import gevent

from gevent.queue import Queue,Empty
import time

#把下面有可能有IO操作的单独坐上标记
"""
以下两行，可以实现爬虫的并发能力，如果没有这两句的话，整个抓取过程就会变成
依次抓取gevent库中的monkey能把可能有IO操作的单独做上标记，将IO变成可以异步执行的函数
"""
from gevent import monkey
monkey.patch_all()#将IO转为异步执行的函数
import requests
link_list = []

with open('most.txt','r') as file:
    file_list = file.readlines()
    for each in file_list:
        link_list.append(each.split()[1].replace('\n',''))

start = time.time()

def crawler(index):
    Process_id = 'Process-'+str(index)
    while not workQueue.empty():
        url = workQueue.get(timeout=2)
        try:
            r = requests.get(url,timeout=20)
            print(Process_id,workQueue.qsize(),r.status_code,url)
        except Exception as e:
            print(Process_id, workQueue.qsize(),  url,'Error',e)

def boss():
    for url in link_list:
        workQueue.put_nowait(url)
if __name__ =='__main__':
    workQueue = Queue(1000)
    gevent.spawn(boss).join() # 将队列中加入的内容整合到gevent中
    '''
    下面4行是创建多协程爬虫的程序
    '''
    jobs = []
    for i in range(10): #创建10个协程
        jobs.append(gevent.spawn(crawler,i))
    gevent.joinall(jobs)
    end = time.time()
    print('多协程爬虫的总时间为：',end-start)
    print('Main Ended')
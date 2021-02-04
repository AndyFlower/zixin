from multiprocessing import cpu_count
from multiprocessing import Process,Queue
import time
import requests
link_list = []
print(cpu_count())

with open('most.txt','r') as file:
    file_list = file.readlines()
    for eachfile in file_list:
        link = eachfile.split()[1]
        link = link.replace('\n','')
        link_list.append(link)

start = time.time()
class MyProcess(Process):
    def __init__(self,q):
        Process.__init__(self)
        self.q = q

    def run(self):
        print('starting:' ,self.pid)
        while not  self.q.empty():
            crawler(self.q)
        print('exit:',self.pid)



def crawler(q):
    url = q.get(timeout = 2)
    try:
        r = requests.get(url,timeout=20)
        print(q.qsize(),r.status_code,url)
    except Exception as e:
        print(q.qsize(),url,'Error:',e)

if __name__ =='__main__':
    ProcessNames = ['Process-1','Process-2','Process-3','Process-4','Process-5']
    workQueue = Queue(1000)
    # 填充队列
    for url in link_list:
        workQueue.put(url)
    for i in range(0,3):
        p = MyProcess(workQueue)
        p.daemon = True #如果将daemon设置为True，当父进程结束后，子进程就会自动被终止。
        p.start()
        p.join()
    end = time.time()
    print('Process + Queue多进程爬虫的总时间为：',end-start)

    print('Main process Ended!')
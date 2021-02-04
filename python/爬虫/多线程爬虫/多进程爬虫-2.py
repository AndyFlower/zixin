from multiprocessing import Pool,Manager
import time
import requests
link_list = []
with open('most.txt','r') as file:
    file_list = file.readlines()
    for each in file_list:
        link = each.split()[1].replace('\n','')
        link_list.append(link)

start = time.time()
def crawler(q,index):
    Process_id = 'Process-'+str(index)
    while not  q.empty():
        url = q.get(timeout=2)
        try:
            r = requests.get(url,timeout=20)
            print(Process_id,q.qsize(),r.status_code,url)
        except Exception as e:
            print(Process_id,q.qsize(),url,'Error:',e)

if __name__ == '__main__':
    manager = Manager()
    workQueue = manager.Queue(1000)
    # 填充队列
    for url in link_list:
        workQueue.put(url)
    pool = Pool(processes=3) #使用Pool(processes=3)创建线程池的最大值为3
    for i in range(4):
        pool.apply_async(crawler,args=(workQueue,i)) # 创建子进程 这里采用的是非阻塞方法
    print('Start process')
    pool.close()
    pool.join()
    end = time.time()
    print('Pool +Queue多进程爬虫的总时间为：',end-start)
    print('Main process End')
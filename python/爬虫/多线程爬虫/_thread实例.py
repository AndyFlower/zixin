import _thread
import time
# 为线程定义一个函数
def print_time(threadName,delay):
    count = 0
    while count < 3:
        time.sleep(delay)
        count += 1
        print(threadName,time.ctime())

_thread.start_new_thread(print_time,('Thread-1',1))
_thread.start_new_thread(print_time,('Thread-2',2))

#time.sleep(5)
print('Main Finished')
#!/usr/bin/env python
import os,time
#how to run it?
#nohup python -u example.py >> /data/logs/example.log 2>&1 &
count =0
os.chdir(r'd:\slpworkspace\github\2020\python\爬虫\blogSpider\blogSpider')
while count < 15:
        os.system('scrapy crawl csdn')#执行系统命令
        time.sleep(100)#推迟执行、休眠
        count +=1
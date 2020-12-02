# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 14:11:22 2020

@author: sangliping
"""

from csv import reader,writer
from random import randrange
from datetime import date,timedelta
fn = 'data.csv'
with open(fn,'w') as fp:
    # 创建csv文件写对象
    wr = writer(fp)
    # 写入表头
    wr.writerow(['日期','销量'])
    # 第一天的日期
    startDate = date(2020,1,1)
    #生成100个模拟数据
    for i in range(100):
        amount = 500+i*5+randrange(5,50)
        wr.writerow([str(startDate),amount])
        # 下一天
        startDate = startDate + timedelta(days=1)

# 读取并显示上面代码生成的csv文件内容
with open(fn) as fp:
    for line in reader(fp):
        if line:
            print(*line)
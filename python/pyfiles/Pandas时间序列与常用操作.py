# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 16:54:10 2020

@author: sangliping
"""

import pandas as pd
# start指定起始日期 end指定结束日期 perods指定生成的数据量
#freq指定时间间隔 D表示天 W表示周H表示小时 M表示月末最后一天 MS表示月初第一天 T表示分钟 Y表示年末最后一天 YS表示年初第一天

print('间隔5天'.ljust(30,'='))
print(pd.date_range(start='20201001',end='20201203',freq='5D'))
 

print('间隔1周'.ljust(30,'='))
print(pd.date_range(start='20201001',end='20201203',freq='W'))
print('间隔2天 5个数据'.ljust(30,'='))
#ValueError: Of the four parameters: start, end, periods, and freq, exactly three must be specified
print(pd.date_range(start='20201001',periods=5,freq='2D'))
print('间隔3小时 8个数据'.ljust(30,'='))
print(pd.date_range(start='20201001',periods=8,freq='3H'))
print('3:00开始 间隔1分钟 12个数据'.ljust(30,'='))
print(pd.date_range(start='202010010300',periods=12,freq='T'))
print('每隔一月，月末最后一天'.ljust(30,'='))
print(pd.date_range(start='20201010',end='20201231',freq='M'))
print('每隔一年，6个数据，年末最后一天'.ljust(30,'='))
print(pd.date_range(start='20200101',periods=6,freq='A'))

print('间隔1年，6个数据，年初第一天'.ljust(30,'='))
print(pd.date_range(start='20200101',periods=6,freq='AS'))

#使用日期时间做索引，创建Series对象
data = pd.Series(index=pd.date_range(start='20200101',periods=24,freq='H'),data=range(24))
print('前5条数据'.ljust(30,'='))
print(data[:5])
print('3分钟重采样，计算均值'.ljust(30,'='))
print(data.resample('3H').mean())
print('5分钟重采样，求和'.ljust(30,'='))
print(data.resample('5H').sum())
print('所有日期替换为第二天'.ljust(30,'='))
data.index = data.index+pd.Timedelta('1D')
print(data[:5])
print('查看指定日期是周几'.ljust(20,'='))
#print(pd.Timestamp('20201204').weekday_name) 这个函数和pandas版本有关 
print('查看指定日期时间所在年是否为闰年'.ljust(30,'='))
print(pd.Timestamp('202012040800').is_leap_year)
print('查看指定日期所在的季度和月份'.ljust(30,'='))
day =pd.Timestamp('20201201')
print(day.quarter,day.month)
print('转换为Python的日期时间对象'.ljust(30,'='))
print(day.to_pydatetime())
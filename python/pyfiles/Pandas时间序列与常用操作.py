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
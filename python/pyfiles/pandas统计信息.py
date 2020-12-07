# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 10:33:53 2020

@author: sangliping
"""

import pandas as pd;
#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
df = pd.read_excel(r'营业额数据.xlsx')

print('查看交易额统计信息'.ljust(20,'='))
print(df['交易额'].describe())
print('查看交易额4分位数'.ljust(20,'='))
print(df['交易额'].quantile([0,0.25,0.5,0.75,1.0]))
print('查看交易额中值'.ljust(20,'='))
print(df['交易额'].median())
print('查看交易额最小的3条记录'.ljust(20,'='))
print(df.nsmallest(3,'交易额'))

print('查看交易额最大的5条记录'.ljust(20,'='))
print(df.nlargest(5,'交易额'))
print('最后一个日期'.ljust(20,'='))
print(df['日期'].max())
print('最小工号'.ljust(20,'='))
print(df['工号'].min())
print('第一个最小交易额的下标'.ljust(20,'='))
index = df['交易额'].idxmin()
print(index)
print('第一个最小交易额'.ljust(20,'='))
print(df.loc[index,'交易额'])
print('第一个最大交易额的行下标'.ljust(20,'='))
index = df['交易额'].idxmax()
print(index)
print('第一个最大交易额'.ljust(20,'='))
print(df.loc[index,'交易额'])
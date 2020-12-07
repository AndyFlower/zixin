# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 10:03:25 2020

@author: sangliping
"""

#筛选数据
import pandas as pd;
#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
# 读取工号、姓名、时段、交易额这4列数据，使用默认索引
df = pd.read_excel(r'营业额数据.xlsx')
print('下标在[5,10]区间的行'.ljust(20,'='))
#对行进行切片 注意切片限定的是左闭右开区间
print(df[5:11])
#iloc使用整数做索引
print('索引为5的行'.ljust(20,'='))
print(df.iloc[5])
#iloc使用整数做索引
print('索引为3 5 10的行'.ljust(20,'='))
print(df.iloc[[3,5,10],:])
#行下标为3 5 10 列下标为0 1 4
print('行下标为3 5 10 列下标为0 1 4 '.ljust(20,'='))
print(df.iloc[[3,5,10],[0,1,4]])
print('查看指定的列前5行数据'.ljust(20,'='))
print(df[['姓名','时段','交易额']][:5])
print('查看前10行指定的列'.ljust(20,'='))
print(df[:10][['姓名','日期','柜台']])
print('下标为3 5 10的行的指定列'.ljust(20,'='))
# loc和at使用标签文本做索引
print(df.loc[[3,5,10],['姓名','交易额']])

print('行下标为3姓名列的值'.ljust(20,'='))
print(df.at[3,'姓名'])

print('交易额高于1700元的数据'.ljust(20,'='))
print(df[df['交易额']>1700])
print('交易总额'.ljust(20,'='))
print(df['交易额'].sum())
print('下午班的交易总额'.ljust(20,'='))
print(df[df['时段']=='14:00-21:00']['交易额'].sum())
print('张三下午班的情况'.ljust(20,'='))
print(df[(df.姓名=='张三')&(df.时段=='14:00-21:00')][:10])
print('日用品柜台销售总额'.ljust(20,'='))
print(df[df['柜台']=='日用品']['交易额'].sum())
print('张三和李四2人销售总额'.ljust(20,'='))
print(df[df['姓名'].isin(['张三','李四'])]['交易额'].sum())
print('交易额在指定范围内的记录'.ljust(20,'='))
print(df[df['交易额'].between(800,850)])
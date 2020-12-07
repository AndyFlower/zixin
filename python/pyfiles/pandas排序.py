# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 11:09:26 2020

@author: sangliping
"""

import pandas as pd;
#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
df = pd.read_excel(r'营业额数据.xlsx')

print('按交易额和工号降序排列'.ljust(20,'='))
print(df.sort_values(by=['交易额','工号'],ascending=False))

print('按交易额降序和工号升序排列'.ljust(20,'='))
print(df.sort_values(by=['交易额','工号'],ascending=[False,True]))
print('按工号升序排序'.ljust(20,'='))
print(df.sort_values(by='工号',na_position='last')[:10])
print('按列名升序排序'.ljust(20,"="))
#这里是汉字的Unicode编码排序
print(df.sort_index(axis=1,ascending=True)[:10])
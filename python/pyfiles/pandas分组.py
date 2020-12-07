# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 11:17:06 2020

@author: sangliping
"""

import pandas as pd;
import numpy as np

#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
df = pd.read_excel(r'营业额数据.xlsx')
print('根据lambda表达式对index处理后的结果分组'.ljust(30,'='))
print(df.groupby(by=lambda num:num%5)['交易额'].sum())

print('指定by参数为字典'.ljust(30,'='))
print(df.groupby(by={7:'下标为7的行',35:'下标为35的行'})['交易额'].sum())
print('不同时段的销售总额'.ljust(30,'='))
print(df.groupby(by='时段')['交易额'].sum())
print('各柜台的销售总额'.ljust(30,'='))
print(df.groupby(by='柜台')['交易额'].sum())
print('每个员工上班的次数'.ljust(30,'='))
diff = df.groupby(by='姓名')['日期'].count()
diff.name='上班次数'
print(diff)


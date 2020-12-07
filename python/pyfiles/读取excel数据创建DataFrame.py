# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 09:53:14 2020

@author: sangliping
"""

#读取Excel中的数据
import pandas as pd;
#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
# 读取工号、姓名、时段、交易额这4列数据，使用默认索引
df = pd.read_excel(r'营业额数据.xlsx',usecols=['工号','姓名','时段','交易额'])
# 输出前10行数据
print(df[:10],end='\n\n')

# 读取第一个worksheet中所有列 跳过1 3 5 行，指定下标为1 的列中数据为DataFrame的行索引标签
df = pd.read_excel(r'营业额数据.xlsx',skiprows=[1,3,5],index_col=1)
print(df[:10],end='\n\n')
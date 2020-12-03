# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 09:08:34 2020

@author: sangliping
"""

import numpy as np

x = np.array((1,2,3,4,5)) #创建数组对象
print(x) #[1 2 3 4 5]
print(x*2) #[ 2  4  6  8 10] 数组与数值相乘
print(x/2) #[0.5 1.  1.5 2.  2.5] 数组与数值相除
print(x//2) #数组与数值整除

print(x ** 3)  #幂运算
print(x%3) #余数

print(2**x) #分别计算2**1 2**2 ... 2**5

print(2/x) #[2.         1.         0.66666667 0.5        0.4       ]
print(63//x) #[63 31 21 15 12]
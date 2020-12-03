# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:20:30 2020

@author: sangliping
"""

import numpy as np
b =np.array(([1,2,3],[4,5,6],[7,8,9]))
print(b)
print(b[0]) #第一行所有元素
print(b[0][0]) #第一行第一列的元素
print(b[0,2]) #第一行第三列的元素 
print(b[[0,1]]) # 第一行和第二行的所有元素

print(b[[0,2,1],[2,1,0]])# 第一行第三列  第3行第二列  第二行第一列的元素

a = np.arange(10)
print(a) #[0 1 2 3 4 5 6 7 8 9]

print(a[::-1]) #[9 8 7 6 5 4 3 2 1 0]
print(a[::2]) #[0 2 4 6 8]
print(a[:5]) #[0 1 2 3 4]

c= np.arange(25)
c.shape=5,5
"""
[[ 0  1  2  3  4]
 [ 5  6  7  8  9]
 [10 11 12 13 14]
 [15 16 17 18 19]
 [20 21 22 23 24]]
"""
print(c)
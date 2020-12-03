# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 14:42:37 2020

@author: sangliping
"""

import numpy as np;
x = np.matrix([[1,2,3],[4,5,6]])
y = np.matrix([1,2,3,4,5,6])
"""
[[1 2 3]
 [4 5 6]]
[[1 2 3 4 5 6]]
5
"""
print(x,y,x[1,1],sep='\n')

"""
[[1 4]
 [2 5]
 [3 6]]
[[1]
 [2]
 [3]
 [4]
 [5]
 [6]]
"""
print(x.T,y.T,sep='\n')

print(x.mean()) # 所有元素的平均值
print(x.mean(axis=0)) #纵向平均值
print(x.mean(axis=0).shape)
print(x.mean(axis=1)) #横向平均值
print(x.sum()) # 所有元素之和
print(x.max(axis=1) #横向最大值
print(x.diagonal()) #对角线元素
print(x.nonzero()) #非0元素下标 分别返回行下标和列下标
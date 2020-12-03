# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 10:50:13 2020

@author: sangliping
"""

import numpy as np

print(np.array([1,2,3,4])+np.array([4,5,6,7])) #等长数组 对应元素相加
print(np.array([1,2,3,4])+np.array([4])) #每个元素都加4

a = np.array((1,2,3))
print(a+a) #[2 4 6]

print(a*a) #等长数组 运算 对应元素的值相减 [1 4 9]

print(a-a) #[0 0 0]

print(a/a)  #[1. 1. 1.] 对应元素相除

print(a**a) #[ 1  4 27] 等长数组幂运算 对应元素的值乘方
"""
[[ 1  4  9]
 [ 4 10 18]
 [ 7 16 27]]
"""
b=np.array(([1,2,3],[4,5,6],[7,8,9]))
print(a*b)

""" a中每个元素和b中对应列元素相加
[[ 2  4  6]
 [ 5  7  9]
 [ 8 10 12]]
"""
print(a+b) 
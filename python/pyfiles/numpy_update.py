# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 08:44:58 2020

@author: sangliping
"""

import numpy as np


x = np.arange(8)
print(x) #[0 1 2 3 4 5 6 7]

print(np.append(x,8)) #是在副本上添加 [0 1 2 3 4 5 6 7 8]

print(np.append(x,[9,10])) #[ 0  1  2  3  4  5  6  7  9 10]

print(np.insert(x,1,8)) #[0 8 1 2 3 4 5 6 7]

x[3]=8
print(x) #[0 1 2 8 4 5 6 7]

"""
[[1 2 3]
 [4 5 6]
 [7 8 9]]
"""
x = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(x)

"""
[[1 2 4]
 [4 5 6]
 [7 8 9]]
"""
x[0,2] = 4 # 修改第一行 第三列

print(x)

"""
[[1 2 4]
 [4 1 1]
 [7 1 1]]
"""
x[1:,1:]=1 #行下标和列下表大于等于1 的都设置为1
print(x)

"""
[[1 2 4]
 [4 1 2]
 [7 1 2]]
"""
x[1:,1:]=[1,2]
print(x)
"""
[[1 2 4]
 [4 1 2]
 [7 3 4]]
"""
x[1:,1:]=[[1,2],[3,4]]
print(x)
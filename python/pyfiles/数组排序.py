# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:04:41 2020

@author: sangliping
"""

import numpy as np

x = np.array([3,1,2])
print(np.argsort(x)) #[1 2 0] 升序后元素的下标
print(x) #[3 1 2]

x = np.array([3,1,2,4])
print(x.argmax()) #3 返回的是下标
print(x.argmin()) #1

print(np.argsort(x)) #3

"""
[1 2 0 3]
[[6 8 8 2 1]
 [3 8 5 8 5]]
"""
x= np.random.randint(1,10,(2,5))
print(x)

"""
[[1 5 6 6 7]
 [2 4 4 5 7]]  横向排序
"""
x.sort(axis=1)
print(x)
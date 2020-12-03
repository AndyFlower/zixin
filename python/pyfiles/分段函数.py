# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 14:21:53 2020

@author: sangliping
"""

import numpy as np

x = np.random.randint(0,10,size=(1,10))
print(x) #[[7 2 8 8 1 5 9 9 2 7]]

print(np.where(x<5,0,1)) #[[1 0 1 1 0 1 1 1 0 1]] 小于5的元素对应0其他对应1

x.resize((2,5))
"""
[[7 2 8 8 1]
 [5 9 9 2 7]]
"""
print(x)

np.piecewise(x,[x<4,x>7],[lambda x:x*2,lambda x:x*3]) #大于4的元素乘以2 大于7的元素乘以3 其他元素变为0
"""
[[7 2 8 8 1]
 [5 9 9 2 7]]
"""
print(x)
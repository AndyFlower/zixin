# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:22:28 2020

@author: sangliping
"""

import numpy as np;
a = np.array([[3,1],[1,2]])
b = np.array([9,8])
x = np.linalg.solve(a,b) #求解
print(x)

print(np.dot(a,x)) #验证
print(np.linalg.lstsq(a,b)) #最小二乘解  返回解 余项 a的秩 a的奇异值

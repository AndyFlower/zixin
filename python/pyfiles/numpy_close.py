# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 16:06:10 2020

@author: sangliping
"""

import numpy as np
x = np.array([1,2,3,4.001,5])
y=np.array([1,1.99,3,4.01,5.1])
print(np.allclose(x,y))
print(np.allclose(x,y,rtol=0.2)) #设置相对误差
print(np.allclose(x,y,atol=0.2)) #设置绝对误差
print(np.isclose(x,y))
print(np.isclose(x,y,atol=0.2))
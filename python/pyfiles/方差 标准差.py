# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:04:50 2020

@author: sangliping
"""

import  numpy as np;
#0.0
print(np.cov([1,1,1,1,1,1]))
#0.0
print(np.std([1,1,1,1,1,1]))

x = [-2.1,-1,4.3]
y = [3,1.1,0.12]

X=np.vstack((x,y))
"""
[[-2.1  -1.    4.3 ]
 [ 3.    1.1   0.12]]
"""
print(X)
"""
[[11.71       -4.286     ]
 [-4.286       2.14413333]]
"""
print(np.cov(X))
"""
[[11.71       -4.286     ]
 [-4.286       2.14413333]]
"""
print(np.cov(x,y))
# 2.2071223094538484
print(np.std(X))
# [2.79404128 1.19558447]
print(np.std(X,axis=1))
#11.709999999999999
print(np.cov(x))
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:44:01 2020

@author: sangliping
"""

import  numpy as np;
x = np.matrix([[1,2],[3,-4]])
print(np.linalg.norm(x))#5.477225575051661
print(np.linalg.norm(x,-2))  #1.9543950758485487
print(np.linalg.norm(x,-1)) #4.0
print(np.linalg.norm(x,1)) #6.0
print(np.linalg.norm([1,2,0,3,4,0],0)) #4.0
print(np.linalg.norm([1,2,0,3,4,0],2)) #5.477225575051661

a=([[1,2,3],[4,5,6],[7,8,9]])
u,s,v = np.linalg.svd(a)
"""
[[-0.21483724  0.88723069  0.40824829]
 [-0.52058739  0.24964395 -0.81649658]
 [-0.82633754 -0.38794278  0.40824829]]
[1.68481034e+01 1.06836951e+00 1.47280825e-16]
[[-0.47967118 -0.57236779 -0.66506441]
 [-0.77669099 -0.07568647  0.62531805]
 [ 0.40824829 -0.81649658  0.40824829]]
"""
print(u,s,v,sep='\n')
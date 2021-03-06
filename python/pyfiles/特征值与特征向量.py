# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:12:54 2020

@author: sangliping
"""

import numpy as np

A = np.array([[1,-3,3],[3,-5,3],[6,-6,4]])

e,v = np.linalg.eig(A) #特征值 与特征向量
"""
[ 4.+0.00000000e+00j -2.+1.10465796e-15j -2.-1.10465796e-15j]
[[-0.40824829+0.j          0.24400118-0.40702229j  0.24400118+0.40702229j]
 [-0.40824829+0.j         -0.41621909-0.40702229j -0.41621909+0.40702229j]
 [-0.81649658+0.j         -0.66022027+0.j         -0.66022027-0.j        ]]
"""
print(e,v,sep='\n')

"""
[[-1.63299316+0.0000000e+00j -0.48800237+8.1404458e-01j
  -0.48800237-8.1404458e-01j]
 [-1.63299316+0.0000000e+00j  0.83243817+8.1404458e-01j
   0.83243817-8.1404458e-01j]
 [-3.26598632+0.0000000e+00j  1.32044054-4.4408921e-16j
   1.32044054+4.4408921e-16j]]
"""
print(np.dot(A,v)) #矩阵与特征向量的乘积
"""
[[-1.63299316+0.00000000e+00j -0.48800237+8.14044580e-01j
  -0.48800237-8.14044580e-01j]
 [-1.63299316+0.00000000e+00j  0.83243817+8.14044580e-01j
   0.83243817-8.14044580e-01j]
 [-3.26598632+0.00000000e+00j  1.32044054-7.29317578e-16j
   1.32044054+7.29317578e-16j]]
"""
print(e*v) #特征向量与特征值的乘积 
"""
[[ True  True  True]
 [ True  True  True]
 [ True  True  True]] 验证二者是否相等
"""
print(np.isclose(np.dot(A,v),e*v))
# (-3.660807638291249e-30+5.965152994198125e-14j)
print(np.linalg.det(A-np.eye(3,3)*e)) #计算A-λE的值应为0
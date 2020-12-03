# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 14:29:58 2020

@author: sangliping
"""

import  numpy as np;

arr1 = np.array([1,2,3])
arr2 = np.array([4,5,6])
#[1 2 3 4 5 6]
print(np.hstack((arr1,arr2)))
"""
[[1 2 3]
 [4 5 6]]
"""
print(np.vstack((arr1,arr2)))
"""
[[1]
 [2]
 [3]]
"""
arr3 = np.array([[1],[2],[3]])
"""
[[4]
 [5]
 [6]]
"""
arr4 = np.array([[4],[5],[6]])

print(arr3)
print(arr4)
"""
[[1 4]
 [2 5]
 [3 6]]
"""
print(np.hstack((arr3,arr4)))
"""
[[1]
 [2]
 [3]
 [4]
 [5]
 [6]]
"""
print(np.vstack((arr3,arr4))) 
# [1 2 3 4 5 6]
print(np.concatenate((arr1,arr2)))
"""
[[1]
 [2]
 [3]
 [4]
 [5]
 [6]]
"""
print(np.concatenate((arr3,arr4)))
"""
[[1 4]
 [2 5]
 [3 6]]
"""
print(np.concatenate((arr3,arr4),axis=1))
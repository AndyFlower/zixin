# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:32:21 2020

@author: sangliping
"""

import numpy as np

x = np.arange(1,11,1)
print(x) #[ 1  2  3  4  5  6  7  8  9 10]

print(x.shape) #(10,)
print(x.size) #10
x.shape=2,5
"""
[[ 1  2  3  4  5]
 [ 6  7  8  9 10]]
"""
print(x)

print(x.shape) #(2, 5)
print(x.size) #10

x = x.reshape(2,5) 

x = np.array(range(5))
#x.reshape((1,10)) ##cannot reshape array of size 5 into shape (1,10)
x.resize((1,10)) #[[0 1 2 3 4 0 0 0 0 0]]
print(x)
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:11:25 2020

@author: sangliping
"""

import numpy as np

x = np.array((1,2,3))
y = np.array((4,5,6))

print(x.dot(y)) #32
print(np.dot(x,y))#32
print(sum(x*y))#32
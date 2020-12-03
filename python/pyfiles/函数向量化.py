# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:55:45 2020

@author: sangliping
"""

import numpy as np
import math
mat = np.matrix([[1,2,3],[4,5,6]])
vecFactorial=np.vectorize(math.factorial) #函数向量化
"""
[[  1   2   6]
 [ 24 120 720]]
"""
print(vecFactorial(mat))
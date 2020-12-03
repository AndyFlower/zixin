# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 14:55:46 2020

@author: sangliping
"""

import numpy as np

x = np.matrix([[1,2,3],[4,5,6]])
y = np.matrix([[1,2],[3,4],[5,6]])
"""
[[22 28]
 [49 64]]
"""
print(x*y)
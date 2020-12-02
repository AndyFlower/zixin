# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 10:48:45 2020

@author: sangliping
"""

range1 = range(4) # 只指定stop为4，start默认为0，step默认为1
range2 = range(5,8) # start=5 stop=8 step默认为1
range3 = range(3,20,4) # start=3 stop=20 step = 4

range4 =range(20,0,-3) # step也可以为负数
print(range1,range2,range3,range4)

print(range4[2])
print(list(range1),list(range2),list(range3),list(range4))

for i in range(10):
    print(i,end=',')
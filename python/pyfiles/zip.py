# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 11:10:50 2020

@author: sangliping
"""

data = zip('1234',[1,2,3,4,5,6])
print(data)

print(list(data))

#再次访问 需要重新创建
data = zip('1234',[1,2,3,4,5,6,7])

print(tuple(data))

data = zip('1234',[1,2,3,4,5,6,7])
# zip对象同样是可迭代的
for item in data:
    print(item)
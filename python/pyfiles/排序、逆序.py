# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 10:38:57 2020

@author: sanglp
"""

from random import shuffle

data = list(range(20))

shuffle(data) #随机打乱顺序
print(data)

print(sorted(data)) #升序
print(sorted(data,key=str)) # 转换成字符串之后大小升序排序
print(sorted(data,key=str,reverse=True)) #降序排序

reversedData = reversed(data) #生成reversed对象
print(reversedData)
print(list(reversedData)) #根据reversed对象得到列表
print(tuple(reversedData)) # 空元祖，reversed对象中元素只能使用一次
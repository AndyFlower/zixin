# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 10:24:12 2020

@author: sanglp
"""

data = [3,22,111]
print(data)

#对列表中的元素直接比较大小，输出最大元素
print(max(data))
print(min(data))
#返回转成字符串之后的最大的元素
print(max(data,key=str))
data = ['3','22','111']
print(max(data))
#返回长度最大的字符串
print(max(data,key=len))
data = ['abc','Abcd','ab']
# 最大的字符串
print(max(data))
#长度最大的字符串
print(max(data,key=len))
#全部转换为小写之后最大的字符串
print(max(data,key=str.lower))
data = [1,1,1,2,2,1,3,1]
# 出现次数最多的元素
print(max(set(data),key=data.count))
# 最大元素的位置，列表方法__getitem__()用于获取指定位置的值
print(max(range(len(data)),key=data.__getitem__))
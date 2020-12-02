# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 11:14:58 2020

@author: sangliping
"""

from operator import add,mul,or_

from functools import reduce

print(map(str,range(5)))
print(list(map(str,range(5))))
print(list(map(len,['abc','1234','test'])))
# 如果map()函数的第一个参数func,是能够接收两个参数的可调用对象，则可以映射在两个序列上
for num in map(add,range(5),range(5,10)):
    print(num)
    
seq = range(1,10)
print(reduce(add,seq)) #累加seq中的数字
print(reduce(mul,seq)) #累乘seq中的数字
seq = [{1},{2},{3},{4}]
print(reduce(or_,seq))    #对seq中的集合连续进行并集运算

seq = ['abcd','1234','.,?!','']
print(list(filter(str.isdigit, seq))) #留数字

print(list(filter(str.isalpha, seq))) #留英文字母字符串
print(list(filter(str.isalnum, seq))) #留数字和英文字符串
print(list(filter(None,seq))) #只留等价于True的元素
# -*- coding: utf-8 -*-
"""
Created on Tue Dec  1 22:57:02 2020

@author: sanglp
"""
# +运算符
print(3+5)
print(3.4+4.5)
print((3+4j)+(4+5j))
print('abc'+'def')
print([1,2]+[3,4])
print((1,2)+(3,))

# -运算符
print(7.9 -4.5) # 浮点数有误差
print(5-3)
num = 3
print(-num)
print(--num)
print({1,2,3}-{3,4,5}) #计算差集

# *运算符
print(3333*5555)
print((3+4j)*(5+6j))
print('重要的事情说3遍'*3)
print([0]*5)
print((0,)*3)

# /和//运算符
print(17 / 4)
print(17 // 4) #4
print((-17) / 4)
print((-17) // 4) #-5 

# %运算符
print(365 %7)
print(365 %2)
print('%c,%c,%c' %(65,97,48)) # 数字格式化为字符 A,a,0

# **运算符
print(2 ** 4)
print(3 ** 3 ** 3)
print(3 ** (3**3))
print((3**3)**3)
print(9**0.5)
print((-1)**0.5) # 对负数计算平方根得到负数
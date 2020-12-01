# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import math

print(math.factorial(32)) #计算32的阶乘
print(0.4 - 0.3 == 0.1) # 浮点数之间尽量避免直接比较大小
print(math.isclose(0.4 - 0.3, 0.1)) # 比较两个数是否接近
num = 7
squreRoot = num ** 0.5  # 计算平方根
print(squreRoot)
print(squreRoot ** 2 == num )
c = 3+4j # 注意写法总间不能有空 
print(c + c)
print(c ** 2)
print(c.real) #实部
print(c.imag) #虚部
print(c.conjugate()) #计算共轭复数
print(abs(c))  # 计算复数的模
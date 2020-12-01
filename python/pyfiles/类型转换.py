# -*- coding: utf-8 -*-
"""
Created on Tue Dec  1 23:21:28 2020

@author: sanglp
"""

print(int(3.5)) #获取整数部分
print(int('119')) #字符串转换为整数
print(int('1111',2)) #1111看做2进制 转换为十进制
print(int('1111'),8)
print(int('1111'),16)
print(int(' 9\n')) #自动忽略字符串的两个空白符
print(float('3.1415')) #字符串转换为浮点数
print(float('-inf')) #负无穷大
print(complex(3,4)) # 复数

print(bin(8888)) #转换为二进制
print(oct(8888)) #转换为八进制
print(hex(8888)) #转换为十六进制

print(ord('a')) # 返回字符的ASCII码
print(ord('桑')) #返回汉字的Unicode编码
print(chr(65)) #返回指定ASCII码对应的字符
print(chr(33891))
print(str([1,2,3,4])) #列表转换为字符串
print(str({1,2,3,4})) #把集合转换为字符串

print(list(),tuple(),dict(),set())
s={3,2,1,4}
print(list(s),tuple(s))
lst = [1,1,2,2,3,4]
#转换为集合时会自动去除重复的元素
print(tuple(lst),set(lst))
print(list(str(lst)))
print(dict(name='Sang',sex='Femal',age=14)) #key上不能加引号

print(eval('3+4j'))
print(eval('8**2'))
print(eval('[1,2,3,4,5]'))
print(eval('{1,2,3,4}'))
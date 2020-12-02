# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 10:43:43 2020

@author: sangliping
"""

num = int(input('请输入一个大于2的自然数：'))
if num %2==1:
    print('这是一个奇数')
else:
    print('这是一个偶数')    
    
lst = eval(input('请输入一个包含若干大于2的自然数的列表：'))
print('列表中所有元素之和为：',sum(lst))    


print(1,2,3,4,5)

print(1,2,3,4,5,sep=',') # 逗号作为分隔符
print(3,5,7,end=' ')
print(9,11,13)
# -*- coding: utf-8 -*-
"""
Created on Tue Dec  1 22:25:25 2020

@author: sanglp
"""
# 创建列表对象
x_list = [1,2,3]
# 创建元租对象
x_tuple=(1,2,3)
#创建字典对象
x_dict = {'a':97,'b':98,'c':99}
# 创建集合对象
x_set = {1,2,3}

# 使用下标访问列表中的元素 下标从0开始
print(x_list[1])

# 元祖也支持使用序号作为下标，1表示第二个元素
print(x_tuple[1])

# 访问字典中特定键的值
print(x_dict['a'])

# 查看列表长度
print(len(x_list))

# 查看元素2在元祖中首次出现的位置
print(x_tuple.index(2))

# 查看字典中哪些键对应的值为98
for key ,value in x_dict.items():
    if value == 98:
        print(key)
        
# 查看集合中元素的最大值
print(max(x_set))        
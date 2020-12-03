# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 14:13:03 2020

@author: sangliping
"""

import numpy as np;
x = np.random.rand(10) #包含10个随机数的数组
print(x) #[0.94722619 0.75023656 0.20496368 0.13063083 0.2637552  0.52204302 0.94217334 0.77210203 0.54795783 0.34623352]

print(x>0.5) #比较每个元素是否大于0.5 [ True  True False False False  True  True  True  True False]

print(x[x>0.5]) #获取数组中大于0.5的元素 [0.94722619 0.75023656 0.52204302 0.94217334 0.77210203 0.54795783]

print(sum((x>0.4) & (x<0.6))) #值大于0.4小于0.6的元素的数量 2

print(np.all(x<1)) #是否元素全部小于1 True

print(np.any(x>0.8)) #True

a=np.array([1,2,3])
b=np.array([3,2,1])

print(a>b)

print(a[a>b]) #数组a中大于数组b中对应位置上的元素的值 
print(a==b)

print(a[a==b])

x=np.arange(1,10)

print(x)

print(x[(x%2==0)&(x>5)]) #大于5放入偶数 两个数组进行布尔与运算  [6 8]

print(x[(x%2==0)|(x>5)]) #大于5的元素或者偶数元素  布尔或运算 [2 4 6 7 8 9]

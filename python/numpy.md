### numpy数组及其运算

#### 创建数组

```python
# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 15:30:26 2020

@author: sangliping
"""

import numpy as np
print(np.array([1,2,3,4,5])) #列表转换为数组
print(np.array((1,2,3,4,5))) #元祖转换为数组
print(np.array(range(5))) #range对象转换为数组

print(np.array([[1,2,3],[4,5,6]])) # 二维数组
print(np.arange(8))  #内置函数
print(np.arange(1,10,2))
print(np.linspace(0,10,11)) #等差数组 包含11个数据 
print(np.linspace(0,10,11,endpoint=False) )#不包含终点

print(np.logspace(0,100,10))
print(np.logspace(1,6,5,base=2))

print(np.zeros(3)) #全0一维数组
print(np.ones(3)) # 全1一维数组
print(np.zeros((3,3))) #全0二维数组 3行3列

print(np.zeros((3,1))) #全0二维数组 3行1列

print(np.zeros((1,3))) # 全0二维数组 1行3列

print(np.ones((3,3))) # 券1二维数组
print(np.ones((1,3))) #全1二维数组

print(np.identity(3)) #单位矩阵

print(np.empty((3,3))) #空数组 只申请空间 其中元素不一定是0
print(np.hamming(20)) #Hamming窗口


print(np.blackman(10))#Blackman窗口
print(np.kaiser(12,5)) #Kaiser窗口


print(np.random.randint(0,50,5)) #随机数组 5个0到50直接的数字 
print(np.random.randint(0,50,(3,5))) #3行5列

print(np.random.rand(10))#10个介于[0,1)的随机数

print(np.random.standard_normal(5)) #标准正太分布中选取5个数
print(np.random.standard_normal(size=(3,4,2))) #3页4行2列

print(np.diag([1,2,3,4]))
```

#### 测试两个数组的对应元素是否足够接近

```python
# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 16:06:10 2020

@author: sangliping
"""

import numpy as np
x = np.array([1,2,3,4.001,5])
y=np.array([1,1.99,3,4.01,5.1])
print(np.allclose(x,y))
print(np.allclose(x,y,rtol=0.2)) #设置相对误差
print(np.allclose(x,y,atol=0.2)) #设置绝对误差
print(np.isclose(x,y))
print(np.isclose(x,y,atol=0.2))
```

#### 修改数组中的元素值
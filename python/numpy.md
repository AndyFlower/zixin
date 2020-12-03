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

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 08:44:58 2020

@author: sangliping
"""

import numpy as np


x = np.arange(8)
print(x) #[0 1 2 3 4 5 6 7]

print(np.append(x,8)) #是在副本上添加 [0 1 2 3 4 5 6 7 8]

print(np.append(x,[9,10])) #[ 0  1  2  3  4  5  6  7  9 10]

print(np.insert(x,1,8)) #[0 8 1 2 3 4 5 6 7]

x[3]=8
print(x) #[0 1 2 8 4 5 6 7]

"""
[[1 2 3]
 [4 5 6]
 [7 8 9]]
"""
x = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(x)

"""
[[1 2 4]
 [4 5 6]
 [7 8 9]]
"""
x[0,2] = 4 # 修改第一行 第三列

print(x)

"""
[[1 2 4]
 [4 1 1]
 [7 1 1]]
"""
x[1:,1:]=1 #行下标和列下表大于等于1 的都设置为1
print(x)

"""
[[1 2 4]
 [4 1 2]
 [7 1 2]]
"""
x[1:,1:]=[1,2]
print(x)
"""
[[1 2 4]
 [4 1 2]
 [7 3 4]]
"""
x[1:,1:]=[[1,2],[3,4]]
print(x)
```

#### 数组与标量的运算

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 09:08:34 2020

@author: sangliping
"""

import numpy as np

x = np.array((1,2,3,4,5)) #创建数组对象
print(x) #[1 2 3 4 5]
print(x*2) #[ 2  4  6  8 10] 数组与数值相乘
print(x/2) #[0.5 1.  1.5 2.  2.5] 数组与数值相除
print(x//2) #数组与数值整除

print(x ** 3)  #幂运算
print(x%3) #余数

print(2**x) #分别计算2**1 2**2 ... 2**5

print(2/x) #[2.         1.         0.66666667 0.5        0.4       ]
print(63//x) #[63 31 21 15 12]
```

#### 数组与数组的运算

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 10:50:13 2020

@author: sangliping
"""

import numpy as np

print(np.array([1,2,3,4])+np.array([4,5,6,7])) #等长数组 对应元素相加
print(np.array([1,2,3,4])+np.array([4])) #每个元素都加4

a = np.array((1,2,3))
print(a+a) #[2 4 6]

print(a*a) #等长数组 运算 对应元素的值相减 [1 4 9]

print(a-a) #[0 0 0]

print(a/a)  #[1. 1. 1.] 对应元素相除

print(a**a) #[ 1  4 27] 等长数组幂运算 对应元素的值乘方
"""
[[ 1  4  9]
 [ 4 10 18]
 [ 7 16 27]]
"""
b=np.array(([1,2,3],[4,5,6],[7,8,9]))
print(a*b)

""" a中每个元素和b中对应列元素相加
[[ 2  4  6]
 [ 5  7  9]
 [ 8 10 12]]
"""
print(a+b) 
```

#### 数组排序

- argsort():返回一个数组，其中的每个元素为原数组中元素的索引，表示应该把原数组中哪个位置上的元素放在这个位置
- argmax():返回数组中最大元素的下标
- argmin():返回数组中最小元素的下标

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:04:41 2020

@author: sangliping
"""

import numpy as np

x = np.array([3,1,2])
print(np.argsort(x)) #[1 2 0] 升序后元素的下标
print(x) #[3 1 2]

x = np.array([3,1,2,4])
print(x.argmax()) #3 返回的是下标
print(x.argmin()) #1

print(np.argsort(x)) #3

"""
[1 2 0 3]
[[6 8 8 2 1]
 [3 8 5 8 5]]
"""
x= np.random.randint(1,10,(2,5))
print(x)

"""
[[1 5 6 6 7]
 [2 4 4 5 7]]  横向排序
"""
x.sort(axis=1)
print(x)
```

#### 数组的内积运算

- dot():计算两个数组的内积
- 内置dot()函数
- sum函数

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:11:25 2020

@author: sangliping
"""

import numpy as np

x = np.array((1,2,3))
y = np.array((4,5,6))

print(x.dot(y)) #32
print(np.dot(x,y))#32
print(sum(x*y))#32
```

#### 访问数组中的元素

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:20:30 2020

@author: sangliping
"""

import numpy as np
b =np.array(([1,2,3],[4,5,6],[7,8,9]))
print(b)
print(b[0]) #第一行所有元素
print(b[0][0]) #第一行第一列的元素
print(b[0,2]) #第一行第三列的元素 
print(b[[0,1]]) # 第一行和第二行的所有元素

print(b[[0,2,1],[2,1,0]])# 第一行第三列  第3行第二列  第二行第一列的元素

a = np.arange(10)
print(a) #[0 1 2 3 4 5 6 7 8 9]

print(a[::-1]) #[9 8 7 6 5 4 3 2 1 0]
print(a[::2]) #[0 2 4 6 8]
print(a[:5]) #[0 1 2 3 4]

c= np.arange(25)
c.shape=5,5
"""
[[ 0  1  2  3  4]
 [ 5  6  7  8  9]
 [10 11 12 13 14]
 [15 16 17 18 19]
 [20 21 22 23 24]]
"""
print(c)
```

#### 数组对函数运算的支持

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:26:44 2020

@author: sangliping
"""

import  numpy as np
x = np.arange(0,100,10,dtype=np.floating)
print(x) #[ 0. 10. 20. 30. 40. 50. 60. 70. 80. 90.]
"""
[ 0.         -0.54402111  0.91294525 -0.98803162  0.74511316 -0.26237485
 -0.30481062  0.77389068 -0.99388865  0.89399666]
正弦
"""
print(np.sin(x))
"""
[[1 2 3]
 [4 5 6]
 [7 8 9]]
"""
x = np.array(([1,2,3],[4,5,6],[7,8,9]))
print(x)
"""
[[ 0.54030231 -0.41614684 -0.9899925 ]
 [-0.65364362  0.28366219  0.96017029]
 [ 0.75390225 -0.14550003 -0.91113026]]
"""
print(np.cos(x))
"""
[[ 1. -0. -1.]
 [-1.  0.  1.]
 [ 1. -0. -1.]]
"""
print(np.round(np.cos(x))) #四舍五入
"""
[[1. 1. 2.]
 [2. 3. 3.]
 [4. 4. 5.]]
"""
print(np.ceil(x/2)) #向上取整
```

#### 改变数组形状

- reshape():返回新数组但不能改变数组中元素的总数量
- resize():数组进行原地修改并且会根据需要进行补0或丢弃部分元素
- shape属性:直接原地修改数组的大小

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 11:32:21 2020

@author: sangliping
"""

import numpy as np

x = np.arange(1,11,1)
print(x) #[ 1  2  3  4  5  6  7  8  9 10]

print(x.shape) #(10,)
print(x.size) #10
x.shape=2,5
"""
[[ 1  2  3  4  5]
 [ 6  7  8  9 10]]
"""
print(x)

print(x.shape) #(2, 5)
print(x.size) #10

x = x.reshape(2,5) 

x = np.array(range(5))
#x.reshape((1,10)) ##cannot reshape array of size 5 into shape (1,10)
x.resize((1,10)) #[[0 1 2 3 4 0 0 0 0 0]]
print(x)
```

#### 数组布尔运算

```python
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
```

#### 分段函数

- where():对原数组中的元素进行“二值化”，根据数组中的元素是否满足指定的条件来决定返回x还是y
- piecewise():实现更复杂的处理

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 14:21:53 2020

@author: sangliping
"""

import numpy as np

x = np.random.randint(0,10,size=(1,10))
print(x) #[[7 2 8 8 1 5 9 9 2 7]]

print(np.where(x<5,0,1)) #[[1 0 1 1 0 1 1 1 0 1]] 小于5的元素对应0其他对应1

x.resize((2,5))
"""
[[7 2 8 8 1]
 [5 9 9 2 7]]
"""
print(x)

np.piecewise(x,[x<4,x>7],[lambda x:x*2,lambda x:x*3]) #大于4的元素乘以2 大于7的元素乘以3 其他元素变为0
"""
[[7 2 8 8 1]
 [5 9 9 2 7]]
"""
print(x)
```

#### 数组堆叠与合并

沿着特定的方向把多个数组合并到一起

- hstack():水平堆叠
- vstack():垂直堆叠
- concatenate():axis指定合并的方向 默认是0 按行合并

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 14:29:58 2020

@author: sangliping
"""

import  numpy as np;

arr1 = np.array([1,2,3])
arr2 = np.array([4,5,6])
#[1 2 3 4 5 6]
print(np.hstack((arr1,arr2)))
"""
[[1 2 3]
 [4 5 6]]
"""
print(np.vstack((arr1,arr2)))
"""
[[1]
 [2]
 [3]]
"""
arr3 = np.array([[1],[2],[3]])
"""
[[4]
 [5]
 [6]]
"""
arr4 = np.array([[4],[5],[6]])

print(arr3)
print(arr4)
"""
[[1 4]
 [2 5]
 [3 6]]
"""
print(np.hstack((arr3,arr4)))
"""
[[1]
 [2]
 [3]
 [4]
 [5]
 [6]]
"""
print(np.vstack((arr3,arr4)))
# [1 2 3 4 5 6]
print(np.concatenate((arr1,arr2)))
"""
[[1]
 [2]
 [3]
 [4]
 [5]
 [6]]
"""
print(np.concatenate((arr3,arr4)))
"""
[[1 4]
 [2 5]
 [3 6]]
"""
print(np.concatenate((arr3,arr4),axis=1))
```

### 矩阵生成与常用操作

#### 矩阵生成

matrix()函数可以用来把列表、元组、range对象等Python可迭代对象转换为矩阵

```python
import numpy as np;
x = np.matrix([[1,2,3],[4,5,6]])
y = np.matrix([1,2,3,4,5,6])
"""
[[1 2 3]
 [4 5 6]]
[[1 2 3 4 5 6]]
5
"""
print(x,y,x[1,1],sep='\n')
```

#### 矩阵转置

```python

"""
[[1 4]
 [2 5]
 [3 6]]
[[1]
 [2]
 [3]
 [4]
 [5]
 [6]]
"""
print(x.T,y.T,sep='\n')
```

#### 查看矩阵特征

- max()、
- min()、
- sum()、
- mean()

[axis=1表示横向  axis=0表示纵向]

```python
print(x.mean()) # 所有元素的平均值
print(x.mean(axis=0)) #纵向平均值
print(x.mean(axis=0).shape)
print(x.mean(axis=1)) #横向平均值
print(x.sum()) # 所有元素之和
print(x.max(axis=1) #横向最大值
print(x.diagonal()) #对角线元素
print(x.nonzero()) #非0元素下标 分别返回行下标和列下标
```

#### 矩阵乘法

```python
import numpy as np

x = np.matrix([[1,2,3],[4,5,6]])
y = np.matrix([[1,2],[3,4],[5,6]])
"""
[[22 28]
 [49 64]]
"""
print(x*y)
```

#### 相关系数矩阵

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:01:23 2020

@author: sangliping
"""

import numpy as np;
"""
[[ 1. -1.]
 [-1.  1.]] 负相关 变化方向相反
"""
print(np.corrcoef([1,2,3,4],[4,3,2,1]))
"""
[[ 1.         -0.91350028]
 [-0.91350028  1.        ]] 负相关 变化方向相反
"""
print(np.corrcoef([1,2,3,4],[8,3,2,1]))
"""
[[1. 1.]
 [1. 1.]] 正相关 变化方向一致
"""
print(np.corrcoef([1,2,3,4],[1,2,3,4]))
"""
[[1.        0.8010362]
 [0.8010362 1.       ]] 正相关  变化趋势接近
"""
print(np.corrcoef([1,2,3,4],[1,2,3,40]))
```

#### 计算方差、协方差、标准差

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:04:50 2020

@author: sangliping
"""

import  numpy as np;
#0.0
print(np.cov([1,1,1,1,1,1]))
#0.0
print(np.std([1,1,1,1,1,1]))

x = [-2.1,-1,4.3]
y = [3,1.1,0.12]

X=np.vstack((x,y))
"""
[[-2.1  -1.    4.3 ]
 [ 3.    1.1   0.12]]
"""
print(X)
"""
[[11.71       -4.286     ]
 [-4.286       2.14413333]]
"""
print(np.cov(X))
"""
[[11.71       -4.286     ]
 [-4.286       2.14413333]]
"""
print(np.cov(x,y))
# 2.2071223094538484
print(np.std(X))
# [2.79404128 1.19558447]
print(np.std(X,axis=1))
#11.709999999999999
print(np.cov(x))
```

#### 计算特征值与特征向量

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:12:54 2020

@author: sangliping
"""

import numpy as np

A = np.array([[1,-3,3],[3,-5,3],[6,-6,4]])

e,v = np.linalg.eig(A) #特征值 与特征向量
"""
[ 4.+0.00000000e+00j -2.+1.10465796e-15j -2.-1.10465796e-15j]
[[-0.40824829+0.j          0.24400118-0.40702229j  0.24400118+0.40702229j]
 [-0.40824829+0.j         -0.41621909-0.40702229j -0.41621909+0.40702229j]
 [-0.81649658+0.j         -0.66022027+0.j         -0.66022027-0.j        ]]
"""
print(e,v,sep='\n')

"""
[[-1.63299316+0.0000000e+00j -0.48800237+8.1404458e-01j
  -0.48800237-8.1404458e-01j]
 [-1.63299316+0.0000000e+00j  0.83243817+8.1404458e-01j
   0.83243817-8.1404458e-01j]
 [-3.26598632+0.0000000e+00j  1.32044054-4.4408921e-16j
   1.32044054+4.4408921e-16j]]
"""
print(np.dot(A,v)) #矩阵与特征向量的乘积
"""
[[-1.63299316+0.00000000e+00j -0.48800237+8.14044580e-01j
  -0.48800237-8.14044580e-01j]
 [-1.63299316+0.00000000e+00j  0.83243817+8.14044580e-01j
   0.83243817-8.14044580e-01j]
 [-3.26598632+0.00000000e+00j  1.32044054-7.29317578e-16j
   1.32044054+7.29317578e-16j]]
"""
print(e*v) #特征向量与特征值的乘积 
"""
[[ True  True  True]
 [ True  True  True]
 [ True  True  True]] 验证二者是否相等
"""
print(np.isclose(np.dot(A,v),e*v))
# (-3.660807638291249e-30+5.965152994198125e-14j)
print(np.linalg.det(A-np.eye(3,3)*e)) #计算A-λE的值应为0
```

#### 计算逆矩阵

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:19:17 2020

@author: sangliping
"""

import numpy as np;
x = np.matrix([[1,2,3],[4,5,6],[7,8,0]])

y=np.linalg.inv(x)
"""
[[-1.77777778  0.88888889 -0.11111111]
 [ 1.55555556 -0.77777778  0.22222222]
 [-0.11111111  0.22222222 -0.11111111]]
"""
print(y)
"""
[[ 1.00000000e+00  1.11022302e-16  0.00000000e+00]
 [-1.11022302e-15  1.00000000e+00  0.00000000e+00]
 [ 0.00000000e+00  0.00000000e+00  1.00000000e+00]]
"""
print(x*y) #对角线元素为1，其他元素为0或者近似为0
"""
[[ 1.00000000e+00 -4.44089210e-16  0.00000000e+00]
 [ 2.22044605e-16  1.00000000e+00  0.00000000e+00]
 [ 1.11022302e-16  1.11022302e-16  1.00000000e+00]]
"""
print(y*x)
```

#### 求解线性方程组

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:22:28 2020

@author: sangliping
"""

import numpy as np;
a = np.array([[3,1],[1,2]])
b = np.array([9,8])
x = np.linalg.solve(a,b) #求解
print(x)

print(np.dot(a,x)) #验证
print(np.linalg.lstsq(a,b)) #最小二乘解  返回解 余项 a的秩 a的奇异值
```

#### 计算向量和矩阵的范数

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:44:01 2020

@author: sangliping
"""

import  numpy as np;
x = np.matrix([[1,2],[3,-4]])
print(np.linalg.norm(x))#5.477225575051661
print(np.linalg.norm(x,-2))  #1.9543950758485487
print(np.linalg.norm(x,-1)) #4.0
print(np.linalg.norm(x,1)) #6.0
print(np.linalg.norm([1,2,0,3,4,0],0)) #4.0
print(np.linalg.norm([1,2,0,3,4,0],2)) #5.477225575051661
```

#### 奇异值分解

- svd()

```python
a=([[1,2,3],[4,5,6],[7,8,9]])
u,s,v = np.linalg.svd(a)
"""
[[-0.21483724  0.88723069  0.40824829]
 [-0.52058739  0.24964395 -0.81649658]
 [-0.82633754 -0.38794278  0.40824829]]
[1.68481034e+01 1.06836951e+00 1.47280825e-16]
[[-0.47967118 -0.57236779 -0.66506441]
 [-0.77669099 -0.07568647  0.62531805]
 [ 0.40824829 -0.81649658  0.40824829]]
"""
print(u,s,v,sep='\n')
```

#### 函数向量化

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 15:55:45 2020

@author: sangliping
"""

import numpy as np
import math
mat = np.matrix([[1,2,3],[4,5,6]])
vecFactorial=np.vectorize(math.factorial) #函数向量化
"""
[[  1   2   6]
 [ 24 120 720]]
"""
print(vecFactorial(mat))
```


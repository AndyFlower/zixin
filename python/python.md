## Python

### if

```pyth
age = 16;
if age>18:
    print(age)
```

### if-else

```python
age = 16;
if age>18:
    print(age)
else:
    print("年纪太小")
```

### if-elif

```python
score = 81;
if score>90:
    print("A")
elif score >80:
    print("B")
else:
    print("C")
```

### while

```pyth
n=1;
while n<10:
    print(n);
    n=n+1;
else:
    print("结束")
```

>print( a,end=" ")  //不换行

### break

```python
while True:
    s = input("输入0退出");
    if s =='0':
        break;
    print("输入的是："+s);
```

### continue

```python
for s in 'python':
    if s =='y':
        continue
    print(s)
```

```python
import  random
m = random.randint(1,100)
total = 5; #可以猜的总数
count = 0;#猜了多少次
while True:
    n = int(input("输入1-100间的一个整数"))
    if n<m:
        print("小了")
    elif n>m:
        print("大了")
    else:
        print("猜对了")
        break;
    count = count+1
    if count >=total:
        print("游戏结束")
        break
```

### 字符串

```python
s = "传奇"
print(s[0])
传
```

```python
s = "传奇传奇"
print(s[0:3])
传奇传
```

```python
s = "传奇传奇"
print(s[0:3:2])
传传
```

### 列表

```python
mylist = [1,2,'a']
print(mylist)
print(mylist[2])
mylist.append('b')
print(mylist)
mylist.insert(1,'python')
print(mylist)
mylist.extend('1')
print(mylist)
mylist.pop()
print(mylist)
mylist.pop(2)
print(mylist)
mylist.remove(1)
print(mylist)
mylist[2]=33
print(mylist)
-----------------------
[1, 2, 'a']
a
[1, 2, 'a', 'b']
[1, 'python', 2, 'a', 'b']
[1, 'python', 2, 'a', 'b', '1']
[1, 'python', 2, 'a', 'b']
[1, 'python', 'a', 'b']
['python', 'a', 'b']
['python', 'a', 33]

```

### 元祖(不能修改)

```python
mylist = (1,2,'a')
print(mylist)
print(mylist[2])
```

### 字典

```python
user = {
    "name":"sang",
    "age":18
}

print(user)
print(user['age'])
user['age']=19
print(user['age'])
user['fav'] = 'swim'
print(user)
----------------------------
{'name': 'sang', 'age': 18}
18
19
{'name': 'sang', 'age': 19, 'fav': 'swim'}

```

### 函数

```python
def add(n,m):
    s = 0
    while n<=m:
        s=s+n;
        n+=1
    return s
        
print(add(1,100))
```

### 文件

```python
f = open('1.txt',encoding='UTF-8');
s = f.read()
print(s)
f.close()
```

```pyth
f = open('write.txt',mode='w',encoding='UTF-8')
f.write('桑\n')
f.write('丽')
f.close()
```

### 字符串是否包含某个字符串

if str1 in str2:

　　包含的话，True

if str1.find(str2)>=0:

　　包含的话，返回第一次出现的位置，没有的话为负数

### 一、遍历文件夹

```py
import os;

path = "D:/FileProcess/vpayms/src/com/cul/culsite/dao/mapping"

dirs = os.listdir(path);

for file in dirs:
    print(file)
```


# -*- coding: utf-8 -*-
"""
Created on Fri Jan 15 15:30:06 2021

@author: sangliping
"""

num = input('请输入一个数字:')
if int(num)<10:
    print(num)
    
if 3: #整数作为条件表达式
    print('ok')    
    
a = [] #列表作为表达式 空列表为False
if a:
    print('空列表 False')    
    
s = 'False' #非空字符串
if s:
    print('非空字符串')    
    
c = 9
if 3<c and c<20:
    print("3<c and c<20")


if True: #布尔值
    print("True")    
    
    
num = input('请输入一个数字')
if int(num)<10:
    print(num)
else:
    print('数字太大')    

num = input('请输入一个数字')
print(num if int(num)<10 else '数字太大')   

score = int(input('请输入分数'))
grade = ''
if score<60:
    grade = '不及格'
elif score>=60 and score<70:
    grade='及格'
elif score>=70 and score<80:
    grade = '良好'   
else:
    grade = '优秀'    
print('分数是{0}，等级是{1}'.format(score,grade))    
    

n = 100
 
sum = 0
counter = 1
while counter <= n:
    sum = sum + counter
    counter += 1
 
print("1 到 %d 之和为: %d" % (n,sum))


for x in list('slp'):
    print(x)
    
d = {'name':'slp','age':18,'address':'bj'}
for x in d: #遍历所有的key
    print(x)
    
for x in d.keys():#遍历字典所有的key
    print(x)
    
for x in d.values():#遍历字典所有的value
    print(x)
        
for x in d.items():#遍历字典所有的键值对
    print(x)    
    
sum_all=0
sum_even=0
sum_odd=0
for num in range(101):
    sum_all +=num
    if num%2 ==0:
        sum_even+=num
    else:
        sum_odd+=num
        
print(sum_all,sum_even,sum_odd)       


for m in range(1,10):
    for n in range(1,m+1):
        print(m,'*',n,'=',m*n ,end='\t')
    print('')
    
    
while True:
    a = input('输入Q退出')
    if a.upper() == 'Q':
        print('退出')
        break
    else:
        print('继续')
        
empNum = 0
salarySum = 0;
salarys = []       
while True:
    s = input('请输入员工的工资（q或Q结束）')
    if s.upper() =='Q':
        print('录入完成 退出')
        break;
    if float(s)<0:
        continue;
    empNum+=1
    salarys.append(float(s))
    salarySum +=float(s)
    
print('员工数{0}'.format(empNum))
print('录入薪资',salarys)
print('平均薪资{0}'.format(salarySum/empNum))
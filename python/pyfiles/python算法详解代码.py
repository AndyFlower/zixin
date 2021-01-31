# -*- coding: utf-8 -*-
"""
Created on Thu Jan 21 10:36:59 2021

@author: sangliping
"""

fib_table = {}
def fib_num(n):
    """
    斐波那契数列 递归算法
    """
    if n<=1:
        return n
    if n not in fib_table:
        fib_table[n] = fib_num(n-1) + fib_num(n-2)
        
    return fib_table[n]

n = int(input('输入斐波那契数列的第n项:'))
print('斐波那契数列的第{0}项是{1}'.format(n, fib_num(n)))



i = 1
def move(n,mfrom,mto):
    global i
    print('第{0}步：将{1}号盘子从{2}->{3}'.format(i,n,mfrom,mto))
    i = i+1
    
def hanoi(n,A,B,C):
    """
    汉诺塔问题
    """
    if n == 1:
        move(1,A,C)
    else:
        hanoi(n-1, A, C, B)
        move(n,A,C)
        hanoi(n-1, B, A, C)
        
try:
    n=int(input('please input a integer:'))
    print('移动步骤如下：')
    hanoi(n, 'A', 'B', 'C')     
except ValueError:
    print('please input a integer n(n>0)')
    
    
    
    
def fact(n):
    """
    阶乘算法
    """
    print('factorial has been called with n='+str(n))
    if n == 1:
        return 1
    else:
        res = n * fact(n-1)
        print('intermeduate result for ',n ,'* fact(',n-1,"):",res)
        return res
print(fact(10))




#基本子算法（子问题规模小于或等于2时）
def get_max(max_list):
    return max(max_list) 
# 分治法 版本二 求最大元素
def solve2(init_list):
    n = len(init_list)
    if n <=2: #若问题规模小于或等于2 解决问题
        return get_max(init_list)
    #分解  子问题规模为n/2
    left_list,right_list = init_list[:n//2],init_list[n//2:]
    # 递归树  分治
    left_max ,right_max = solve2(left_list),solve2(right_list)
    # 合并
    return get_max([left_max,right_max])

if __name__ =='__main__':
    test_list = [12,2,23,45,67,3,2,45,24]
    print(solve2(test_list))
    
    
    
# 划分 基于主元pivot 非就地划分
def partition(seq):
    pi = seq[0]#挑选主元
    lo = [x for x in seq[1:] if x<=pi]  #所有小的元素
    hi = [x for x in seq[1:] if x>pi]     # 所有大的元素
    return lo, pi, hi

def select(seq,k):
    """
    找第k小数
    """
    #分解
    lo ,pi, hi = partition(seq)
    m = len(lo)
    if m==k:
        return pi#解决
    elif m<k:
        return select(hi,k-m-1) #递归 分治
    else:
        return select(lo,k) #递归 分治
    
seq = [3,2,1,5,6,7,23,42]    
print(select(seq,3))    
print(select(seq,1))  




def main():
    """
    贪心算法找零钱
    """
    d =[0.01,0.02,0.05,0.1,0.2,0.5,1.0] #存储每种硬币的面值
    d_num =[]# 存储每种货币的数量
    s=0
    # 拥有的零钱总和
    temp = input('请输入每种零钱的数量')
    d_num0 = temp.split(' ')
    for i in range(0,len(d_num0)):
        d_num.append(int(d_num0[i]))
        s += d[i]*d_num[i] #计算收银一共有多少钱
    sum = float(input('请输入需要找的零钱'))
    if sum >s:
        print('数据有错')
        return 0
    s = s-sum
    # 想要用的硬币数量最少，需要利用所有大面值的硬币，因此从数组的大面值的元素开始遍历
    i = 6
    while i>=0:
        if sum >=d[i]:
            n= int(sum/d[i])
            if n>=d_num[i]:
                n=d_num[i]
            sum -= n*d[i] #贪心算法的关键步骤 令sum动态改变
            print('用了{0}个{1}枚硬币'.format(n, d[i]))
        i -=1
        
main()        



def greedy():
    """
    贪心算法 加油站
    """
    n = 100  #距离
    k = 5 #加油站数量
    d = [50,80,39,60,40,32]
    # 表示加油站的距离
    num = 0
    # 表示加油次数
    for i in range(k):
        if d[i]>n:
            print('no solution')
            #如果得到的任何一个数值大于n则无法计算
            return
    i,s=0,0
    # 利用s进行迭代
    while i<=k:
        s+=d[i]
        if s>=n:
            #当局部和大于n时，将局部和更新为当前距离
            s = d[i]
            #贪心意在让每一次加满之后跑尽可能远的距离
            num += 1
        i += 1
    print(num)
    
greedy()    



n = 8 
x = [] #一个解
X = [] #一组解
# 冲突检测，判断x[k]是否与前面的x[0] x[k-1]冲突
def conflict(k):
    global x
    for i in range(k):# 遍历前面的x[0]~x[k-1]
        if x[i]==x[k] or abs(x[i]-x[k])==abs(i-k):
            return True #冲突
    return False 

def queens(k):#到达第k行
    global  n,x,X
    if k>=n :
        X.append(x[:])
    else:
        for i in range(n):
            x.append(i)
            if not conflict(k):
                queens(k+1)
            x.pop()
            
#解的可视化
def show(x):
    global n 
    for i in range(n):
        print('. ' * (x[i]) +'X' + '. ' *(n-x[i]-1))
queens(0) #从第0行开始
print(X[-1])
show(X[-1])        
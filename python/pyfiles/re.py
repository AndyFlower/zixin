# -*- coding: utf-8 -*-
"""
Created on Mon Jan 18 16:01:36 2021

@author: sangliping
"""
"""
import turtle

colors=("red","green","yellow","black")
t = turtle.Pen()
t.speed(0)
t.width(3)
for i in range(10):
    t.penup()
    t.goto(0,-i*10)
    t.pendown()
    t.color(colors[i%len(colors)])
    t.circle(100+i*10)

turtle.done()# 程序执行
"""

"""
画同心圆
"""

import turtle

t = turtle.Pen();
width = 30
num = 18
x1=[(-400,400),(-400+width*num,400)]
y1=[(-400,400),(-400,400-width*num)]
for i in range(0,19):
    t.penup()
    t.goto(x1[0][0],x1[0][i]-30*i)
    t.pendown()
    t.goto(x1[1][0],x1[1][1]-30*i)
    
    
def printMax(a,b):
    """实现两个数的比较，并返回较大的值"""
    if a>b:
        print(a,"较大值")
    else:
        print(b,'较大值')
# -*- coding: utf-8 -*-
"""
Created on Fri Dec 18 21:27:14 2020

@author: Administrator
"""

import matplotlib.pyplot as plt 
#plt.plot(0,0,'o')
#plt.plot(0,0,'o',markersize=36)
#plt.plot(0,0,'>',markersize=36 ,color='r')
#plt.plot(0,0,'*',markersize=36)

#plt.plot(0,0,'o')
#plt.plot(1,0,'o')
#plt.plot([0,1],[0,0])# 第一个值是两个点的横坐标  第二个值是两个点的纵坐标

#x = [1,1,0]
#y = [0,1,0]
#plt.plot(x,y,marker='o')

#坐标list=[[1,0],[1,1],[0,]]

import turtle
t = turtle.Pen()
for x in range(360):
    t.forward(x)
    t.left(59)
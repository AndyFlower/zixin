# -*- coding: utf-8 -*-
"""
Created on Tue Jan 19 12:48:00 2021

@author: sangliping
"""

from django.http import HttpResponse

def hello(request):
    #前面可以有向数据模型请求数据的代码
    return HttpResponse("hello world")#返回响应
# -*- coding: utf-8 -*-
"""
Created on Tue Jan 19 13:11:48 2021

@author: sangliping
"""

from django.contrib import admin

from django.urls import path

from . import views

#特定URL表达式和相应视图函数之间的映射列表，如果接收到具有与指定模式匹配的URL的HTTP请求，则将调用相关联的视图函数
urlpatterns = [
    path('admin/',admin.site.urls),
    path('hello/',views.hello)
    ]
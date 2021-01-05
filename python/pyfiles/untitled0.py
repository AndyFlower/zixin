# -*- coding: utf-8 -*-
"""
Created on Fri Dec 18 21:18:26 2020

@author: Administrator
"""

from PIL import Image
import io
from urllib import request
import plot
url='https://profile.csdnimg.cn/1/3/6/3_weixin_51656605'
resp=request.urlopen(url)
s = resp.read()
im =Image.open(io.BytesIO(s))
im
print(im)
size=12,12
im.thumbnail(size)
print(im)

plot(0,0,'o')
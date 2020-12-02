# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 13:52:09 2020

@author: sangliping
"""

import json
information  = [
    {'小区名称':'小区A','均价':8000,'月交易量':20},
    {'小区名称':'小区B','均价':8500,'月交易量':30},
    {'小区名称':'小区C','均价':7800,'月交易量':50},
    {'小区名称':'小区D','均价':12000,'月交易量':27}
    ]
# json.dump() 写入 JSON 数据
with open('房屋信息.json','w') as fp:
    json.dump(information, fp, indent=4,separators=[',',':'])
with open('房屋信息.json') as fp:
    information = json.load(fp)
    for info in information:
        print(info)
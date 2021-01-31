# -*- coding: utf-8 -*-
"""
Created on Wed Jan 20 23:29:53 2021

@author: Administrator
"""
import itertools
def twentyfour(cards):
    for nums in itertools.permutations(cards):
        for ops in itertools.product('+-*/',repeat=3):
            #构造三种中缀表达式 bsd
            bds1 = '({0}{4}{1}){5}({2}{6}{3})'.format(*nums, *ops) #(a+b)*(c-d)
            bds2 = '(({0}{4}{1}){5}{2}){6}{3}'.format(*nums, *ops) #(a+b)*c-d
            bds3 = '{0}{4}({1}{5}({2}{6}{3}))'.format(*nums, *ops) #a/(b-(c/d))
            for bds in [bds1,bds2,bds3]:
                try:
                    if abs(eval(bds)-24.0)<1e-10:   #计算
                        return bds
                except ZeroDivisionError: #除零错误
                    continue
                
    return 'Not fount'

cards = [1,2,3,4]
for card in cards:
    print(twentyfour(card))
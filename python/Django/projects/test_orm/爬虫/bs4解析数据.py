#  -*- encoding=utf-8 -*-
from bs4 import  BeautifulSoup

if __name__ == '__main__':
    soup = BeautifulSoup(open('./test.html','r',encoding='utf-8'),'lxml')
    print(soup)
    #h1 代表的是h1标签
    print(soup.h1)
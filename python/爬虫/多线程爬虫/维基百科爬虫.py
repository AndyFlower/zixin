import requests
from bs4 import BeautifulSoup
import re
import  time
headers = {
    'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36'
}
'''
r = requests.get('https://en.wikipedia.beta.wmflabs.org/wiki/Main_Page',headers=headers)
html = r.text
bsObj =BeautifulSoup(html)
re = '<a href="/wiki/([^:#=<>]*?)".*?</a>'
for link in bsObj.findAll('a'):
    if 'href' in link.attrs:
        print(link.attrs['href']) #得到该页面的所有链接
'''

exist_url = []#存放已爬取的网页
g_writecount = 0
def scrappy(url,depth=1):
    global g_writecount
    try:
        url = "https://en.wikipedia.org/wiki/"+url
        r = requests.get(url,headers=headers)
        html = r.text
    except Exception as e:
        print('Failed downloading and saving',url)
        print(e)
        exist_url.append(url)
        return None
    exist_url.append(url)
    link_list = re.findall('<a href= "/wiki/([^#=<>]*?)".*?</a>',html)
    # 去掉已爬链接和重复链接
    unique_list = list(set(link_list)-set(exist_url))
    # 把链接写入txt文件中
    for eachone in unique_list:
        g_writecount+=1
        output = "No."+str(g_writecount) +'\t Depth:'+str(depth) +'\t'+url+'->'+eachone + '\n'
        print(output)
        with open('link_12-3.txt','a+') as f:
            f.write(output)
        if depth<2:
            scrappy(eachone,depth+1)
scrappy('Wikipedia')
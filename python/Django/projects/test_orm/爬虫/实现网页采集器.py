# -*- encoding = utf-8 -*-
#UA ：User-Agent:请求载体的身份标识
#UA伪装：门户网站的服务器会检测对应请求的载体身份标识，如果检测到请求的载体为某一款浏览器，说明该请求是一个正常的请求，
# 但是，如果检测到请求的载体身份标识不是基于某一款浏览器的，则表示该请求不是正常的请求
import requests
if __name__ =='__main__':
    url = 'http://www.sogou.com/web'
    # 指定搜索关键字
    kw = input('请输入需要查询的关键字：')
    headers = {
        'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36'
    }
    # 处理url携带的参数：封装到字典中
    param = {
        'query':kw
    }
    #对指定的url发起的请求是携带参数的，并且请求过程中处理了请求 不加headers则有可能会标识为非法请求，无法获得请求数据
    #response = requests.get(url=url,params=param)
    response = requests.get(url=url,params=param,headers=headers)
    # 获取响应数据
    page_text = response.text;
    # 持久化存储
    fileName = kw+'.html'
    with open(fileName,'w',encoding='utf-8') as fp:
        fp.write(page_text)
    print(kw+'保存成功')



## **引入**

- 在python实现的网络爬虫中，用于网络请求发送的模块有两种，第一种为urllib模块，第二种为requests模块。urllib模块是一种比较古老的模块，在使用的过程中较为繁琐和不便。当requests模块出现后，就快速的代替了urllib模块，因此，在我们课程中，推荐大家使用requests模块。
- Requests 唯一的一个**非转基因**的 Python HTTP 库，人类可以安全享用。

## **what is requests**

requests模块是python中原生的基于网络请求的模块，其主要作用是用来模拟浏览器发起请求。功能强大，用法简洁高效。在爬虫领域中占据着半壁江山的地位。

## **为什么要使用requests模块**

- 在使用urllib模块的时候，会有诸多不便之处，总结如下：
  - 手动处理url编码
  - 手动处理post请求参数
  - 处理cookie和代理操作繁琐
  - ……
- 使用requests模块：
  - 自动处理url编码
  - 自动处理post请求参数
  - 简化cookie和代理操作
  - ……

## **如何使用requests模块**

- 环境安装
  - pip install requests
- 使用流程/编码流程
  - 指定url
  - 基于requests模块发起请求
  - 获取响应对象中的数据值
  - 持久化存储

## **第一个爬虫程序**

- **需求：爬取搜狗首页的页面数据**

```python
#导包
import requests
#step_1:指定url
url = 'https://www.sogou.com/'
#step_2:发起请求:使用get方法发起get请求，该方法会返回一个响应对象。参数url表示请求对应的url
response = requests.get(url=url)
#step_3:获取响应数据:通过调用响应对象的text属性，返回响应对象中存储的字符串形式的响应数据（页面源码数据）
page_text = response.text
#step_4:持久化存储
with open('./sogou.html','w',encoding='utf-8') as fp:
    fp.write(page_text)
print('爬取数据完毕！！！')
```

https://book.apeland.cn/details/68/
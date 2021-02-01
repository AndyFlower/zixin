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



## **基于requests模块经典案例实战**

通过5个基于requests模块的爬虫项目对该模块进行学习和巩固

- 基于requests模块的get请求

  - 需求：爬取搜狗指定词条对应的搜索结果页面（简易网页采集器）

  - 反爬机制

    - User-Agent：请求载体的身份标识，使用浏览器发起的请求，请求载体的身份标识为浏览器，使用爬虫程序发起的请求，请求载体为爬虫程序。

    - UA检测：相关的门户网站通过检测请求该网站的载体身份来辨别该请求是否为爬虫程序，如果是，则网站数据请求失败。因为正常用户对网站发起的请求的载体一定是基于某一款浏览器，如果网站检测到某一请求载体身份标识不是基于浏览器的，则让其请求失败。因此，UA检测是我们整个课程中遇到的第二种反爬机制，第一种是robots协议。

    - UA伪装：通过修改/伪装爬虫请求的User-Agent来破解UA检测这种反爬机制，具体实现见下属代码：

      ```python
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
      
      
      
      ```

- 基于requests模块的post请求

  - 需求：破解百度翻译

    ```python
    # -*- encoding=utf-8 -*-
    import requests
    import json
    if __name__ =='__main__':
        #指定url
        post_url = 'https://fanyi.baidu.com/sug'
        kw = input('请输入要翻译的文字：')
        # 请求参数处理
        data = {
            'kw':kw
        }
        #进行UA伪装
        headers = {
            'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36'
    
        }
        # 请求发送
        response = requests.put(url=post_url,data=data,headers=headers)
        res_text = response.text #字符串数据
        dic_obj = response.json()# 返回的是json对象 确认服务器返回的是json格式的时候才可以使用json方法进行对象的返回
        print(dic_obj)
        print(dic_obj.get('data'))
        # 持久化存储
        fp = open('./'+kw+'.json','w',encoding='utf-8')
        json.dump(dic_obj,fp=fp,ensure_ascii=False)
        print(kw+'翻译结束')
    
    ```

- 基于requests模块ajax的get请求

  - 需求：爬取豆瓣电影分类排行榜 https://movie.douban.com/中的电影详情数据

    ```python
    import requests
    import json
    
    if __name__ =='__main__':
        url = 'https://movie.douban.com/j/chart/top_list'
        param = {
            'type': 24,
            'interval_id': '100:90',
            'action':'',
            'start':'0', #分页开始
            'limit': '10' #页数
        }
        headers = {
            'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36'
        }
        response = requests.get(url=url,headers=headers,params=param)
        list_data = response.json()
        fp = open('./douban.json','w',encoding='utf-8')
        json.dump(list_data,fp=fp,ensure_ascii=False)
        print('爬取结束')
    ```

- 基于requests模块ajax的post请求

  - 需求：爬取肯德基餐厅查询http://www.kfc.com.cn/kfccda/index.aspx中指定地点的餐厅数据

    ```python
    import requests
    if __name__ == "__main__":
        #指定ajax-post请求的url（通过抓包进行获取）
        url = 'http://www.kfc.com.cn/kfccda/ashx/GetStoreList.ashx?op=keyword'
        #定制请求头信息，相关的头信息必须封装在字典结构中
        headers = {
            #定制请求头中的User-Agent参数，当然也可以定制请求头中其他的参数
            'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36',
        }
        #定制post请求携带的参数(从抓包工具中获取)
        data = {
            'cname':'',
            'pid':'',
            'keyword':'北京',
            'pageIndex': '1',
            'pageSize': '10'
        }
        #发起post请求，获取响应对象
        response = requests.post(url=url,headers=headers,data=data)
        #获取响应内容
        print(response.text)
    ```

    

- 综合练习

  - 需求：爬取国家药品监督管理总局中基于中华人民共和国化妆品生产许可证相关数据http://scxk.nmpa.gov.cn:81/xk/

  ```python
  # -*- encoding=utf-8 -*-
  
  import requests
  import json
  if __name__ == '__main__':
      headers = {
          'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36'
      }
      #url = 'http://scxk.nmpa.gov.cn:81/xk/'
      url = 'http://scxk.nmpa.gov.cn:81/xk/itownet/portalAction.do?method=getXkzsList'
      params = {
          'on': 'true',
          'page': '1',
          'pageSize': '15',
          'productName':'',
          'conditionType':'1',
          'applyname':'',
          'applysn':''
      }
      response = requests.post(url,headers=headers,params=params)
      list_json = response.json()
      all_id_list = []
      all_data_list = []
      for dict in list_json['list']:
          id = dict['ID']
          all_id_list.append(id)
      post_url = 'http://scxk.nmpa.gov.cn:81/xk/itownet/portalAction.do?method=getXkzsById'
      for id in all_id_list:
          post_data = {
              'id':id
          }
          response = requests.post(url=post_url,headers=headers,params=post_data)
          #print(response.text)
          if response.headers['Content-Type'] =='application/json;charset=UTF-8':
              json_text = response.json()
              print(json_text)
              all_data_list.append(json_text)
              print(json_text['businessPerson'])
  
      fp = open('药监局数据.json','w',encoding='utf-8')
      fp.write(str(all_data_list))
  
  
  ```

  






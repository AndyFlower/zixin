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

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
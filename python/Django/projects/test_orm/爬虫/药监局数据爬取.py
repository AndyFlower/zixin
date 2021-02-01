# -*- encoding=utf-8 -*-

import requests
from fake_useragent import UserAgent

if __name__ == '__main__':
    #ua = UserAgent(use_cache_server=False, verify_ssl=False).random
    #print(ua)
    headers = {
        'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36'
       # 'User-Agent':ua
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


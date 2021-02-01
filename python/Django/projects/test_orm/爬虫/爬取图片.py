 # -*-  encoding=utf-8 -*-
import requests
import re
import  os

if __name__ =='__main__':
    url = 'https://www.qiushibaike.com/pic/%s/'
    # 进行UA伪装
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36'
    }
    # 指定起始页和结束页
    page_start = int(input('enter start page:'))
    page_end = int(input('enter end page:'))

    # 创建文件夹
    if not os.path.exists('images'):
        os.mkdir('images')
    for page in range(page_start,page_end):
        print('正在下载第%d页图片'%page)
        new_url = format(url % page)
        response = requests.get(url = new_url,headers=headers)
        #print(response.text)
        # 解析response中的图片链接
        e = '.*?.*?'
        ex = '<img src="(.*?)" alt.*? />'
        pa = re.compile(e,re.S)
        image_urls = re.findall(ex,response.text,re.S)
        #print(image_urls)
        for image_url in image_urls:
            print(image_url)
            image_url = 'https:'+image_url
            image_name=image_url.split('/')[-1].split('?')[0]
            #print(image_name)
            image_path = 'images/'+image_name
            try:
                image_data = requests.get(url=image_url,headers=headers).content
                with open(image_path, 'wb') as fp:
                    fp.write(image_data)
            except Exception as e:
                print(e)



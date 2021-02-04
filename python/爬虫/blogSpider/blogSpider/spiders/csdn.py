# -*- coding: utf-8 -*-
import scrapy
from bs4 import BeautifulSoup
from blogSpider.items import  BlogspiderItem

class SantotangSpider(scrapy.Spider):
    name = 'csdn'
    allowed_domains = ['blog.csdn.net']
    start_urls = ['https://blog.csdn.net/weixin_51656605/category_10621310.html',
                  'https://blog.csdn.net/weixin_51656605/category_10795198.html',
                  'https://blog.csdn.net/weixin_51656605/category_10700169.html',
                  'https://blog.csdn.net/weixin_51656605/category_10755656.html',
                  'https://blog.csdn.net/weixin_51656605/category_10690950.html',
                  'https://blog.csdn.net/weixin_51656605/category_10673253.html'
                  ]
    #start_urls = ['https://blog.csdn.net/weixin_51656605/category_10690950.html']
    def start_requests(self):
        for i in range(len(self.start_urls)):
            url = self.start_urls[i]
            print('当前页面是'+url)
            # 对新闻列表也发起请求
            yield scrapy.Request(url=url,callback=self.parse)
    def parse(self, response):
        #print(response.text)
        #with open('index.html','w',encoding='utf-8') as f:
            #f.write(response.text)
        soup = BeautifulSoup(response.text,'lxml')
        article_list = soup.find('ul',class_='column_article_list').find_all('li')
        #print(article_list)
        article_info_list = []
        for article in article_list:
            link = article.a['href'];
            title = article.find('h2',class_='title').text.strip().replace(' ','');
            date = article.find('div',class_='column_article_data').span.text.strip().replace(' ','')
            #article_info_list.append([title,date])
            item = BlogspiderItem() #将数据封装到BlogspiderItem对象，
            item['title'] = title
            item['date'] = date
            item['link'] = link
            article_info_list.append(item)
            # 根据文章链接，发送Request请求，并传递item参数
            yield scrapy.Request(url = link,meta={'item':item},callback=self.parse2)
            #print(article.text)
        return article_info_list


    def parse2(self,response):
        # 接收传递的item
        item = response.meta['item']
        soup = BeautifulSoup(response.text,'lxml')
        content = soup.find('div',class_='article_content clearfix').text
        item['content'] = content
        # 返回item 交给item pipeline
        yield item
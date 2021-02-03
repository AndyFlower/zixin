# -*- coding: utf-8 -*-
import scrapy
from bs4 import BeautifulSoup
from blogSpider.items import  BlogspiderItem

class SantotangSpider(scrapy.Spider):
    name = 'csdn'
    allowed_domains = ['blog.csdn.net']
    start_urls = ['https://blog.csdn.net/weixin_51656605/category_10621310.html']

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
# -*- coding: utf-8 -*-
import scrapy
from bs4 import BeautifulSoup
from financeSpider.items import FinancespiderItem

class FinanceSpider(scrapy.Spider):
    name = 'finance'
    allowed_domains = ['finance.eastmoney.com']
    start_urls = ['http://finance.eastmoney.com/news/cywjh_1.html']
    url_head = 'http://finance.eastmoney.com/news/cywjh_'
    url_end = '.html'
    # scrapy自带功能，从start_request开始发送请求
    #start_requests这个方法是Scrapy自带功能，目的是能够使用一个循环来获取新闻列表的前三页
    def start_requests(self):
        for i in range(1,4):
            url = self.url_head+str(i)+self.url_end
            print('当前页面是'+url)
            # 对新闻列表也发起请求
            yield scrapy.Request(url=url,callback=self.parse)
    def parse(self, response):
        soup  = BeautifulSoup(response.text,'lxml')
        title_list = soup.find_all('p',class_='title')
        for i in range(len(title_list)):
            item = FinancespiderItem()
            title = title_list[i].a.text.strip()
            link = title_list[i].a['href']
            item['title']=title
            item['link']=link
            # 根据文章链接，发送request请，并传递item参数
            yield scrapy.Request(url = link,meta={'item':item},callback=self.parse2)


    def parse2(self,response):
        # 接收传递的item
        item = response.meta['item']
        #解析文章内容
        soup = BeautifulSoup(response.text,'lxml')
        date = soup.find('div',class_='time').text.strip()
        source = soup.find('div' ,class_='data-source')['data-source']
        content = soup.find('div',id='ContentBody').text.strip()
        content = content.replace('\n',' ')
        comment = soup.find('span',class_='cNumShow num').text.strip()
        involve = soup.find('span',class_='num ml5').text.strip()
        item['content']=content
        item['date'] = date
        item['source'] = source
        item['comment'] = comment
        item['involve']= involve
        # 返回item交给item pipeline
        yield item


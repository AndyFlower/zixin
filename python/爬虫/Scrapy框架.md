## Scrapy是什麽

Scrapy是一个为了爬取网站数据，提取数据而编写的应用框架。简单来说，它把爬虫的三步：获取网页，解析网页，存储数据都整合成了这个爬虫框架。

### Scrapy架构

![image-20210203101616307](.\images\image-20210203101616307.png)

Scrapy主要的组件有Scrapy Engine（引擎）, Scheduler（调度器）,Downloader（下载器）, Spider（爬虫器）, Item Pipeline（管道）。还有两个中间件：Downloader Middlewares（下载器中间件）和SpiderMiddlewares（爬虫器中间件）。这些组件的功能分别是：

- 引擎：负责控制数据流在所有组件流动，并在相应动作时触发事件。可以理解为爬虫的大脑。
- 调度器：从引擎接受请求（request）并将它们加入爬虫队列。可以理解把等待爬取的网页排队的功能。
- 下载器：负责获取页面并提供给引擎。相当于之前学的“获取网页”功能。
- 爬虫器：负责解析网页（response），提取数据，或额外跟进一些URL。相当于之前学的“解析网页”功能。
- 管道：负责处理被爬虫器提取的数据（items），例如保存下来。相当于之前学的“存储数据”功能。
-  下载器中间件：引擎和下载器中间的一个部分，处理下载器传递给引擎的数据（response），一般不做处理。
-  爬虫器中间件：引擎和爬虫器中间的一个部分，处理爬虫器的输入（response）和输出（items, requests）。

![image-20210203101813032](.\images\image-20210203101813032.png)

### Scrapy数据流（Data Flow）

（1）引擎：向爬虫器请求第一个要抓取的url。

（2）爬虫器：提供请求url给引擎。

（3）引擎：接收到网址，交给调度器排序入队。

（4）调度器：将它处理成请求（request）给引擎。

（5）引擎：接收到request，并通过下载器中间件给下载器下载。

（6）下载器：根据request下载页面，返回回应（response）给引擎。

（7）引擎：接收到response，并通过爬虫器中间件给爬虫器处理。

（8）爬虫器：处理response，提取博客标题数据，返回结果item给引擎，如果有跟进的请求request也会给引擎。

（9）引擎：接收到item，交给管道；新的request给调度器。

（10）管道：存储数据。

## 安装Scrapy

### 使用pip安装

> pip install Scrapy

### 使用conda安装

> conda install -c conda-forge scrapy

## 通过Scrapy抓取博客

### 创建一个Scrapy项目

> scrapy startproject blogSpider

![image-20210203103052336](.\images\image-20210203103052336.png)

在爬取之前需要先定义目标字段。在items.py中输入需要的字段

```python
# -*- coding: utf-8 -*-

# Define here the models for your scraped items
#
# See documentation in:
# https://doc.scrapy.org/en/latest/topics/items.html

import scrapy


class BlogspiderItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    title = scrapy.Field()
    date = scrapy.Field()
    #content = scrapy.Field()


```

### 获取内容并保存

在项目目录下输入scrapy genspider csdn blog.csdn.net

此时会在blogSpider/spider创建一个csdn.py的文件，此处是定义了名称和爬取范围

```python
# -*- coding: utf-8 -*-
import scrapy


class SantotangSpider(scrapy.Spider):
    name = 'csdn'
    allowed_domains = ['blog.csdn.net']
    start_urls = ['https://blog.csdn.net/weixin_51656605/article/details/113567112']

    def parse(self, response):
        pass

```

如上是默认生成的内容，如果不用命令的话，手动创建文件和内容也是可以的。

- name：爬虫器唯一的名字，不同的爬虫器不能使用相同的名字。
- allow_domains=[]：是搜索的域名范围，规定爬虫只会爬取这个域名下的网页。
- start_urls：爬虫器在启动时会爬取的url列表。
-  parse()：爬虫器的一个方法，获取到爬虫的下载的response，之后解析网页。

补充完整解析：

```python
# -*- coding: utf-8 -*-
import scrapy


class SantotangSpider(scrapy.Spider):
    name = 'csdn'
    allowed_domains = ['blog.csdn.net']
    start_urls = ['https://blog.csdn.net/weixin_51656605/article/details/113567112']

    def parse(self, response):
        print(response.text)
        with open('index.html','w',encoding='utf-8') as f:
            f.write(response.text)

```

然后执行：

> scrapy crawl csdn

重新编写，将数据存入文件中：

```python
# -*- coding: utf-8 -*-
import scrapy
from bs4 import BeautifulSoup
from blogSpider.items import  BlogspiderItem

class CsdnSpider(scrapy.Spider):
    name = 'csdn'
    allowed_domains = ['blog.csdn.net']
    start_urls = ['https://blog.csdn.net/weixin_51656605/category_10700169.html']

    def parse(self, response):
        #print(response.text)
        #with open('index.html','w',encoding='utf-8') as f:
            #f.write(response.text)
        soup = BeautifulSoup(response.text,'lxml')
        article_list = soup.find_all('ul',class_='column_article_list')
        #print(article_list)
        article_info_list = []
        for article in article_list:
            title = article.find('h2',class_='title').text.strip().replace(' ','');
            date = article.find('div',class_='column_article_data').span.text.strip().replace(' ','')
            #article_info_list.append([title,date])
            item = BlogspiderItem()
            item['title'] = title
            item['date'] = date
            article_info_list.append(item)
            #print(article.text)
        return article_info_list
```

修改pipeline:

```python
# -*- coding: utf-8 -*-

# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://doc.scrapy.org/en/latest/topics/item-pipeline.html


class BlogspiderPipeline(object):
    file_path = 'result.txt'
    def __init__(self):
        self.article = open(self.file_path,'a+',encoding='utf-8')
    def process_item(self, item, spider):
        title = item['title']
        date = item['date']
        output = title +'\t' +date+'\t'
        self.article.write(output)
        return item

```

settings.py注释放开：

```python
ITEM_PIPELINES = {
    'blogSpider.pipelines.BlogspiderPipeline': 300,
}
```

然后再执行

scrapy crawl csdn即可将数据保存在本地

爬列表之后爬取内容完整代码：

项目目录：

![image-20210203170924423](.\images\image-20210203170924423.png)

csdn.py

```python
# -*- coding: utf-8 -*-
import scrapy
from bs4 import BeautifulSoup
from blogSpider.items import  BlogspiderItem

class SantotangSpider(scrapy.Spider):
    name = 'csdn'
    allowed_domains = ['blog.csdn.net']
    start_urls = ['https://blog.csdn.net/weixin_51656605/category_10690950.html']

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
            item = BlogspiderItem() #将数据封装到BlogspiderItem对象，字典类型数据
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
```

与之前的不同之处：一是加入了yield，二是加入了函数parse2。然而，Scrapy的并行获取能力就是通过yield实现的。通过yield来发起一个请求，定义url是文章链接，使用meta传递item参数，并通过callback参数为这个请求添加回调函数，这里是self.parse2

items.py

```python
# -*- coding: utf-8 -*-

# Define here the models for your scraped items
#
# See documentation in:
# https://doc.scrapy.org/en/latest/topics/items.html

import scrapy


class BlogspiderItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    title = scrapy.Field()
    date = scrapy.Field()
    link = scrapy.Field()
    content = scrapy.Field()
    #content = scrapy.Field()

```

pipelines.py

```python
# -*- coding: utf-8 -*-

# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://doc.scrapy.org/en/latest/topics/item-pipeline.html


class BlogspiderPipeline(object):
    file_path = 'result.txt'
    def __init__(self):
        self.article = open(self.file_path,'a+',encoding='utf-8')
    def process_item(self, item, spider):
        title = item['title']
        date = item['date']
        link = item['link']
        content = item['content']
        output = title +'\t' +date+'\t' +link +'\t' +content
        self.article.write(output)
        return item

```

settings.py

```python
#此处不是新增，是将注释放开
ITEM_PIPELINES = {
    'blogSpider.pipelines.BlogspiderPipeline': 300,
}
```



### 总结步骤

- scrapy startproject blogSpider 创建项目
- scrapy genspider csdn blog.csdn.net 创建需要爬虫的模板 csdn为名字 blog.csdn.net为网址
- 修改items.py定义类型字段
- 编写请求和解析内容
- 如果需要保存则修改settings.py中的注释内容
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

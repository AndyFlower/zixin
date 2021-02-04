# -*- coding: utf-8 -*-

# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://doc.scrapy.org/en/latest/topics/item-pipeline.html


class FinancespiderPipeline(object):
    file_path = 'finance.txt'
    def __init__(self):
        self.article = open(self.file_path,'a+',encoding='utf-8')
    def process_item(self, item, spider):
        title = item['title']
        link = item['link']
        content = item['content']
        date = item['date']
        source = item['source']
        comment = item['comment']
        involve = item['involve']
        output = title +'\t' + link +'\t' +date+ '\t'+source+'\t'+comment+'\t'+involve + '\t' +content +'\t'
        self.article.write(output)
        return item

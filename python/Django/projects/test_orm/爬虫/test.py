import requests

headers={
         'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36',
     }

res = requests.get(url='https://pdfssj.sslibrary.com/download/getFile?fileMark=13174804&userMark=&pages=196&time=1612172896890&enc=80a77730e954a4fa1f1c7d23ef998f66&code=e8c10374358b37a33086eebea1a06aeb&cpage=8',headers=headers)

print(res.content)
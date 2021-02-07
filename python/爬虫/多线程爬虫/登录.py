import  requests
import http.cookiejar as cookielib #导入cookiejar库
session = requests.session()
session.cookies = cookielib.LWPCookieJar(filename='cookies') #说明cookies所在的位置
post_url = 'http://xxx.xx.com'
agent = ''
headers = {
    'Host':'xxx.xx.com',
    'Origin':'http://xxx.xx.com',
    'Referer':'http://www.xxx.xx.com/test-login',
    'User-Agent':agent
}
#这个要根据自己的需求来变更
postdata = {
    'pwd' :'123456',
    'user' :'test',
    'remember':'forever'
}

login_page = session.post(post_url,data=postdata,headers=headers)
print(login_page.status_code)
session.cookies.save() #保存此次登录的cookies。
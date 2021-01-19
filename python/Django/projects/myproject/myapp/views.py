from django.shortcuts import render

# Create your views here.
from django.shortcuts import  HttpResponse #导入Http Response函数

from django.shortcuts import  render #向HTML文件传递参数，一般用render()函数，代码首先要导入render。

from django.shortcuts import redirect
def index(request): #视图函数
    return HttpResponse('<h1>hello world</h1>')

def test(request):
    hi = '你好，世界是美好的'
    test = '这是一个测试页面，动态显示页面信息，测试成功'
    return render(request,'test.html',{'hi':hi,'test':test}) #通过render()函数向test.html传递模板变量（第3个参数），参数是字典类型，注意字典的key的名字一定与HTML文件中模板变量名一致，并用单引号括起来。

def login(request):
    if request.method =='GET':
        #打开login页面
        return render(request,'login.html')
    else:
        #表单获取用户名和密码
        username = request.POST.get("username")
        password = request.POST.get("password")
        if(username=='test' and password=='123'):
            #用户名密码都正确定向到test
            return redirect('/test/')
        else:
            return render(request,'login.html',{'error':'用户名或密码错误'})
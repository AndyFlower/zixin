## Django框架

### Django简介

在学习Django知识之前，先来了解一下Python的特点：

Python具有解释型、交互式、面向对象这3个特征。

- Python有极其简单、明确的语法，关键字较少，结构简单。
- Python可跨平台，在Linux、Windows和macOS等操作系统中都能很好地运行。
- Python提供所有主流的商业数据库的接口。
- Python提供了一个很好的结构，支持大型程序开发。
- Python是自由/开放源码的软件之一。

Python下有许多款不同的 Web 框架。Django是重量级选手中最有代表性的一位。许多成功的网站和APP都基于Django。

Django是基于Python的一款非常成熟的Web开发框架，完全用Python开发，它功能强大，开发便捷。很多知名网站都是利用Django开发的。Django可插拔式模块的思想及前/后端内容分离的机制，使它具有简单灵活、开箱即用的特点，应用Django使设计、开发、测试、应用等变得便捷高效。

好处：不重复造轮子，让程序员可以专注于编写应用程序业务逻辑代码，而无需重新开发Web应用的通用功能。只要配置好路由，找一个好的模板文件，然后在视图函数中按需求写代码，一个安全、“优雅”的网站就诞生了，不用管服务器如何接收请求，也不用管服务器如何把结果发回浏览器。

除此之前，Django可以无限扩充，它可以让你写的组件、第三方模块或组件融入应用系统中。

Django主要用于简便、快速地开发数据库驱动的网站，它主要有以下特点：

- Django采用了MTV设计模式，即模型Model、模板Template和视图View。
- Django强调代码复用，注重组件的重用性和“可插拔性”，注重敏捷开发和DRY（Don't Repeat Yourself）法则。
- Django有许多功能强大的第三方插件，具有很强的可扩展性。
- Django使开发复杂的、数据库驱动的网站变得简单。

### Django安装

1. 安装Python
2. 安装Python虚拟环境
   - pip install virtualenv
   - virtualenv newenv_dir  创建一个虚拟环境
   - activate  (进入newev_dir目录，再到Scripts文件夹下 )激活虚拟环境
3. 安装Django
   - pip install django （或者指定版本：pip install django==3.1.5）

### Django基本知识

1. Django的开发优势：

- 功能完备：Django提供了“开箱即用”的功能，这些功能可以无缝结合在一起，并遵循一致性设计原则，对开发人员来说非常重要。Django有完善的ORM、强大的路由映射功能、完善的视图模板的实现、强大的缓存支持等。
- 通用：Django可以构建多种类型的网站，可以与许多客户端框架一起工作，支持并且可以提供多种格式的内容，如HTML、RSS（Really SimpleSyndication，简单信息整合）、JSON （Java Scripe Object Notation，Java Script对象简谱）、XML（Extensible Markup Language，可扩展标记语言）等格式的内容。
- 安全：Django能够自动保护网站，避免许多常见的安全错误。例如要将session放在cookie中这种易受攻击的方式改变为一种安全的方式，就让cookies只包含一个密钥，实际数据存储在数据库中；并用hash()函数加密用户密码。默认情况下，Django可以防范许多漏洞，包括SQL（StructurQuery Language，结构查询语言）注入、跨站脚本、CSRF（Cross-SiteRequest Forgery，跨站请求伪造）、单击劫持等。
- 可移植：Django是用Python编写的，Python能在许多操作系统上运行，因此用Django开发的程序不受特定服务器操作系统的限制，可以在Linux、Windows、mac OS等操作系统上正常运行。
- 自助管理后台：Django拥有一个强大的Django Admin管理后台，用户几乎不用写代码就拥有一个完整的后台管理页面。

2. Django的MTV设计模式简介

- 模型：用来定义数据结构的类，并提供数据库表管理机制，主要用来定义字段的名称、类型、字段最大值、默认值、约束条件等。

  ```python
  from django.db import models
  
  class employee(models.Model):
      #员工姓名
      name=models.CharField(max_length=32,verbose_name='姓名')
      #员工邮箱
      email = models.EmailField(verbose_name='邮箱')
  ```

  这段代码展示了一个非常简单的Django数据模型，从代码中可以看到，数据模型类必须==继承于models.Model==，它在类中定义了两个属性name和email，这两个属性相当于数据库表的字段，它们为字符类型，代码还设置了字段的一些约束，如最大长度、字段显示名称等。

- 模板文件：一般是HTML格式，用于定义文件的结构或布局，并使用占位符表示相关内容，通过视图函数提取数据模型的数据填充HTML文件的占位符，可以创建动态页面。

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head><meta charset="UTF-8">
          <title>Title</title>
      </head>
      <body>{{ hello }}</body>
  </html>
  ```

  模板文件输出指定文档的结构，占位符用于表示在生成页面时填充的数据。在以上代码中，{{ hello }}称为==模板变量==，是一个占位符，视图函数可以用render()把变量hello传过来，在页面上显示时会用变量的实际值替换{{ hello}}。

- MTV的V包含视图函数以及与它有密切关系的URL配置。

  - 视图函数：是一个处理Web请求的函数，它接收HTTP请求，经过一番处理，返回HTTP响应。也就是视图函数接收请求后，到数据模型里拿到客户端需要的数据，把数据以一定的格式传递给模板文件，然后Django把模板文件以HTTP 响应格式发送给浏览器。

  ```python
  from django.http import HttpResponse
  
  def hello(request):
      #前面可以有向数据模型请求数据的代码
      return HttpResponse("hello world")#返回响应
  ```

  视图函数要求必须接收一个Http Request对象作为参数并返回HttpResponse对象，以上代码只是返回了一个字符串。

  - URL配置：建立URL与视图函数对应关系，相当于URL映射器，主要作用是根据浏览器（客户端）的URL，将HTTP请求重定向到相应的视图函数进行处理。

    ```python
    
    from django.contrib import admin
    
    from django.urls import path
    
    from . import views
    
    #特定URL表达式和相应视图函数之间的映射列表，如果接收到具有与指定模式匹配的URL的HTTP请求，则将调用相关联的视图函数
    urlpatterns = [
        path('admin/',admin.site.urls),
        path('hello/',views.hello)
        ]
    ```

3. Django的其他功能
   - 表单：Django通过表单进行数据验证和处理。
   - 用户身份验证和权限：Django有一个强大的、安全性很高的用户身份验证和权限系统。
   - 序列化数据：Django可以轻松地将数据序列化，并支持XML或JSON格式。
   - 管理后台：Django Admin管理后台使系统管理员能够轻松创建、编辑和查看网站中的任何数据模型，这个管理后台是Django默认包含的。
   - 缓存机制：Django提供灵活的缓存机制，可以存储部分页面，提高网页响应速度。

4. Django的主要文件
   - ==urls.py==是进行URL配置的文件，是==网址入口==，建立URL表达式与视图函数的对应关系，也就是建立“访问网址就是调用函数”的机制
   - ==views.py==是视图函数存放模块，处理用户发出的请求。用户请求从urls.py中的配置项映射过来，逻辑代码分析用户请求后，从数据库中提取数据，向templates文件夹中的模板文件传递数据。
   - ==models.py==是数据模型，定义数据表结构，是数据库操作的基础。
   - ==forms.py==是Django表单定义文件，通过表单及字段属性设置，生成页面文本框，对用户提交的数据进行验证。
   - ==templates==文件夹中的文件是模板文件，这些文件是视图函数渲染改造的对象，一般是HTML文件，它与视图函数共同生成具有动态内容的网页。
   - ==admin.py==是管理后台配置文件，经过简单的配置代码，就能让后台对数据库数据进行管理。
   - ==settings.py==是Django配置文件，在文件中可设置应用程序模块、数据库类型、中间件等，可以让各应用程序共享配置内容。
   - ==apps.py==是应用程序本身的配置文件。
   - ==tests.py==是用来编写单元测试代码的文件。

### Django基本开发流程

1. 部署开发环境

   pip install django

2. 创建项目

   cd test_django

   django-admin startproject myproject

   - - 目录
       - myproject:项目myproject的根目录
         - __init.py__　　# 一个空文件，用来告诉Python这是myproject目录的一个模块
         - settings.py　 # 项目配置文件，包含一些初始化设置
         - urls.py  # 存放URL表达式的文件，这里定义的每一个URL都对应一个视图函数，这个文件称为路由文件
         - wsgi.py  #服务器程序和应用程序的一个协议接口，规定了使用的接口和功能，这个文件不需修改， Django已为项目配置好
       - manage.py:# 简单的命令文件封装文件，可以通过这个文件生成应用程序

   

3. 创建应用程序

   在一个项目下可以有多个应用程序并实现不同功能，Django可以根据需求建立多个应用程序模块，各个应用程序模块共享项目的配置环境.

   cd myproject

   python manage.py startapp myapp #生成应用程序模块，运行完成后在/myproject下会多一个目录myapp

​      myapp目录如下：

- __init__.py
- admin.py　　# 配置管理后台，写少量代码就可以启用Django Admin管理后台
- apps.py：　　# 存放当前应用程序的配置
- models.py　 # 存放数据库相关的内容
- tests.py　　# 可在这个文件写测试代码以对当前应用程序进行测试
- views.py　　# 存放业务请求功能的代码
- migrations/ # 这个文件夹中的文件保存该应用程序的数据库表与变化的相关内容

4. 编写业务逻辑代码

   业务逻辑代码按照Django的约定一般要写在views.py文件中，换句话说就是要在views.py文件中生成一个视图函数并在其中编写代码。

   ```python
   #views.py
   from django.shortcuts import render
   
   # Create your views here.
   from django.shortcuts import  HttpResponse #导入Http Response函数
   
   def index(request): #视图函数
       return HttpResponse('<h1>hello world</h1>')
   ```

5. 建立URL与视图函数的对应关系

   URL与视图函数的对应关系要放在urls.py文件中，对应关系以URL配置项形式放在文件中的一个列表变量中.

   ```python
   #urls.py
   from django.contrib import admin
   from django.urls import path
   from myapp import  views
   
   urlpatterns = [
       path('admin/', admin.site.urls),
   path('index/', views.index)
   ]
   
   ```

   启动应用程序：

   - python manage.py runserver

   访问应用程序：

   - http://127.0.0.1:8000/index/

6. 动态加载HTML页面

   - 创建templates文件夹，文件夹下新建test.html

     ```html
     <!DOCTYPE html>
     <html lang="en">
     <head>
         <meta charset="UTF-8">
         <title>测试模板</title>
     </head>
     <body>
         <div align="center">
             <h1>{{ hi }}</h1>
             <hr><h2>{{ test }}
         </h2></div>
     </body>
     </html>
     ```

     

   - 编写views.py中内容

     ```python
     from django.shortcuts import render
     
     # Create your views here.
     from django.shortcuts import  HttpResponse #导入Http Response函数
     
     from django.shortcuts import  render #向HTML文件传递参数，一般用render()函数，代码首先要导入render。
     def index(request): #视图函数
         return HttpResponse('<h1>hello world</h1>')
     
     def test(request):
         hi = '你好，世界是美好的'
         test = '这是一个测试页面，动态显示页面信息，测试成功'
         return render(request,'test.html',{'hi':hi,'test':test}) #通过render()函数向test.html传递模板变量（第3个参数），参数是字典类型，注意字典的key的名字一定与HTML文件中模板变量名一致，并用单引号括起来。
     ```

     

   - 配置settings

     ```python
     """
     Django settings for myproject project.
     
     Generated by 'django-admin startproject' using Django 3.1.5.
     
     For more information on this file, see
     https://docs.djangoproject.com/en/3.1/topics/settings/
     
     For the full list of settings and their values, see
     https://docs.djangoproject.com/en/3.1/ref/settings/
     """
     
     from pathlib import Path
     import  os
     # Build paths inside the project like this: BASE_DIR / 'subdir'.
     #BASE_DIR = Path(__file__).resolve().parent.parent
     BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
     print('BASE_DIR',BASE_DIR)
     
     
     # Quick-start development settings - unsuitable for production
     # See https://docs.djangoproject.com/en/3.1/howto/deployment/checklist/
     
     # SECURITY WARNING: keep the secret key used in production secret!
     SECRET_KEY = 'tr^)h2bb7&s%dk9)+fzx7%*fz4rl7=naj11#8!c2d&vzg43q($'
     
     # SECURITY WARNING: don't run with debug turned on in production!
     DEBUG = True
     
     ALLOWED_HOSTS = []
     
     
     # Application definition
     
     INSTALLED_APPS = [
         'django.contrib.admin',
         'django.contrib.auth',
         'django.contrib.contenttypes',
         'django.contrib.sessions',
         'django.contrib.messages',
         'django.contrib.staticfiles',
     ]
     
     MIDDLEWARE = [
         'django.middleware.security.SecurityMiddleware',
         'django.contrib.sessions.middleware.SessionMiddleware',
         'django.middleware.common.CommonMiddleware',
         'django.middleware.csrf.CsrfViewMiddleware',
         'django.contrib.auth.middleware.AuthenticationMiddleware',
         'django.contrib.messages.middleware.MessageMiddleware',
         'django.middleware.clickjacking.XFrameOptionsMiddleware',
     ]
     
     ROOT_URLCONF = 'myproject.urls'
     
     TEMPLATES = [
         {
             'BACKEND': 'django.template.backends.django.DjangoTemplates',
             'DIRS': [os.path.join(BASE_DIR,'templates')], #指定templates位置
             'APP_DIRS': True,
             'OPTIONS': {
                 'context_processors': [
                     'django.template.context_processors.debug',
                     'django.template.context_processors.request',
                     'django.contrib.auth.context_processors.auth',
                     'django.contrib.messages.context_processors.messages',
                 ],
             },
         },
     ]
     
     WSGI_APPLICATION = 'myproject.wsgi.application'
     
     
     # Database
     # https://docs.djangoproject.com/en/3.1/ref/settings/#databases
     
     
     
     # Password validation
     # https://docs.djangoproject.com/en/3.1/ref/settings/#auth-password-validators
     
     AUTH_PASSWORD_VALIDATORS = [
         {
             'NAME': 'django.contrib.auth.password_validation.UserAttributeSimilarityValidator',
         },
         {
             'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
         },
         {
             'NAME': 'django.contrib.auth.password_validation.CommonPasswordValidator',
         },
         {
             'NAME': 'django.contrib.auth.password_validation.NumericPasswordValidator',
         },
     ]
     
     
     # Internationalization
     # https://docs.djangoproject.com/en/3.1/topics/i18n/
     
     LANGUAGE_CODE = 'en-us'
     
     TIME_ZONE = 'UTC'
     
     USE_I18N = True
     
     USE_L10N = True
     
     USE_TZ = True
     
     
     # Static files (CSS, JavaScript, Images)
     # https://docs.djangoproject.com/en/3.1/howto/static-files/
     
     STATIC_URL = '/static/'
     
     ```

   - 访问：http://127.0.0.1:8000/test/

7. 配置静态文件存放位置

   网页可以引用图像、音/视频、CSS、Java Script等形式的文件

   ```python
   #setting.py
   """
   Django settings for myproject project.
   
   Generated by 'django-admin startproject' using Django 3.1.5.
   
   For more information on this file, see
   https://docs.djangoproject.com/en/3.1/topics/settings/
   
   For the full list of settings and their values, see
   https://docs.djangoproject.com/en/3.1/ref/settings/
   """
   
   from pathlib import Path
   import  os
   # Build paths inside the project like this: BASE_DIR / 'subdir'.
   #BASE_DIR = Path(__file__).resolve().parent.parent
   BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
   print('BASE_DIR',BASE_DIR)
   
   
   # Quick-start development settings - unsuitable for production
   # See https://docs.djangoproject.com/en/3.1/howto/deployment/checklist/
   
   # SECURITY WARNING: keep the secret key used in production secret!
   SECRET_KEY = 'tr^)h2bb7&s%dk9)+fzx7%*fz4rl7=naj11#8!c2d&vzg43q($'
   
   # SECURITY WARNING: don't run with debug turned on in production!
   DEBUG = True
   
   ALLOWED_HOSTS = []
   
   STATIC_URL='/static/' #静态文件夹前缀
   STATICFILES_DIRS=(
       os.path.join(BASE_DIR,'static'), #单个元素 末尾的逗号必须有 否则会提示不是元祖或列表
   )
   # Application definition
   
   INSTALLED_APPS = [
       'django.contrib.admin',
       'django.contrib.auth',
       'django.contrib.contenttypes',
       'django.contrib.sessions',
       'django.contrib.messages',
       'django.contrib.staticfiles', #静态文件引入
   ]
   
   MIDDLEWARE = [
       'django.middleware.security.SecurityMiddleware',
       'django.contrib.sessions.middleware.SessionMiddleware',
       'django.middleware.common.CommonMiddleware',
       'django.middleware.csrf.CsrfViewMiddleware',
       'django.contrib.auth.middleware.AuthenticationMiddleware',
       'django.contrib.messages.middleware.MessageMiddleware',
       'django.middleware.clickjacking.XFrameOptionsMiddleware',
   ]
   
   ROOT_URLCONF = 'myproject.urls'
   
   TEMPLATES = [
       {
           'BACKEND': 'django.template.backends.django.DjangoTemplates',
           'DIRS': [os.path.join(BASE_DIR,'templates')], #指定templates位置
           'APP_DIRS': True,
           'OPTIONS': {
               'context_processors': [
                   'django.template.context_processors.debug',
                   'django.template.context_processors.request',
                   'django.contrib.auth.context_processors.auth',
                   'django.contrib.messages.context_processors.messages',
               ],
           },
       },
   ]
   
   WSGI_APPLICATION = 'myproject.wsgi.application'
   
   
   # Database
   # https://docs.djangoproject.com/en/3.1/ref/settings/#databases
   
   
   
   # Password validation
   # https://docs.djangoproject.com/en/3.1/ref/settings/#auth-password-validators
   
   AUTH_PASSWORD_VALIDATORS = [
       {
           'NAME': 'django.contrib.auth.password_validation.UserAttributeSimilarityValidator',
       },
       {
           'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
       },
       {
           'NAME': 'django.contrib.auth.password_validation.CommonPasswordValidator',
       },
       {
           'NAME': 'django.contrib.auth.password_validation.NumericPasswordValidator',
       },
   ]
   
   
   # Internationalization
   # https://docs.djangoproject.com/en/3.1/topics/i18n/
   
   LANGUAGE_CODE = 'en-us'
   
   TIME_ZONE = 'UTC'
   
   USE_I18N = True
   
   USE_L10N = True
   
   USE_TZ = True
   
   
   # Static files (CSS, JavaScript, Images)
   # https://docs.djangoproject.com/en/3.1/howto/static-files/
   
   STATIC_URL = '/static/'
   
   ```

   新增login.html

   ```html
   <!DOCTYPE html>
   {% load static %} <!--表示HTML文件要加载静态文件的相关设置-->
   
   <html lang="zh-CN">
   <head>
       <meta charset="UTF-8">
       <title>登录</title>
       <link href="{% static 'bootstrap/css/bootstrap.min.css' %}" rel="stylesheet">
       <link href="{% static 'sigin.css' %}" rel="stylesheet">
       <link rel="stylesheet" href="{% static 'fontawesome/css/font-awesome.min.css' %}">
       <script src="{% static 'jquery-3.5.1.min.js' %}">
   
   </script>
       <script src="{% static 'bootstrap/js/bootstrap.min.js' %}"></script>
   </head>
   <body>
   <div class="container">
       <form class="form-signin" method="post" action="">
           {% csrf_token %} <!--这种形式的标签称为模板标签，可以实现与函数、代码语句相似的功能 csrf_token:防止跨站请求伪造以及中间件-->
           <h2 class="form-signin-heading">请登录</h2>
           <p></p>　<p></p>
           <label for="username" class="sr-only">用户名</label>
           <input type="text" id="username" name="username" class="form-control" placeholder="用户" required autofocus>
           <p></p><p></p>
           <label for="password" class="sr-only">密 码</label>
           <input type="password" id=password" name="password" class="form-control" placeholder="密码" required>
           <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
       </form>
   </div> <!-- /container -->
   </body>
   </html>
   ```

   新增login请求

   ```python
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
   ```

   urls.py新增path

   ```python
   
   urlpatterns = [
       path('admin/', admin.site.urls),
   path('index/', views.index),path('test/',views.test),
       path('login/',views.login)
   ]
   
   ```

8. 连接数据库

   - 配置数据库

     ```python
     # setting.py
     DATABASES = {
         #'default':{
          #   #数据库引擎，指明数据库类型
          #   'ENGINE':'django.db.backends.sqlites',
         #    # 指明数据库所在位置，本项目中数据库位置：/myproject/db.sqlites
         #    'NAME':os.path.join(BASE_DIR,'db.sqlite3'),
         #}
         'default':{
             'ENGINE':'django.db.backends.mysql',# 数据库引擎，指明数据库类型
             'HOST':'192.168.2.213',
             'PORT':'3306',
             'NAME':'mycat_manager',
             'USER':'root',
             'PASSWORD':'loyalty'
         }
     }
     
     ```

     

   - 建立数据表

     ```python
     from django.db import models #第一行代码导入models模块
     
     # Create your models here.
     
     class UserInfo(models.Model): #通过建立UserInfo类建立UserInfo数据表。
         user = models.CharField(max_length=32,verbose_name='姓名')
         email = models.EmailField(verbose_name='邮箱')
     
         def __str__(self): #__str__返回模型对象的描述
             return self.user
     ```

     

   - 注册app

     ```python
     #setting.py
     INSTALLED_APPS = [
         'django.contrib.admin',
         'django.contrib.auth',
         'django.contrib.contenttypes',
         'django.contrib.sessions',
         'django.contrib.messages',
         'django.contrib.staticfiles', #静态文件引入
         'myapp', ## 注册应用程序myapp
     ]
     ```

     

   - 使用pymysql替代MySQLDB

     ```python
     # myproject下的__init__文件
     import pymysql
     pymysql.version_info = (1, 4, 13, "final", 0) #这一行没有会报版本低
     pymysql.install_as_MySQLdb()
     ```

     

   - 终端执行命令

     python manage.py makemigrations

     python manage.py migrate

     执行完之后就会看到数据库多了很多表

9. Django后台管理

   注册数据库表，在/myproject/myapp/admin.py中注册models.py生成的数据表

   ```python
   from django.db import models #第一行代码导入models模块
   
   # Create your models here.
   
   class UserInfo(models.Model): #通过建立UserInfo类建立UserInfo数据表。
       user = models.CharField(max_length=32,verbose_name='姓名')
       email = models.EmailField(verbose_name='邮箱')
   
       def __str__(self): #__str__返回模型对象的描述
           return self.user
   ```

   修改setting.py支持显示中文：

   ```python
   #LANGUAGE_CODE = 'en-us'
   LANGUAGE_CODE = 'zh-hans'  # 语言格式
   #TIME_ZONE = 'UTC'
   TIME_ZONE = 'Asia/Shanghai' # 设置时区
   USE_I18N = True
   ```

   创建后台管理用户

   python manage.py createsuperuser

   运行系统，使用创建的用户登录

   python manage.py runserver

   访问网址

   http://127.0.0.1:8000/admin/

   

## Django ORM

### Django ORM的特点

1. Django ORM的优点

   Django ORM通过统一格式的业务逻辑代码操作数据库，把SQL语句统一转换成较为固定的Django语法结构。

2. Django ORM的缺点

   Django ORM本质上是对SQL语句的功能进行封装，最终还是转化成SQL语句来操作数据库。这些SQL语句必然是统一格式的，有时会在一定程度上牺牲执行效率。

3. Django ORM的模式特征

   Django中的一个数据模型（Model）映射一个数据库表。其基本情况是：类（django.db.models.Model）映射到数据库表，类的属性映射为数据库表字段，类的实例对象则映射为数据行。

   Django ORM能实现的功能：一是生成数据库表，如数据库表的创建、修改、删除；二是操作数据库表的数据行，如数据行的增、删、改、查。DjangoORM不能创建数据库，需要在数据库管理系统中手工创建。

   使用步骤：

   - 在项目使用的数据库管理系统中建立数据库。
   - 在项目的配置文件settings.py中设置数据库的连接字符。
   - 在应用程序的models.py文件中编写继承于models.Model的数据模型。
   - 运行python manage.py makemigrations、python manage.pymigrate两个命令生成数据库表。
   - 使用Django ORM操作数据库表。

### Django ORM的用法

1. 常用字段类型
   - user=models.Char Field(max_length=32,verbose_name='姓名') CharField：字符类型，必须提供max_length参数 verbose_name在Django Admin管理后台是字段的显示名称，可理解为字段别名
   - email=models.Email Field(verbose_name='邮箱') ：Email Field：邮箱类型，实际上是字符类型，只是提供了邮箱格式检验。
   - descript=models.Text Field(verbose_name="简介")：Text Field：文本类型，存储大段文本字符串。字符串如果超过 254 个字符建议使用Text Field。
   - int= models.Integer Field()：Integer Field：整数类型。
   - date=models.Date Field(auto_now=True, auto_now_add=False)：Date Field：日期字段。
   - time= models.Time Field(auto_now=False, auto_now_add=False)：Time Field：时间字段。
   - datetime=models.Date Time Field(auto_now=False,auto_now_add=False)：Date Time Field：日期时间字段，合并了日期字段与时间字段。
   - filetest =models.Fiel Field (upload_to = 'test/')：File Field：实际上是字符串类型，用来把上传的文件的路径保存在数据库中。文件上传到指定目录，主要参数upload_to指明上传文件的保存路径，这个路径与Django配置文件的MEDIA_ROOT变量值有关。
   - picture = models.Image Field(upload_to = 'pic/')：Image Field：实际上是字符串类型，用来把上传的图片的路径保存在数据库中。
2. 常用字段属性
   - db_index：db_index=True表示设置此字段为数据库表的索引。title = models.Char Field(max_length=32, db_index=True)
   - unique：unique=True表示该字段在数据库表中不能有重复值。
   - default：设置字段默认值，如default='good'。
   - auto_now_add：Datetime Field、Date Field、Time Field 这 3 种字段的独用属性， auto_now_add=True表示把新建该记录的时间保存为该字段的值。
   - auto_now：Datetime Field、Date Field、Time Field这3种字段的独用属性，auto_now= True表示每次修改记录时，把当前时间存储到该字段。

### Django ORM基本数据操作

1. 增加记录。

   - 第一种方式 

     new_emp= models.employee.objects.create(name="tom",email="tom@163.com",dep_id=66）

   - 第二种方式，必须调用save()函数

     new_emp= models.employee (name="tom",email="tom@163.com",dep_id=66)

     new_emp.save()

2. 删除记录，用filter()过滤出符合条件的记录后调用delete()删除

    删除符合条件的数据models. employee.objects.filter(name= "张三").delete()

3. 修改记录

    将指定条件的记录更新，并更新指定字段的值models.employee.objects.filter(name='tom').update(email="tom2@163.com")

    修改单条数据

   obj = models.employee.objects.get(id=66)

   obj.email = "tom2@sina.com"

   obj.save()

4. 查询

   获取全部

   Emp_list= models.employee.objects.all()

    获取单条数据，数据不存在则报错

   Emp=models.employee.objects.get(id=123)

   获取指定条件的记录集

   Emp_group=models. employee.objects.filter(name= "张三")

### Django ORM数据操作常用函数

1. all()函数，返回符合条件的全部记录。

   objects = models.employee.objects.all()

2. filter()函数，返回指定条件的记录。filter后面的括号内为过滤条件，类似于SQL中语句where后面的条件语句。条件名词：contains、icontains、in、gt、lt、range、startswith、endswith、istartswith、iendswith

   objects = models.employee.objects.filter(name='tom') 

   获取name字段包含“Tom”的记录

   `models. employee.objects.filter(name__contains="Tom")`

    获取name字段包含“tom”的记录,icontains忽略大小写`models.employee.objects.filter(name__icontains="tom")`

    获取employee数据表中id等于10、20、66的数据

   `models. employee.objects.filter(id__in=[10, 20, 66])`

    获取employee数据表中id不等于10、20、66的记录，因为前面用的是`excludemodels. employee.objects.exclude(id__in=[10, 20, 66])`。

    获取employee数据表中id大于1 且 小于10的记录，两个过滤条件的关系等价于SQL的and `models. employee.objects.filter(id__gt=1, id__lt=10)`

    获取employee数据表中id在范围1～66内的记录，等价于SQL的idbettwen 1 and 66

   `models. employee.objects.filter(id__range=[1, 66])`

    获取employee数据表中birthday字段中月份为9月的记录，birthday为日期格式

   models. employee.objects.filter(birthday__month=9)

3. values_list()函数，返回一个元组类型序列

   objects = models.employee.objects.values_list('id','name','email')print( objects)

4. get()、first()、last()返回单个对象，可以理解为返回数据表中的一条记录。

   返回id为1的记录，括号内是过滤条件

   object1 = models.employee.objects.get(id=1)

    返回数据集的第一条记录

   object2 = models.employee.objects.first()

    返回数据集的最后一条记录

   object3 = models.employee.objects.last()

    返回数据集的个数

   object4= models.employee.objects.count()

5. 


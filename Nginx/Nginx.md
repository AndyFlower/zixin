## Nginx

### 一.Nginx的基本概念

#### 1.nginx 是什么，做什么事情

Nginx (engine x) 是一个高性能的[HTTP](https://baike.baidu.com/item/HTTP)和[反向代理](https://baike.baidu.com/item/反向代理/7793488)web服务器，其特点是占有内存少，[并发](https://baike.baidu.com/item/并发/11024806)能力强，事实上nginx的并发能力在同类型的网页服务器中表现较好，中国大陆使用nginx网站用户有：百度、[京东](https://baike.baidu.com/item/京东/210931)、[新浪](https://baike.baidu.com/item/新浪/125692)、[网易](https://baike.baidu.com/item/网易/185754)、[腾讯](https://baike.baidu.com/item/腾讯/112204)、[淘宝](https://baike.baidu.com/item/淘宝/145661)等。

Nginx专门为性能优化而开发，性能是起最重要的考量，实现上非常注重效率，能经手高负载的考研，有报告表明能支撑高达50000个并发数链接。

#### 2.反向代理

要理解反向代理，我们先来看一下什么是正向代理。

> 正向代理:如果吧局域网外的internet想象成一个巨大的资源局，则局域网中的客户端要访问Internet,则需要通过代理服务器来访问，这种代理服务就成为正向代理。

![1-正向代理](../images\Nginx\1-正向代理.png)

反向代理，其实客户端对代理是无感知的，因为**客户端不需要任何配置**就可以访问，我们只需要将请求发送到反向代理服务器，由反向代理服务器去选择目标服务器，获取数据后，返回客户端，此时反向代理服务器和目标服务器对外就是一个服务器，暴露的是代理服务器地址，隐藏了真实的服务器IP地址。

![2-反向代理](..\images\Nginx\2-反向代理.png)

#### 3.负载均衡

增加服务器的数量，然后将请求分发到各个服务器上，将原先请求集中到单个服务器上的情况改为请求分发到多个服务器上，将负载分发到不同的服务器，也就是我们所说的负载均衡。

![3-负载均衡](..\images\Nginx\3-负载均衡.png)

#### 4.动静分离

为了加快网站的解析速度，可以把动态页面和静态页面由不同的服务器来解析，加快解析速度。降低原来单个服务器的压力。

![4-动静分离](..\images\Nginx\4-动静分离.png)

### 二.Nginx的安装，常用命令和配置文件

#### 1.在linux系统中安装nginx

##### 1.1 准备工作

准备虚拟机

到nginx官网下载软件

##### 1.2 需要的依赖

pcre

openssl

zlib

nginx

- 安装pcre依赖

  wget http://downloads.sourceforge.net/project/pcre/8.37/pcre-8.37.tar.gz

  tar -xvf pcre-8.37.tar.gz

  进入解压目录，执行./configure

  > 如果提示：configure: error: no acceptable C compiler found in $PATH
  >
  > 需要安装下c编译器：yum -y llinstall  gcc
  >
  > 如果提示：configure:errpr:You need a C++ compiler for C++ support
  >
  > 需要安装下c++编译器：yum -y llinstall  gcc gcc-c++
  >
  > # 

  make &&  make install

  查看版本号：pcre-config --version

- 安装openssl zlib

  yum -y install make zlib zlib0devel gcc-c++ libtool openssl openssl-devel

- 安装nginx

  wget http://nginx.org/download/nginx-1.12.2.tar.gz

  tar -xvf nginx-1.12.2.tar.gz

  进入解压的路径 ./confirure

  make && make install

  安装成功之后，在/usr文件夹下会多出来一个local/nginx

  cd /usr/local/nginx/sbin 

  ./nginx

  查看是否启动成功 ps -ef |grep nginx

  ![6-nginx查看进程](..\images\Nginx\6-nginx查看进程.png)

  查看nginx默认监听的端口

  ![7-nginx监听端口](..\images\Nginx\7-nginx监听端口.png)

  直接访问有可能无法访问，因为默认80端口是无法访问的

  查看开放的端口号：firewall-cmd --list-all

  ![8-查看端口号前](..\images\Nginx\8-查看端口号前.png)

  设置开放的端口号

  firewall-cmd --add-service=http --permanent

  firewall-cmd --add-port=80/tcp --permanent

  ![9-添加端口号](..\images\Nginx\9-添加端口号.png)

  重启防火墙

  firewall-cmd -reload

  ![10-添加端口号之后查看](..\images\Nginx\10-添加端口号之后查看.png)

  使用ip地址和端口进行访问

  ![11-访问](..\images\Nginx\11-访问.png)

  出现此页面，即表示安装成功

#### 2.nginx常用命令

使用nginx操作命令前提条件，必须进入nginx的目录

##### 2.1 查看nginx版本号

`./nginx -v`

##### 2.2 启动nginx

`./nginx`

##### 2.3 停止nginx

`./nginx -s stop`

##### 2.4 重新加载nginx

`./nginx -s reload`

![12-nginx常用命令](..\images\Nginx\12-nginx常用命令.png)

#### 3.nginx配置文件

##### 3.1 nginx配置文件位置

/usr/local/nginx/conf/nginx.conf

##### 3.2 配置文件组成部分

1. 全局块

   ```
   #user  nobody;
   worker_processes  1;
   
   #error_log  logs/error.log;
   #error_log  logs/error.log  notice;
   #error_log  logs/error.log  info;
   
   #pid        logs/nginx.pid;
   ```

   

   从配置文件开始到 events 块之间的内容，主要会设置一些影响 nginx 服务器整体运行的配置指令，主要包括配置运行 Nginx 服务器的用户（组）、允许生成的 worker process 数，进程 PID 存放路径、日志存放路径和类型以及配置文件的引入等。

   比如worker_processes  1;

   这是 Nginx 服务器并发处理服务的关键配置，worker_processes 值越大，可以支持的并发处理量也越多，但是

   会受到硬件、软件等设备的制约

2. events块

   ```
   events {
       worker_connections  1024;
   }
   ```

   events 块涉及的指令主要影响 Nginx 服务器与用户的网络连接，常用的设置包括是否开启对多 work process 

   下的网络连接进行序列化，是否允许同时接收多个网络连接，选取哪种事件驱动模型来处理连接请求，每个 word 

   process 可以同时支持的最大连接数等。

    上述例子就表示每个 work process 支持的最大连接数为 1024.

    这部分的配置对 Nginx 的性能影响较大，在实际中应该灵活配置。

3. http块

   ```
   http {
       include       mime.types;
       default_type  application/octet-stream;
   
       #log_format  main  '$remote_addr - $remote_user [$time_local] "$request" '
       #                  '$status $body_bytes_sent "$http_referer" '
       #                  '"$http_user_agent" "$http_x_forwarded_for"';
   
       #access_log  logs/access.log  main;
   
       sendfile        on;
       #tcp_nopush     on;
   
       #keepalive_timeout  0;
       keepalive_timeout  65;
   
       #gzip  on;
   
       server {
           listen       80;
           server_name  localhost;
   
           #charset koi8-r;
   
           #access_log  logs/host.access.log  main;
   
           location / {
               root   html;
               index  index.html index.htm;
           }
   
           #error_page  404              /404.html;
   
           # redirect server error pages to the static page /50x.html
           #
           error_page   500 502 503 504  /50x.html;
           location = /50x.html {
               root   html;
           }
   
          
       }
   
   }
   ```

   这算是 Nginx 服务器配置中最频繁的部分，代理、缓存和日志定义等绝大多数功能和第三方模块的配置都在这里。

    需要注意的是：http 块也可以包括 **http 全局块**、**server 块**

   - http全局块

      http 全局块配置的指令包括文件引入、MIME-TYPE 定义、日志自定义、连接超时时间、单链接请求数上限等。

   - server块

     这块和虚拟主机有密切关系，虚拟主机从用户角度看，和一台独立的硬件主机是完全一样的，该技术的产生是为了节省互联网服务器硬件成本。每个 http 块可以包括多个 server 块，而每个 server 块就相当于一个虚拟主机。而每个 server 块也分为全局 server 块，以及可以同时包含多个 locaton 块。

      **1、全局 server 块**

      最常见的配置是本虚拟机主机的监听配置和本虚拟主机的名称或 IP 配置。

      **2、location 块**

      一个 server 块可以配置多个 location 块。这块的主要作用是基于 Nginx 服务器接收到的请求字符串（例如 server_name/uri-string），对虚拟主机名称（也可以是 IP 别名）之外的字符串（例如 前面的 /uri-string）进行匹配，对特定的请求进行处理。地址定向、数据缓存和应答控制等功能，还有许多第三方模块的配置也在这里进行。

### 三.Nginx配置实例-反向代理

#### 1.实现效果

打开浏览器，在浏览器输入www.123.com，跳转到linux系统tomcat的主页面中

#### 2.准备工作

##### 2.1 安装tomcat服务器。使用默认8080端口

下载tomcat安装包并解压，然后启动，具体操作见下图

![13-安装tomcat并启动](..\images\Nginx\13-安装tomcat并启动.png)

配置开放8080端口

firewall-cmd --add-port=8080/tcp --permanent

firewall-cmd --reload

firewall-cmd --list-all

![14-tomcat开放8080端口](..\images\Nginx\14-tomcat开放8080端口.png)

查看tomcat服务器是否配置成功

![15-tomcat服务器是否成功](..\images\Nginx\15-tomcat服务器是否成功.png)

##### 2.2 配置

在C:\Windows\System32\drivers\etc下hosts文件中添加

`192.168.181.200 www.123.com`

nginx配置文件中做如下修改

![16-反向代理配置](..\images\Nginx\16-反向代理配置.png)

查看效果：

![17-反向代理查看](..\images\Nginx\17-反向代理查看.png)



#### 反向代理，例二

##### 1.实现效果

使用nginx反向代理，根据访问的路径跳转到不同的端口服务中去，‘

nginx监听端口为9001

访问http://127.0.0.1:9001/edu/直接跳转到127.0.0.1:8080

访问http://127.0.0.1:9001/vod/直接跳转到127.0.0.1:8081

##### 2.准备工作

准备两个tomcat服务器

创建文件夹和测试文件

##### 3.具体配置

```
server{
	listen  9001;
	server_name 192.168.181.200;
	location ~ /edu/{
		proxy_pass http://127.0.0.1:8080;
	}
	location ~ /vod/{
		proxy_pass http://127.0.0.1:8081;
	}
}
```

> 记得开放端口号



### 四.Nginx配置实例-负载均衡

#### 1.实现效果

浏览器输入http://192.168.181.200/edu/a.html负载均衡，平均到8080和8081端口中

#### 2.准备工作

准备2台tomcat  修改端口

在webapps目录下创建名称为edu文件夹，在edu文件夹中国创建页面用于测试。

#### 3.配置

```
upstream  myserver{
	server 192.168.181.200:8080;
	server 192.168.181.200:8081;
}

server{
	listen 80;
	server_name 192.168.181.200;
	location /{
		proxy_pass http://myserver;
		root html;
		index index.html index.htm;
	}
}
```

#### 4.常用分配方式（策略）

1. 轮询（默认）

   每个请求按时间顺序逐一分配到不同的后端服务器，如果后端服务器down掉，能自动剔除

2. weight

   weight代表权重，默认值是1，权重越高被分配的客户端越多

   ```
   upstream  myserver{
   	server 192.168.181.200:8080 weight=5;
   	server 192.168.181.200:8081 weight=10;
   }
   ```

   

3. ip_hash

   每个请求按访问ip的hash结果分配，这样每个访客固定访问一个后端服务器，可以解决session的问题

   ```
   upstream  myserver{
   	ip_hash;
   	server 192.168.181.200:8080 ;
   	server 192.168.181.200:8081 ;
   }
   ```

4. fair

   按后端服务器的响应时间来分配，响应时间短的优先分配

   ```
   upstream  myserver{
   	server 192.168.181.200:8080 ;
   	server 192.168.181.200:8081 ;
   	fair
   }
   ```

### 五. Nginx配置实例-动静分离

#### 1.什么是动静分离

将动态请求和静态请求分开，Nginx处理静态资源，tomcat处理动态资源。

一种方案是：纯粹把静态文件独立成单独的域名，放在独立的服务器上，也是目前主流推荐的方案。

另一种方案是：动态和静态文件混合在一起发布，通过Nginx来分开。

#### 2.准备工作

准备一些静态资源用于访问

#### 3.配置

```
location /www/{
	root /data/;
	index index.html index.htm;
}
location /image/{
	root /data/;
	autoindex on;  # 加上autoindex  会自动列出来内容
}
```



### 六.Nginx配置高可用集群

#### 1.什么是高可用

![18-主从  高可用](..\images\Nginx\18-主从  高可用.png)

#### 2.准备工作

需要两台nginx服务器 192.168.181.200  192.168.181 201

需要keepalived 

> yum install keepalived -y 
>
> rpm -q -a keepalived 查看keepalived是否已经安装
>
> 安装位置在/etc/keepalived/
>
> keepalived.conf为配置文件

需要虚拟ip

#### 3.完成配置

修改/etc/keepalived/keepalived.conf 

```
global_defs {
	notification_email{
		acassen@firewall.loc
		failover@firewall.loc
		sysadmin@firewall.loc
	}
	notification_email_from Alexandre.Cassen@firewall.loc
	smtp_server 192.168.181.200
	smtp_connect_timeout 30
	# 访问到主机 配置在hosts中 127.0.0.1 LVS_DEVEL
	router_id LVS_DEVEL  
}

vrrp_script chk_http_port{
	script "/usr/local/src/mginx_check.sh"
	interval 2  # 检测脚本执行的间隔
 	weight 2    # 当前服务器权重
}
vrrp_instance VI_1 {  # 虚拟ip 
	state BACKUP  # 表示是主还是从  备份服务器上将MASTER改为BACKUP
	interface ens33  # 网卡名称
	virtual_router_id 51  # 主备机相同
	priority 100  # 不同的优先级
	advert_int 1
	authentication {   # 校验方式  这里是采用密码
		auth_type PASS
		auth_pass 1111
	}
	virtual_ipaddress{
		192.168.181.202 //vrrp H 虚拟地址
	}
}
	
```

增加检测脚本

```

#!/bin/bash
A=`ps -C nginx -no-header|wc -l`
if [ $A -eq 0 ] ;then
	/usr/local/nginx/sbin/nginx
	sleep 2
	if [ `ps -C nginx --no-header |wc -l ` -eq 0 ] ;then
		killall keepalived
	fi
fi		
```

把两台服务器的nginx和keepalived启动

```
systemctl start keepalived.service
ps -ef|grep keepalived
```



### 七.Nginx原理

![19-nginx原理](..\images\Nginx\19-nginx原理.png)



master-worker的机制好处

首先，对于每个worker来说，独立的进程，不需要加锁，所以省掉了锁带来的开销，同时在编程一级问题查找时，会方便很多，其次，采用独立的进程，可以让互相之间不会影响，一个进程退出后，其它工作还在进行，服务不会中断，master进程会启动新的worker进行，当然，worker进程的异常退出，肯定是程序有bug了，异常退出，会导致当前worker上的所有请求失败，不过不会影响到所有请求，所以降低了风险。

需要设置多少个worker:

nginx通redis类似都采用了io多路复用机制，每个worker都是一个独立的进程，但每个进程里只有一个主线程。

worker数和cpu核数相同，少了会浪费cpu 多了会造成cpu频繁切换

连接数worker_connection

> 发送请求，占用worker的几个连接数?
>
> 2或者4个

>nginx有一个master 4个worker 每个worker支持最大的并发数
>
>普通静态资源最大并发数worker_connection*worker_process/2 而如果是http作为反向代理来说，最大并发数应该是worker_connections*worker_process/4

### 八.命令说明

#### 1.location指令说明

该指令用于匹配URL

语法如下：

```
location [= | ~ | ~* |^~] uri{

}
```

- = 用于不含正则表达式的uri前，要求请求字符串与url严格匹配，如果匹配成功就停止继续向下搜索并立即处理该请求。
- ~ 用于表示uri包含正则表达式，并且区分大小写
- ~* 用于表示uri包含正则表达式，并且不区分大小写
- ^~ 用于不含正则表达式的uri前，要求nginx服务器找到标识uri和请求字符串匹配度最高的location后，立即使用此location处理请求，而不再使用location块中的正则uri和请求字符串做匹配

> 如果uri包含正则表达式，则必须要有~ 或~*标识


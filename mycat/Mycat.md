## 一、入门概述

### 1. 是什么

Mycat 是数据库中间件。 

#### 1.1 数据库中间件

中间件：是一类连接软件组件和应用的计算机软件，以便于软件各部件之间的沟通。

例子：Tomcat，web中间件。

数据库中间件：连接java应用程序和数据库

#### 1.2 为什么要用Mycat？

① Java与数据库紧耦合。 

② 高访问量高并发对数据库的压力。 

③ 读写请求数据不一致

#### 1.3 数据库中间件对比

![Mycat-01-中间件](images\Mycat-01-中间件.png)

- Cobar属于阿里B2B事业群，始于2008年，在阿里服役3年多，接管3000+个MySQL数据库的schema,集群日处理在线SQL请求50亿次以上。由于Cobar发起人的离职，Cobar停止维护。

- Mycat是开源社区在阿里cobar基础上进行二次开发，解决了cobar存在的问题，并且加入了许多新的功能在其中。青出于蓝而胜于蓝。

- OneProxy基于MySQL官方的proxy思想利用c进行开发的，OneProxy是一款商业收费的中间件。舍弃了一些功能，专注在性能和稳定性上。

- kingshard由小团队用go语言开发，还需要发展，需要不断完善。 

- Vitess是Youtube生产在使用，架构很复杂。不支持MySQL原生协议，使用需要大量改造成本。 

- Atlas是360团队基于mysql proxy改写，功能还需完善，高并发下不稳定。 

- MaxScale是mariadb（MySQL原作者维护的一个版本） 研发的中间件

- MySQLRoute是MySQL官方Oracle公司发布的中间件

#### 1.4 Mycat官网

http://www.mycat.io/

### 2.干什么

#### 2.1 读写分离

![Mycat-02-读写分离](images\Mycat-02-读写分离.png)

#### 2.2 数据分片

垂直拆分（分库）、水平拆分（分表）、垂直+水平拆分（分库分表）![Mycat-03-数据分片-垂直拆分](images\Mycat-03-数据分片-垂直拆分.png)

#### 2.3 多数据源整合

![Mycat-04-多数据源整合](images\Mycat-04-多数据源整合.png)

### 3.原理

Mycat 的原理中最重要的一个动词是“拦截”，它拦截了用户发送过来的 SQL 语句，首先对 SQL 语句做了一些特定的分析：如分片分析、路由分析、读写分离分析、缓存分析等，然后将此 SQL 发往后端的真实数据库，并将返回的结果做适当的处理，最终再返回给用户。

![Mycat-05-拦截](images\Mycat-05-拦截.png)

这种方式把数据库的分布式从代码中解耦出来，程序员察觉不出来后台使用 Mycat 还是

MySQL。

## 二、安装启动

> 1.rpm方式
>
> ​	.rpm安装包，按顺序安装
>
> 2.yum方式
>
> ​	需要联网
>
> 3.解压后即可使用
>
> 4.解压后编译安装

### 1. 安装

#### 1.1 **解压后即可使用**

> tar -zxvf Mycat-server-1.6.7.1-release-20190627191042-linux.tar.gz 

解压缩文件拷贝到 linux 下 /usr/local/

> cp -r mycat /usr/local/

#### 1.2 三个配置文件

①schema.xml：定义逻辑库，表、分片节点等内容

②rule.xml：定义分片规则

③server.xml：定义用户以及系统相关变量，如端口等

ojzNSrj!#7Es

### 2. 启动

#### 2.1 修改配置文件server.xml

修改用户信息，与MySQL区分，如下

```
<user name="culsite_read">
                <property name="password">123456</property>
                <property name="schemas">TESTDB</property>

                <!-- 表级 DML 权限设置 -->
                <!-- 
                <privileges check="false">
                        <schema name="TESTDB" dml="0110" >
                                <table name="tb01" dml="0000"></table>
                                <table name="tb02" dml="1111"></table>
                        </schema>
                </privileges>
                 -->
        </user>
```

#### 2.2 **修改配置文件** schema.xml

删除<schema>标签间的表信息，<dataNode>标签只留一个，<dataHost>标签只留一个，<writeHost> <readHost>只留一对

```
<?xml version="1.0"?>
<!DOCTYPE mycat:schema SYSTEM "schema.dtd">
<mycat:schema xmlns:mycat="http://io.mycat/">
 <schema name="TESTDB" checkSQLschema="false" sqlMaxLimit="100" dataNode="dn1">
 </schema>
 <dataNode name="dn1" dataHost="host1" database="testdb" />
 <dataHost name="host1" maxCon="1000" minCon="10" balance="0"
 writeType="0" dbType="mysql" dbDriver="native" switchType="1" 
slaveThreshold="100">
 <heartbeat>select user()</heartbeat>
 <!-- can have multi write hosts 写主机-->
 <writeHost host="hostM1" url="192.168.140.128:3306" user="root"
 password="123123">
 <!-- can have multi read hosts 读主机-->
 <readHost host="hostS1" url="192.168.140.127:3306" user="root" 
password="123123" />
 </writeHost>
 </dataHost>
</mycat:schema>
```

#### 2.3 验证数据库访问情况

Mycat 作为数据库中间件要和数据库部署在不同机器上，所以要验证远程访问情况。

```
mysql -uroot -p123123 -h 192.168.140.128 -P 3306
mysql -uroot -p123123 -h 192.168.140.127 -P 3306
#如远程访问报错，请建对应用户
grant all privileges on *.* to root@'缺少的host' identified by '123123';
```

#### 2.4 启动程序

- 控制台启动 ：去 mycat/bin 目录下执行 ./mycat console

- 后台启动 ：去 mycat/bin 目录下 ./mycat start

  为了能第一时间看到启动日志，方便定位问题，我们选择控制台启动。

### 3. 登录

#### 3.1 登录后台管理窗口

此登录方式用于管理维护 Mycat

```
mysql -umycat -p123456 -P 9066 -h 192.168.140.128
```

#### 3.2 登录数据窗口

此登录方式用于通过 Mycat 查询数据，我们选择这种方式访问 Mycat

```
mysql -umycat -p123456 -P 8066 -h 192.168.140.128
```

## 三、搭建一主一从

一个主机用于处理所有写请求，一台从机负责所有读请求，架构图如下![Mycat-06-主从](images\Mycat-06-主从.png)

### 1.**搭建** **MySQL** 数据库主从复制

#### 1.1 MySQL 主从复制原理

![Mycat-07-主从复制原理](images\Mycat-07-主从复制原理.png)

#### 1.2 主机配置(host79)

```
修改配置文件：vim /etc/my.cnf
#主服务器唯一ID
server-id=1
#启用二进制日志
log-bin=mysql-bin
# 设置不要复制的数据库(可设置多个)
binlog-ignore-db=mysql
binlog-ignore-db=information_schema
#设置需要复制的数据库
binlog-do-db=需要复制的主数据库名字
#设置logbin格式
binlog_format=STATEMENT
```

binlog 日志三种格式

![Mycat-08-binlog格式](images\Mycat-08-binlog格式.png)

#### 1.3 从机配置(host80)

```
修改配置文件：vim /etc/my.cnf
#从服务器唯一ID
server-id=2
#启用中继日志
relay-log=mysql-relay
```

#### 1.4 主机、从机重启 MySQL 服务

#### 1.5 主机从机都关闭防火墙

#### 1.6 在主机上建立帐户并授权 slave

```
#在主机MySQL里执行授权命令 赋予主从复制权限  并不是任何从机都可以读取主机日志
GRANT REPLICATION SLAVE ON *.* TO 'slave'@'%' IDENTIFIED BY '123123';
```

\#查询master的状态

`show master status;`

![Mycat-09-主机状态](images\Mycat-09-主机状态.png)

\#记录下File和Position的值

\#执行完此步骤后不要再操作主服务器MySQL，防止主服务器状态值变化

#### 1.7 在从机上配置需要复制的主机

\#复制主机的命令

CHANGE MASTER TO MASTER_HOST='主机的IP地址',

MASTER_USER='slave',

MASTER_PASSWORD='123123',

MASTER_LOG_FILE='mysql-bin.具体数字',MASTER_LOG_POS=具体值; 

![Mycat-10-从机复制主机](images\Mycat-10-从机复制主机.png)

> 如果之前搭建过主从 会报错需要重置
>
> stop slave
>
> reset master

#启动从服务器复制功能

start slave;

\#查看从服务器状态

show slave status\G;![Mycat-11-主从复制搭建](images\Mycat-11-主从复制搭建.png)

\#下面两个参数都是Yes，则说明主从配置成功！

\# Slave_IO_Running: Yes

\# Slave_SQL_Running: Yes

#### 1.8 主机新建库、新建表、insert 记录，从机复制

![Mycat-12-复制结果](images\Mycat-12-复制结果.png)

#### 1.9 如何停止从服务复制功能

> stop slave;

#### 1.10  如何重新配置主从

> stop slave; 
>
> reset master;

### 2.**修改** **Mycat** **的配置文件** **schema.xml**

之前的配置已分配了读写主机，是否已实现读写分离？

#### 2.1 验证读写分离

（1）在写主机插入：insert into mytbl values (1,@@hostname);

主从主机数据不一致了

（2）在Mycat里查询：select * from mytbl;

#### 2.2 修改<dataHost>的balance属性，通过此属性配置读写分离的类型

负载均衡类型，目前的取值有4 种：

（1）balance="0", 不开启读写分离机制，所有读操作都发送到当前可用的 writeHost 上。

（2）balance="1"，全部的 readHost 与 stand by writeHost 参与 select 语句的负载均衡，简单的说，当双主双从

模式(M1->S1，M2->S2，并且 M1 与 M2 互为主备)，正常情况下，M2,S1,S2 都参与 select 语句的负载均衡。

（3）balance="2"，所有读操作都随机的在 writeHost、readhost 上分发。

（4）balance="3"，所有读请求随机的分发到 readhost 执行，writerHost 不负担读压力

为了能看到读写分离的效果，把balance设置成2，会在两个主机间切换查询

```
<dataHost name="host1" maxCon="1000" minCon="10" balance="2"
 writeType="0" dbType="mysql" dbDriver="native" switchType="1" 
slaveThreshold="100">
```

#### 2.3 启动Mycat

#### 2.4  验证读写分离

- 在写主机数据库表mytbl中插入带系统变量数据，造成主从数据不一致

  INSERT INTO mytbl VALUES(2,@@hostname);

- 在Mycat里查询mytbl表,可以看到查询语句在主从两个主机间切换

## 四、搭建双主双从

一个主机 m1 用于处理所有写请求，它的从机 s1 和另一台主机 m2 还有它的从机 s2 负责所有读请求。当 m1 主机宕机后，m2 主机负责写请求，m1、m2 互为备机。架构图如下![Mycat-13-双主双从](images\Mycat-13-双主双从.png)

编号 

角色 

IP 地址 

机器名



Master1                    192.168.140.128              host79.atguigu

Slave1 						192.168.140.127 			host80.atguigu

Master2 					192.168.140.126 				host81.atguigu

Slave2 							192.168.140.125 				host82.atguigu

### 1. **搭建** **MySQL** **数据库主从复制（双主双从）**

#### 1.1 双主机配置

Master1配置

```
修改配置文件：vim /etc/my.cnf
#主服务器唯一ID
server-id=1
#启用二进制日志
log-bin=mysql-bin
# 设置不要复制的数据库(可设置多个)
binlog-ignore-db=mysql
binlog-ignore-db=information_schema
#设置需要复制的数据库
binlog-do-db=需要复制的主数据库名字
#设置logbin格式
binlog_format=STATEMENT
# 在作为从数据库的时候，有写入操作也要更新二进制日志文件
log-slave-updates 
#表示自增长字段每次递增的量，指自增字段的起始值，其默认值是1，取值范围是1 .. 65535
auto-increment-increment=2 
# 表示自增长字段从哪个数开始，指字段一次递增多少，他的取值范围是1 .. 65535
auto-increment-offset=1
```

Master2配置

```
修改配置文件：vim /etc/my.cnf
#主服务器唯一ID
server-id=3 #启用二进制日志
log-bin=mysql-bin
# 设置不要复制的数据库(可设置多个)
binlog-ignore-db=mysql
binlog-ignore-db=information_schema
#设置需要复制的数据库
binlog-do-db=需要复制的主数据库名字
#设置logbin格式
binlog_format=STATEMENT
# 在作为从数据库的时候，有写入操作也要更新二进制日志文件
log-slave-updates 
#表示自增长字段每次递增的量，指自增字段的起始值，其默认值是1，取值范围是1 .. 65535
auto-increment-increment=2 
# 表示自增长字段从哪个数开始，指字段一次递增多少，他的取值范围是1 .. 65535
auto-increment-offset=2
```

#### 1.2 双从机配置

Slave1配置

```
修改配置文件：vim /etc/my.cnf
#从服务器唯一ID
server-id=2
#启用中继日志
relay-log=mysql-relay
```

Slave2配置

```
修改配置文件：vim /etc/my.cnf
#从服务器唯一ID
server-id=4 #启用中继日志
relay-log=mysql-relay
```

#### 1.3 双主机、双从机重启 mysql 服务

#### 1.4 主机从机都关闭防火墙

#### 1.5 在两台主机上建立帐户并授权 slave

```
#在主机MySQL里执行授权命令
GRANT REPLICATION SLAVE ON *.* TO 'slave'@'%' IDENTIFIED BY '123123';
#查询Master1的状态
show master status;
#查询Master2的状态
show master status;
#分别记录下File和Position的值
#执行完此步骤后不要再操作主服务器MYSQL，防止主服务器状态值变化
```


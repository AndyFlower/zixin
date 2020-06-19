## Spring mvc

分层就为了解耦， 解耦为了维护方便和分工合作![spring-mvc思想](images\spring-mvc思想.png)

SpringMVC思想是有一个前端控制器拦截所有请求，，并智能派发；这个前端控制器是一个Servlet,应该在web.xml中配置这个servlet来拦截所有请求
### web.xml
```xml
<servlet>
<servlet-name>springDispatcherServlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
        <!--指定springmvc的配置文件位置-->
    <param-name>contextConfigLocation</param-name>
        <param-value>classpath:springmvc.xml</param-value>
    </init-param>
</servlet>
<servlet-mapping>
	<servlet-name>springDispatcherServlet</servlet-name>
    <!--/和/*都是所有请求  /*范围更大，还会拦截到*。jsp等等的这些请求，一旦拦截了就不能显示了  /拦截所有请求但是不会拦截jsp等-->
    <url-pattern>/</url-pattern>
</servlet-mapping>
```

### springmvc.xml

```xml
<!--扫描所有组件-->
<context:component-scan base-package="com.clp"> </context:component-scan>

<!--配置试图解析器  拼接页面地址-->
<bean class="org.springframework.web.servlet.view.InternalResour">
<property name="prefix" value="/WEB-INF/pages/"></property>
<property name="suffix" value="*.jsp"></property>
</bean>
```
### SpringMVC请求流程
>客户端点击链接发送请求
>来到tomcat服务器
>SpringMVC的前端控制器收到所有请求
>来看请求地址和@RequestMapping标注的哪个匹配，来找到到底使用哪个类的哪个方法
>前端控制器找到了目标处理器和目标方法，直接利用返回执行目标方法
>方法执行完成以后得到一个返回值，SpringMVc认为这个返回值就是要去的页面地址
>拿到方法返回值以后，用试图解析器进行拼接得到完整的页面地址
>拿到页面地址 前端控制器帮我们转发到页面
@RequestMapping:
告诉Springmvc这个方法用来处理什么请求
如果在web.xml中不指定配置文件的位置，默认是/WEB-INF/springDispatcherServelt-servlet.xml(springDispatcherServlet就是配置的前端控制器的名称 是可以更换的)
服务器的大web.xml中有一个defaultServlet是url-pattern=/
我们的配置中前端控制器url-pattern=/  静态资源或来到DispatcherServlet看那个方法的RequestMapping
为什么jsp能访问？因为我们没有覆盖服务器中的JspServlet的配置

### @RequestMapping属性
- method:限定请求方法 
- params:绑定请求参数
- headers:绑定请求头(请求头信息中的任何信息都可以指定) eg:User-agent:规定请求头 
- consumes:只接受什么类型的请求
### Ant风格的url
> url地址可以写模糊的通配符 ？， *，  **
- ？ 能替代任意一个字符
- *任意多个字符 和一层路径
- ** 能替代多层路径
### @PathVariable
> @RequestMapping("/user/{id}")

路径上可以有占位符，占位符语法就是可以在任意路径的地方写一个{变量名}

### REST
Representational State Transfer(资源)表现层状态转化。是目前最流行的一种软件架构。
Rest:希望以非常简洁的URL地址来发请求
  怎样表示对一个资源的增删改查用请求方式来区分
> /getBook?id=1
> /deleteBook?id=1
>/updateBook?id=1
> /addBook

Rest推荐:/资源名、资源标识符
> /book/1  GET 查询
>/book/1  PUT 更新
>/book/1  DELETE  删除
> book     POST 添加

简介的方式提交请求，以请求方式区分操作
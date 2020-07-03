# 视图解析器

- 导包

- web.xml

  - 添加DispatcherServlet

  - 添加字符编码

- 添加Spring配置文件

  - 包扫描
  - InternalResolverViewResolver

页面：

- 可以使用相对路径的方式，比如：`../../hello`
- 可以使用`forward:/hello.jsp` 这种不会根据spring配置文件中进行拼接
- 可以使用`forward:/handle01` 这种就是新的方法会转发到`handle01` 实际返回的是`handle01`的页面
- `redirect:/hello.jsp`:原生的response.sendRedirect()需要加上项目名称，redirect不需要，SpringMVC会为我们自动加上项目名。
- redirect:/handle03:也可以

有前缀的转发和重定向操作，和视图解析器没有关系。

## SpringMVC试图解析：

方法之后后的返回值会作为返回值作为页面地址参考，转发或者重定向到页面。

- ProcessDispatchResult()来到页面的方法，视图渲染的流程：将域中的数据在页面展示，页面就是用来渲染模型数据的
- 调用render(mv,request,response)渲染页面
- View与ViewResolver:ViewResolver的作用根据视图名得到view对象

返回View对象

- 视图解析器得到View对象的流程就是，所有配置的视图解析器都来尝试得到View,得到就返回，得不到就换下一个视图解析器。‘
- 调用View的render方法

视图是无状态的，所以他们不会有线程安全的问题

## 国际化

javaWeb国际化

- 得到ocale对象
- 使用ResourceBundle绑定国际化资源文件
- 使用ResourceBundle.getString("key")获取到国际化配置文件中的值
- web页面的国际化，fmt标签库来做

有了jstlView以后

- 让Spring管理国际化资源就行
- 直接去页面使用

spring配置文件中添加messageSource，配置文件基础名

<fmt:message key="username"/>直接使用即可

发送一个请求，直接到WEB-INF下的一个页面

使用国际化不能用forward

path:指定是哪个请求

view-name:指定页面

<mvc:view-controller path=""/  view-name="">

需要开启`<mvc:annotation-driven/>`否则配置了上面之后其余的将不好用

---

自定义视图解析器的步骤：

1. 编写自定义的视图解析器
2. 视图解析器要放在ioc容器中容器中
3. Springmvc自己的视图解析器的优先级是最低的，可以通过设置order属性的值来改变顺序。

---

Springmvc的表单标签：

<%@tablib prefix="" uri=""/>

通过Sprinmgmvc的表单标签可以实现将模型数据中的属性和html表单元素相关联

```html

<form:form action="">
lastName:<form:input path="lastName"/>
    gender:男<form:radiobutton path="" value="1"/>
    女<form:radiobutton path="" value="2"/>
    <!--items指定要遍历的集合-->
    dept:<form:select path="department.id" items="depts" itemLabel="departmentName" itemsValue="id"></form:select>
</form:form>
```

```xml
<!--告诉Springmvc,自己映射的请求就自己处理，不能处理的就交给tomcat-->
<mvc:default-servlet-handler/>
```

```xml
<!--保证动态资源访问-->
<mvc:annotation-driven></mvc:annotation-driven>
```




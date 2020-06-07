## SpringBoot Web开发

### 一、简介

#### 使用SpringBoot；

1. 创建SpringBoot应用，选中我们需要的模块；
2. SpringBoot已经默认将这些场景配置好了，只需要在配置文件中指定少量配置就可以运行起来
3. 自己编写业务代码；  

#### 自动配置原理？  

这个场景SpringBoot帮我们配置了什么？能不能修改？能修改哪些配置？能不能扩展？xxx  

>```
>XXXAutoConfiguration:帮我们给容器中自动配置组件
>xxxxProperties:配置类来封装配置文件的内容；
>```

### 二、SpringBoot对静态资源的映射规则

```java
////可以设置和静态资源有关的参数，缓存时间等
@ConfigurationProperties(
    prefix = "spring.resources",
    ignoreUnknownFields = false
)
public class ResourceProperties {
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = new String[]{"classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/"};
    
```



```java
//WebMvcAutoConfiguration.java
public void addResourceHandlers(ResourceHandlerRegistry registry) {
            if (!this.resourceProperties.isAddMappings()) {
                logger.debug("Default resource handling disabled");
            } else {
                Duration cachePeriod = this.resourceProperties.getCache().getPeriod();
                CacheControl cacheControl = this.resourceProperties.getCache().getCachecontrol().toHttpCacheControl();
                if (!registry.hasMappingForPattern("/webjars/**")) {
                    this.customizeResourceHandlerRegistration(registry.addResourceHandler(new String[]{"/webjars/**"}).addResourceLocations(new String[]{"classpath:/META-INF/resources/webjars/"}).setCachePeriod(this.getSeconds(cachePeriod)).setCacheControl(cacheControl));
                }

                String staticPathPattern = this.mvcProperties.getStaticPathPattern();
                if (!registry.hasMappingForPattern(staticPathPattern)) {
                    this.customizeResourceHandlerRegistration(registry.addResourceHandler(new String[]{staticPathPattern}).addResourceLocations(WebMvcAutoConfiguration.getResourceLocations(this.resourceProperties.getStaticLocations())).setCachePeriod(this.getSeconds(cachePeriod)).setCacheControl(cacheControl));
                }

            }
        }
```

1. 所有 /webjars/** ，都去 classpath:/META-INF/resources/webjars/ 找资源  

webjars：以jar包的方式引入静态资源；  

localhost:8080/webjars/jquery/3.5.1/jquery.js  

![SpringBoot-07-webjars](.\images\SpringBoot-07-webjars.png)



```xml
 <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery</artifactId>
            <version>3.5.1</version>
        </dependency>
```

2. /**访问当前项目的任何资源，都去（静态资源的文件夹）找映射  

   ```
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = new String[]{"classpath:/META-INF/resources/", 
    "classpath:/resources/", 
    "classpath:/static/", 
    "classpath:/public/"};
   
   ```

   

3. 欢迎页； 静态资源文件夹下的所有index.html页面；被"/**"映射；  

   ```java
   //配置欢迎页映射
   @Bean
           public WelcomePageHandlerMapping welcomePageHandlerMapping(ApplicationContext applicationContext, FormattingConversionService mvcConversionService, ResourceUrlProvider mvcResourceUrlProvider) {
               WelcomePageHandlerMapping welcomePageHandlerMapping = new WelcomePageHandlerMapping(new TemplateAvailabilityProviders(applicationContext), applicationContext, this.getWelcomePage(), this.mvcProperties.getStaticPathPattern());
               welcomePageHandlerMapping.setInterceptors(this.getInterceptors(mvcConversionService, mvcResourceUrlProvider));
               welcomePageHandlerMapping.setCorsConfigurations(this.getCorsConfigurations());
               return welcomePageHandlerMapping;
           }
   ```

   

### 三、模板引擎

   JSP、Velocity、Freemarker、Thymeleaf

  ![SpringBoot-08-模板引擎](.\images\SpringBoot-08-模板引擎.png)

SpringBoot推荐的Thymeleaf；
语法更简单，功能更强大；  

#### 1.引入thymeleaf

```xml
<!--thymeleaf模板引擎-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
```

#### 2.Thymeleaf使用

[Thymeleaf官网](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#using-texts)

```java
@ConfigurationProperties(
    prefix = "spring.thymeleaf"
)
public class ThymeleafProperties {
    private static final Charset DEFAULT_ENCODING;
    public static final String DEFAULT_PREFIX = "classpath:/templates/";
    public static final String DEFAULT_SUFFIX = ".html";
    private boolean checkTemplate = true;
    private boolean checkTemplateLocation = true;
    private String prefix = "classpath:/templates/";
    private String suffix = ".html";
    private String mode = "HTML";
```

只要我们把HTML页面放在classpath:/templates/，thymeleaf就能自动渲染；  

使用：

1. 导入thymeleaf的名称空间  

   ```
   <html lang="en" xmlns:th="http://www.thymeleaf.org">
   ```

2. 使用thymeleaf语法

   ```html
   <!DOCTYPE html>
   <html lang="en" xmlns:th="http://www.thymeleaf.org">
   <head>
       <meta charset="UTF-8">
       <title>Title</title>
   </head>
   <body>
    <h1>成功</h1>
    <!--th:text 将div里面的文本内容替换-->
   <div th:text="${hello}">这是显示成功信息</div>
   </body>
   </html>
   ```

3. 语法规则

   - th:text；改变当前元素里面的文本内容；   

     th：任意html属性；来替换原生属性的值  

     ![SpringBoot-09模板引擎语法](.\images\SpringBoot-09模板引擎语法.png)

   - 表达式

     - Simple expressions:（表达式语法）  
       - Variable Expressions: `${...}`  获取表达式 OGNL
       
         - 获取对象的属性、调用方法
         - 使用内置的基本对象
         - `#ctx`: the context object.
         - `#vars:` the context variables.
         - `#locale`: the context locale.
         - `#request`: (only in Web Contexts) the `HttpServletRequest` object.
         - `#response`: (only in Web Contexts) the `HttpServletResponse` object.
         - `#session`: (only in Web Contexts) the `HttpSession` object. ${session.foo}   
         - `#servletContext`: (only in Web Contexts) the `ServletContext` object.
         - 内置的工具对象
         - `#execInfo`: information about the template being processed.
         - `#messages`: methods for obtaining externalized messages inside variables expressions, in the same way as they would be obtained using #{…} syntax.
         - `#uris`: methods for escaping parts of URLs/URIs
         - `#conversions`: methods for executing the configured *conversion service* (if any).
         - `#dates`: methods for `java.util.Date` objects: formatting, component extraction, etc.
         - `#calendars`: analogous to `#dates`, but for `java.util.Calendar` objects.
         - `#numbers`: methods for formatting numeric objects.
         - `#strings`: methods for `String` objects: contains, startsWith, prepending/appending, etc.
         - `#objects`: methods for objects in general.
         - `#bools`: methods for boolean evaluation.
         - `#arrays`: methods for arrays.
         - `#lists`: methods for lists.
         - `#sets`: methods for sets.
         - `#maps`: methods for maps.
         - `#aggregates`: methods for creating aggregates on arrays or collections.
         - `#ids`: methods for dealing with id attributes that might be repeated (for example, as a result of an iteration).
       
       - Selection Variable Expressions: `*{...}` 选择表达式 与#相同 
       
         - 补充：配合th:object="${session.user}使用
       
           - ```html
             <div th:object="${session.user}">
                 <p>Name: <span th:text="*{firstName}">Sebastian</span>.</p>
                 <p>Surname: <span th:text="*{lastName}">Pepper</span>.</p>
                 <p>Nationality: <span th:text="*{nationality}">Saturn</span>.</p>
               </div>
             ```
       
       - Message Expressions: `#{...}`  国际化
       
       - Link URL Expressions: `@{...}`  定义URL链接 **@{/order/process(execId=${execId},execType='FAST')}**
       
       - Fragment Expressions: `~{...}` 片段引用表达式 <div th:insert="~{commons :: main}">...</div>
     - Literals  字面量
       - Text literals: `'one text'`, `'Another one!'`,…
       - Number literals: `0`, `34`, `3.0`, `12.3`,…
       - Boolean literals: `true`, `false`
       - Null literal: `null`
       - Literal tokens: `one`, `sometext`, `main`,…
     - Text operations:  文本操作
       - String concatenation: `+`
       - Literal substitutions: `|The name is ${name}|`
     - Arithmetic operations:  数学运算
       - Binary operators: `+`, `-`, `*`, `/`, `%`
       - Minus sign (unary operator): `-`
     - Boolean operations:  boolean运算
       - Binary operators: `and`, `or`
       - Boolean negation (unary operator): `!`, `not`
     - Comparisons and equality: 比较运算
       - Comparators: `>`, `<`, `>=`, `<=` (`gt`, `lt`, `ge`, `le`)
       - Equality operators: `==`, `!=` (`eq`, `ne`)
     - Conditional operators: 条件运算（三元运算符）
       - If-then: `(if) ? (then)`
       - If-then-else: `(if) ? (then) : (else)`
       - Default: `(value) ?: (defaultvalue)`
     - Special tokens:  特殊操作
       
       - No-Operation: `_`

### 四、SpringBoot 自动配置

[SpringBoot官方文档章节](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/spring-boot-features.html#boot-features-developing-web-applications)

#### 1.Spring MVC Auto-configuration

Spring Boot 自动配置好了SpringMVC.

以下是SpringBppt对SpringMVC的默认配置:

- Inclusion of `ContentNegotiatingViewResolver` and `BeanNameViewResolver` beans.

  - 自动配置了视图解析器ViewResolver(视图解析器：根据方法的返回值得到视图对象View,视图对象决定如何渲染)
  - ContentNegotiatingViewResolver：组合所有的视图解析器
  - 如何定制：我们可以自己给容器中添加一个视图解析器，自动的将其组合起来

- Support for serving static resources, including support for WebJars (covered [later in this document](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-mvc-static-content))).  静态资源文件夹和webjars

- 自动注册了 `Converter`, `GenericConverter`, and `Formatter` beans.

  - `Converter`转换器：public String hello(Use user):类型转换使用Convert

  - `Formatter` :格式化器 2017-12-17->date

    自己添加格式化转换器，放在容器中即可

- Support for `HttpMessageConverters` (covered [later in this document](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-mvc-message-converters)).

  - `HttpMessageConverters`：SpringMVC用来转换Http请求和响应的 User->json
  - `HttpMessageConverters`：是从容器中确定的 ，获取所有的HttpMessageConverters
  - 定制化：自己添加转换器，放在容器中即可

- Automatic registration of `MessageCodesResolver` (covered [later in this document](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-message-codes)).

  - 定义错误代码生成规则

- Static `index.html` support.  静态首页

- Custom `Favicon` support (covered [later in this document](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-mvc-favicon)).

- Automatic use of a `ConfigurableWebBindingInitializer` bean (covered [later in this document](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-mvc-web-binding-initializer)).

  - 可以自定义一个来替换默认的（添加到容器）

  - > 初始化WebDataBinder
    >
    > 请求数据->JavaBean

  - ```java
    return (ConfigurableWebBindingInitializer)this.beanFactory.getBean(ConfigurableWebBindingInitializer.class);
    ```

`org.springframework.boot.autoconfigure.web`:web的所有自动配置场景

If you want to keep those Spring Boot MVC customizations and make more [MVC customizations](https://docs.spring.io/spring/docs/5.2.6.RELEASE/spring-framework-reference/web.html#mvc) (interceptors, formatters, view controllers, and other features), you can add your own `@Configuration` class of type `WebMvcConfigurer` but **without** `@EnableWebMvc`.

#### 2.扩展SpringMVC

```xml
<mvc:view-controller path="/hello" view-name="success"/>
    <mvc:interceptors>
        <mvc:interceptor>
            <mvc:mapping path="/hello"/>
            <bean></bean>
        </mvc:interceptor>
    </mvc:interceptors>
```

编写一个配置类（@Configuration）是WebMvcConfigurer类型。不能标注`@EnableWebMvc`.

既保留率所有的自动配置，也能用我们扩展的配置

```java
package com.slp.springboot04web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyMvcConfig
 * @Description 使用WebMvcConfigurer可以扩展SpringMvc的功能
 * @Author slp
 * @Date 2020/5/25 9:33
 * @Version 1.0
 **/

@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送hello请求也来到success页面
        registry.addViewController("/slp").setViewName("success");
    }
}
```

原理：

1. WebMvcAutoConfiguration是SpringMVC的自动配置类

2. 在做其他自动配置时会导入@Import({WebMvcAutoConfiguration.EnableWebMvcConfiguration.class})

   ```java
    public static class EnableWebMvcConfiguration extends DelegatingWebMvcConfiguration implements ResourceLoaderAware
   ```

   ```java
   public class DelegatingWebMvcConfiguration extends WebMvcConfigurationSupport {
       private final WebMvcConfigurerComposite configurers = new WebMvcConfigurerComposite();
   
       public DelegatingWebMvcConfiguration() {
       }
       //从容器中获取所有的WebMvcConfigurer，
       @Autowired(
           required = false
       )
       public void setConfigurers(List<WebMvcConfigurer> configurers) {
           if (!CollectionUtils.isEmpty(configurers)) {
               this.configurers.addWebMvcConfigurers(configurers);
               //一个参考实现:将所有的WebMvcConfiguraer相关配置都来一起调用
               // protected void addViewControllers(ViewControllerRegistry registry) {
          		//	 this.configurers.addViewControllers(registry);
      			 //}
           }
   
       }
   ```

3. 容器中所有的WebMvcConfigurer都会一起起作用

4. 我们的配置类也会被调用 

   SpringMVC的自动配置和我们的配置一起起作用

#### 3.全面接管SpringMVC

   SpringBoot对SpringMVC的自动配置不需要了，所有的都是我们自己配；

我们需要在配置类中添加@EnableWebMvc

```java
package com.slp.springboot04web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyMvcConfig
 * @Description 使用WebMvcConfigurer可以扩展SpringMvc的功能
 * @Author slp
 * @Date 2020/5/25 9:33
 * @Version 1.0
 **/
@EnableWebMvc
@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送hello请求也来到success页面
        registry.addViewController("/slp").setViewName("success");
    }
}
```

原理：

为什么@EnableWebMmc自动配置就失效了

1. EnableWebMvc的核心

   ```java
   @Retention(RetentionPolicy.RUNTIME)
   @Target({ElementType.TYPE})
   @Documented
   @Import({DelegatingWebMvcConfiguration.class})
   public @interface EnableWebMvc {
   }
   ```

2. WebMvcConfigurationSupport

   ```java
   @Configuration(
       proxyBeanMethods = false
   )
   public class DelegatingWebMvcConfiguration extends WebMvcConfigurationSupport {
   ```

3. WebMvcAutoConfiguration

   ```java
   @ConditionalOnClass({Servlet.class, DispatcherServlet.class, WebMvcConfigurer.class})
   //容器中没有这个组件的时候，这个自动配置类才生效
   @ConditionalOnMissingBean({WebMvcConfigurationSupport.class})
   @AutoConfigureOrder(-2147483638)
   @AutoConfigureAfter({DispatcherServletAutoConfiguration.class, TaskExecutionAutoConfiguration.class, ValidationAutoConfiguration.class})
   public class WebMvcAutoConfiguration {
   ```

4. @EnableWebMvc将WebMvcConfigurationSupport组件导入进来

5. 导入的WebMvcConfigurationSupport只是SpringMVC最基本的功能

模式：

1. SpringBoot在自动配置很多组件的时候，先看容器中有没有用户自己配置的（@bean  @Component）如果有就用用户自己配置的，如果没有才自动配置；如果有些组件可以有多个（ViewResolver）将用户配置的和自己默认的组合起来
2. 在SpringBoot中会有很多的xxxConfigurer帮助我们进行扩展配置

### 五、如何修改SpringBoot的默认配置

### 六、RestfulCRUD

#### 1、默认访问首页

#### 2、国际化

- 编写国际化配置文件

  

- 使用ResourceBundleMessageSource管理国际化资源文件

- 在页面使用fmt:message取出国际化

步骤

1. 编写文件

     ![SpringBoot-12-国际化](D:\slpworkspace\github\2020\SpringBoot\images\SpringBoot-12-国际化.png)

2. SpringBoot自动配置好了管理国际化资源文件的组件

     ```java
     //MessageSourceAutoConfiguration
     prefix = "spring.messages" //我们的配置文件可以直接放在类路径下角messages.properties
     @Bean
         public MessageSource messageSource(MessageSourceProperties properties) {
             ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
             if (StringUtils.hasText(properties.getBasename())) {
       //设置国际化资源文件的基础名（去掉语言国家名）     
                 messageSource.setBasenames(StringUtils.commaDelimitedListToStringArray(StringUtils.trimAllWhitespace(properties.getBasename())));
             }
     
             if (properties.getEncoding() != null) {
                 messageSource.setDefaultEncoding(properties.getEncoding().name());
             }
     
             messageSource.setFallbackToSystemLocale(properties.isFallbackToSystemLocale());
             Duration cacheDuration = properties.getCacheDuration();
             if (cacheDuration != null) {
                 messageSource.setCacheMillis(cacheDuration.toMillis());
             }
     
             messageSource.setAlwaysUseMessageFormat(properties.isAlwaysUseMessageFormat());
             messageSource.setUseCodeAsDefaultMessage(properties.isUseCodeAsDefaultMessage());
             return messageSource;
         }
     ```

     ```pro
     spring.messages.basename=i18n.login
     ```

     

3. 页面获取国际化

  ```html
  <h1 class="" th:text="#{login.tip}">Please sign in</h1>
          <label class="sr-only" th:text="#{login.username}" th:placeholder="#{login.username}" required="">UserName</label>
  
  ```

  原理：

国际化Locale（区域信息对象）LocaleResolver(获取区域信息对象)

```java
   @Bean
        @ConditionalOnMissingBean
        @ConditionalOnProperty(
            prefix = "spring.mvc",
            name = {"locale"}
        )
        public LocaleResolver localeResolver() {
            if (this.mvcProperties.getLocaleResolver() == org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.LocaleResolver.FIXED) {
                return new FixedLocaleResolver(this.mvcProperties.getLocale());
            } else {
                AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
                localeResolver.setDefaultLocale(this.mvcProperties.getLocale());
                return localeResolver;
            }
        }
//默认的就是请求头带来的区域信息获取Locale来获取国际化
```



点击切换国际化

```java
package com.slp.springboot04web.componenet;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @ClassName MyLocaleResolver
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/26 12:30
 * @Version 1.0
 **/
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String  l =httpServletRequest.getParameter("l");
        Locale locale = Locale.getDefault();//系統默認的
        if(!StringUtils.isEmpty(l)){
            String[] split = l.split("_");
            locale = new Locale(split[0],split[1]);

        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}

```

```java
//MyMvcConfig
@Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
```

模板修改后实时生效

```prop
spring.thymeleaf.cache=false
```

页面修改完成以后ctrl+f9：重新编译；

#### 3、拦截器

```java
package com.slp.springboot04web.componenet;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginHandlerInterceptor
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/27 8:20
 * @Version 1.0
 **/

public class LoginHandlerInterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object  user = request.getSession().getAttribute("loginUser");
        if(user == null){
            request.setAttribute("msg","请先登录");

            request.getRequestDispatcher("/INDEX.HTML").forward(request,response
            );
            return false;


        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

```

```java
package com.slp.springboot04web.config;

import com.slp.springboot04web.componenet.LoginHandlerInterceptor;
import com.slp.springboot04web.componenet.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyMvcConfig
 * @Description 使用WebMvcConfigurer可以扩展SpringMvc的功能
 * @Author slp
 * @Date 2020/5/25 9:33
 * @Version 1.0
 **/

//@EnableWebMvc
@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送hello请求也来到success页面
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("main").setViewName("dashboard");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    /**
     * 注册拦截器
     * SpringBoot做好了静态资源映射 不需要处理
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html","/","/user/login");
    }
}

```

#### 4、CRUD-员工列表

实验要求： 

##### 1、RestfulCRUD：CRUD满足Rest风格； 

URI： /资源名称/资源标识 HTTP请求方式区分对资源CRUD操作 

##### 2、thymeleaf抽取公共片段

```
1、抽取公共片段 
<div th:fragment="copy"> 
&copy; 2011 The Good Thymes Virtual Grocery 
</div> 
2、引入公共片段 
<div th:insert="~{footer :: copy}">
</div> ~{templatename::selector}：模板名::选择器
~{templatename::fragmentname}:模板名::片段名 
3、默认效果： 
insert的公共片段在div标签中 
如果使用th:insert等属性进行引入，可以不用写~{}： 
行内写法可以加上：[[~{}]];[(~{})]；
```

三种引入公共片段的th属性：
**th:insert**：将公共片段整个插入到声明引入的元素中
**th:replace**：将声明引入的元素替换为公共片段
**th:include**：将被引入的片段的内容包含进这个标签中  

```
<footer th:fragment="copy">
&copy; 2011 The Good Thymes Virtual Grocery
</footer>
引入方式
<div th:insert="footer :: copy"></div>
<div th:replace="footer :: copy"></div>
<div th:include="footer :: copy"></div>
效果
<div>
<footer>
&copy; 2011 The Good Thymes Virtual Grocery
</footer>
</div>
<footer>
&copy; 2011 The Good Thymes Virtual Grocery
</footer>
<div>
&copy; 2011 The Good Thymes Virtual Grocery
</div>
```

引入片段的时候传入参数：  

```
<nav class="col‐md‐2 d‐none d‐md‐block bg‐light sidebar" id="sidebar">
<div class="sidebar‐sticky">
<ul class="nav flex‐column">
<li class="nav‐item">
<a class="nav‐link active"
th:class="${activeUri=='main.html'?'nav‐link active':'nav‐link'}"
href="#" th:href="@{/main.html}">
<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24"
viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke‐width="2" stroke‐
linecap="round" stroke‐linejoin="round" class="feather feather‐home">
<path d="M3 9l9‐7 9 7v11a2 2 0 0 1‐2 2H5a2 2 0 0 1‐2‐2z"></path>
<polyline points="9 22 9 12 15 12 15 22"></polyline>
</svg>
Dashboard <span class="sr‐only">(current)</span>
</a>
</li>
<!‐‐引入侧边栏;传入参数‐‐>
<div th:replace="commons/bar::#sidebar(activeUri='emps')"></div>
```


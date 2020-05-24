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
       - Variable Expressions: `${...}`
       - Selection Variable Expressions: `*{...}`
       - Message Expressions: `#{...}`
       - Link URL Expressions: `@{...}`
       - Fragment Expressions: `~{...}`
     - Literals
       - Text literals: `'one text'`, `'Another one!'`,…
       - Number literals: `0`, `34`, `3.0`, `12.3`,…
       - Boolean literals: `true`, `false`
       - Null literal: `null`
       - Literal tokens: `one`, `sometext`, `main`,…
     - Text operations:
       - String concatenation: `+`
       - Literal substitutions: `|The name is ${name}|`
     - Arithmetic operations:
       - Binary operators: `+`, `-`, `*`, `/`, `%`
       - Minus sign (unary operator): `-`
     - Boolean operations:
       - Binary operators: `and`, `or`
       - Boolean negation (unary operator): `!`, `not`
     - Comparisons and equality:
       - Comparators: `>`, `<`, `>=`, `<=` (`gt`, `lt`, `ge`, `le`)
       - Equality operators: `==`, `!=` (`eq`, `ne`)
     - Conditional operators:
       - If-then: `(if) ? (then)`
       - If-then-else: `(if) ? (then) : (else)`
       - Default: `(value) ?: (defaultvalue)`
     - Special tokens:
       - No-Operation: `_`

   - 

4. 
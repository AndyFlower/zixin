## SpringBoot 入门

SpringBoot来简化Spring应用开发，约定大于配置，去繁从简，just run就能创建一个独立的，产品级别的应用。

### 一、背景

J2EE笨重的开发，繁多的配置、地下的开发效率、复杂的部署流程、第三方技术集成难度大。

### 二、解决

Spring全家桶时代。

Spring Boot -> J2EE一站式解决方案

Spring Cloud ->分布式整体解决方案

> https://spring.io/projects 
>
> 可以访问spring的所有项目

![SpringBoot-01](./images/SpringBoot-01.png)

###　三、优点

- 快速创建独立运行的Spring项目以及与主流框架集成
- 使用嵌入式的Servelt容器，应用无需打成war包
- starters自动依赖与版本控制
- 大量的自动配置，简化开发，也可修改默认值
- 无需配置xml,无代码生成，开箱即用
- 准生产环境的运行时应用监控
- 与云计算的天然集成

### 四、环境准备

- intellij/eclipse

  修改idea中的maven设置

  ![SpringBoot-02](images\SpringBoot-02.png)

- maven3.9

maven设置：在setting.xml配置文件的profilers标签添加

>	<profile>
>		<id>jdk-1.8</id>
>	
>		<activation>
>			<activeByDefault>true</activeByDefault>
>			<jdk>1.8</jdk>
>		</activation>
>	
>		<properties>
>			<maven.compiler.source>1.8</maven.compiler.source>
>			<maven.compiler.target>1.8</maven.compiler.target>
>			<maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
>		</properties>
>	</profile>
>
>
>

### 五、HelloWorld

> 实现一个功能：浏览器发送一个请求，并处理响应

#### 1.创建一个maven工程

#### 2.导入spring boot的相关依赖

```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.2.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
      <exclusions>
        <exclusion>
          <groupId>org.junit.vintage</groupId>
          <artifactId>junit-vintage-engine</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
```



#### 3.编写一个主程序，启动Spring Boot的应用

```
package com.slp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序，说明这是一个springboot程序
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    /**
     * 启动程序
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}

```

#### 4.编写实现

```
package com.slp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}

```

#### 5.测试

#### 6.简化部署

```j
<build>
    <!--这个插件可以将应用打包成可执行的jar包-->
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
      
    </plugins>
    
  </build>
```

将这个应用打成jar包，直接使用java -jar的命令来进行执行

### 六、Hello World探究

#### 1.pom文件

##### 1.1 父项目

```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.2.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>
  
他的父项目
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.2.2.RELEASE</version>
    <relativePath>../../spring-boot-dependencies</relativePath>
  </parent>
  
  它来真正管理SpringBoot应用里面的所有依赖
  <properties>
    <activemq.version>5.15.11</activemq.version>
    <antlr2.version>2.7.7</antlr2.version>
    <appengine-sdk.version>1.9.77</appengine-sdk.version>
    <artemis.version>2.10.1</artemis.version>
    <aspectj.version>1.9.5</aspectj.version>
    <assertj.version>3.13.2</assertj.version>
    <atomikos.version>4.0.6</atomikos.version>
    <awaitility.version>4.0.1</awaitility.version>
    <bitronix.version>2.1.4</bitronix.version>
    ...
  </properties>
```

SpringBoot的版本仲裁中心；

以后我们导入依赖默认是不需要版本号的，（没有在dependencies里面管理的依赖需要声明）

##### 1.2 导入的依赖

```java
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
```

spring-boot-starter-web:

​	spring-boot-starter:spring-boot场景启动器，帮我们导入了web模块正常运行所依赖的组件；

> https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/#using-boot-starter 
>
> 可以查看所有的启动器模块

Spring Boot将所有的功能场景都抽取出来，做出一个个的starter,只需要在项目里引入这些starter相关场景所需的依赖就会导入进来。

#### 2.主程序类

```
package com.slp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序，说明这是一个springboot程序
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    /**
     * 启动程序
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
```

##### 2.1 @SpringBootApplication:

Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类，SpringBoot就应该运行这个类的main方法来启动SpringBoot应用。

```
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
    excludeFilters = {@Filter(
    type = FilterType.CUSTOM,
    classes = {TypeExcludeFilter.class}
), @Filter(
    type = FilterType.CUSTOM,
    classes = {AutoConfigurationExcludeFilter.class}
)}
)
public @interface SpringBootApplication {
```



##### 2.2 @SpringBootConfiguration:Spring Boot的配置类：

​	标注在某个类上表示这是一个Spring Boot的配置类

   - Configuration:配置类上来标注这个注解
     - 配置类-----配置文件：配置类也是容器中的一个组件：@Component

##### 2.3  @EnableAutoConfiguration:开启自动配置功能

以前我们需要配置的东西，SpringBoot帮我们自动配置；@EnableAutoConfiguration告诉SpringBoot开启自动配置功能；这样自动配置才能生效；

```
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import({AutoConfigurationImportSelector.class})
public @interface EnableAutoConfiguration {
```

- @AutoConfigurationPackage:自动配置包

  ```
  @Target({ElementType.TYPE})
  @Retention(RetentionPolicy.RUNTIME)
  @Documented
  @Inherited
  @Import({Registrar.class})
  public @interface AutoConfigurationPackage {
  }
  ```

  

  - @Import({Registrar.class})

    - Spring的底层注解@Import,给容器中导入一个组件；导入的组件由Registrar；

      ```
       public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
                  AutoConfigurationPackages.register(registry, (new AutoConfigurationPackages.PackageImport(metadata)).getPackageName());
              }
      ```

      ```
        public static void register(BeanDefinitionRegistry registry, String... packageNames) {
              if (registry.containsBeanDefinition(BEAN)) {
                  BeanDefinition beanDefinition = registry.getBeanDefinition(BEAN);
                  ConstructorArgumentValues constructorArguments = beanDefinition.getConstructorArgumentValues();
                  constructorArguments.addIndexedArgumentValue(0, addBasePackages(constructorArguments, packageNames));
              } else {
                  GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
                  beanDefinition.setBeanClass(AutoConfigurationPackages.BasePackages.class);
                  beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, packageNames);
                  beanDefinition.setRole(2);
                  registry.registerBeanDefinition(BEAN, beanDefinition);
              }
      
          }
      ```

      将主配置类的所在包及下面所有子包里面的所有组件扫描到Spring容器

- @Import({AutoConfigurationImportSelector.class})

  给容器中导入组件

  AutoConfigurationImportSelector：需要导入哪些组件的选择器，

  将所有需要导入的组件以全类名的方式返回；这些组件就会被添加到容器中

  ```
  public String[] selectImports(AnnotationMetadata annotationMetadata) {
          if (!this.isEnabled(annotationMetadata)) {
              return NO_IMPORTS;
          } else {
              AutoConfigurationMetadata autoConfigurationMetadata = AutoConfigurationMetadataLoader.loadMetadata(this.beanClassLoader);
              AutoConfigurationImportSelector.AutoConfigurationEntry autoConfigurationEntry = this.getAutoConfigurationEntry(autoConfigurationMetadata, annotationMetadata);
              return StringUtils.toStringArray(autoConfigurationEntry.getConfigurations());
          }
      }
  ```

  会给容器导入非常多的自动配置类；就是给容器中导入这个场景需要的所有组件

  ![SpringBoot-03自动配置类](images\SpringBoot-03自动配置类.png)

  有了自动配置类，免去了我们手动编写配置注入功能等的工作。

  ```
  private static Map<String, List<String>> loadSpringFactories(@Nullable ClassLoader classLoader) {
          MultiValueMap<String, String> result = (MultiValueMap)cache.get(classLoader);
          if (result != null) {
              return result;
          } else {
              try {
                  Enumeration<URL> urls = classLoader != null ? classLoader.getResources("META-INF/spring.factories") : ClassLoader.getSystemResources("META-INF/spring.factories");
                  LinkedMultiValueMap result = new LinkedMultiValueMap();
  
                  while(urls.hasMoreElements()) {
                      URL url = (URL)urls.nextElement();
                      UrlResource resource = new UrlResource(url);
                      Properties properties = PropertiesLoaderUtils.loadProperties(resource);
                      Iterator var6 = properties.entrySet().iterator();
  
                      while(var6.hasNext()) {
                          Entry<?, ?> entry = (Entry)var6.next();
                          String factoryTypeName = ((String)entry.getKey()).trim();
                          String[] var9 = StringUtils.commaDelimitedListToStringArray((String)entry.getValue());
                          int var10 = var9.length;
  
                          for(int var11 = 0; var11 < var10; ++var11) {
                              String factoryImplementationName = var9[var11];
                              result.add(factoryTypeName, factoryImplementationName.trim());
                          }
                      }
                  }
  
                  cache.put(classLoader, result);
                  return result;
              } catch (IOException var13) {
                  throw new IllegalArgumentException("Unable to load factories from location [META-INF/spring.factories]", var13);
              }
          }
      }
  ```

  从类路径下的META-INF/spring.factories中获取EnableAutoConfiguration指定的值，将这些值作为自动配置类导入到容器中，自动配置类就生效，帮我们进行自动配置工作；以前需要我们自己配置的东西，自动配置类帮我们做了。

  ![SpringBoot-04自动配置类文件路径](images\SpringBoot-04自动配置类文件路径.png)

  J2EE的整体整合和配置都在autoconfig包下面。

### 七、使用Spring Initializer快速创建Spring Boot项目

IDE都支持使用Spring的项目创建向导快速创建一个SpringBoot项目

![SpringBoot-05快速创建项目](images\SpringBoot-05快速创建项目.png)

选择我们需要的模块；向导会联网创建Spring Boot项目

默认生成的Spring Boot项目；

- 主程序已经生成好了
- resources文件夹中目录结构
  - static:保存静态资源：js  css images
  - templates:保存所有的模板页面（SpringBoot默认jar包使用嵌入式的Tomcat,默认不支持JSP），可以使用模板引擎（freemarker  thymeleaf）
- application.properties:Spring Boot应用的配置文件
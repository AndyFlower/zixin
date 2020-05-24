## SpringBoot 配置文件

### 一、配置文件

SpringBoot使用一个全局的配置文件，配置文件名是固定的； 

- application.properties 

- application.yml 

配置文件的作用：修改SpringBoot自动配置的默认值；SpringBoot在底层都给我们自动配置好； 

YAML（YAML Ain't Markup Language） 

YAML A Markup Language：是一个标记语言 

YAML isn't Markup Language：不是一个标记语言； 

标记语言： 

以前的配置文件；大多都使用的是 **xxxx.xml**文件； 

YAML：**以数据为中心**，比json、xml等更适合做配置文件； 

YAML：配置例子

```yaml
server:
	port: 8081
```

xml:

```xml
<server> 
    <port>8081</port> 
</server>
```

### 二、YAML语法

#### 1、基本语法

k:(空格)v：表示一对键值对（空格必须有）； 

以**空格**的缩进来控制层级关系；只要是左对齐的一列数据，都是同一个层级的

```yaml
server: 
	port: 8081
	path: /hello
```

属性和值也是大小写敏感； 

#### 2、值的写法

##### 2.1 **字面量：普通的值（数字，字符串，布尔）**

k: v：字面直接来写； 

字符串默认不用加上单引号或者双引号； 

""：双引号；不会转义字符串里面的特殊字符；特殊字符会作为本身想表示的意思 

name: "zhangsan \n lisi"：输出；zhangsan 换行 lisi 

''：单引号；会转义特殊字符，特殊字符最终只是一个普通的字符串数据 

name: ‘zhangsan \n lisi’：输出；zhangsan \n lisi 

##### 2.2 对象、Map（属性和值）（键值对）：

k: v：在下一行来写对象的属性和值的关系；注意缩进 

对象还是k: v的方式 

```yaml
friends:
		lastName: sang
		age: 18
```

行内写法

```yaml
friends: {lastName: sang,age: 18}
```

##### 2.3 数组（List Set）

用- 值表示数组中的一个元素 

```yaml
pets:
	- cat
	- dog
	- pig
```

行内写法

```yaml
pets: [cat,dog,pig]
```

### 三、@ConfigurationProperties配置文件值注入

#### 1.pom.xml中添加依赖

```xml
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <version>2.3.0.RELEASE</version>
            <optional>true</optional>
</dependency>
```

书写配置文件的时候会提示

#### 2.配置文件 

```yaml
person:
  lastName: sang
  age: 18
  boss: false
  maps: {k1: v1,k2: v2}
  lists:
    - li
    - san
  dog:
    name: wang
    age: 12

```

如果使用properties文件中文乱码的话需要修改文件的编码

#### 3.JavaBean:

```
package com.slp.springboot02config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName Person
 * @Description 将配置文件中配置的每一个属性的值，映射到这个组件中
 * ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中的相关的配置进行绑定；
 * prefis = "person":配置文件中哪个下面的所有属性一一映射
 *
 * 只有这个组价是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 * @Author sanglp
 * @Date 2020/5/22 17:42
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private int age;
    private Boolean boss;
    private List<Object> lists;
    private Map<String,Object> maps;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", lists=" + lists +
                ", maps=" + maps +
                ", dog=" + dog +
                '}';
    }
}

```

```java
package com.slp.springboot02config.bean;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/22 17:44
 * @Version 1.0
 **/
public class Dog {
    private String name;

    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

```

```ja
package com.slp.springboot02config;

import com.slp.springboot02config.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 可以在测试期间自动注入
 * RunWith 指定使用Spring处理器而不是junit
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }
}
```



#### 4.结果：

```java
Person{lastName='sang', age=18, boss=false, lists=[li, san], maps={k1=v1, k2=v2}, dog=com.slp.springboot02config.bean.Dog@6fa69af7}

```

### 四、@Value获取值

其它配置和上方一致，只看一下javabean的改变

```java
package com.slp.springboot02config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class PersonNew {
    /**
     * <bean class="Person2">
     *     <propertu name="lastName" value="sang"></propertu>
     *     </bean>
     *     person.last-name :对应的是配置文件中的名称
     */
    @Value("person.last-name")
    private String lastName;
    @Value("#{11*2}")
    private int age;
    @Value("true")
    private Boolean boss;
    private List<Object> lists;
    private Map<String,Object> maps;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}

```



### 五、@Value和@ConfigurationProperties注入的区别

|                | @ConfigurationProperties | @Value     |
| -------------- | ------------------------ | ---------- |
| 功能           | 批量注入配置文件中的属性 | 一个个指定 |
| 松散绑定       | 支持                     | 不支持     |
| SPEL           | 不支持                   | 支持       |
| JSR303数据校验 | 支持                     | 不支持     |

[^松散绑定]: 比如lasName 可以使用last-name last_name等

```java
//JSR303校验
@Component
@ConfigurationProperties(prefix = "personval")
@Validated
public class PersonValidate {
    @Email
    private String lastName;
}

```

需要添加jar包

```xml
<!--jsr3参数校验器-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
```

### 六、@PropertySource&@ImportResource

#### 1.@PropertySource 

加载指定配置文件

```java
package com.slp.springboot02config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "personsource")
public class PersonPropertySource {
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PersonPropertySource{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
}

```

person.properties

```properties
personsource.lastName=sang
```

测试结果

```java
PersonPropertySource{lastName='sang'}
```



#### 2.@ImportResource

导入Spring的配置文件，让配置文件中的内容生效

新建一个spring的配置文件，内容如下

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="helloService" class="com.slp.springboot02config.service.HelloService"></bean>
</beans>
```

测试Spring容器是否包含这个bean

```java
package com.slp.springboot02config;

import com.slp.springboot02config.bean.Person;
import com.slp.springboot02config.bean.PersonPropertySource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 可以在测试期间自动注入
 * RunWith 指定使用Spring处理器而不是junit
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;
    @Autowired
    PersonPropertySource personPropertySource;
    @Autowired
    ApplicationContext ioc ;
    @Test
    void contextLoads() {
        System.out.println(ioc.containsBean("helloService"));
    }

}
```

输出结果为false,说明此时里面还没有这个bean,说明自己编写的配置文件不能自动识别，想让Spring的配置文件生效，加载进来，需要将@ImportResource标注在主配置类上，修改启动类内容为如下

```java
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02ConfigApplication.class, args);
    }

}
```

再进行测试则会输出true，说明加载成功。

但是这样会很麻烦，加一个就要修改一下，SpringBoot推荐给容器中添加组件的方式:使用全注解的方式(@Bean)

去掉主配置类上的@ImportResource

```java
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02ConfigApplication.class, args);
    }

}
```

添加一个配置类

```java
package com.slp.springboot02config.config;

import com.slp.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：指明当前类是一个配置类   就是来替代之前的Spring配置文件
 * 在配置文件中用<bean></bean>来添加组件
 */
@Configuration
public class MyAppConfig {
    /**
     *  @Bean:将方法的返回值添加到容器中，容器中的组件默认的id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}

```

### 七、配置文件占位符

#### 1.随机数

```
${random.value}
${random.int}
${random.long}
${random.int(10)}
${random.int[1024,65536]}
```

#### 2.占位符获取之前配置的值，如果没有可以使用：之后的默认值

```pro
person.last-name=sang${random.int}
person.dog.name=${person.hello:hello}_dog
```

### 八.Profile

#### 1.多Profile文件

我们在主配置文件编写的时候，文件名可以是application-{profile}.properties/yml

默认使用application.properties的配置

#### 2.yml支持多文档块方式

```yml
server:
  port: 8081
  
spring:
  profiles:
    active: prod
      
---
server:
  port: 8083
spring:
  profiles: dev
  
---
server:
  port: 8084
spring:
  profiles: prod  
```

#### 3. 激活制定profile

1. 在配置文件application.properties中指定

```properties
spring.profiles.active=dev
```

2. 命令行

   java -jar   项目.jar  -spring.profiles.active=dev

3. 虚拟机参数

   -Dspring.profiles.active=dev

### 九 配置文件加载位置

springboot启动会扫描以下位置的application.properties或者application.yml文件作为Spring boot的默认配置文件

file:./config

file:./

classpath:/config/

classpath:/

优先级由高到低，高优先级会覆盖低优先级的配置；

SpringBoot从这四个位置全部加载，形成互补；

> 可以通过spring.config.location来修改默认的配置文件位置

项目打包好之后我们可以使用命令行参数的形式，启动项目的时候来指定配置文件的新位置，指定配置文件和默认加载的这些配置文件共同起作用形式形成互补

java -jar spring-boot-02.jar --spring.config.location=D:/application.properties

### 十、外部配置加载顺序

[官方文档]: (https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/spring-boot-features.html#boot-features-external-config)

SpringBoot可以从以下位置加载，优先级由高到低，形成互补。

1. 命令行参数

   > java -jar spring-boot.jar --server.port=8081 --server.context-path=/hello

2. 来自java:comp:/env的JNDI属性

3. java系统属性（System.getProperties()）

4. 操作系统环境变量

5. RandomValuePropertySource配置的random.*属性值

6. jar包外部的application-{profile}.properties或application.yml（带spring.profile）

7. jar包内部的application-{profile}.properties或application.yml（带spring.profile）

8. jar包外部的application-{profile}.properties或application.yml（不带spring.profile）

9. jar包内部的application-{profile}.properties或application.yml（不带spring.profile）

10. @Configuration注解类上的@PropertySource

11. 通过SpringApplication.setDefaultProperties指定的默认属性

### 十一、自动配置原理

[可以配置的元素](https://docs.spring.io/spring-boot/docs/1.5.9.RELEASE/reference/htmlsingle/#common-application-properties)

#### 1.自动配置原理

#####　1） SpringBoot启动的时候加载主配置类，开启了自动配置功能@EnableAutoConfiguration

##### 2）@EnableAutoConfiguration的作用

- 利用AutoConfigurationImportSelector给容器导入一些组件

- 可以查看selectInports()方法的内容

- ```java
  protected AutoConfigurationImportSelector.AutoConfigurationEntry getAutoConfigurationEntry(AnnotationMetadata annotationMetadata) 
  ```

> ```java
> Enumeration<URL> urls = classLoader != null ? classLoader.getResources("META-INF/spring.factories") : ClassLoader.getSystemResources("META-INF/spring.factories");
> ```
>
> SpringFactoriesLoader.loadFactoryNames()
>
> 扫描所有jar包类路径下META-INF/spring.factories
>
> 把扫描到的这些文件的内容包装秤properties对象
>
> 从properties中获取到EnableAutoConfiguration.class类对应的值

- 将类路径下META-INF/spring.factories里面配置的所有EnableAutoConfiguration的值加入到容器中

  ```
  # Initializers
  org.springframework.context.ApplicationContextInitializer=\
  org.springframework.boot.autoconfigure.SharedMetadataReaderFactoryContextInitializer,\
  org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener
  
  # Application Listeners
  org.springframework.context.ApplicationListener=\
  org.springframework.boot.autoconfigure.BackgroundPreinitializer
  
  # Auto Configuration Import Listeners
  org.springframework.boot.autoconfigure.AutoConfigurationImportListener=\
  org.springframework.boot.autoconfigure.condition.ConditionEvaluationReportAutoConfigurationImportListener
  
  # Auto Configuration Import Filters
  org.springframework.boot.autoconfigure.AutoConfigurationImportFilter=\
  org.springframework.boot.autoconfigure.condition.OnBeanCondition,\
  org.springframework.boot.autoconfigure.condition.OnClassCondition,\
  org.springframework.boot.autoconfigure.condition.OnWebApplicationCondition
  
  # Auto Configure
  org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
  org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration,\
  org.springframework.boot.autoconfigure.aop.AopAutoConfiguration,\
  org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration,\
  org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration,\
  org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration,\
  org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration,\
  org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration,\
  org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration,\
  org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration,\
  org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration,\
  org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration,\
  org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.couchbase.CouchbaseReactiveDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.couchbase.CouchbaseReactiveRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.couchbase.CouchbaseRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRestClientAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.ldap.LdapRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.mongo.MongoReactiveRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.neo4j.Neo4jRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.solr.SolrRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.r2dbc.R2dbcRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.r2dbc.R2dbcTransactionManagerAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration,\
  org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration,\
  org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientAutoConfiguration,\
  org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration,\
  org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration,\
  org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration,\
  org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration,\
  org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration,\
  org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration,\
  org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration,\
  org.springframework.boot.autoconfigure.hazelcast.HazelcastJpaDependencyAutoConfiguration,\
  org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration,\
  org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration,\
  org.springframework.boot.autoconfigure.influx.InfluxDbAutoConfiguration,\
  org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration,\
  org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration,\
  org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration,\
  org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,\
  org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration,\
  org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration,\
  org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration,\
  org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration,\
  org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration,\
  org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration,\
  org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration,\
  org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration,\
  org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration,\
  org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration,\
  org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration,\
  org.springframework.boot.autoconfigure.jsonb.JsonbAutoConfiguration,\
  org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration,\
  org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration,\
  org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapAutoConfiguration,\
  org.springframework.boot.autoconfigure.ldap.LdapAutoConfiguration,\
  org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration,\
  org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration,\
  org.springframework.boot.autoconfigure.mail.MailSenderValidatorAutoConfiguration,\
  org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration,\
  org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration,\
  org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration,\
  org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration,\
  org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration,\
  org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration,\
  org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration,\
  org.springframework.boot.autoconfigure.rsocket.RSocketMessagingAutoConfiguration,\
  org.springframework.boot.autoconfigure.rsocket.RSocketRequesterAutoConfiguration,\
  org.springframework.boot.autoconfigure.rsocket.RSocketServerAutoConfiguration,\
  org.springframework.boot.autoconfigure.rsocket.RSocketStrategiesAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.rsocket.RSocketSecurityAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyAutoConfiguration,\
  org.springframework.boot.autoconfigure.sendgrid.SendGridAutoConfiguration,\
  org.springframework.boot.autoconfigure.session.SessionAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.oauth2.client.reactive.ReactiveOAuth2ClientAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration,\
  org.springframework.boot.autoconfigure.security.oauth2.resource.reactive.ReactiveOAuth2ResourceServerAutoConfiguration,\
  org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration,\
  org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration,\
  org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration,\
  org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration,\
  org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration,\
  org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration,\
  org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.reactive.error.ErrorWebFluxAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration,\
  org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration,\
  org.springframework.boot.autoconfigure.websocket.reactive.WebSocketReactiveAutoConfiguration,\
  org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration,\
  org.springframework.boot.autoconfigure.websocket.servlet.WebSocketMessagingAutoConfiguration,\
  org.springframework.boot.autoconfigure.webservices.WebServicesAutoConfiguration,\
  org.springframework.boot.autoconfigure.webservices.client.WebServiceTemplateAutoConfiguration
  
  # Failure analyzers
  org.springframework.boot.diagnostics.FailureAnalyzer=\
  org.springframework.boot.autoconfigure.diagnostics.analyzer.NoSuchBeanDefinitionFailureAnalyzer,\
  org.springframework.boot.autoconfigure.flyway.FlywayMigrationScriptMissingFailureAnalyzer,\
  org.springframework.boot.autoconfigure.jdbc.DataSourceBeanCreationFailureAnalyzer,\
  org.springframework.boot.autoconfigure.jdbc.HikariDriverConfigurationFailureAnalyzer,\
  org.springframework.boot.autoconfigure.r2dbc.ConnectionFactoryBeanCreationFailureAnalyzer,\
  org.springframework.boot.autoconfigure.session.NonUniqueSessionRepositoryFailureAnalyzer
  
  # Template availability providers
  org.springframework.boot.autoconfigure.template.TemplateAvailabilityProvider=\
  org.springframework.boot.autoconfigure.freemarker.FreeMarkerTemplateAvailabilityProvider,\
  org.springframework.boot.autoconfigure.mustache.MustacheTemplateAvailabilityProvider,\
  org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAvailabilityProvider,\
  org.springframework.boot.autoconfigure.thymeleaf.ThymeleafTemplateAvailabilityProvider,\
  org.springframework.boot.autoconfigure.web.servlet.JspTemplateAvailabilityProvider
  
  ```

  每一个这样的xxxAutoCnfiguration类都是容器中的一个组件，都加入到容器中，用他们来做自动配置

##### 3)、每一个自动配置类进行自动配置功能

##### 4) 以HttpEncodingAutoConfiguration为例来解释自动配置与案例

  ```java
@Configuration(  //表示这是一个配置类 可以给容器中添加组件
    proxyBeanMethods = false
)
@EnableConfigurationProperties({ServerProperties.class}) //启用指定类ConfigurationProperties功能  将配置文件中对应的值和ConfigurationProperties绑定起来
@ConditionalOnWebApplication(
    type = Type.SERVLET
)
@ConditionalOnClass({CharacterEncodingFilter.class})//根据不同的条件，如果满足指定的条件整改配置类里面的配置就会生效  判断当前项目有没有CharacterEncodingFilter.class这个类
@ConditionalOnProperty(
    prefix = "server.servlet.encoding",
    value = {"enabled"},
    matchIfMissing = true
)//判断配置文件中是否存在某个配置 server.servlet.encoding.enable=true如果不存在也是生效的
public class HttpEncodingAutoConfiguration {
    private final Encoding properties;
    //只有一个有参构造器的情况下，参数的值会从容器中拿
    public HttpEncodingAutoConfiguration(ServerProperties properties) {
        this.properties = properties.getServlet().getEncoding();
    }
     @Bean//给容器中添加组件 这个组件的某些值 需要从Properties中获取
    @ConditionalOnMissingBean
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
        filter.setEncoding(this.properties.getCharset().name());
        filter.setForceRequestEncoding(this.properties.shouldForce(org.springframework.boot.web.servlet.server.Encoding.Type.REQUEST));
        filter.setForceResponseEncoding(this.properties.shouldForce(org.springframework.boot.web.servlet.server.Encoding.Type.RESPONSE));
        return filter;
    }
  ```

根据当前不同的条件判断，决定这个配置是否生效？

一旦这个配置类生效，这个配置类就会给容器中添加各种组件；这些组件的属性是从对应的properties里中获取的，这些类里面的属性又是和配置文件绑定的。

##### 5）所有配置文件中能配置的属性都是在xxxProperties类中封装着

  ```java
@ConfigurationProperties(
    prefix = "server",
    ignoreUnknownFields = true
)//从配置文件中获取指定的值和bean的属性进行绑定
public class ServerProperties {
  ```

精髓：

- SpringBoot启动会加载大量的自动配置类
- 我们看我们需要的功能有没有SpringBoot默认写好的自动配置类
- 我们再来看这个自动配置类到底配置了哪些组件
- 给容器中的自动配置类添加组件的时候，会从properties类中获取某些属性，我们就可以在配置文件中指定这些属性的至

  #### 2.细节

##### 1)@Conditional派生注解（Spring注解版原生的@Conditional作用）

作用：必须是@Conditional指定的条件成立，才给容器中添加组件，配置文件中的内容才生效

| @Conditional扩展注解            | 作用（判断是否满足当前指定条件）                 |
| ------------------------------- | ------------------------------------------------ |
| @ConditionalOnJava              | 系统的java版本是否符合要求                       |
| @ConditionalOnBean              | 容器中存在指定Bean；                             |
| @ConditionalOnMissingBean       | 容器中不存在指定Bean；                           |
| @ConditionalOnExpression        | 满足SpEL表达式指定                               |
| @ConditionalOnClass             | 系统中有指定的类                                 |
| @ConditionalOnMissingClass      | 系统中没有指定的类                               |
| @ConditionalOnSingleCandidate   | 容器中只有一个指定的Bean，或者这个Bean是首选Bean |
| @ConditionalOnProperty          | 系统中指定的属性是否有指定的值                   |
| @ConditionalOnResource          | 类路径下是否存在指定资源文件                     |
| @ConditionalOnWebApplication    | 当前是web环境                                    |
| @ConditionalOnNotWebApplication | 当前不是web环境                                  |
| @ConditionalOnJndi              | JNDI存在指定项                                   |

我们如何知道哪些自动配置类生效

通过启用debug=true属性，来让控制台打印自动配置报告

```
============================
CONDITIONS EVALUATION REPORT
============================


Positive matches:  （自动配置类启用的）
-----------------

   AopAutoConfiguration matched:
      - @ConditionalOnProperty (spring.aop.auto=true) matched (OnPropertyCondition)

   AopAutoConfiguration.ClassProxyingConfiguration matched:
      - @ConditionalOnMissingClass did not find unwanted class 'org.aspectj.weaver.Advice' (OnClassCondition)
      - @ConditionalOnProperty (spring.aop.proxy-target-class=true) matched (OnPropertyCondition)
      
Negative matches:  （自动配置类没有启用的）
-----------------

   ActiveMQAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.jms.ConnectionFactory' (OnClassCondition)

   AopAutoConfiguration.AspectJAutoProxyingConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.aspectj.weaver.Advice' (OnClassCondition)
      
```


## SpringBoot 日志

### 一、日志框架

#### 1、开发一个大型系统

1. System.out.println() ;关键信息打印在控制台 去掉 也太麻烦了吧 如果去掉又想改回来 或者写在一个文件  WDT  我疯了
2. 用框架来记录系统的一些运行时信息，eg:logging.jar
3. 加入一些高大上的功能，eg:异步模式、自动归档、日志切分 logging-good.jar
4. 调用需要修改之前的api，要修改代码 OMG
5. 想起来 JDBC是面向接口编程，可不可以使用这个呢？
6. 写一个统一的接口层；日志门面logger-abstrace.jar  给项目中导入具体的实现日志就可以了，我们之前的日志框架都是实现的抽象层。

#### 2、世面上的日志框架：

JUL、JCL、Jboss-logging、logback、log4j、log4j2、slf4j  

| 日志门面 （日志的抽象层）                                    | 日志实现                                          |
| ------------------------------------------------------------ | ------------------------------------------------- |
| ~~JCL（Jakarta Commons Logging）~~ SLF4j（Simple Logging Facade for Java） ~~**jboss-logging**~~ | Log4j JUL（java.util.logging） Log4j2 **Logback** |

左边选一个门面（抽象层）、右边来选一个实现；
日志门面： SLF4J；
日志实现：Logback；  

SpringBoot：底层是Spring框架，Spring框架默认是用JCL；‘
**SpringBoot选用SLF4j和logback**；

### 二、SLF4j使用

#### 1、如何在系统中使用SLF4j  [SLF4j](http://www.slf4j.org)

以后开发的时候，日志记录方法的调用，不应该来直接调用日志的实现类，而是调用日志抽象层里面的方法；
给系统里面导入slf4j的jar和 logback的实现jar  [http://www.slf4j.org/manual.html]

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    logger.info("Hello World");
  }
}
```

![http://www.slf4j.org/images/concrete-bindings.png](http://www.slf4j.org/images/concrete-bindings.png)

每一个日志的实现框架都有自己的配置文件。使用slf4j以后，**配置文件还是做成日志实现框架自己本身的配置文件；**  

#### 2、遗留问题

a（slf4j+logback）: Spring（commons-logging）、Hibernate（jboss-logging）、MyBatis、xxxx
统一日志记录，即使是别的框架和我一起统一使用slf4j进行输出？  

![统一日志记录](http://www.slf4j.org/images/legacy.png)

#### 3、如何让系统中所有的日志都统一到slf4j；
1、将系统中其他日志框架先排除出去；
2、用中间包来替换原有的日志框架；
3、我们导入slf4j其他的实现  

### 三、SpringBoot日志关系

```xml
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
       </dependency>
```

SpringBoot使用它来做日志功能；  

```xml
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring‐boot‐starter‐logging</artifactId>
</dependency>
```

![spring-boot-03-logging](D:\devtool\workspace\zixin\SpringBoot\images\spring-boot-03-logging.png)![SpringBoot-06](D:\devtool\workspace\zixin\SpringBoot\images\SpringBoot-06.png)

总结：

1. SpringBoot底层也是使用slf4j+logback的方式进行日志记录
2. SpringBoot也把其他的日志都替换成了slf4j；
3. 中间替换包？  

### 四、日志使用

#### 1、默认配置

SpringBoot默认帮我们配置好了日志；  

```java
package com.slp.springboot03logging;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot03LoggingApplicationTests {

    Logger log = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        //日志的级别  由低到高  可以调整输出的日志级别  日志就只会在这个级别和以后的高级别生效
        log.trace("这是trace日志");
        log.debug("这是debug日志");
        //springboot默认给我们的是info级别   如果指定了就按照指定的来 如果没指定就按照默认的方式来
        log.info("这是info日志");
        log.warn("这是warn日志");
        log.error("这是error日志");

    }

}
```

日志输出格式

```
日志输出格式：
%d表示日期时间，
%thread表示线程名，
%‐5level：级别从左显示5个字符宽度
%logger{50} 表示logger名字最长50个字符，否则按照句点分割。
%msg：日志消息，
%n是换行符
‐‐>
%d{yyyy‐MM‐dd HH:mm:ss.SSS} [%thread] %‐5level %logger{50} ‐ %msg%n

```

#### 2、SpringBoot修改日志的默认配置

```prop
logging.level.com.slp=trace
#logging.path=
# 不指定路径在当前项目下生成springboot.log日志
# 可以指定完整的路径；
#logging.file=D:/springboot.log
# 在当前磁盘的根路径下创建spring文件夹和里面的log文件夹；使用 spring.log 作为默认文件
logging.file.path=/spring/boot.log
# 在控制台输出的日志的格式
logging.pattern.console=%d{yyyy‐MM‐dd} [%thread] %‐5level %logger{50} ‐ %msg%n
# 指定文件中日志输出的格式
logging.pattern.file=%d{yyyy‐MM‐dd} === [%thread] === %‐5level === %logger{50} ==== %msg%n
```

#### 3、指定配置

给类路径下放上每个日志框架自己的配置文件即可；SpringBoot就不使用他默认配置的了

| Logging System          | Customization                                                |
| :---------------------- | :----------------------------------------------------------- |
| Logback                 | `logback-spring.xml`, `logback-spring.groovy`, `logback.xml`, or `logback.groovy` |
| Log4j2                  | `log4j2-spring.xml` or `log4j2.xml`                          |
| JDK (Java Util Logging) | `logging.properties`                                         |

> logback.xml：直接就被日志框架识别了；
> **logback-spring.xml**：日志框架就不直接加载日志的配置项，由SpringBoot解析日志配置，可以使用SpringBoot
> 的高级Profile功能  

```pro
<springProfile name="staging">
    <!-- configuration to be enabled when the "staging" profile is active -->
    可以指定某段配置只在某个环境下生效
</springProfile>

<springProfile name="dev | staging">
    <!-- configuration to be enabled when the "dev" or "staging" profiles are active -->
</springProfile>

<springProfile name="!production">
    <!-- configuration to be enabled when the "production" profile is not active -->
</springProfile>
```

如

```xml
 <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
<!‐‐
日志输出格式：
%d表示日期时间，
%thread表示线程名，
%‐5level：级别从左显示5个字符宽度
%logger{50} 表示logger名字最长50个字符，否则按照句点分割。
%msg：日志消息，
%n是换行符
‐‐>
        <layout class="ch.qos.logback.classic.PatternLayout">
            <springProfile name="dev">
                <pattern>%d{HH:mm:ss.SSS}--> [%thread] %-5level %logger{50} - %msg%n
                </pattern>
            </springProfile>
            <springProfile name="!dev">
                <pattern>%d{HH:mm:ss.SSS}=== [%thread] %-5level %logger{50} - %msg%n
                </pattern>
            </springProfile>
        </layout>
    </appender>
```

如果使用logback.xml作为日志配置文件，还要使用profile功能，会有以下错误
no applicable action for [springProfile]  

### 五、切换日志框架

可以按照slf4j的日志适配图，进行相关的切换；  

slf4j+log4j的方式；

```xml
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring‐boot‐starter‐web</artifactId>
<exclusions>
<exclusion>
<artifactId>logback‐classic</artifactId>
<groupId>ch.qos.logback</groupId>
</exclusion>
<exclusion>
<artifactId>log4j‐over‐slf4j</artifactId>
    <groupId>org.slf4j</groupId>
</exclusion>
</exclusions>
</dependency>
<dependency>
<groupId>org.slf4j</groupId>
<artifactId>slf4j‐log4j12</artifactId>
</dependency>
```

切换为log4j2

```xml
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring‐boot‐starter‐web</artifactId>
<exclusions>
<exclusion>
<artifactId>spring‐boot‐starter‐logging</artifactId>
<groupId>org.springframework.boot</groupId>
</exclusion>
</exclusions>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring‐boot‐starter‐log4j2</artifactId>
</dependency>
```


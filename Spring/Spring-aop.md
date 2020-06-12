## AOP
> AOP:(Aspect Oriented Programming)面向切面编程
> OOP:(Object Oriented Programming)面向对象编程


面向切面编程：基于OOP基础之上新的编程思想
指在程序运行期间，将某段代码动态的切入到指定方法的指定位置进行运行的这种编程方式，面向切面编程。

### 场景
计算器运行计算方法的时候进行日志记录
加日志记录

#### 1. 直接编写在方法内部；
不推荐，维护修改麻烦
日志记录：系统的辅助功能；
业务逻辑：核心功能
耦合
#### 2. 期望

业务逻辑：日志模块；在核心功能运行期间，自己动态的加上

> 可以使用动态代理来将日志代码动态的在目标方法执行前后执行

### 实现

#### 1. 动态代理

```
package com.slp.proxy;

import com.slp.inter.Calculator;
import com.slp.utils.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class CalculatorProxy {
    /**
     *
     * @param calculator  被代理对象
     * @return 返回的是代理对象
     */
    public static Calculator getProxy(final Calculator calculator){
        //执行器  帮助目标对象执行目标方法
        InvocationHandler h = new InvocationHandler() {
            /**
             *
             * @param proxy  代理对象 给jdk使用，任何时候都不要动这个对象
             * @param method  我们当前将要执行的目标对象的方法
             * @param args  方法调用是外界传入的参数值
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //利用反射执行目标方法
                //目标方法执行后的返回值
               // System.out.println("["+method.getName()+"]方法开始执行，用的参数列表是【"+ Arrays.toString(args));
                LogUtils.logStart(method,args);
               Object  invoke = method.invoke(calculator,args);
                LogUtils.logEnd(method,invoke);
                //System.out.println("["+method.getName()+"]方法执行完成，计算结果是【"+ invoke);
                //返回值必须返回出去外界才能拿到
                return invoke;
            }
        };
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        ClassLoader loader =calculator.getClass().getClassLoader();
        return (Calculator) Proxy.newProxyInstance(loader,interfaces,h);
    }
}

```

```java
@Test
    public void test(){
        Calculator calculator = new MyCalculator();
        calculator.add(1,2);

        Calculator c =  CalculatorProxy.getProxy(calculator);
        //代理对象和被代理对象唯一能产生的关联就是实现了同一个接口
        System.out.println(c.getClass());//class com.sun.proxy.$Proxy2
        System.out.println(Arrays.asList(c.getClass().getInterfaces()));//[interface com.slp.inter.Calculator]
        c.add(2,3);
    }
```

1. 写起来难
2. jdk默认的动态代理，如果目标uix没有事先任何接口，是无法为他创建代理对象的。

#### 2.Spring动态代理

Spring实现了AOP功能；底层就是动态代理；

1. 可以利用Spring一句代码都不写的去创建动态代理。实现简单，没有要求必须实现接口

将某段代码动态切入到指定方法的指定位置进行运行的这种编程方式（Spring简化了面向切面编程）

### AOP专业术语

![spring-aop-专业术语](images\spring-aop-专业术语.png)

### AOP使用步骤

#### 1、导包

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.slp</groupId>
  <artifactId>spring-aop-01</artifactId>
  <version>1.0-SNAPSHOT</version>

  <name>spring-aop-01</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aop</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-beans</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aspects</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-expression</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>commons-logging</groupId>
      <artifactId>commons-logging</artifactId>
      <version>1.2</version>
    </dependency>
    <!--即使没有实现接口也可以创建代理-->
    <dependency>
      <groupId>aopalliance</groupId>
      <artifactId>aopalliance</artifactId>
      <version>1.0</version>
    </dependency>
    <dependency>
      <groupId>org.aspectj</groupId>
      <artifactId>aspectjweaver</artifactId>
      <version>1.9.5</version>
    </dependency>
    <dependency>
      <groupId>cglib</groupId>
      <artifactId>cglib</artifactId>
      <version>3.3.0</version>
    </dependency>
  </dependencies>

  <build>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
        <!-- site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
        <plugin>
          <artifactId>maven-site-plugin</artifactId>
          <version>3.7.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-project-info-reports-plugin</artifactId>
          <version>3.0.0</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>

```



#### 2、写配置

​    将目标类和切面类（封装了通知方法）加入到IOC容器中

指定哪个是切面类，加@Aspect

#### 3.告诉Spring,切面类中的方法，都是何时何地运行

```java
package com.slp.version2.utils;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogUtils {

    /**
     * 告诉Spring每个方法都什么时候运行
     * try{
     * @Before
     *      method.invoke(obj,args)
     * @AfterReturning
     * }catch(e){
     * @AfterThrowing
     * }finally{
     * @After
     * }
     *
     * 在执行目标方法之前运行
     *
     * @Before  前置通知
     * @After 目标方法运行结束之后  后置通知
     * @AfterReturning 目标方法返回之后  返回通知
     * @AfterThrowing 目标方法抛出异常之后  异常通知
     * @Around ：环绕通知
     */

    //想在执行目标方法执行之前运行，写切入点表达式
    //execution(访问权限  返回类型  方法签名)
    @Before("execution(public int com.slp.version2.inter.impl.MyCalculator.*(int,int))")
    public static void logStart(){
        System.out.println("[]方法开始执行，用的参数列表是【");

    }

    /**
     *  在执行目标方法之后运行
     */
    @AfterReturning("execution(public int com.slp.version2.inter.impl.MyCalculator.*(int,int))")
    public static void logEnd(){
        System.out.println("[]方法执行完成，计算结果是【】");

    }
}

```



4. 开启基于注解的功能

   ```java
   package com.slp.version2.utils;
   
   import org.aspectj.lang.JoinPoint;
   import org.aspectj.lang.ProceedingJoinPoint;
   import org.aspectj.lang.Signature;
   import org.aspectj.lang.annotation.*;
   import org.springframework.stereotype.Component;
   
   import java.util.Arrays;
   
   @Aspect
   @Component
   public class LogUtils2 {
   
   
       /**
        * 提取可重用的切入点表达式
        * 1.随便申明一个没有实现和返回的方法
        * 2.给方法标注@Pointcut注解
        *
        */
       @Pointcut("execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
       public void MyPoint(){
   
       }
   
       @Before(value = "MyPoint()")
       public static void logStartReference(JoinPoint jp){
   
       }
       /**
        * 告诉Spring每个方法都什么时候运行
        * try{
        * @Before
        *      method.invoke(obj,args)
        * @AfterReturning
        * }catch(e){
        * @AfterThrowing
        * }finally{
        * @After
        * }
        *
        * 在执行目标方法之前运行
        *
        * @Before  前置通知
        * @After 目标方法运行结束之后  后置通知
        * @AfterReturning 目标方法返回之后  返回通知
        * @AfterThrowing 目标方法抛出异常之后  异常通知
        * @Around ：环绕通知
        */
   
       //想在执行目标方法执行之前运行，写切入点表达式
       //execution(访问权限  返回类型  方法签名)
       @Before("execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
       public static void logStart(JoinPoint jp){
         Object[] args =   jp.getArgs();//获取目标方法运行时使用的参数
          Signature signature =  jp.getSignature();//获取方法签名
           String name = signature.getName();//方法名称
           System.out.println("["+name+"]方法开始执行，用的参数列表是【"+ Arrays.asList(args)+"】");
   
       }
   
       /**
        *  在执行目标方法之后运行
        *
        *  在方法执行的时候拿到目标方法的详细信息
        *  1)只需要为通知方法的参数列表上写一个参数JoinPoint
        *      JoinPoint joinPoint:封装了当前目标方法的详细信息
        */
       @AfterReturning("execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
       public static void logEnd(JoinPoint jp){
           Signature signature =  jp.getSignature();//获取方法签名
           String name = signature.getName();//方法名称
           System.out.println("["+name+"]方法执行完成");
   
       }
   
       /**
        * 高速Spring这个result用来接收返回值returning = "result"
        * @param jp
        * @param result
        */
       @AfterReturning(returning = "result",value="execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
       public static void logAfterReturning(JoinPoint jp,Object result){
           Signature signature =  jp.getSignature();//获取方法签名
           String name = signature.getName();//方法名称
           System.out.println("["+name+"]方法执行完成，计算结果是【"+result+"】");
   
       }
   
       /**
        * 告诉Spring哪个参数来接收异常
        * throwing = "exception"
        * Spring对通知方法要求不严格
        * 唯一要求的是方法的参数列表一定不能乱写
        * 参数表上的每一个参数，Spring都得知道是什么
        * JpinPoint:Spring知道
        * 不知道的参数一定要知道
        * Exception exception:指定可以接收的异常类型  如果范围小的话 只会接收指定的异常
        * @param jp
        * @param
        */
       @AfterThrowing(throwing = "exception",value="execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
       public static void logAfterThrowing(JoinPoint jp,Exception exception){
           Signature signature =  jp.getSignature();//获取方法签名
           String name = signature.getName();//方法名称
           System.out.println("["+name+"]方法执行完成，异常是【"+exception.getMessage()+"】");
   
       }
   
       /**
        * @Around 环绕 是Spring最强大的通知
        * @Around 环绕：动态代理
        * try{
        *     前置
        *     method.invoke
        *     返回通知
        * }catch(e){
        *     异常通知
        * }finally{
        *     后置通知
        * }
        *
        * 四合一就是环绕通知：
        * 环绕通知中有一个参数
        * 环绕通知优先于普通通知执行，执行顺序
        *  （环绕前置）    普通前置  目标方法执行  环绕正常返回/出现异常  环绕后置 普通后置  普通返回
        */
   
       @Around("MyPoint()")
       public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
           System.out.println("环绕");
           Object[] args = proceedingJoinPoint.getArgs();
           Object procees  =  proceedingJoinPoint.proceed(args);//利用反射推进目标方法运行
           return procees;
       }
   }
   
   ```

   ```java
   package com.slp.version1;
   
   import com.slp.version2.inter.Calculator;
   import com.slp.version2.inter.impl.MyCalculator;
   import com.slp.version2.inter.impl.MyCalculator2;
   import org.junit.Test;
   import org.springframework.context.ApplicationContext;
   import org.springframework.context.support.ClassPathXmlApplicationContext;
   
   public class TestVersion2 {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
   
   
   
       @Test
       public void test(){
           //从IOC容器获取目标对象，注意，如果想要用类型 一定要用他的接口
           Calculator myCalculator = applicationContext.getBean(Calculator.class);
           myCalculator.add(1,2);
           //细节1com.slp.version2.inter.impl.MyCalculator@1190200a
           //class com.sun.proxy.$Proxy15
           //AOP的底层就是动态代理  容器中国保存的组件是他的代理对象，$Proxy15 当然不是本类的类型 所以不能用本类获取
           System.out.println(myCalculator);//com.slp.version2.inter.impl.MyCalculator@1190200a
           System.out.println(myCalculator.getClass());//class com.sun.proxy.$Proxy15
       }
   
       @Test
       public void test2(){
           //从IOC容器获取目标对象，注意，如果想要用类型 一定要用他的接口  如果没有接口就用自己
           MyCalculator2 myCalculator = applicationContext.getBean(MyCalculator2.class);
           myCalculator.add(1,2);
           //细节1com.slp.version2.inter.impl.MyCalculator2@4d0f2471
           //class com.slp.version2.inter.impl.MyCalculator2$$EnhancerBySpringCGLIB$$2b7c9b9d
           //cglib帮我们创建好了代理对象
           System.out.println(myCalculator);//com.slp.version2.inter.impl.MyCalculator2@4d0f2471
           System.out.println(myCalculator.getClass());//class com.slp.version2.inter.impl.MyCalculator2$$EnhancerBySpringCGLIB$$2b7c9b9d
   
       }
   
   
       /**
        * 通知方法的执行顺序
        * try{
        * @Before
        *      method.invoke(obj,args)
        * @AfterReturning
        * }catch(e){
        * @AfterThrowing
        * }finally{
        * @After
        * }
        *
        * 正常执行@Before   @After    @AfterReturning
        * 异常执行@Before @After   @AfterThrowing
        */
   
   }
   
   ```

   

### AOP使用场景

1. AOP加日志保存到数据库
2. AOP做权限验证
3. AOP可以做安全检查
4. AOP做事务控制

### 基于配置使用AOP

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/aop https://www.springframework.org/schema/aop/spring-aop.xsd">

    <!--基于配置的aop-->
    <bean id="myCalculator" class="com.slp.version3.inter.impl.MyCalculator"/>
    <bean id="logUtils" class="com.slp.version3.utils.LogUtils"/>
    <bean id="validationAspect" class="com.slp.version3.utils.ValidationAspect"/>
    <!--aop名称空间-->
    <aop:config>
        <!--全局能用-->
        <aop:pointcut id="globalPoint" expression="execution( * com.slp.version3.inter.impl.*.*(..))"/>
        <!--普通前置  目标方法 （环绕执行后置/返回）  普通后置  （环绕后置）-->
        <!--指定切面  order可以指定执行顺序-->
        <aop:aspect ref="logUtils" order="2">
            <!--只有当前切面能用-->
            <aop:pointcut id="myPoint" expression="execution( * com.slp.version3.inter.impl.*.*(..))"/>
            <aop:before method="logStart" pointcut="execution( * com.slp.version3.inter.impl.*.*(..))"/>
            <aop:after method="logEnd" pointcut-ref="myPoint"/>
        </aop:aspect>
        <aop:aspect ref="validationAspect">
            <aop:before method="logStart" pointcut="execution( * com.slp.version3.inter.impl.*.*(..))"/>
            <aop:after method="logEnd" pointcut-ref="globalPoint"/>

        </aop:aspect>
        <!--配置切面执行时间-->

    </aop:config>
    <!--注解优点：快速 方便
        配置：功能完善 重要的用配置 不重要的用注解 -->
</beans>
```


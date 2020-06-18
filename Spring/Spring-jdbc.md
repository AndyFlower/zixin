## 声明式事务

事务：

操作数据库

Spring提供了JdbcTemplate能快捷的操作数据库

JdbcTemplate和QueryRunner;

```xml
<dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-orm</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>5.2.6.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.20</version>
    </dependency>
    <dependency>
      <groupId>c3p0</groupId>
      <artifactId>c3p0</artifactId>
      <version>0.9.1.2</version>
    </dependency>
```

配置：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">
    <context:component-scan base-package="com.slp"/>
    <!--引入外部配置文件-->
    <context:property-placeholder location="db.properties"/>
    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <property name="user" value="${jdbc.user}"></property>
        <property name="password" value="${jdbc.password}"></property>
        <property name="jdbcUrl" value="${jdbc.jdbcUrl}"></property>
        <property name="driverClass" value="${jdbc.classDriver}"></property>
     </bean>
    <!--具名参数的jdbctemplate-->
    <bean id="namedParameterJdbcTemplate" class="org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate">
        <!--使用构造器方式注入一个数据元-->
        <constructor-arg name="dataSource" ref="dataSource"/>
    </bean>
</beans>
```



测试：

```java
package com.slp.test;

import com.slp.bean.Employee;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class TxTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
    NamedParameterJdbcTemplate namedParameterJdbcTemplate=context.getBean(NamedParameterJdbcTemplate.class);
    @Test
    public void test() throws SQLException {
        DataSource dataSource = context.getBean(DataSource.class);
        Connection connection =  dataSource.getConnection();
        connection.close();
    }
    @Test
    public void test1() throws SQLException {
        String sql = "update employee set salary = ? where emp_id=?";
        int update = jdbcTemplate.update(sql,1200.00,5);
        System.out.println("更新影响的员工数目："+update);

    }

    /**
     * 批量插入
     * @throws SQLException
     */
    @Test
    public void test2() throws SQLException {
        String sql = "insert into employee (emp_name,salary) values (?,?)";
        //长度就是执行次数
        List<Object[]> batchArgs = new ArrayList<>();
        batchArgs.add(new Object[]{"zhansan",122});
        batchArgs.add(new Object[]{"lisi",233});
        int insert[] = jdbcTemplate.batchUpdate();
        System.out.println("更新影响的员工数目："+insert.length);

    }

    /**
     * bean需要和数据库中字段值名称一致 否则无法完成封装
     * 方法级别进行了区分
     * 查询集合jdbcTemplate.query()
     * 查询单个对象jdbcTemplate.queryForObject()
     *          如果查询没结果会报错
     * @throws SQLException
     */
    @Test
    public void test5() throws SQLException {
        String sql = "select emp_id empId,emp_name empName,salary  from employee where emp_id=?";

        //RowMapper 每一行记录和javaBean属性如何映射

        Employee employee = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Employee.class),5);
        System.out.println("查询信息："+employee.getEmpName());


    }

    /**
     * 批量查询
     * @throws SQLException
     */
    @Test
    public void test6() throws SQLException {
        String sql = "select emp_id empId,emp_name empName,salary  from employee where salary > ?";

        List<Employee> employee = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Employee.class),4000);

        System.out.println("查询信息："+employee);


    }

    /**
     * 具名参数插入
     * 具名参数：具有名字的参数  不是占位符 而是变量名
     *          语法格式： ：参数名
     *          Spring有支持具名参数功能的JdbcTemplate
     * 占位符参数：？的顺序不能乱
     * @throws SQLException
     */
    @Test
    public void test7() throws SQLException {
        String sql = "insert into employee (emp_name,salary) values (:empName,:salary)";

        Map<String,Object> map=new HashMap<>();
        map.put("empName","wang");
        map.put("salary",222);
        namedParameterJdbcTemplate.update(sql,map);


    }

    /**
     * 具名函数插入 以SqlParameterSource形式传入
     * @throws SQLException
     */
    @Test
    public void test8() throws SQLException {
        String sql = "insert into employee (emp_name,salary) values (:empName,:salary)";
        Employee employee=new Employee();
        employee.setEmpName("li");
        employee.setSalary(9999.0);
        namedParameterJdbcTemplate.update(sql,new BeanPropertySqlParameterSource(employee));



    }
}

```



### 编程式事务

```java
try{
    获取连接
    设置非自动提交
    执行
    提交    
}catch(){
    回滚
}finally{
    关闭连接释放资源
}
```

###  声明式事务

以前通过复杂的编程来编写一个事务，替换为只需要告诉Spring哪个方法是事务。

Spring自动进行事务控制AOP环绕通知可以去做：

>  获取连接
>  设置非自动提交
>  执行
>  提交 
>
>  回滚
>
> 关闭连接释放资源

最终效果：

```java
BookService{
    @thisistransaction
    public void checkout(){
        
    }
}
```

#### 事务的特性

- 原子性
- 一致性
- 隔离性
- 持久性

事务管理代码的固定模式作为一种横切关注点

```
TransactionManager 
```

这个事务管理器就可以在目标方法运行前后进行事务管理（事务切面）

我们使用`DataSourceTransactionManager`;

#### 为方法快速加上事务

1. 配置出事务管理器让他工作

   ```xml
   <!--事务控制-->
       <!--配置事务管理器-->
       <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
           <!--控制数据源-->
           <property name="dataSource" ref="dataSource"/>
   
       </bean>
       <!--开启基于注解的事务控制模式-->
       <tx:annotation-driven transaction-manager="transactionManager" />
       <!-- 给事务方法加注解-->
   ```

   

2. 开启基于注解的事务控制模式

3. 加事务注解

   ```java
    /**
        * 事务注解
        * @param userName
        * @param bookId
        */
       @Transactional
       public void checkout(String userName,String bookId){
           //库存
           bookDao.updateStock(bookId);
   
           //查询价格
           int price = bookDao.getPrice(bookId);
           //更新余额
           bookDao.updateBalance(userName,price);
       }
   ```

   

### 事务的隔离级别

#### 数据库事务并发问题

假设现在有两个事务:Transaction01和Transaction02并发执行。

##### 1.脏读

1. Transaction01将某条记录的age值从20修改为30
2. Transaction02读取了Transaction01更新后的值30
3. Transaction01回滚，age恢复到了20
4. Transaction02读取到的300是一个无效的值

##### 2.不可重复读

1. Transaction01读取了AGE的值为20
2. Transaction02将AGE的值修改为30
3. Transaction01再次读取AGE值为30，和第一次读取不一致

##### 3.幻读

1. Transaction01读取了STUDENT表中的一部分数据
2. Transaction01向Student表中插入了新的行
3. Transaction01读取了STUDENT表时，多出了一些行

#### 隔离级别

数据库系统必须具有隔离并发运行各个事务的能力，使他们不会相互影响，避免各种并发问题。一个事务与其他事务隔离的程度称为隔离级别。SQL标准中规定了各种事务隔离级别，不同隔离级别对应不同的干扰程度，隔离级别越高，数据一致性就约好，但并发性越弱。

#####  1.读未提交：READ UNCOMMITED

允许Transaction01读取Transaction01未提交的修改

> 会出现脏读

##### 2.读已提交：READ COMMITED

要求Transaction01只能读取Transaction02已提交的修改

> 可以避免脏读 

##### 3.可重复读：REPEATABLE READ

确保Transaction01可以多次从一个字段中读取相同的值，即Transaction01执行期间禁止其他事务对这个字段进行更新

##### 4.串行化：SERIALIZABLE

确保Transaction01可以多次从一个表中读取到相同的行，由Transaction01执行期间，禁止其他事务对这个表进行添加、更新、删除操作。可以避免任何并发问题，但性能十分低下。

|                  | 脏读 | 不可重复读 | 幻读 |
| ---------------- | ---- | ---------- | ---- |
| READ UNCOMMITTED | 有   | 有         | 有   |
| READ COMMITTED   | 无   | 有         | 有   |
| REPEATABLE READ  | 无   | 无         | 有   |
| SERIALIZABLE     | 无   | 无         | 无   |

各种数据库产品对事务隔离级别的支持程度

|                  | Oracle | Mysql |
| ---------------- | ------ | ----- |
| READ UNCOMMITTED | ×      | √     |
| READ COMMITTED   | √      | √     |
| REPEATABLE READ  | ×      | √     |
| SERIALIZABLE     | √      | √     |

#### 在Spring中指定事务隔离基本

> ```
> @Transactional(isolation = Isolation.REPEATABLE_READ)
> ```

#### 事务的传播行为

| 传播属性      | 描述                                                         |
| ------------- | ------------------------------------------------------------ |
| REQUIRED      | 如果有事在运行，当前的方法就在这个事务内运行，否陈，就启动一个新的事务，并在自己的事务内运行 |
| REQUIRED_NEW  | 当前的方法必须启动新事务，并在他自己的事务内运行，如果有事务正在运行，应该将它挂起 |
| SUPPORTS      | 如果有事务在运行，当前的方法就在这个事务内运行，否则他可以不运行在事务中 |
| NOT_SUPPORTED | 当前的事务不应该运行在事务中，如果有运行的事务，将它挂起     |
| MANDATORY     | 当前的方法必须运行在事务内部，如果没有正在运行的事务，就抛出异常 |
| NEVER         | 当前的方法不应该运行在事务中，如果有运行的事务，将抛出异常   |
| NESTED        | 如果有事务再运行，当前的方法就应该在这个事务的嵌套事务内运行，否则，就启动一个新的事务，并在他自己的事务内运行 |

##### 注解版配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context" xmlns:tx="http://www.springframework.org/schema/tx"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd">
    <context:component-scan base-package="com.slp"/>
    <!--引入外部配置文件-->
    <context:property-placeholder location="db.properties"/>
    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <property name="user" value="${jdbc.user}"></property>
        <property name="password" value="${jdbc.password}"></property>
        <property name="jdbcUrl" value="${jdbc.jdbcUrl}"></property>
        <property name="driverClass" value="${jdbc.classDriver}"></property>
     </bean>
    <!--具名参数的jdbctemplate-->
    <bean id="namedParameterJdbcTemplate" class="org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate">
        <!--使用构造器方式注入一股数据元-->
        <constructor-arg name="dataSource" ref="dataSource"/>
    </bean>
    <!--配置jdbctemplate-->
    <bean class="org.springframework.jdbc.core.JdbcTemplate" id="jdbcTemplate">
        <property name="dataSource" ref="dataSource"/>
    </bean>
    <!--事务控制-->
    <!--配置事务管理器-->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <!--控制数据源-->
        <property name="dataSource" ref="dataSource"/>

    </bean>
    <!--开启基于注解的事务控制模式-->
    <tx:annotation-driven transaction-manager="transactionManager" />
    <!-- 给事务方法加注解-->

</beans>
```



```
package com.slp.service;

import com.slp.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * 事务注解
     * @param userName
     * @param bookId
     * 事务细节：
     * isolation-Isolation:事务隔离级别
     * propagation-Propagation:事务传播特性
     *
     * noRollbackFor-Class[] :哪些异常事务可以不回滚
     * noRollbackForClassName-String[]  :全类名
     *
     * rollbackFor-Class[] :哪些异常事务需要回滚
     * rollbackForClassName-String[]  :全类名
     *
     * 异常分类：
     *        运行时异常（非检查异常）：可以不用处理  ；默认都回滚
     *        编译时异常（受检异常）：需要处理 ； 默认不回滚
     *
     * 事务的回滚：默认发生运行时异常都回滚，发生编译时异常不回滚
     * noRollbackFor:哪些异常事务可以不回滚；可以让原来默认回滚的不回滚
     *              noRollbackFor = {ArithmeticException.class}
     * rollbackFor:原本不回滚的异常让其回滚
     *              rollbackFor = {FileNotFoundException.class}
     *
     * readOnly-boolean:设置事务只读、
     *      可以进行事务优化：
     *      readonly=true 加快查询速度，不用管事务那一块操作
     * timeout-int:超时；事务超出指定时长自动终止并回滚
     *
     *
     * propagation-Propagation:事务传播行为
     *   传播行为（事务的传播+事务的行为）
     *          如果有多个事务进行嵌套操作，子事务是否大事务公用一个事务
     *传播行为：
     * AService{
     *     tx_a(){
     *         tx_b(){
     *         }
     *         tx_c(){
     *         }
     *     }
     * }
     */
    @Transactional(timeout = 3,readOnly = false,noRollbackFor = {ArithmeticException.class},rollbackFor = {FileNotFoundException.class})
    public void checkout(String userName,String bookId){
        //库存
        bookDao.updateStock(bookId);

        //查询价格
        int price = bookDao.getPrice(bookId);
        //更新余额
        bookDao.updateBalance(userName,price);
    }

    /**
     * 调整事务的传播行为
     *  REQUIRED(0),
     *     SUPPORTS(1),
     *     MANDATORY(2),
     *     REQUIRES_NEW(3),
     *     NOT_SUPPORTED(4),
     *     NEVER(5),
     *     NESTED(6);
     * @param bookId
     * @return
     */
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public int getPrice(String bookId){
        return bookDao.getPrice(bookId);
    }

    @Transactional()
    public void updatePrice(String bookId,int price){
         bookDao.updatePrice(bookId,price);
    }

    /**
     * 如果将multx放在这里
     * 将内部两个方法都设置为REQUIRES_NEW
     * 效果：没修改
     */
    @Transactional
    public void mulTx(){
        checkout("Li","001");
        updatePrice("002",98);
        int i=10/0;
    }
}

```

```
package com.slp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName MultService
 * @Description TODO
 * @Author zixin
 * @Date 2020/6/12 8:43
 * @Version 1.0
 **/
@Service
public class MultService {

    @Autowired
    private BookService bookService ;
    @Transactional
    public void mulTx(){
        //都是可以设置的
        //传播行为来设置这个事务方法是不是和之前的大事务共享一个事务（使用同一条连接）
        //都设置为REQUIRED表示和外面的公用一个事务  如果错误将所有的都回滚
        //REQUIRED
        bookService.checkout("Li","001");
        //REQUIRED
        bookService.updatePrice("002",98);
    }

    @Transactional
    public void mulTx2(){
        //都是可以设置的
        //传播行为来设置这个事务方法是不是和之前的大事务共享一个事务（使用同一条连接）
        //如果第二个设置为REQUIRE_NEW表示第二个方法开启新事务 如果第二个失败  第一个不会回滚
        //REQUIRED
        bookService.checkout("Li","001");
        //REQUIRED_new
        bookService.updatePrice("002",98);
    }
}

```

```java
package com.slp;

import com.slp.service.BookService;
import com.slp.service.MultService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test(){
        BookService bookService = context.getBean(BookService.class);
        bookService.checkout("zhang","isbn01");;

    }

    /**
     * multc(){
     *     //Required
     *     A(){
     *          //REQUIRES_NEW
     *         B(){}
     *         //REQUIRED
     *         C(){}
     *     }
     *     //REQUIRES_NEW
     *     D(){
     *     DDDD()//REQUIRES_NEW 不崩  required崩
     *     //REQUIRED
     *         E(){
     *             //REQUIRED_NEW
     *             F(){
     *                 10/0 ；E崩 G崩 A崩 C崩
     *             }
     *         }
     *         //REQUIRED_NEW
     *         G(){}
     *
     *     }
     *
     *     int i=10/0; B成功 D成功
     *
     *     任何处崩已经执行的REQUIRES_NEW都会成功
     *
     *     如果是REQUIRED事务的属性都是继承与大事务的
     *     而REQUIRES_NEW 可以调整自己的属性
     *
     *     默认REQUIRED
     *
     *     REQUIRED:将之前事务用的connection传递给这个方法使用
     *     REQUIRES_NEW这个方法直接使用新的connection
     * }
     */
    @Test
    public void testMult(){
        MultService multService = context.getBean(MultService.class);
        multService.mulTx2();
        //如果是MulService--mulTx 调用bookService两个方法
        //BookService --mulTx --直接调用两个方法
        /**
         * MultServiceProxy.mulTx(){
         *     bookServiceProxy.checkout();//代理对象能进行事务控制
         *     bookServiceProxy.updatePrice()
         * }
         * //本类方法的嵌套调用就只是一个事务
         * MBookServiceProxy.mulTx(){
         *        checkout();//这里直接调用方法  相当于是将方法中的语句整合在一起
         *        updatePrice()
         *    }
         *
         */
    }
}

```

##### 配置版配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context" xmlns:tx="http://www.springframework.org/schema/tx"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd http://www.springframework.org/schema/aop https://www.springframework.org/schema/aop/spring-aop.xsd">
    <context:component-scan base-package="com.slp"/>
    <!--引入外部配置文件-->
    <context:property-placeholder location="db.properties"/>
    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <property name="user" value="${jdbc.user}"></property>
        <property name="password" value="${jdbc.password}"></property>
        <property name="jdbcUrl" value="${jdbc.jdbcUrl}"></property>
        <property name="driverClass" value="${jdbc.classDriver}"></property>
     </bean>
    <!--具名参数的jdbctemplate-->
    <bean id="namedParameterJdbcTemplate" class="org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate">
        <!--使用构造器方式注入一股数据元-->
        <constructor-arg name="dataSource" ref="dataSource"/>
    </bean>
    <!--配置jdbctemplate-->
    <bean class="org.springframework.jdbc.core.JdbcTemplate" id="jdbcTemplate">
        <property name="dataSource" ref="dataSource"/>
    </bean>
    <!--事务控制-->
    <!--配置事务管理器-->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <!--控制数据源-->
        <property name="dataSource" ref="dataSource"/>

    </bean>
   <!--基于xml的配置-->
    <bean id = "bookService" class="com.slp.service.BookService"></bean>

    <aop:config>
        <aop:pointcut id="txPoint" expression="execution(* com.slp.service.*.*(..))"/>
        <!--事务增强 -->
        <aop:advisor advice-ref="myAdvice" pointcut-ref="txPoint"/>
    </aop:config>
    <!--配置事务管理器
        指定是配置哪个事务管理器
    -->
    <tx:advice id="myAdvice" transaction-manager="transactionManager">
        <!--事务属性-->
        <tx:attributes>
            <!--指明哪个方法是事务方法 切入点表达式只是说要切的方法 并不一定要加事务-->
            <tx:method name="*"/>
            <tx:method name="checkout" propagation="REQUIRED" timeout="-1"/>
            <tx:method name="get" read-only="true"/>
        </tx:attributes>
    </tx:advice>

</beans>
```



IOC容器创建和销毁都要在合适的时机完成

Spring已经写好了这个监听器

这个监听器创建好的ioc容器在WebApplicationContext

public static WebApplicationContext getCurrentWebApplicationContext()

获取IOC容器的时候不需要自己new,使用ContextLoader.getCurrentWebApplicationContext()

```xml
<!-- Spring配置文件 -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>
               classpath:application-Context.xml
		</param-value>
	</context-param>
	<listener>
		<listener-class>
			org.springframework.web.context.ContextLoaderListener
		</listener-class>
	</listener>
```


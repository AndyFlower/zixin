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

   
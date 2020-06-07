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

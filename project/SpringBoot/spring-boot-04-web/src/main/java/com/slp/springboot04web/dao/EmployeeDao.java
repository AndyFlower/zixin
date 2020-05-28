package com.slp.springboot04web.dao;

import com.slp.springboot04web.entities.Department;
import com.slp.springboot04web.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EmployeeDao
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/26 8:22
 * @Version 1.0
 **/
@Repository
public class EmployeeDao {
    private  static Map<Integer, Employee> demployeess = null;

    static {
        demployeess = new HashMap<Integer,Employee>();
        demployeess.put(101,new Employee(101,"D-aa",1,new Department(101,"D-11"),new Date()));
    }

    public Collection<Employee> selectAll() {
        return  demployeess.values();
    }
}

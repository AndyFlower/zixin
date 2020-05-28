package com.slp.springboot04web.dao;

import com.slp.springboot04web.entities.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/26 8:17
 * @Version 1.0
 **/
@Repository
public class DepartmentDao {
    private  static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer,Department>();
        departments.put(101,new Department(101,"D-aa"));
    }

    public Collection<Department> getDepartmnents(){
        return departments.values();
    }

    public Department getDepartment(Integer id){
        return departments.get(id);
    }
}

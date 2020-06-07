package com.slp.springboot04web.controller;

import com.slp.springboot04web.dao.DepartmentDao;
import com.slp.springboot04web.dao.EmployeeDao;
import com.slp.springboot04web.entities.Department;
import com.slp.springboot04web.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

/**
 * @ClassName EmployeeController
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/27 8:38
 * @Version 1.0
 **/
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;
    public String list(){
        Collection<Employee> employees = employeeDao.selectAll();

        //classpath:/templates/xxx.html SpringBoot默认会拼接处理
        return  "emp/list";

    }
    
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartmnents();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addPage(Employee employee){

        return "redirect:/emps";
    }
}

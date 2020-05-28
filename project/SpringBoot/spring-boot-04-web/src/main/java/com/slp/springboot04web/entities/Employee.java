package com.slp.springboot04web.entities;

import java.util.Date;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/26 8:15
 * @Version 1.0
 **/
public class Employee {
    private Integer id;
    private String lastName;
            private Integer gender;
            private Department department;
            private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Employee(Integer id, String lastName, Integer gender, Department department, Date birth) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.department = department;
        this.birth = birth;
    }

    public Employee() {
    }
}

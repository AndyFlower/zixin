package com.slp.pattern.iterator;

import java.util.Iterator;

/**
 * @ClassName ComputerCollege
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/3 8:40
 * @Version 1.0
 **/
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;//保存当前数组的对象个数

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("数据结构","数据结构");
        addDepartment("大数据","大数据");
        addDepartment("数据挖掘","数据挖掘");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment]=department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}

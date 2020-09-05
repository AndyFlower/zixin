package com.slp.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName OutputImpl
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/3 8:51
 * @Version 1.0
 **/
public class OutputImpl {
    //学院集合
    List<College> collegeList ;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    //遍历所有的学院 然后调用printDepartment输出各个学院的系
    public void printCollege(){
        //collegeList取出所有的学院
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterator());//得到对应的迭代器 遍历
        }
    }

    //输出 学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }

}

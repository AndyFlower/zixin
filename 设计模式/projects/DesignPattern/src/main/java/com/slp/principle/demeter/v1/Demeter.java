package com.slp.principle.demeter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demeter
 * @Description 迪米特原则改造前版本
 * @Author sanglp
 * @Date 2020/8/13 14:26
 * @Version 1.0
 **/
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
//学校总部员工类
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
//管理学院员工的管理类
class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id="+i);
            list.add(emp);
        }
        return list;
    }
}

//管理学校员工的管理类
class SchoolManager{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee();
            emp.setId("学院总部员工id="+i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 该方法完成输出学校总部和学院员工信息id
     * 分析问题：
     *      1.这里的CollegeEmployee不是SchoolManager的直接朋友
     *      2.CollegeEmployee是以局部变量方式出现在SchoolManager
     *      3.违反了迪米特法则
     * @param sub
     */
    void printAllEmployee(CollegeManager sub){
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("-----学院员工-----");
        for(CollegeEmployee e:list1){
            System.out.println(e.getId());
        }
        //获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----学校总部员工-----");
        for(Employee e :list2){
            System.out.println(e.getId());
        }
    }
}
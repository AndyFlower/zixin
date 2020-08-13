package com.slp.principle.demeter.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demeter
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/13 17:04
 * @Version 1.0
 **/
public class Demeter {

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
    //输出学院员工的信息
    public void printEmployee(){
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("-------------学院员工-----------");
        for(CollegeEmployee e :list1){
            System.out.println(e.getId());
        }
    }
}

/**
 * 分析：SchoolManager类的直接朋友类有哪些 Employee  CollegeManager
 * CollegeEmployee不是直接朋友 而是一个陌生类，这样违背了一个迪米特法则
 */
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

    void printAllEmployee(CollegeManager sub){
        //1.将输出学院的员工方法，封装到CollegeManager
        sub.printEmployee();
        //获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工-----");
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }
}
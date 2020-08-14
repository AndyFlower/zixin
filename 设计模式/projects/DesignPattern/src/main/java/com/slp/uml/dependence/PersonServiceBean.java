package com.slp.uml.dependence;

/**
 * @ClassName PersonServiceBean
 * @Description 类图依赖关系
 * @Author sanglp
 * @Date 2020/8/14 9:49
 * @Version 1.0
 **/
public class PersonServiceBean {
    private PersonDao personDao;//类

    public void save(Person person){

    }

    public IDCard getIdCard(Integer personid){
        return new IDCard();
    }

    public void modify(){
        Department department = new Department();
    }
}

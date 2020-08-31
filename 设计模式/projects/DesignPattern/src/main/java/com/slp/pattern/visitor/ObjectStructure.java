package com.slp.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName ObjectStructure
 * @Description 数据结构，管理很多人
 * @Author sanglp
 * @Date 2020/8/31 8:32
 * @Version 1.0
 **/
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<Person>();

    //增加到list
    public void attach(Person person){
        persons.add(person);
    }
    //移除
    public void detach(Person person){
        persons.remove(person);
    }

    //显示测评结果
    public void display(Action action){
        for (Person p:persons
             ) {
            p.accept(action);

        }
    }
}

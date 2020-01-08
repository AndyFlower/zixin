package com.zixin;

/**
 * @ClassName Person
 * @Description TODO
 * @Author zishen
 * @Date 2019/12/30 8:16
 * @Version 1.0
 **/
public class Person {
    private int age;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

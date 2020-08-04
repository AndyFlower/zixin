package com.slp.principle.singleresponsibility.v1;

public class SingeleResponsibility {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run("汽车");
        v.run("飞机");
    }
}

/**
 * 交通工具类
 * 方式一
 * 1.在方法1的run方法中，违反了单一职责原则
 * 2.解决的方案非常的简单，根据交通工具运行的方法不同，分解成不同的类即可
 */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上奔跑");
    }
}
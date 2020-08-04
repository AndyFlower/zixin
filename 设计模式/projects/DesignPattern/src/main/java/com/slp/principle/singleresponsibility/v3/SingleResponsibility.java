package com.slp.principle.singleresponsibility.v3;

public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }
}

/**
 * 方式3的分析
 * 1.这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2.虽然没有遵循类的单一职责，但是在方法上遵循了单一职责方法
 */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上奔跑");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+"在天空飞行");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+"在水中");
    }
}
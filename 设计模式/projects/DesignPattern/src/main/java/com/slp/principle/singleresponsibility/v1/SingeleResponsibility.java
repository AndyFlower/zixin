package com.slp.principle.singleresponsibility.v1;

public class SingeleResponsibility {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run("汽车");
        v.run("飞机");
    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上奔跑");
    }
}
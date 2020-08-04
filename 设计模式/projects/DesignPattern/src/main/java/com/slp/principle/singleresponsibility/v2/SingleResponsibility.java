package com.slp.principle.singleresponsibility.v2;

public class SingleResponsibility {
    public static void main(String[] args) {
        RodeVehicle rodeVehicle = new RodeVehicle();
        rodeVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("船");
    }
}

/**
 * 1.遵循单一原则
 * 2.但是这样改动很大，将类分解，并且需要修改客户端
 * 3。改进 直接修改Vehicle类
 */
class RodeVehicle{
    public void run(String name){
        System.out.println(name+"在公路上运行");
    }
}

class AirVehicle{
    public void run(String name){
        System.out.println(name+"在天上飞行");
    }
}
class WaterVehicle{
    public void run(String name){
        System.out.println(name+"在水中运行");
    }
}


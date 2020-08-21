package com.slp.pattern.facade;

/**
 * @ClassName Projector
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/21 8:23
 * @Version 1.0
 **/
public class Projector {
    private static  Projector projector = new Projector();
    public static Projector getInstance(){
        return projector;
    }

    public void on(){
        System.out.println("投影仪打开");
    }
    public void off(){
        System.out.println("投影仪关闭");
    }

    public void focus(){
        System.out.println("投影仪聚焦");
    }
}

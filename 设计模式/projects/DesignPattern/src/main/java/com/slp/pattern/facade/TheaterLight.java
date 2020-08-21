package com.slp.pattern.facade;

/**
 * @ClassName TheaterLight
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/21 8:27
 * @Version 1.0
 **/
public class TheaterLight {

    private static TheaterLight theaterLight = new TheaterLight();

    public static TheaterLight getInstance(){
        return theaterLight;
    }

    public void on(){
        System.out.println("灯光打开");
    }

    public void off(){
        System.out.println("灯光关闭");
    }

    public void dim(){
        System.out.println("灯光调暗");
    }

    public void bright(){
        System.out.println("灯光调亮");
    }
}

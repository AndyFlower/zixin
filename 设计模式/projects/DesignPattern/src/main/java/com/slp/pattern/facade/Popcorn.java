package com.slp.pattern.facade;

/**
 * @ClassName Popcorn
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/21 8:21
 * @Version 1.0
 **/
public class Popcorn {
    private static Popcorn popcorn= new Popcorn();

    public static Popcorn getInstance(){
        return popcorn;
    }

    public void on(){
        System.out.println("爆米花打开");
    }
    public void off(){
        System.out.println("爆米花关闭");
    }
    public void pop(){
        System.out.println("取爆米花");
    }
}

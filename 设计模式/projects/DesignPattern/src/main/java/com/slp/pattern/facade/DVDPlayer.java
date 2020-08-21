package com.slp.pattern.facade;

/**
 * @ClassName DVDPlayer
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/21 8:18
 * @Version 1.0
 **/
public class DVDPlayer {
    //使用单例模式
    private static DVDPlayer instance = new DVDPlayer();
    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD打开了");
    }

    public void off(){
        System.out.println("DVD关闭");
    }

    public void play(){
        System.out.println("dvd播放中");
    }

    public  void pause(){
        System.out.println("dvdpause");
    }
}

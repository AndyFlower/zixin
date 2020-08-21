package com.slp.pattern.facade;

/**
 * @ClassName Stereo
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/21 8:26
 * @Version 1.0
 **/
public class Stereo {
    private static Stereo stereo = new Stereo();

    public static Stereo  getInstance(){
        return stereo;
    }

    public void on(){
    System.out.println("立体声打开");
    }
    public void off(){
        System.out.println("立体声关闭");
    }
    public void up(){
        System.out.println("立体声加大");
    }
}

package com.slp.pattern.command;

/**
 * @ClassName LightReceiver
 * @Description 命令接收者
 * @Author sanglp
 * @Date 2020/8/27 9:02
 * @Version 1.0
 **/
public class LightReceiver {

    public void on(){
        System.out.println("电灯打开了");
    }

    public void  off(){
        System.out.println("电灯关闭了");
    }

}

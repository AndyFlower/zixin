package com.slp.pattern.command;

/**
 * @ClassName Client
 * @Description  客户端
 * @Author sanglp
 * @Date 2020/8/27 9:20
 * @Version 1.0
 **/
public class Client {

    /**
     * 使用命令模式完成对电灯的操作
     * @param args
     */
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关操作
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //使用遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置相关命令
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println("按下开的按钮");
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

    }
}

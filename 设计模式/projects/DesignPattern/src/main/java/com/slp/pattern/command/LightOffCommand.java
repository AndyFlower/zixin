package com.slp.pattern.command;

/**
 * @ClassName LightOffCommand
 * @Description 电灯关闭命令
 * @Author sanglp
 * @Date 2020/8/27 9:05
 * @Version 1.0
 **/
public class LightOffCommand  implements Command {
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}

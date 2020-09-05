package com.slp.pattern.command;

/**
 * @ClassName LightOnCommand
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/27 9:01
 * @Version 1.0
 **/
public class LightOnCommand  implements Command {
    LightReceiver light;
    @Override
    public void execute() {
    //调用接受者的方法
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    //构造器
    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }
}

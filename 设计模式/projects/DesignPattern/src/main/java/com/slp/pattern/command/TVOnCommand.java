package com.slp.pattern.command;

/**
 * @ClassName TVOnCommand
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/27 9:28
 * @Version 1.0
 **/
public class TVOnCommand implements Command{
    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}

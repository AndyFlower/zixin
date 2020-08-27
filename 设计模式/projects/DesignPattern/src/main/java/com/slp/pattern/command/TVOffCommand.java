package com.slp.pattern.command;

/**
 * @ClassName TVOffCommand
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/27 9:29
 * @Version 1.0
 **/
public class TVOffCommand implements Command {
    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}

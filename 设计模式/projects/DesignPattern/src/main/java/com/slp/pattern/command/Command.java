package com.slp.pattern.command;

/**
 * @ClassName Command
 * @Description 创建命令接口
 * @Author sanglp
 * @Date 2020/8/27 8:58
 * @Version 1.0
 **/
public interface Command {
    //执行某个动作
    public void execute();
    //撤销某个动作
    public void undo();
}

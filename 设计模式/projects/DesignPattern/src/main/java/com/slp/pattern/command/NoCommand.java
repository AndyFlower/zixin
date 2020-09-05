package com.slp.pattern.command;

/**
 * @ClassName NoCommand
 * @Description 空命令  没有人格命令，即空操作 调用空命令时 对象什么都不做
 * 其实，这也是一种设计模式 可以省掉对空的判断
 * @Author sanglp
 * @Date 2020/8/27 9:06
 * @Version 1.0
 **/
public class NoCommand  implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}

package com.slp.pattern.visitor;

/**
 * @ClassName Woman
 * @Description  1.这里我们使用到了一个双分派，即首先在客户端程序中将具体的状态作为参数
 * 传递到Woman中
 *                 2.然后woman这个类调用作为参数的“具体方法”中的方法getWomanResult()同时将自己作为参数传入，完成了第二次的分派
 * @Author sanglp
 * @Date 2020/8/31 8:23
 * @Version 1.0
 **/
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}

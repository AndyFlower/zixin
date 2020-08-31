package com.slp.pattern.visitor;

/**
 * @ClassName Man
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/31 8:22
 * @Version 1.0
 **/
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}

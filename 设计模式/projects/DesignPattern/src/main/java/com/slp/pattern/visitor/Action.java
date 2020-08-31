package com.slp.pattern.visitor;

/**
 * @ClassName Action
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/31 8:20
 * @Version 1.0
 **/
public abstract class Action {
    public abstract void getManResult(Man man);
    public abstract void getWomenResult(Woman woman);
}

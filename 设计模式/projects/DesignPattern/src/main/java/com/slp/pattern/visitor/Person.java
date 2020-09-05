package com.slp.pattern.visitor;

/**
 * @ClassName Person
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/31 8:23
 * @Version 1.0
 **/
public abstract class Person  {
    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}

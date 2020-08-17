package com.slp.pattern.factory.v3;

/**
 * @ClassName BJCheesePizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 16:39
 * @Version 1.0
 **/
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备BJCheesePizza");
    }
}

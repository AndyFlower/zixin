package com.slp.pattern.factory.v4;



/**
 * @ClassName BJPepperPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 16:40
 * @Version 1.0
 **/
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备BJPepperPizza");
    }
}

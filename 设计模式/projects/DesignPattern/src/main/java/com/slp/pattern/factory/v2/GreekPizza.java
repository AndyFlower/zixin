package com.slp.pattern.factory.v2;

/**
 * @ClassName GreekPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 13:02
 * @Version 1.0
 **/
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare GreekPizza");
    }

}

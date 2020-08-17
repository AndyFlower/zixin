package com.slp.pattern.factory.v2;

/**
 * @ClassName CheessPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 13:01
 * @Version 1.0
 **/
public class CheessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare CheessPizza");
    }


}

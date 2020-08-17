package com.slp.pattern.factory.v3;

/**
 * @ClassName CheessPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 13:01
 * @Version 1.0
 **/
public class LDCheessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare CheessPizza");
    }


}

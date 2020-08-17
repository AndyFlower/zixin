package com.slp.pattern.factory.v3;

/**
 * @ClassName ChinaPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 13:02
 * @Version 1.0
 **/
public class ChinaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare ChinaPizza");
    }


}

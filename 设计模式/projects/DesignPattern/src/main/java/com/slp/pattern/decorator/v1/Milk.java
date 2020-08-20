package com.slp.pattern.decorator.v1;

/**
 * @ClassName Milk
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/20 8:46
 * @Version 1.0
 **/
public class Milk extends Decorator {
    /**
     * 构造器
     *
     * @param obj
     */
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(1.5f);
    }
}

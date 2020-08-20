package com.slp.pattern.decorator.v1;

/**
 * @ClassName Soy
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/20 8:47
 * @Version 1.0
 **/
public class Soy extends Decorator{
    /**
     * 构造器
     *
     * @param obj
     */
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.0f);
    }
}

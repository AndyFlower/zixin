package com.slp.pattern.decorator.v1;

/**
 * @ClassName Chocolate
 * @Description 具体装饰类  继承自抽象装饰类
 * @Author sanglp
 * @Date 2020/8/20 8:45
 * @Version 1.0
 **/
public class Chocolate extends Decorator{
    /**
     * 构造器
     *
     * @param obj
     */
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(2f);
    }
}

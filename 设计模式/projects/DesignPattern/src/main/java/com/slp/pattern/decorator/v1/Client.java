package com.slp.pattern.decorator.v1;

import java.io.FilterInputStream;

/**
 * @ClassName Client
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/20 8:48
 * @Version 1.0
 **/
public class Client {
    //装饰者模式下单：2分巧克力+1分牛奶的LonBlank
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("费用1："+order.cost());
        System.out.println("描述1："+order.getDes());
        order = new Milk(order);
        System.out.println("费用2："+order.cost());
        System.out.println("描述2："+order.getDes());
        order = new Chocolate(order);
        System.out.println("费用3："+order.cost());
        System.out.println("描述3："+order.getDes());
        order = new Chocolate(order);
        System.out.println("费用4："+order.cost());
        System.out.println("描述4："+order.getDes());
    }

    public void test(){
        //FilterInputStream
    }
}

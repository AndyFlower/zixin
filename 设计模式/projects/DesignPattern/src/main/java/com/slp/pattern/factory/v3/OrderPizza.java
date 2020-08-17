package com.slp.pattern.factory.v3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 16:34
 * @Version 1.0
 **/
public abstract class OrderPizza {
    /**
     * 定义一个抽象方法，让各个工厂类去实现
     * @param orderType
     * @return
     */
    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订购pizza的类型
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    protected  String getType(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String orderType = null;
        try {
            orderType = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orderType;
    }
}

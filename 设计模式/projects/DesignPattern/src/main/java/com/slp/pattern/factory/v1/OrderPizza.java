package com.slp.pattern.factory.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @ClassName OrderPizza
 * @Description 传统方式
 * @Author sanglp
 * @Date 2020/8/17 12:58
 * @Version 1.0
 **/
public class OrderPizza {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
    }
    public OrderPizza(){
        Pizza pizza = null;
        String orderType ;//订购的类型
        do{
            orderType=getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("china")){
                pizza = new ChinaPizza();
                pizza.setName("中国披萨");
            }else {

                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }while (true);
    }

    /**
     * pizza种类从控制台输入
     * @return
     */
    private String getType() {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = s.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

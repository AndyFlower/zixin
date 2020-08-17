package com.slp.pattern.factory.v4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }
    AbsFactory factory;
    private void setFactory(AbsFactory absFactory){
        Pizza pizza = null;

        factory = absFactory;
        do{
            String orderType = getType();
            //factory可能是北京工厂子类 也可能是伦敦工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza!=null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                break;
            }
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

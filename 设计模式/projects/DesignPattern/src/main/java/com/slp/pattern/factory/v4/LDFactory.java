package com.slp.pattern.factory.v4;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheessPizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDGreekPizza();
        }else {
            System.out.println("输入有误");
        }
        return pizza;
    }
}

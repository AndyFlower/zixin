package com.slp.pattern.factory.v4;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("输入为："+orderType);
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }else {
            System.out.println("输入有误");
        }
        return pizza;
    }
}

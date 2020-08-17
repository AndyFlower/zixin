package com.slp.pattern.factory.v3;

/**
 * @ClassName BJOrderPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 16:38
 * @Version 1.0
 **/
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
            pizza.setName("bjcheese");
        }else  if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("bjpepper");
        }
        return  pizza;
    }
}

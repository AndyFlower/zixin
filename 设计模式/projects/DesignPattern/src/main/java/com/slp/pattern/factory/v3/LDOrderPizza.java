package com.slp.pattern.factory.v3;

/**
 * @ClassName LDOrderPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 16:42
 * @Version 1.0
 **/
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("perper")){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}

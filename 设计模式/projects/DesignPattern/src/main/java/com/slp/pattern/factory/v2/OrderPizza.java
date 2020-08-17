package com.slp.pattern.factory.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 14:01
 * @Version 1.0
 **/
public class OrderPizza {
    //定义一个简单工厂
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    //构造器
    public  OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;//设置简单工厂对象
        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if(pizza!=null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
            }
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

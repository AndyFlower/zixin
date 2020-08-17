package com.slp.pattern.factory.v2;



/**
 * @ClassName SimpleFactory
 * @Description 简单工厂模式
 * @Author sanglp
 * @Date 2020/8/17 13:56
 * @Version 1.0
 **/
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("china")){
            pizza = new ChinaPizza();
            pizza.setName("中国披萨");
        }else {

            System.out.println("输入有误");
        }
       return pizza;

    }

    /**
     * 简单工厂模式，也叫静态工厂模式
     * @param orderType
     * @return
     */
    public static Pizza createPizzav2(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式2");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("china")){
            pizza = new ChinaPizza();
            pizza.setName("中国披萨");
        }else {

            System.out.println("输入有误");
        }
        return pizza;
    }
}

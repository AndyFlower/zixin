package com.slp.pattern.factory.v3;

/**
 * @ClassName Test
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 16:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        BJOrderPizza bjOrderPizza = new BJOrderPizza();
        bjOrderPizza.createPizza("cheese");
    }
}

package com.slp.pattern.template;

import com.slp.pattern.decorator.v1.Soy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/26 8:25
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();
        System.out.println("制作华生豆浆");
        SoyaMilk peanut = new PeanutSoyalMilk();
        peanut.make();
        System.out.println("制作纯豆浆");
        SoyaMilk pureMilk = new PureSoyalMilk();
        pureMilk.make();

       // ConfigurableApplicationContext
    }
}

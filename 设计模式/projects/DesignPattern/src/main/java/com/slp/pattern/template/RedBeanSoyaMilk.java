package com.slp.pattern.template;

/**
 * @ClassName RedBeanSoyaMilk
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/26 8:23
 * @Version 1.0
 **/
public class RedBeanSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("加入上好的红豆");
    }
}

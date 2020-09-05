package com.slp.pattern.template;

/**
 * @ClassName PureSoyalMilk
 * @Description 钩子方法
 * @Author sanglp
 * @Date 2020/8/26 8:30
 * @Version 1.0
 **/
public class PureSoyalMilk extends SoyaMilk {

    @Override
    void addCondiments() {

    }

    @Override
    boolean customWantCondiments() {
        return false;
    }
}

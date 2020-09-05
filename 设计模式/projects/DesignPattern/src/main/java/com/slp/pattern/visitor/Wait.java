package com.slp.pattern.visitor;

/**
 * @ClassName Wait
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/31 8:42
 * @Version 1.0
 **/
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男生给的评价是待定");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println("女生给的评价是待定");
    }
}

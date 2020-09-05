package com.slp.pattern.visitor;

/**
 * @ClassName Fail
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/31 8:25
 * @Version 1.0
 **/
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男生给出的评价是失败");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println("女生给出的评价是失败");
    }
}

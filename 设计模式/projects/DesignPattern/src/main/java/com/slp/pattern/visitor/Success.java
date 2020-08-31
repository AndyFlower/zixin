package com.slp.pattern.visitor;

/**
 * @ClassName Success
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/31 8:24
 * @Version 1.0
 **/
public class Success extends  Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男生的评价是成功");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println("女生给的评价是很成功");
    }
}

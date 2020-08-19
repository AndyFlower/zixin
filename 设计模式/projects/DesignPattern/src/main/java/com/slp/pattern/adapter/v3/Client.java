package com.slp.pattern.adapter.v3;

/**
 * @ClassName Client
 * @Description 接口适配器
 * @Author sanglp
 * @Date 2020/8/19 8:24
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
          //如果只使用其中的某个方法，那么重写这个方法即可

            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        absAdapter.m1();
    }
}

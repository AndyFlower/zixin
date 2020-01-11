package com.zixin.classloader;

/**
 * @ClassName Test8
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/11 17:39
 * @Version 1.0
 **/
public class Test8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

class FinalTest{
    //final修饰 不会打印静态代码块   如果去掉final则会打印
    public static final int x=3;
    static {
        System.out.println("FinalTest static block");
    }
}

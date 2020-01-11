package com.zixin.classloader;

/**
 * @ClassName Test11
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/11 17:56
 * @Version 1.0
 **/
public class Test11 {
    /**
     *
     * @param
     * @desc 子类调用父类的方法或代码块其实是主动使用父类，看所属不看调用方
     *
     * parent 11 static block
     * 3
     * do something
     */
    public static void main(String[] args) {
        System.out.println(Child11.a);//这里其实是对parent的主动使用
        Child11.doSomething();
    }
}

class Parent11{
    static int a=3;
    static {
        System.out.println("parent 11 static block");
    }

    static void doSomething(){
        System.out.println("do something");
    }
}

class Child11 extends Parent11{
    static {
        System.out.println("Child11 static block");
    }
}
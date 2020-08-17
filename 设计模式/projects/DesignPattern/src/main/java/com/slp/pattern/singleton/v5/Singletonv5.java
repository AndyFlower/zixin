package com.slp.pattern.singleton.v5;

/**
 * @ClassName Singletonv5
 * @Description 懒汉式 线程安全。同步代码块
 * @Author sanglp
 * @Date 2020/8/17 9:15
 * @Version 1.0
 **/
public class Singletonv5 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}

class Singleton{
    private static Singleton singleton;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(singleton == null ){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}

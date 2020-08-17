package com.slp.pattern.singleton.v3;

/**
 * @ClassName Singletonv3
 * @Description 懒汉式，线程不安全
 * @Author sanglp
 * @Date 2020/8/17 8:59
 * @Version 1.0
 **/
public class Singletonv3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;
    //构造器私有化
    private Singleton(){}
    //提供静态的私有方法，当使用到该方法时才去创建instance 即懒汉式
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
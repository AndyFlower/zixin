package com.slp.pattern.singleton.v7;

/**
 * @ClassName Singletonv7
 * @Description 静态内部类
 * @Author sanglp
 * @Date 2020/8/17 10:18
 * @Version 1.0
 **/
public class Singletonv7 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}

/**
 * 静态内部类完成，推荐使用
 */
class Singleton{
    private static  volatile Singleton instance;
    //构造器私有化
    private Singleton(){

    }

    /**
     * 写一个内部静态类，该类中有一个静态属性，Singleton
     */
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE;
     * @return
     */
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
package com.slp.pattern.singleton.v6;

/**
 * @ClassName Singletonv6
 * @Description 双重检查
 * @Author sanglp
 * @Date 2020/8/17 9:20
 * @Version 1.0
 **/
public class Singletonv6 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
//懒汉式（线程安全，同步方法）
class Singleton{
    private static  Singleton singleton;
    //构造方法私有化
    private Singleton(){

    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决线程安全问题，保证了效率 推荐使用
     * @return
     */
    public static synchronized Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
    return singleton;
    }
}

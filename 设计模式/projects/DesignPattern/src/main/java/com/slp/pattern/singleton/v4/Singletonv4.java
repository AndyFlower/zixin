package com.slp.pattern.singleton.v4;

/**
 * @ClassName Singletonv4
 * @Description 懒汉式，线程安全，使用同步方法
 * @Author sanglp
 * @Date 2020/8/17 9:08
 * @Version 1.0
 **/
public class Singletonv4 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 懒汉式（线程安全，同步方法）
 */
class Singleton{
    private static Singleton instance;
    //构造器私有化
    private Singleton(){}
    //提供静态的私有方法，加入同步代码块的处理，解决线程安全问题
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

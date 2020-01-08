package com.zixin;

/**
 * @ClassName SingletonVolatileDemo
 * @Description volatile禁止重排的单例模式
 * Author zishen
 * @Date 2019/12/24 21:57
 * @Version 1.0
 **/
public class SingletonVolatileDemo {

    //在这加volatile禁止指令重排
    private static volatile SingletonVolatileDemo instance= null;

    private SingletonVolatileDemo(){
        System.out.println(Thread.currentThread().getName()+"\t 我是构造方法");
    }

    //原始模式
    public synchronized  static SingletonVolatileDemo getInstance(){
        if(instance == null){
            instance = new SingletonVolatileDemo();
        }
        return instance;
    }

    //DCL Double Check Lock 双端检测机制
    public  static SingletonVolatileDemo getDCLVolatileInstance(){
        if(instance == null){
            //同步代码块
            synchronized (SingletonVolatileDemo.class) {
                if (instance == null) {
                    instance = new SingletonVolatileDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

        //System.out.println(SingletonDemo.getInstance()==SingletonDemo.getInstance());
        ///System.out.println(SingletonDemo.getInstance()==SingletonDemo.getInstance());
        // System.out.println(SingletonDemo.getInstance()==SingletonDemo.getInstance());

        for(int i=0;i<10;i++){
            new Thread(()->{

                SingletonVolatileDemo.getDCLVolatileInstance();
            },String.valueOf(i)).start();
        }
    }
}

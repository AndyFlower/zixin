package com.zixin;

/**
 * @ClassName SingletonDemo
 * @Description单例模式
 * Author zishen
 * @Date 2019/12/24 21:34
 * @Version 1.0
 **/
public class SingletonDemo {

    private static SingletonDemo instance= null;

    private SingletonDemo(){
        System.out.println(Thread.currentThread().getName()+"\t 我是构造方法");
    }

    //原始模式
    public synchronized  static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }

    //DCL Double Check Lock 双端检测机制
    public  static SingletonDemo getDCLInstance(){
        if(instance == null){
            //同步代码块
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
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
                //SingletonDemo.getInstance();
                SingletonDemo.getDCLInstance();
            },String.valueOf(i)).start();
        }
    }
}

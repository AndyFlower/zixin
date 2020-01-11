package com.zixin.classloader;

/**
 * @ClassName Test6
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/11 14:58
 * @Version 1.0
 **/
public class Test6 {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        //1、counter1:1  counter2:1
        //2、counter1:1  counter2:0
        System.out.println("counter1:"+Singleton.counter1);
        System.out.println("counter2:"+Singleton.counter2);
    }
}

class Singleton{

    public static int counter1;
    //1
    //public static int counter2=0;
    private static Singleton singleton = new Singleton();
    private Singleton(){
        counter1++;
        counter2++;//准备阶段的重要意义
        System.out.println(counter1);
        System.out.println(counter2);
    }
    //2
    public static int counter2=0;
    public static Singleton getInstance(){
        return singleton;
    }

}
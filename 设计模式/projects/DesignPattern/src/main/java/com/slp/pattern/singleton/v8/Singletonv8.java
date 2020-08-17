package com.slp.pattern.singleton.v8;

/**
 * @ClassName Singletonv8
 * @Description 枚举类实现单例
 * @Author sanglp
 * @Date 2020/8/17 10:27
 * @Version 1.0
 **/
public class Singletonv8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.sayOK();
    }
}
//使用枚举 可以使用单例  推荐
enum Singleton{
    INSTANCE;//属性
    public void sayOK(){
        System.out.println("ok");
    }
}
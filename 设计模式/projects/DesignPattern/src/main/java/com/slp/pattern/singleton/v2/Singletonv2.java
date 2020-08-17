package com.slp.pattern.singleton.v2;

/**
 * @ClassName Singletonv2
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/17 8:52
 * @Version 1.0
 **/
public class Singletonv2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());

    }
}
class Singleton{
    //1.构造方法私有化，外部不能new
    private Singleton(){

    }

    //2.本类内部创建对象实例
    private  static Singleton instance ;
    static{
        instance = new Singleton();
    }
    //3、对外提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
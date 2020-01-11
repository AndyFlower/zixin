package com.zixin.classloader;

import java.util.Random;

/**
 * @ClassName Test5
 * @Description 当一个接口在初始化时，并不要求其父接口都完成了初始化
 *              只有在真正使用到父接口的时候（如引用接口中定义的常量时），才会初始化
 *              注意与类的区别
 * @Author zixin
 * @Date 2020/1/11 14:38
 * @Version 1.0
 **/
public class Test5 {

    public static void main(String[] args) {
        //6
        //System.out.println(Child.b);
        System.out.println(Parent5_1.thread);

    }

}
interface  GrandPa{
    public static Thread thread=new Thread(){
        {//实例化代码块
            System.out.println("GrandParent5 invoked");
        }
    };
}

interface Parent5 extends GrandPa{
   public static Thread thread=new Thread(){
       {//实例化代码块
           System.out.println("Parent5 invoked");
       }
   };
}
class Child  implements Parent5{
    public static int b=6;
    //public static final int b= new Random().nextInt(2);
}

interface GrandPa_1{
    public static Thread thread=new Thread(){
        {//实例化代码块
            System.out.println("GrandPa_1 invoked");
        }
    };
}

interface Parent5_1{
    public static Thread thread=new Thread(){
        {//实例化代码块
            System.out.println("Parent5_1 invoked");
        }
    };
}
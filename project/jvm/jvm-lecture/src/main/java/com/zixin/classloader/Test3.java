package com.zixin.classloader;

import java.util.UUID;

/**
 * 当一个常量的值并非编译器间可以确定的，那么其值就不会被放到调用类的常量池中，
 * 这是在程序运行时，会导致主动使用这个常量所在的类，显然会导致这个类被初始化
 */
public class Test3 {
    public static void main(String[] args) {
        /**
         * Parent3 static code
         * 41724e87-f67c-4e0d-8604-ccbf7d57cb56
         */
        System.out.println(Parent3.s);
    }
}

class Parent3{
    public static  final String s=UUID.randomUUID().toString();
    static {
        System.out.println("Parent3 static code");
    }

}
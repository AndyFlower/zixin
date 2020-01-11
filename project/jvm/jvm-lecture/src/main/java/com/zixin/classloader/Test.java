package com.zixin.classloader;

/**
 * 对于静态字段来说，只有直接定义了该字段的类才会被加载。
 * 当一个类在初始化时，要求其父类全部都已经初始化完毕。
 * -XX:+TraceClassLoading：用于追踪类的加载信息并打印出来
 *
 * -XX:+<option>:表示开启option选项
 * -XX:-<option>:表示关闭option选项
 * -XX：<option>=<value>:表示将option选项的值设置为value
 */
public class Test {
    public static void main(String[] args) {
        /**
         * Parent static block
         * Hello world
         */
        System.out.println(Son.str);
        /**
         * Parent static block
         * son static block
         * Welcome
         *
         * 子类初始化的时候要保证父类也都初始化完成
         */
        System.out.println(Son.str2);
    }
}

class Parent{
    public static String str="Hello world";
    static {
        System.out.println("Parent static block");
    }
}

class Son extends Parent{
    public static String str2="Welcome";
    static{
        System.out.println("son static block");
    }

}

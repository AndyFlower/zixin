package com.zixin.classloader;

/**
 * @ClassName Test12
 * @Description 调用classloader类的loadclass方法加载一个类，并不是对类的主动使用，不会导致类的初始化
 * @Author zixin
 * @Date 2020/1/11 18:02
 * @Version 1.0
 **/
public class Test12 {
    /**
     * class com.zixin.classloader.CL
     * --
     * Class CL
     * class com.zixin.classloader.CL
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        Class<?> clazz =classLoader.loadClass("com.zixin.classloader.CL");
        System.out.println(clazz);
        System.out.println("--");
        clazz=Class.forName("com.zixin.classloader.CL");
        System.out.println(clazz);
    }
}

class CL{
    static {
        System.out.println("Class CL");

    }
}
package com.zixin.classloader;

/**
 * @ClassName Test18
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/12 13:18
 * @Version 1.0
 **/
public class Test18 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}

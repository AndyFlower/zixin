package com.zixin.classloader;

/**
 * @ClassName Test17_1
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/12 12:42
 * @Version 1.0
 **/
public class Test17_1 {
    public static void main(String[] args) throws Exception {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("C:/Users/sangliping/Desktop/target/classes/");
        Class<?> clazz = loader1.loadClass("com.zixin.classloader.MySample");
        System.out.println("clazz:"+clazz.hashCode());
        Object object=clazz.newInstance();
    }
}

package com.zixin.classloader;

/**
 * @ClassName Test7
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/11 17:33
 * @Version 1.0
 **/
public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classa = Class.forName("java.lang.String");
        //null
        System.out.println(classa.getClassLoader());

        Class<?> classb = Class.forName("com.zixin.classloader.C");
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(classb.getClassLoader());
    }
}

class C{

}
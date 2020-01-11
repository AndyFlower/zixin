package com.zixin.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @ClassName Test14
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/11 18:17
 * @Version 1.0
 **/
public class Test14 {
    public static void main(String[] args) throws IOException {
        //Returns the context ClassLoader for this Thread. The context ClassLoader is provided by the creator of the thread for use
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        String resourceName="com/zixin/classloader/Test13.class";
        Enumeration<URL> urls=classLoader.getResources(resourceName);
        while(urls.hasMoreElements()){
            URL url = urls.nextElement();
            //file:/D:/slpworkspace/github/2020/project/jvm/jvm-lecture/target/classes/com/zixin/classloader/Test13.class
            System.out.println(url);
        }

        System.out.println("--------");
        Class<?> clazz = Test14.class;
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(clazz.getClassLoader());

    }
}

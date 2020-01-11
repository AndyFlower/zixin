package com.zixin.classloader;

/**
 * @ClassName Test13
 * @Description 类加载动作
 * @Author zixin
 * @Date 2020/1/11 18:09
 * @Version 1.0
 **/
public class Test13 {

    /**
     * @param args
     * sun.misc.Launcher$AppClassLoader@18b4aac2
     * sun.misc.Launcher$ExtClassLoader@1540e19d
     * null
     */
    public static void main(String[] args) {
        //Returns the system class loader for delegation.  This is the default delegation parent for new <tt>ClassLoader</tt> instances, and is typically the class loader used to start the application.
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        while (null != classLoader){
            classLoader=classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}

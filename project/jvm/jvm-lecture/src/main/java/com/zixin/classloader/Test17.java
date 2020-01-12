package com.zixin.classloader;

/**
 * @ClassName Test17
 * @Description 复杂类加载
 * @Author zixin
 * @Date 2020/1/12 12:28
 * @Version 1.0
 **/
public class Test17 {
    /**
     * clazz:1735600054
     * MySample:sun.misc.Launcher$AppClassLoader@18b4aac2
     * MyCat is loading by:sun.misc.Launcher$AppClassLoader@18b4aac2
     * @param args
     * @throws Exception
     * 位于classpath下 由系统类加载器加载
     */
    public static void main1(String[] args) throws Exception {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        Class<?> clazz = loader1.loadClass("com.zixin.classloader.MySample");
        System.out.println("clazz:"+clazz.hashCode());
        Object object=clazz.newInstance();
    }

    /**
     * clazz:1735600054
     * @param args
     * @throws Exception
     * 不会实例化MySample对象，即MySample构造方法不会被调用，因此不会实例化MyCat对象，即没有对MyCat进行主动使用，
     * 也就不会加载MyCat class
     */
    public static void main(String[] args) throws Exception {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        Class<?> clazz = loader1.loadClass("com.zixin.classloader.MySample");
        System.out.println("clazz:"+clazz.hashCode());

    }

}

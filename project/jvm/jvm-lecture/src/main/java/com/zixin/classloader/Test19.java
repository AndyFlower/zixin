package com.zixin.classloader;

import sun.misc.Launcher;

/**
 * @ClassName Test19
 * @Description 在运行期，一个java类是由该类的完全限定名和用于加载各类的定义类加载器共同决定的
 *              如果同样名字的类由两个不同的加载器所加载，那么这些类就是不同的，即便.class的字节码完全一致也是如此
 *              在oracle的HotSpot实现中，系统属性sun.boot.class.path如果修改错误则运行会出错
 *              Error occurred during initialization of VM
 * @Author zixin
 * @Date 2020/1/12 14:17
 * @Version 1.0
 **/
public class Test19 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        /**
         * 内建与JVM中的启动类加载器会加载java.lang.ClassLoader以及其他的Java平台类，当JVM启动时
         * 一块特殊的机器码会运行，它会加载扩展类加载器和系统类加载器，这块特殊的机器码叫做启动类加载器（BootStrap）
         *
         * 启动类加载器并不是java类，而其他的加载器则都是java类
         * 启动类加载器是特定于平台的机器指令，它负责开启整个加载过程
         *
         * 所有类加载器（除了启动类加载器）都被实现为java类，不过，总归要有一个组件来加载第一个java类加载器，
         * 从而让整个加载过程能进行下去，加载第一个存java类加载的启动类加载器的职责
         *
         * 启动类加载器还会负责加载供JRE正常运行所需要的基本组件，包括java.util和java.lang包中的类
         */

        //null
        System.out.println(ClassLoader.class.getClassLoader());
        //扩展类和系统类加载器也是由启动类加载器所负责加载的
        System.out.println(Launcher.class.getClassLoader());

        System.out.println("----------");

        System.out.println(System.getProperty("java.system.class.loader"));
    }
}

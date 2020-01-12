package com.zixin.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @ClassName Test22
 * @Description 线程上下文类加载器的一般使用模式（获取  使用  还原）
 * ClassLoader classLoader = Thread.currentThread.getContextClassLoader()
 *   try{
 *       Thread.currentThread.setContextClassLoader(targetTool)
 *       xxx()
 *   }finally{
 *       Thread.currentThread.setContextClassLoader(classLoader)
 *   }
 *   如果一个类由类加载器A加载，那么这个类的依赖类也是由相同的类加载器加载的
 *   ContextClassLoader的作用就是为了破坏java的类加载委托机制
 *   当高层提供了统一的接口让底层区实行，同事又要在高层加载底层的类时，就必须要通过线程上下文类加载器来帮助高层的ClassLoader找到并加载该类。
 *
 * @Author zixin
 * @Date 2020/1/12 15:59
 * @Version 1.0
 **/
public class Test22 {

    public static void main1(String[] args) {
        ServiceLoader<Driver> loader=ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            //class com.mysql.cj.jdbc.Driver,sun.misc.Launcher$AppClassLoader@18b4aac2
            System.out.println(driver.getClass()+","+driver.getClass().getClassLoader());

        }

        //当前线程上下文类加载器：sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println("当前线程上下文类加载器："+Thread.currentThread().getContextClassLoader());
        //ServiceLoader的类加载器：null
        System.out.println("ServiceLoader的类加载器："+ServiceLoader.class.getClassLoader());

    }

    public static void main(String[] args) {
        Thread.currentThread().setContextClassLoader(MyClassLoader.class.getClassLoader().getParent());
        ServiceLoader<Driver> loader=ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println(driver.getClass()+","+driver.getClass().getClassLoader());

        }

        //当前线程上下文类加载器：sun.misc.Launcher$ExtClassLoader@6d6f6e28
        System.out.println("当前线程上下文类加载器："+Thread.currentThread().getContextClassLoader());
        //ServiceLoader的类加载器：null
        System.out.println("ServiceLoader的类加载器："+ServiceLoader.class.getClassLoader());

    }
}

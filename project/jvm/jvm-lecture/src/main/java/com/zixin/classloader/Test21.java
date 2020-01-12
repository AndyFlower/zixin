package com.zixin.classloader;

/**
 * @ClassName Test21
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/12 15:52
 * @Version 1.0
 **/
public class Test21 implements Runnable {

    private Thread thread;

    public Test21() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {

        ClassLoader classLoader =this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);
        //class class sun.misc.Launcher$AppClassLoader
        System.out.println("class "+classLoader.getClass());
        //Parent class sun.misc.Launcher$ExtClassLoader
        System.out.println("Parent "+classLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new Test21();
    }
}

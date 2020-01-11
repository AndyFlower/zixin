package com.zixin.classloader;

import java.io.*;

/**
 * @ClassName MyClassLoader
 * @Description 自定义类加载器
 * @Author zixin
 * @Date 2020/1/11 19:00
 * @Version 1.0
 **/
public class MyClassLoader extends ClassLoader {
    private String classLoaderName ;
    private final String fileExtension=".class";
    public MyClassLoader(String classLoaderName){
        super();//将系统类加载器当做该类加载器的父加载器
        this.classLoaderName=classLoaderName;
    }

    public MyClassLoader(ClassLoader parent,String classLoaderName){
        super(parent);//显示指定改类加载器的父加载器
        this.classLoaderName=classLoaderName;
    }

    @Override
    public String toString() {
        return "MyClassLoader{" +
                "classLoaderName='" + classLoaderName + '\'' +
                '}';
    }

    private byte[] loadClassData(String name){

        InputStream is = null;
        byte[] data=null;
        ByteArrayOutputStream baos = null;
        try {

            this.classLoaderName=this.classLoaderName.replace(".","/");
            is = new FileInputStream(new File(name+this.fileExtension));
            int ch=0;
            while(-1!=(ch=is.read())){
                baos.write(ch);
            }
            data=baos.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        byte[] data = this.loadClassData(className);
        return this.defineClass(className,data,0,data.length);
    }

    public static void test(ClassLoader classLoader) throws Exception{
        Class<?> clazz = classLoader.loadClass("com.zixin.classloader.Test");
        Object object=clazz.newInstance();
        System.out.println(object);//com.zixin.classloader.Test@1540e19d


    }

    public static void main(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader("loader1");
        test(myClassLoader);
    }

}

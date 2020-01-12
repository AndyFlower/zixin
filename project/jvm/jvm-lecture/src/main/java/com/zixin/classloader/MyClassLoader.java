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
    private String path ;
    private final String fileExtension=".class";
    public MyClassLoader(String classLoaderName){
        super();//将系统类加载器当做该类加载器的父加载器
        this.classLoaderName=classLoaderName;
    }

    public MyClassLoader(ClassLoader parent,String classLoaderName){
        super(parent);//显示指定改类加载器的父加载器
        this.classLoaderName=classLoaderName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
        name=name.replace(".","/");
        try {

            this.classLoaderName=this.classLoaderName.replace(".","/");
            is = new FileInputStream(new File(this.path+name+this.fileExtension));
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
        System.out.println("fincclass :"+className);
        byte[] data = this.loadClassData(className);
        return this.defineClass(className,data,0,data.length);
    }

    public static void test(ClassLoader classLoader) throws Exception{
        Class<?> clazz = classLoader.loadClass("com.zixin.classloader.Test");
        Object object=clazz.newInstance();
        System.out.println(object);//com.zixin.classloader.Test@1540e19d
    }

    /**
     *
     * @param args
     * @throws Exception
     * 测试情况：1.使用classpath加载
     *         2、使用绝对非classpath加载
     *         3、定义2个加载器加载相同的类
     *         4、删除classpath中的class,再加载  会在各自的命名空间个加载一次  hashcode值不同
     */
    public static void main1(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader("loader1");
        //如果指定的是path下的文件，那么将由父加载器加载
        //myClassLoader.setPath("D:\\slpworkspace\\github\\2020\\project\\jvm\\jvm-lecture\\target\\classes");
        //父加载器找不到的话就会由自己定义的类加载器来加载
        myClassLoader.setPath("D:\\jvm\\jvm-lecture\\target\\classes");

        Class<?> clazz = myClassLoader.loadClass("com.zixin.classloader.Test");
        System.out.println(clazz.hashCode());
        Object object=clazz.newInstance();
        System.out.println(object);

        //如果前面已经加载了，就不会再次加载一次
        MyClassLoader myClassLoader2 = new MyClassLoader("loader2");
        myClassLoader2.setPath("D:\\jvm\\jvm-lecture\\target\\classes");
        Class<?> clazz2 = myClassLoader2.loadClass("com.zixin.classloader.Test");
        System.out.println(clazz.hashCode());
        Object object2=clazz.newInstance();
        System.out.println(object2);

    }

    /**
     *
     * @param args
     * @throws Exception
     * 指定了父加载器 父加载器已经加载 再次返回的是原先加载的 所以hashcode相同
     */
    public static void main(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader("loader1");
        //如果指定的是path下的文件，那么将由父加载器加载
        //myClassLoader.setPath("D:\\slpworkspace\\github\\2020\\project\\jvm\\jvm-lecture\\target\\classes");
        //父加载器找不到的话就会由自己定义的类加载器来加载
        myClassLoader.setPath("D:\\jvm\\jvm-lecture\\target\\classes");

        Class<?> clazz = myClassLoader.loadClass("com.zixin.classloader.Test");
        System.out.println(clazz.hashCode());
        Object object=clazz.newInstance();
        System.out.println(object);

        //如果前面已经加载了，就不会再次加载一次
        MyClassLoader myClassLoader2 = new MyClassLoader(myClassLoader,"loader2");
        myClassLoader2.setPath("D:\\jvm\\jvm-lecture\\target\\classes");
        Class<?> clazz2 = myClassLoader2.loadClass("com.zixin.classloader.Test");
        System.out.println(clazz.hashCode());
        Object object2=clazz.newInstance();
        System.out.println(object2);

    }

}

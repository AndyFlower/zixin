package com.slp.pattern.proxy.v2;

/**
 * @ClassName Client
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/24 8:57
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao teacherDao = new TeacherDao();
        //给目标对象，创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao  teacherProxy=(ITeacherDao)proxyFactory.getProxyInstance();
        System.out.println(teacherProxy.getClass());//class com.sun.proxy.$Proxy0  内存中生成了代理对象
        teacherProxy.teach();
    }
}

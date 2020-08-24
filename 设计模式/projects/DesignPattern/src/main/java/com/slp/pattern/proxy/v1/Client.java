package com.slp.pattern.proxy.v1;

/**
 * @ClassName Client
 * @Description 静态代理
 * @Author sanglp
 * @Date 2020/8/24 8:30
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象 调用被代理对象的方法
        teacherDaoProxy.teach();
    }
}

package com.slp.pattern.proxy.v3;

/**
 * @ClassName Client
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/25 8:52
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取到代理对象，并将目标对象传递给代理对象
      TeacherDao procyInstance =     (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();

      //执行代理对象的方法，触发interceptor方法，从而实现对目标对象的调用
        procyInstance.teach();
    }
}

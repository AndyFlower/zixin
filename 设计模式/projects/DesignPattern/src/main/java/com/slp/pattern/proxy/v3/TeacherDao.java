package com.slp.pattern.proxy.v3;

/**
 * @ClassName TeacherDao
 * @Description 被代理对象
 * @Author sanglp
 * @Date 2020/8/25 8:41
 * @Version 1.0
 **/
public class TeacherDao {
    public  void teach(){
        System.out.println("老师授课中 cglib  不需要实现接口");
    }
}

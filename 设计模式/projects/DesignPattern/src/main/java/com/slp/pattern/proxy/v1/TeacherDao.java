package com.slp.pattern.proxy.v1;

/**
 * @ClassName TeacherDao
 * @Description 目标对象
 * @Author sanglp
 * @Date 2020/8/24 8:24
 * @Version 1.0
 **/
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中");
    }
}

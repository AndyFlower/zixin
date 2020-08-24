package com.slp.pattern.proxy.v2;

/**
 * @ClassName TeacherDao
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/24 8:44
 * @Version 1.0
 **/
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中");
    }
}

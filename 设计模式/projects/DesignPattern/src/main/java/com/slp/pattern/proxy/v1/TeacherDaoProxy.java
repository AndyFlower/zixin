package com.slp.pattern.proxy.v1;

/**
 * @ClassName TeacherDaoProxy
 * @Description 代理对象 使用的是静态代理
 * @Author sanglp
 * @Date 2020/8/24 8:24
 * @Version 1.0
 **/
public class TeacherDaoProxy implements ITeacherDao {
    //目标对象  通过接口来聚合
    private ITeacherDao target;

    /**
     * 构造器
     * @param target
     */
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理对象开始");
        target.teach();
        System.out.println("代理对象结束");
    }
}

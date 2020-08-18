package com.slp.pattern.builder.v1;

/**
 * @ClassName AbstractHouse
 * @Description 传统模式解决盖房子的问题
 * @Author sanglp
 * @Date 2020/8/18 14:15
 * @Version 1.0
 **/
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    /**
     * 整合盖房子的三个步骤
     */
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}

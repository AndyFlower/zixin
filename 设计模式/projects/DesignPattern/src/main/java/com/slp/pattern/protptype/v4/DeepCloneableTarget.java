package com.slp.pattern.protptype.v4;

import java.io.Serializable;

/**
 * @ClassName DeepCloneableTarget
 * @Description 深拷贝
 * @Author sanglp
 * @Date 2020/8/18 8:33
 * @Version 1.0
 **/
public class DeepCloneableTarget implements Serializable,Cloneable {

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//默认的clone方法会克隆基本属性
    }
}

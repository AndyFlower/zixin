package com.slp.pattern.protptype.v4;

/**
 * @ClassName Client
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/18 8:43
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtptype deepProtptype = new DeepProtptype();
        deepProtptype.name="松江";
        deepProtptype.deepCloneableTarget = new DeepCloneableTarget("大学","小学");
        //方式1 完成深拷贝
        DeepProtptype p2 = (DeepProtptype) deepProtptype.clone();
        System.out.println(deepProtptype.hashCode() +"-"+p2.hashCode());
        //方式二 完成深拷贝
        DeepProtptype p3 = (DeepProtptype) deepProtptype.deepClone();
        System.out.println(deepProtptype.hashCode() +"-"+p3.hashCode());
    }
}

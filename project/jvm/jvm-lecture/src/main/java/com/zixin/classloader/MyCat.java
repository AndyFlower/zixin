package com.zixin.classloader;

/**
 * @ClassName MyCat
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/12 12:26
 * @Version 1.0
 **/
public class MyCat {
    public MyCat() {
        System.out.println("MyCat is loading by:"+this.getClass().getClassLoader());

    }
}

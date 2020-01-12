package com.zixin.classloader;

/**
 * @ClassName MySample
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/12 12:27
 * @Version 1.0
 **/
public class MySample {
    public MySample() {
        System.out.println("MySample is loading by:"+this.getClass().getClassLoader());
        new MyCat();
    }
}

package com.zixin.classloader;

/**
 * @ClassName Test15
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/11 18:48
 * @Version 1.0
 **/
public class Test15 {

    public static void main(String[] args) {
        String[] strings=new String[2];
        //null
        System.out.println(strings.getClass().getClassLoader());
    }
}

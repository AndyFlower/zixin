package com.zixin;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName CASDemo
 * @Description TODO
 * @Author zishen
 * @Date 2019/12/25 8:06
 * @Version 1.0
 * 1、什么是CAS
 *     比较并交换
 **/
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        //如果内存值和期望值相同则修改
        System.out.println(atomicInteger.compareAndSet(5,2019)+"\t current data is :"+atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5,1024)+"\t current data is :"+atomicInteger.get());

    }
}

package com.zixin;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchDemo
 * @Description CountDownLatch  做减法
 * @Author zishen
 * @Date 2019/12/30 13:17
 * @Version 1.0
 **/
public class CountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for(int i=1;i<=6;i++){

            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"国，被灭");
                countDownLatch.countDown();
            },CountryEnum.forEach(i).getRetMessage()).start();
        }
        try {
            //Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" 一统华夏");
    }

    public static void countDown(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for(int i=1;i<=6;i++){

            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"购物完成，离开商城");
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
        try {
            //Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" 商城关门");
    }

}

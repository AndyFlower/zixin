package com.zixin;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @ClassName ABADemo
 * @Description 时间戳的原子引用
 * @Author zishen
 * @Date 2019/12/25 19:50
 * @Version 1.0
 **/
public class ABADemo {

    static AtomicReference<Integer> atomicReference = new AtomicReference<>(10);

    static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(10,1);
    public static void main(String[] args) {
        System.out.println("以下是ABA问题的产生");
        new Thread(()->{
            atomicReference.compareAndSet(10,11);
            atomicReference.compareAndSet(11,10);
        },"t").start();
        new Thread(()->{
            try {
                //为了保证t现在完成了一次ABA操作
                TimeUnit.SECONDS.sleep(1);
                atomicReference.compareAndSet(10,12);
                System.out.println(atomicReference.get());


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1").start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("以下是ABA问题的解决办法");

        new Thread(()->{
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName()+"\t 第一次版本号"+atomicStampedReference.getStamp());
            try {
                TimeUnit.SECONDS.sleep(1);
                atomicStampedReference.compareAndSet(10,11,atomicStampedReference.getStamp(),atomicStampedReference.getStamp()+1);
                System.out.println(Thread.currentThread().getName()+"\t 第二次版本号"+atomicStampedReference.getStamp());
                atomicStampedReference.compareAndSet(11,10,atomicStampedReference.getStamp(),atomicStampedReference.getStamp()+1);
                System.out.println(Thread.currentThread().getName()+"\t 第三次版本号"+atomicStampedReference.getStamp());


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2").start();

        new Thread(()->{
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName()+"\t 第一次版本号"+stamp);
            try {
                //暂停t3保证t2完成一次ABA问题
                TimeUnit.SECONDS.sleep(3);
                boolean result = atomicStampedReference.compareAndSet(10,2019,stamp,stamp+1);
                System.out.println(Thread.currentThread().getName()+" 修改"+result);
                System.out.println(Thread.currentThread().getName()+" 当前最新版本号"+atomicStampedReference.getStamp());
                System.out.println(Thread.currentThread().getName()+" 当前最新值"+atomicStampedReference.getReference());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t3").start();
    }
}

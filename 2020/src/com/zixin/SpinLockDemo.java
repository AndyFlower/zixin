package com.zixin;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName SpinLockDemo
 * @Description 手写一个自旋锁
 * @Author zixin
 * @Date 2019/12/30 10:34
 * @Version 1.0
 **/
public class SpinLockDemo {
    //原子引用线程
    AtomicReference<Thread> atomicReference = new AtomicReference<Thread>();
    public void myLock(){
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName()+" come in");
        while(!atomicReference.compareAndSet(null,thread)){

        }
    }
    public void myUnLock(){
        Thread thread =Thread.currentThread();
        atomicReference.compareAndSet(thread,null);
        System.out.println(Thread.currentThread().getName()+" invoked myUnLock");
    }

    /**
     * AA come in
     * BB come in
     * AA invoked myUnLock
     * BB invoked myUnLock
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        SpinLockDemo spinLockDemo = new SpinLockDemo();
        new Thread(()->{
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
                spinLockDemo.myUnLock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AA").start();
        TimeUnit.SECONDS.sleep(1);
        new Thread(()->{
            spinLockDemo.myLock();
            spinLockDemo.myUnLock();
        },"BB").start();
    }
}

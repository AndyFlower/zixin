package com.zixin;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareResource{
    private int number =1;
    private Lock lock=new ReentrantLock();

    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();
    public void prints(){
        lock.lock();
        try {
            while (number !=1){
               c1.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            number =2;
            c2.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print10(){
        lock.lock();
        try {
            while (number !=2){
                c2.await();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            number =3;
            c3.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print15(){
        lock.lock();
        try {
            while (number !=3){
                c3.await();
            }
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            number =1;
            c1.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
/**
 * @ClassName SynchronizedAndReentrantLockDemo
 * @Description 多线程之间按顺序调用 实现A->B->C三个线程启动
 *               A打印5次 B打印10次 C打印15次
 * @Author zishen
 * @Date 2019/12/31 11:19
 * @Version 1.0
 **/
public class SynchronizedAndReentrantLockDemo {
    public static void main(String[] args) {
       ShareResource shareResource = new ShareResource();
       
       new Thread(()->{
           for (int i = 0; i <10 ; i++) {
               shareResource.prints();
           }
       },"A").start();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                shareResource.print10();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                shareResource.print15();
            }
        },"C").start();
    }
}

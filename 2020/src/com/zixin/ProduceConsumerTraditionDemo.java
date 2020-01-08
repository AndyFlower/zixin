package com.zixin;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 资源类
 */
class ShareData{
private int number = 0;
private Lock lock = new ReentrantLock();
private Condition condition = lock.newCondition();
public  void increment()throws Exception{
    lock.lock();
    try{
    //1、判断
    while(number !=0){
        //等待 不能生产
        condition.await();
    }
    //2、干活
    number++;
    System.out.println(Thread.currentThread().getName()+"  "+number);
    condition.signalAll();
    }catch (Exception e){
        e.printStackTrace();
    }finally {
        lock.unlock();
    }
}

    public  void decrement()throws Exception{
        lock.lock();
        try{
            //1、判断  要使用while 如果用if可能会产生虚假唤起
            while(number ==0){
                //等待 不能生产
                condition.await();
            }
            //2、干活
            number--;
            System.out.println(Thread.currentThread().getName()+"  "+number);
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
/**
 * @ClassName ProduceConsumerTraditionDemo
 * @Description 初始值为0的变量。两个线程对其交替操作，一个加1一个减1 来5轮
 *     1、线程  操作   资源类
 *     2、判断  干活   通知
 *     3、防止虚假唤醒操作
 * @Author zixin
 * @Date 2019/12/31 10:35
 * @Version 1.0
 **/
public class ProduceConsumerTraditionDemo {

    public static void main(String[] args) {

        ShareData shareData = new ShareData();
        new Thread(()->{
            for (int i=0;i<5;i++){
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();
        new Thread(()->{
            for (int i=0;i<5;i++){
                try {
                    shareData.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();
    }
}

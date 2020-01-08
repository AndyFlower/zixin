package com.zixin;

class Photo{
    public synchronized void sendSms() throws Exception{
        System.out.println(Thread.currentThread().getId()+"  invoked sendSMS");
        sendEmail();
    }

    public synchronized void sendEmail() throws Exception{
        System.out.println(Thread.currentThread().getId()+"  invoked sendEmail");

    }
}
/**
 * @ClassName ReenterLockDemo
 * @Description 指的是同一线程外层函数获得锁之后，内层递归函数仍然能获得该锁的代码，在同一个线程在外层方法获得锁的时候，在进入内层方法会自动获取锁。也就是锁，线程可以进入任何一个它已经拥有的锁所同步着的代码块。
 * @Author zishen
 * @Date 2019/12/30 9:36
 * @Version 1.0
 **/
public class ReenterLockDemo {

    /**
     * 11  invoked sendSMS
     * 11  invoked sendEmail
     * 10  invoked sendSMS
     * 10  invoked sendEmail
     * @param args
     */
    public static void main(String[] args) {
        Photo p = new Photo();
        new Thread(()->{
            try {
                p.sendSms();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t1").start();
        new Thread(()->{
            try {
                p.sendSms();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t2").start();
    }


}

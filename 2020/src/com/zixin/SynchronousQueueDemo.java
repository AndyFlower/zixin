package com.zixin;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @ClassName SynchronousQueueDemo
 * @Description
 * @Author zishen
 * @Date 2019/12/31 9:10
 * @Version 1.0
 * AA put 1
 * BB take 1
 * AA put 2
 * BB take 2
 * AA put 3
 * BB take 3
 **/
public class SynchronousQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+" put 1");
                blockingQueue.put("1");
                System.out.println(Thread.currentThread().getName()+" put 2");
                blockingQueue.put("2");
                System.out.println(Thread.currentThread().getName()+" put 3");
                blockingQueue.put("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AA").start();

        new Thread(()->{
            try {
                Thread.sleep(5);
                System.out.println(Thread.currentThread().getName()+" take 1");
                blockingQueue.take();
                Thread.sleep(5);
                System.out.println(Thread.currentThread().getName()+" take 2");
                blockingQueue.take();
                Thread.sleep(5);
                System.out.println(Thread.currentThread().getName()+" take 3");
                blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"BB").start();
    }
}

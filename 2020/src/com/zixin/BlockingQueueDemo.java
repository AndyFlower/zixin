package com.zixin;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName BlockingQueueDemo
 * @Description 1、队列
 *              2、阻塞队列
 *              2.1 阻塞队列有没有好处
 *              2.2 不得不阻塞 如何管理
 * @Author zixin
 * @Date 2019/12/30 14:08
 * @Version 1.0
 **/
public class BlockingQueueDemo {

    public static void exception(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
        System.out.println(blockingQueue.element());
        //java.lang.IllegalStateException: Queue full
        //System.out.println(blockingQueue.add("d"));
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        //java.util.NoSuchElementException
        //System.out.println(blockingQueue.remove());
    }

    public static void certain(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        //false
        System.out.println(blockingQueue.offer("d"));
        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        //null
        System.out.println(blockingQueue.poll());
    }

    public static void block(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        blockingQueue.put("a");
        blockingQueue.put("b");
        blockingQueue.put("c");
        //blockingQueue.put("d");
        blockingQueue.take();
        blockingQueue.take();
        blockingQueue.take();
        //blockingQueue.take();
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        blockingQueue.offer("a",2L, TimeUnit.SECONDS);
        blockingQueue.offer("b",2L, TimeUnit.SECONDS);
        blockingQueue.offer("c",2L, TimeUnit.SECONDS);
        blockingQueue.offer("d",2L, TimeUnit.SECONDS);
    }

}

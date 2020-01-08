package com.zixin;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MyCache{
    private volatile Map<String,Object> map = new HashMap<>();

    private ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();
    public void put(String key,Object value){
        rwlock.writeLock().lock();

        try {
            System.out.println(Thread.currentThread().getName()+" 正在写入："+key);
            TimeUnit.MILLISECONDS.sleep(500);
            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+" 写入完成："+key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            rwlock.writeLock().unlock();
        }

    }
    public void get(String key){
        rwlock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+" 正在读取："+key);
            TimeUnit.MILLISECONDS.sleep(500);
            Object result = map.get(key);
            System.out.println(Thread.currentThread().getName()+" 读取完成："+result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            rwlock.readLock().unlock();
        }

    }
    public void clearMap(){
        map.clear();
    }
}
/**
 * @ClassName ReadWriteLockDemo
 * @Description 读写锁
 * @Author zixin
 * @Date 2019/12/30 11:38
 * @Version 1.0
 **/
public class ReadWriteLockDemo {

    /**
     * 0 正在写入：0
     * 0 写入完成：0
     * 1 正在写入：1
     * 1 写入完成：1
     * 2 正在写入：2
     * 2 写入完成：2
     * 3 正在写入：3
     * 3 写入完成：3
     * 4 正在写入：4
     * 4 写入完成：4
     * 0 正在读取：0
     * 1 正在读取：1
     * 2 正在读取：2
     * 3 正在读取：3
     * 4 正在读取：4
     * 1 读取完成：1
     * 2 读取完成：2
     * 0 读取完成：0
     * 3 读取完成：3
     * 4 读取完成：4
     * @param args
     */
    public static void main(String[] args) {
        MyCache myCache = new MyCache();

        for (int i = 0; i <5 ; i++) {
            final int tempInt = i;
            new Thread(()->{
                myCache.put(tempInt+"",tempInt+"");
            },String.valueOf(i)).start();
        }

        for (int i = 0; i <5 ; i++) {
            final int tempInt = i;
            new Thread(()->{
                myCache.get(tempInt+"");
            },String.valueOf(i)).start();
        }
    }
}

package com.zixin;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @ClassName ContainerNotSafeDemo
 * @Description TODO
 * @Author zixin
 * @Date 2019/12/27 12:37
 * @Version 1.0
 **/
public class ContainerNotSafeDemo {

    /**
     * HashMap线程不安全
     * 解决方案：
     *        new ConcurrentHashMap<>();
     * java.util.ConcurrentModificationException
     * @param args
     */
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        new ConcurrentHashMap<>();
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                        map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0,8));
                        System.out.println(map);
                    },String.valueOf(i)
            ).start();
        }
    }

    /**
     * HashSet线程不安全
     * 解决方案：
     *        1.Collections.synchronizedSet(new HashSet<String>())
     *        2、new CopyOnWriteArraySet<String>();
     * @param args
     */
    public static void setNotSafe(String[] args) {
        Set<String> set = Collections.synchronizedSet(new HashSet<String>());
        new CopyOnWriteArraySet<String>();
        for (int i=1;i<=500;i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
    }

    public static void listNotSafe(String[] args) {
        //Constructs an empty list with an initial capacity of ten.
        new ArrayList<Integer>().add(1);
        List<String> list = new ArrayList<String>();
        for (int i=1;i<=500;i++) {
            new Thread(()->{
               list.add(UUID.randomUUID().toString().substring(0,8));
               System.out.println(list);
            },String.valueOf(i)).start();
        }
        //java.util.ConcurrentModificationException

        /**
         * 1、故障现象：java.util.ConcurrentModificationException
         * 2、导致原因
         *          并发争抢修改导致，一个线程正在写，另外一个线程过来抢夺，导致数据不一致，出现数据修改异常
         * 3、解决方法
         *     3.1、使用Vector（Vector出现在ArrayList之前）
         *     3.2、Collections.synchronizedList(new ArrayList<String>());
         *     3.3、new CopyOnWriteArrayList<String>();
         * 4、优化建议
         */
        Collections.synchronizedList(new ArrayList<String>());
        new CopyOnWriteArrayList<String>();
    }
}

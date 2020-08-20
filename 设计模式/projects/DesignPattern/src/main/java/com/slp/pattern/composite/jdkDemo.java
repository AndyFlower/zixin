package com.slp.pattern.composite;


import java.util.HashMap;
import java.util.Map;

public class jdkDemo {
    public static void main(String[] args) {
        //Map是一个抽象的构建，类似于Component
        //HashMap相当于是一个中间的构建，等价于Composite  实现/实现了相关的方法  put  putAll
        //Node类是HashMap的静态内部类，类似于Leaf叶子节点 他只有一些get方法
        //static class Node<K,V> implements Map.Entry<K,V> {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"s");

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(2,"l");
        hashMap.put(3,"p");

        map.putAll(hashMap);
        System.out.println(map);
    }
}

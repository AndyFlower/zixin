package com.slp.pattern.flyweight;

public class JDKInteger {
    public static void main(String[] args) {
        //-128到127 使用的是享元模式  如果不在该范围内 则仍然new一个新的对象
        Integer integer = Integer.valueOf(127);
        Integer integer1 = new Integer(127);
        Integer integer2 = Integer.valueOf(127);
        Integer integer3 = new Integer(127);
        System.out.println(integer.equals(integer1));
        System.out.println(integer == integer1);
        System.out.println(integer3== integer);
        System.out.println(integer3==integer1);
    }
}

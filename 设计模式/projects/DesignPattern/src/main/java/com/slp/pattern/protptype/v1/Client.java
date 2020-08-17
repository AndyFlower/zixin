package com.slp.pattern.protptype.v1;

public class Client {
    public static void main(String[] args) {
        //使用传统的方法解决
        Sheep sheep = new Sheep("Tom",1,"白色");
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep2);
    }
}

package com.slp.pattern.protptype.v2;


public class Client {
    public static void main(String[] args) {
       Sheep sheep =new Sheep("tom",1,"白色");
       Sheep sheep1 = (Sheep) sheep.clone();
       System.out.println(sheep);
       System.out.println(sheep1);
    }
}

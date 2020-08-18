package com.slp.pattern.protptype.v3;


public class Client {
    public static void main(String[] args) {
       Sheep sheep =new Sheep("tom",1,"白色");
        sheep.setSheep(new Sheep("anl",2,"黑色"));
       Sheep sheep1 = (Sheep) sheep.clone();
       System.out.println(sheep);
       System.out.println(sheep1);
    }
}

package com.zixin;


import java.util.concurrent.atomic.AtomicReference;

class User{
    String userName;
    int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}
/**
 * @ClassName AtomicReferenceDemo
 * @Description TODO
 * @Author zishen
 * @Date 2019/12/25 19:40
 * @Version 1.0
 **/
public class AtomicReferenceDemo {

    public static void main(String[] args) {
        AtomicReference<User> atomicReference = new AtomicReference<User>();
        User u1 = new User("u1",11);
        User u2= new User("u2",22);
        atomicReference.set(u1);

        System.out.println(atomicReference.compareAndSet(u1,u2)+"\t"+atomicReference.get().toString());

    }
}

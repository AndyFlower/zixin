package com.slp.principle.inversion.v1;

public class DependecyInversion {
    public static void main(String[] args) {
        Person p=new Person();
        p.receive(new Email());
    }

}

/**
 * 完成person接收信息的功能
 * 方式1
 * 1.比较简单 比较容易想到
 * 2.如果我们获取的对象是微信、短信等，则需要新增类同时person类也要增加相应的犯法
 * 3.解决思路：引入一个抽象的接IReceiver 这样person类与接口发生依赖，
 * 因为email weixin都属于接收的对象他们各自实现接口即可
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息：hello";
    }
}
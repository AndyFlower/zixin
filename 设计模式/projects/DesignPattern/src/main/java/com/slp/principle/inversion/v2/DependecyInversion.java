package com.slp.principle.inversion.v2;

public class DependecyInversion {
    public static void main(String[] args) {
        //客户端无需改变
        Person p =new Person();
        p.receive(new Email());
        p.receive(new WEIXIN());
    }

}

class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：hello";
    }
}
interface IReceiver{
    public String getInfo();
}
class WEIXIN implements IReceiver{

    @Override
    public String getInfo() {
        return "微信消息：hello";
    }
}
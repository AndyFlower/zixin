package com.slp.pattern.visitor;

/**
 * @ClassName Client
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/31 8:35
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());
       Success success = new Success();
       objectStructure.display(success);
       Fail fail = new Fail();
       objectStructure.display(fail);
    }
}

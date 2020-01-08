package com.zixin;

/**
 * @ClassName TestTransferValue
 * @Description TODO
 * @Author zishen
 * @Date 2019/12/30 8:15
 * @Version 1.0
 **/
public class TestTransferValue {

    public void changeValue1(int age){
        age=20;
    }
    public void changeValue2(Person person){
        person.setName("tes");
    }
    public void changeValue3(String str){
        str="tes";
    }

    /**
     * age---18
     * name---tes
     * String---abc
     * @param args
     */
    public static void main(String[] args) {
        TestTransferValue test = new TestTransferValue();
        int age=18;
        test.changeValue1(age);
        System.out.println("age---"+age);
        Person person = new Person("abc");
        test.changeValue2(person);
        System.out.println("name---"+person.getName());

        String s ="abc";
        test.changeValue3(s);
        System.out.println("String---"+s);
    }

}

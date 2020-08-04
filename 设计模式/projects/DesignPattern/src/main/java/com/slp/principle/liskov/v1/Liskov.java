package com.slp.principle.liskov.v1;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        a.fun1(11,3);
        a.fun1(1,8);

        B b =new B();
        b.fun1(11,3);
        b.fun1(1,8);//本意是做减法
    }
}

class A{
    public int fun1(int num1,int num2){
        return num1-num2;
    }
}
//B继承与A
//增加了一个新功能，完成两个数相加
class B extends A{
    @Override
    public int fun1(int num1, int num2) {
        return num1+num2;
    }
    public  int fun2(int a,int b){
       return a-b;
    }
}
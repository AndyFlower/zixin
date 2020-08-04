package com.slp.principle.liskov.v2;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        a.fun1(11,3);
        a.fun1(1,8);
//因为B不再继承A类，因此调用者不会再认为fun1是求减法了
        B b =new B();
        b.fun1(11,3);
        b.fun1(1,8);//本意是做减法

        //使用组合依然可以使用到A累的方法
        System.out.println(b.fun3(11,3));
    }
}

class Base{
    //将更加基础的方法和成员写到Base类中

}
class A extends Base{
    public int fun1(int num1,int num2){
        return num1-num2;
    }
}

//B继承与A
//增加了一个新功能，完成两个数相加
class B extends Base{
    //如果B需要使用A的方法，使用组合的关系
    private A a = new A();
    public int fun1(int num1, int num2) {
        return num1+num2;
    }
    public  int fun2(int a,int b){
       return a-b;
    }
    //假如我们仍然想使用A的方式
    public int fun3(int a,int b){
        return this.a.fun1(a,b);
    }
}
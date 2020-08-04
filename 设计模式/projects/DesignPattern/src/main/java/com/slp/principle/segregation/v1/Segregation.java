package com.slp.principle.segregation.v1;

public class Segregation {
}

interface  Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements  Interface1{

    @Override
    public void operation1() {
        System.out.println("B中实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B中实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B中实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B中实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B中实现了operation5");
    }
}
class D implements  Interface1{

    @Override
    public void operation1() {
        System.out.println("D中实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D中实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D中实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D中实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D中实现了operation5");
    }
}
//A类通过interface依赖B 但是只用到了1 2 3 方法
class A{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface1 interface1){
        interface1.operation2();
    }
    public void depend3(Interface1 interface1){
        interface1.operation3();
    }
}
//C类通过interface依赖D 但是只用到了1 4 5 方法
class C{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend4(Interface1 interface1){
        interface1.operation4();
    }
    public void depend5(Interface1 interface1){
        interface1.operation5();
    }
}
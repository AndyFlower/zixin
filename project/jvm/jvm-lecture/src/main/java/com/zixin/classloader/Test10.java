package com.zixin.classloader;

/**
 * @ClassName Test10
 * @Description TODO
 * @Author zixin
 * @Date 2020/1/11 17:49
 * @Version 1.0
 **/
public class Test10 {
    static {
        System.out.println("Test10 static block");
    }

    /**
     * Test10 static block
     * -----------
     * Parent10 static block
     * ----------------
     * 3
     * ----------------
     * Child10 static block
     * 4
     * @param args
     */
    public static void main(String[] args) {
        Parent10 parent10;
        System.out.println("-----------");
        parent10=new Parent10();
        System.out.println("----------------");
        System.out.println(parent10.a);
        System.out.println("----------------");
        System.out.println(Child10.b);
    }


}

class Parent10{
    static int a=3;
    static {
        System.out.println("Parent10 static block");
    }
}

class Child10 extends Parent10{

    static int b=4;
    static {
        System.out.println("Child10 static block");
    }
}

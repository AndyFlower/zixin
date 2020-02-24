package com.zixin.bytecode;

public class Test2 {
    String str = "Welcome";
    private int x =5;
    public static Integer in =10;

    private Object object=new Object();

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.setX(8);
        in=20;
    }

    private synchronized void setX(int x){
        this.x=x;
    }

    private void test(String str){
        /*此处如果使用str起不到上锁的作用 要用同一个对象 所以类中定义一个变量来上锁*/
        synchronized (object){
            System.out.println("hello world");
        }
    }

    /**
     * synchronized修饰静态方法实际上是给Test2锁对应的类class上的锁
     * @param str
     */
    private synchronized static void test2(String str){

    }
}

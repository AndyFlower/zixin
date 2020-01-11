package com.zixin.classloader;

/**
 * 常量在编译阶段会存入到调用这个常量的方法所在的类的常量池中
 * 本质上，调用类并没有直接引用到这个定义常量的类，因此不会触发定义常量的类的初始化
 * 注意：这里指的是将常量存放到了Test2的常量池中，之后Test2与Parent1就没有任何关系了，甚至，我们可以将Parent1的class文件删除
 *
 * 助记符：
 * ldc表示将int  float或是String类型的常量值从常量池中推送到栈顶
 * bipush表示将单字节的常量值-128~127推送至栈顶
 * sipush表示将一个短征信常量值（-322768~32767）推送至栈顶
 * iconst_1表示将int类型的1推送至栈顶(iconst_m1~iconst_5)
 */
public class Test2 {
    public static void main(String[] args) {
        /**
         * s加final修饰  hello world
         * s不加final修饰：parent1 static block
         *                hello world
         */
        System.out.println(Parent1.i);
    }

}
class Parent1{
    public static final String s = "hello world";
    public static final int i = 1;
    public static final Short sh = 127;
    static {
        System.out.println("parent1 static block");
    }
}
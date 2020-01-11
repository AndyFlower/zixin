package com.zixin.classloader;

/**
 *对于数组实例来说，其类型是由JVM在运行期动态生成的，表示为[Lcom.zixin.classloader.Parent4
 * 这种形式，动态生成的类型，父类型都是object
 *
 * 对于数组来说，JavaDoc经常讲构成数组的元素称为Component,实际上就是将数组将第一个维度后的类型
 *
 * 助记符：
 * anewarray:表示创建一个引用类型的数组，并将其引用值压入栈顶
 * newarray:表示创建一个袁术类型的数组，并将其引用值压入栈顶
 */
public class Test4 {
    public static void main(String[] args) {
        /**
         * 主动使用第一种情况：创建类的实例：
         *     Parent4 static block
         */
        //Parent4 parent4 = new Parent4();
        /**
         * 不会输出
         */
        Parent4[] parent4s= new Parent4[1];
        //class [Lcom.zixin.classloader.Parent4; 由java虚拟机在运行过程中创建的
        System.out.println(parent4s.getClass());
        //class java.lang.Object
        System.out.println(parent4s.getClass().getSuperclass());
        Parent4[][] parent4s1= new Parent4[1][1];
        //class [[Lcom.zixin.classloader.Parent4;
        System.out.println(parent4s1.getClass());
        //class java.lang.Object
        System.out.println(parent4s1.getClass().getSuperclass());

        System.out.println("-----");
        int[] ints = new int[1];
        //class [I
        System.out.println(ints.getClass());
        //class java.lang.Object
        System.out.println(ints.getClass().getSuperclass());
    }
}

class Parent4{
    static {
        System.out.println("Parent4 static block" );
    }
}

package com.zixin.classloader;

/**
 * @ClassName Test9
 * @Description
 * @Author zixin
 * @Date 2020/1/11 17:44
 * @Version 1.0
 * 加载顺序
 * [Loaded com.zixin.classloader.Test9 from file:/D:/slpworkspace/github/2020/project/jvm/jvm-lecture/target/classes/]
 * [Loaded sun.launcher.LauncherHelper$FXHelper from C:\Program Files\Java\jdk1.8.0_121\jre\lib\rt.jar]
 * [Loaded java.lang.Void from C:\Program Files\Java\jdk1.8.0_121\jre\lib\rt.jar]
 * Test9 static block
 * [Loaded com.zixin.classloader.Parent9 from file:/D:/slpworkspace/github/2020/project/jvm/jvm-lecture/target/classes/]
 * [Loaded com.zixin.classloader.Child9 from file:/D:/slpworkspace/github/2020/project/jvm/jvm-lecture/target/classes/]
 * Parent static block
 * child static block
 **/
public class Test9 {
    static {
        System.out.println("Test9 static block");
    }
    public static void main(String[] args) {
        /**
         * Test9 static block
         * Parent static block
         * child static block
         * 4
         */
        System.out.println(Child9.b);
    }
}

class Parent9{
    static int a=3;
    static{
        System.out.println("Parent static block");
    }
}

class Child9 extends Parent9{
    static int b=4;
    static {
        System.out.println("child static block");
    }
}
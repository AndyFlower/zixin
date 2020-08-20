package com.slp.pattern.composite;

/**
 * 组合模式客户端调用
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        University university = new University("清华大学","中国顶级的大学");

        //创建学院
        College computerCollege = new College("计算机学院","清华姚班");
        College mathCllege = new College("数学学院","数学学院");

        //创建系
        computerCollege.add(new Department("计算机系","计算机不错"));
        computerCollege.add(new Department("电子信息","新学科"));

        mathCllege.add(new Department("数学与应用数学","数学与应用数学"));
        mathCllege.add(new Department("信息与计算科学","信息与计算科学"));

        university.add(computerCollege);
        university.add(mathCllege);
        university.print();




    }
}

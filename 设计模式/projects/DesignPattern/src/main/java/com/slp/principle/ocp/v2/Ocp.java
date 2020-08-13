package com.slp.principle.ocp.v2;

/**
 * @ClassName Ocp
 * @Description 符合开闭原则的版本
 * @Author sanglp
 * @Date 2020/8/13 11:14
 * @Version 1.0
 **/
public class Ocp {
    public static void main(String[] args) {
        GraphicEditoe graphicEditoe = new GraphicEditoe();
        graphicEditoe.drawShape(new Rectangle());
        graphicEditoe.drawShape(new Circle());
        graphicEditoe.drawShape(new Triangle());
    }
}

abstract class Shape{
    int m_type;
    public abstract void draw();
}

/**
 * 这是一个用于绘图的类【使用方】
 */
class GraphicEditoe{
    //接收Shape，调用draw方法
    public void drawShape(Shape s){
        s.draw();
    }
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("画个大操场");
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
    @Override
    public void draw() {
        System.out.println("画个大太阳");
    }
}

/**
 * 如果需要新增一个三角形
 */
class Triangle extends Shape{
    Triangle(){
        super.m_type=2;
    }
    @Override
    public void draw() {
        System.out.println("画个大山峰");
    }
}
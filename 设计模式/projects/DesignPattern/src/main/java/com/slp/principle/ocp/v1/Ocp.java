package com.slp.principle.ocp.v1;

/**
 * @ClassName Ocp
 * @Description 开闭原则修改前版本
 * @Author sanglp
 * @Date 2020/8/13 10:54
 * @Version 1.0
 **/
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class Shape{
    int m_type;
}
class GraphicEditor{
    /**
     * 接收shape对象，然后根据type来绘制不同的图形
     * @param shape
     */
    public void drawShape(Shape shape){
        if(shape.m_type == 1){
            drawRectangle(shape);
        }else if(shape.m_type == 2){
            drawCircle(shape);
        }else if(shape.m_type ==3){
            drawTriangle(shape);
        }
    }
    //画矩形
    public void drawRectangle(Shape r){
        System.out.println("画一个大操场");

    }
    //画圆形
    public void drawCircle(Shape r){
        System.out.println("画一个大太阳");

    }
    //画三角形
    public void drawTriangle(Shape r){
        System.out.println("画一个大山峰");

    }
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type=1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}

class Triangle extends Shape{
    Triangle(){
        super.m_type=3;
    }
}
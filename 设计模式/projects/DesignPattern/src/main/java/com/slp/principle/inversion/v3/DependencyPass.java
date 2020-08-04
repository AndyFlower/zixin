package com.slp.principle.inversion.v3;

import javax.print.DocFlavor;

public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        //OpenAndClose openAndClose = new OpenAndClose();
        //openAndClose.open(changHong);

        //OpenAndClose openAndClose = new OpenAndClose(changHong);
        //openAndClose.open();

        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}
/*
//通过接口传递实现依赖
interface IOpenAndClose{
    public  void open(ITV tv);//抽象方法接收接口
}
interface ITV{
    public void play();
}
class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}
//实现接口
class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}*/

/*
//方式二 通过构造方法依赖传递
interface IOpenAndClose{
    public void open();//抽象方法
}
interface ITV{
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    public ITV tv;

    public OpenAndClose(ITV tv){
        this.tv = tv;
    }
    @Override
    public void open() {
        tv.play();
    }
}
class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}*/

//方式3 通过setter方式传递
interface IOpenAndClose{
    public void open();//抽象方法
    public void setTv(ITV tv);
}

interface ITV{
    public void play();
}

class OpenAndClose implements IOpenAndClose{
    private ITV tv;

    @Override
    public void open() {
        tv.play();
    }

    public void setTv(ITV tv){
        this.tv=tv;
    }
}
class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}
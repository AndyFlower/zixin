package com.slp.pattern.facade;

/**
 * @ClassName Screen
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/21 8:24
 * @Version 1.0
 **/
public class Screen {

    private static Screen screen = new Screen();
    public static Screen  getInstance(){
        return screen;
    }

    public void up(){
        System.out.println("屏幕上升");
    }

    public void down(){
        System.out.println("屏幕下降");
    }
}

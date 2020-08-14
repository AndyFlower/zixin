package com.slp.uml.aggregation;

/**
 * @ClassName Computer
 * @Description 类图-聚合关系
 * @Author sanglp
 * @Date 2020/8/14 10:26
 * @Version 1.0
 **/
public class Computer {
    private Mouse mouse;
    private Monitor monitor;

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

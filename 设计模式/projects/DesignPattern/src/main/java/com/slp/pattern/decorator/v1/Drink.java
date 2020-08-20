package com.slp.pattern.decorator.v1;

/**
 * @ClassName Drink
 * @Description 抽象构件
 * @Author sanglp
 * @Date 2020/8/20 8:33
 * @Version 1.0
 **/
public abstract class Drink {
    public String des;
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //计算费用的抽象方法
    public abstract float cost();
}

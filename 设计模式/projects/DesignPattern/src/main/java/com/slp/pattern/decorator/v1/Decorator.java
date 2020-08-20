package com.slp.pattern.decorator.v1;

/**
 * @ClassName Decorator
 * @Description 装饰者
 * @Author sanglp
 * @Date 2020/8/20 8:39
 * @Version 1.0
 **/
public class Decorator extends Drink {
    private Drink obj; //装饰器一定持有一个抽象组件的引用
    @Override
    public float cost() {//组合
        //super.getPrice()先拿到自己的价格
        return super.getPrice()+obj.cost();
    }

    /**
     * 构造器
     * @param obj
     */
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDes() {
        //obj.getDes()输出被装饰者的信息
        return super.getDes() + " "+super.getPrice() +" &&" +obj.cost();
    }
}

package com.slp.pattern.decorator.v1;

/**
 * @ClassName Coffee
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/20 8:35
 * @Version 1.0
 **/
public class Coffee extends Drink {

    @Override
    public float cost() {
      return  super.getPrice();
    }
}

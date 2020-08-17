package com.slp.pattern.factory.v4;

/**
 * 抽象工厂模式
 */
public class Test {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}

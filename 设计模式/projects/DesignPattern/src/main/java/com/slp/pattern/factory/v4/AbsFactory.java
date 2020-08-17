package com.slp.pattern.factory.v4;

/**
 * 抽象工厂模式的抽象层  解决
 */
public interface AbsFactory {
    /**
     * 让工厂子类来具体实现
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType);
}

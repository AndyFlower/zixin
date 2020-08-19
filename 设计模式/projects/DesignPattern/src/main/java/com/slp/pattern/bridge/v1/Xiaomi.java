package com.slp.pattern.bridge.v1;

public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }

    @Override
    public void call() {

    }
}

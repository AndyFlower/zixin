package com.slp.pattern.adapter.v1;

/**
 * 类适配器
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}

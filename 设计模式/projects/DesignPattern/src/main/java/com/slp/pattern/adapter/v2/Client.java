package com.slp.pattern.adapter.v2;

/**
 * 对象适配器
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter voltageAdapter =new VoltageAdapter(new Voltage220v());
        phone.charging(voltageAdapter);
    }
}

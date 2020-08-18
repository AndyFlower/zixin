package com.slp.pattern.adapter.v1;

public class VoltageAdapter extends Voltage220v implements IVoltage5v {
    @Override
    public int output5V() {
        int src = ouyput220v();//先获取到22v电压
        int dst = src/44;//转换成5v
        return dst;
    }
}

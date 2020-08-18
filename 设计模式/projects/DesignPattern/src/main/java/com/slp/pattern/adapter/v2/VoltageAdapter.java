package com.slp.pattern.adapter.v2;

public class VoltageAdapter implements IVoltage5v {
    private Voltage220v voltage220v ;

    public VoltageAdapter(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5V() {
        int dest = 0;
        if(null != voltage220v){
            int src = voltage220v.ouyput220v();
            System.out.println("使用对象适配器进行转换");
            dest = src/44;
        }
        return dest;
    }
}

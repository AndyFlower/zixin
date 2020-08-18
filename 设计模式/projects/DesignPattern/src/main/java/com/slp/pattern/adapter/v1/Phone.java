package com.slp.pattern.adapter.v1;

public class Phone {
    public void charging(IVoltage5v iVoltage5v){
        if (iVoltage5v.output5V()==5){
            System.out.println("电压为5V可以进行充电");
        }else {
            System.out.println("电压不符合，不能充电");
        }
    }
}

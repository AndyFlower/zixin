package com.slp.pattern.adapter.v1;

/**
 * 被适配的类
 */
public class Voltage220v {
    /**
     * 输出220v的
     * @return电压
     */
    public int ouyput220v(){
        int src=220;
        System.out.println("电压="+src);
        return src;
    }
}

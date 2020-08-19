package com.slp.pattern.bridge.v1;

public class Huawei  implements Brand{
    @Override
    public void open() {
        System.out.println("华为手机开机了");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机了");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}

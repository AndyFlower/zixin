package com.slp.pattern.bridge.v1;

import com.mysql.jdbc.Driver;

public class Client {
    public static void main(String[] args) {
        //获取折叠式手机（样式+品牌）
        Phone phone = new FoldedPhone(new Huawei());
        phone.open();
        phone.call();
        phone.close();

        Phone phone1 = new UprightPhone(new Xiaomi());
        phone1.open();
        phone1.call();
        phone.close();

    }


}

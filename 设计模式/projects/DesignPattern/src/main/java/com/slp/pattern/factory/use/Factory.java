package com.slp.pattern.factory.use;

import java.util.Calendar;

public class Factory {
    public static void main(String[] args) {
        //getInstance是一个静态方法
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
    }
}

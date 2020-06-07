package com.slp.version1.inter.impl;

import com.slp.version1.inter.Calculator;

public class MyCalculator  implements Calculator {

    @Override
    public int add(int i, int j) {
        return i+j;
    }
    @Override
    public int sub(int i, int j) {
        return i-j;
    }
}

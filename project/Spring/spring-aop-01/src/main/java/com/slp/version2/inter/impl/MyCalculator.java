package com.slp.version2.inter.impl;

import com.slp.version2.inter.Calculator;
import org.springframework.stereotype.Service;

@Service
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

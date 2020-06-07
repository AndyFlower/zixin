package com.slp.version2.inter.impl;

import com.slp.version2.inter.Calculator;
import org.springframework.stereotype.Service;

@Service
public class MyCalculator2  {


    public int add(int i, int j) {
        return i+j;
    }

    public int sub(int i, int j) {
        return i-j;
    }
}

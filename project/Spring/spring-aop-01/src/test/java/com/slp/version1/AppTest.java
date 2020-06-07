package com.slp.version1;

import static org.junit.Assert.assertTrue;

import com.slp.version1.inter.Calculator;
import com.slp.version1.inter.impl.MyCalculator;
import com.slp.version1.proxy.CalculatorProxy;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test(){
        Calculator calculator = new MyCalculator();
        calculator.add(1,2);

        Calculator c =  CalculatorProxy.getProxy(calculator);
        //代理对象和被代理对象唯一能产生的关联就是实现了同一个接口
        System.out.println(c.getClass());//class com.sun.proxy.$Proxy2
        System.out.println(Arrays.asList(c.getClass().getInterfaces()));//[interface com.slp.inter.Calculator]
        c.add(2,3);
    }
}

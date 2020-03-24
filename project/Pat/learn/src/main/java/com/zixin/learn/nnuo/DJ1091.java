package com.zixin.learn.nnuo;

import java.math.BigDecimal;
import java.util.Scanner;

public class DJ1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
        	BigDecimal d= sc.nextBigDecimal();
        	if(d.compareTo(new BigDecimal(1000))<0) {
        		System.out.println("discount=1,pay="+d);
        	}
        	if(d.compareTo(new BigDecimal(1000))>=0&&d.compareTo(new BigDecimal(2000))<0) {
        		System.out.println("discount=0.95,pay="+d.multiply(new BigDecimal("0.95")).toPlainString());
        	}
        	if(d.compareTo(new BigDecimal(2000))>=0&&d.compareTo(new BigDecimal(3000))<0) {
        		System.out.println("discount=0.9,pay="+d.multiply(new BigDecimal("0.9")));
        	}
        	if(d.compareTo(new BigDecimal(3000))>=0&&d.compareTo(new BigDecimal(5000))<0) {
        		System.out.println("discount=0.85,pay="+d.multiply(new BigDecimal("0.85")));//注意这里是使用new BigDecimal（）构造为字符串的方式  否则输出会有很多0
        	}
        	if(d.compareTo(new BigDecimal(5000))>=0) {
        		System.out.println("discount=0.8,pay="+d.multiply(new BigDecimal("0.8")).stripTrailingZeros().toPlainString());
        	}
        }
	}

}

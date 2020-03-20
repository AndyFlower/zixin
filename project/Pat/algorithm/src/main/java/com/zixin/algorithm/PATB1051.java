package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @author sangliping
 * @desc 复数乘法：z1=a+bi，z2=c+di(a、b、c、d∈R)是任意两个复数，那么它们的积(a+bi)(c+di)=(ac-bd)+(bc+ad)i.
 * 当A或者B小于0但是大于-0.005(比如-0.00001)时候，如果按照A>=0的判断，会输出“-0.00”这样的结果,事实上应该输出“0.00”【B同理，应该输出“+0.00i”】
 */
public class PATB1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r1=sc.nextDouble();
		double p1=sc.nextDouble();
		double r2=sc.nextDouble();
		double p2=sc.nextDouble();
		sc.close();
		double A = r1 * r2 * Math.cos(p1) * Math.cos(p2) - r1 * r2 * Math.sin(p1) * Math.sin(p2);
		double B = r1 * r2 * Math.cos(p1) * Math.sin(p2) + r1 * r2 * Math.sin(p1) * Math.cos(p2);
	    if (A + 0.005 >= 0 && A < 0)
	        System.out.println("0.00");
	    else
	    	System.out.printf("%.2f", A);
	    if(B >= 0)
	    	System.out.printf("+%.2fi", B);
	    else if (B + 0.005 >= 0 && B < 0)
	    	System.out.printf("+0.00i");
	    else
	    	System.out.printf("%.2fi", B);
	    
		
	}
}

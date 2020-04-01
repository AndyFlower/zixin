package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		sc.close();
		int c = a+b;
		if(c<0) {
			System.out.print("-");
			c=-c;
		}
		int length=0;
		int num[] = new int[10];
		if(c==0) {
			num[length++]=0;
		}
		while(c!=0) {
			num[length++]=c%10;
			c=c/10;
		}
		for(int k=length-1;k>=0;k--) {//高位开始输出
			System.out.printf("%d",num[k]);
			if(k>0&&k%3==0) {
				System.out.print(",");//三位1个逗号
			}
		}

	}

}

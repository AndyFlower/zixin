package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1011 {

	public static void main(String[] args) {
		char s[]= {'W','T','L'};
		double ans = 1.0;
		double temp=0.0;
		double a=0.0;
		int idx = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			temp=0.0;
			for(int j=0;j<3;j++) {
				double a1 = sc.nextDouble();
				if(a1>temp) {
					idx=j;
					temp=a1;
				}
			}
			ans*=temp;
			System.out.print(s[idx]+" ");
		}
		
       System.out.printf("%.2f",(ans*0.65-1)*2);  
	}

}

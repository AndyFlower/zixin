package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] arra = new double[1002];
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int a = sc.nextInt();
			double b = sc.nextDouble();
			arra[a]=b;
		}

		double [] res = new double[2002];
		int numb = sc.nextInt();
		for(int i=0;i<numb;i++) {
			int a = sc.nextInt();
			double b = sc.nextDouble();
			for(int j=0;j<1001;j++) {
				if(arra[j]!=0) {
					res[a+j]+=b*arra[j];
				}
			}
		}
		int count = 0;
		for(int i=0;i<2001;i++) {
			if(res[i]!=0) {
				count++;
			}
		}
		
		System.out.print(count);
		for(int i=res.length-1;i>=0;i--) {
			if(res[i]!=0) {
				System.out.printf(" %d %.1f",i,res[i]);
			}
			
		}
	}

}

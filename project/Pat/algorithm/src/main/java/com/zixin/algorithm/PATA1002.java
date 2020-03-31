package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] arr=new double[1111];//注意极端情况
		int maxSum = 0;
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			
			int a = sc.nextInt();
			if(a>maxSum) {
				maxSum=a;
			}
			double b = sc.nextDouble();
			arr[a]=b;
		}
		int numb = sc.nextInt();
		for(int i=0;i<numb;i++) {
			
			int a = sc.nextInt();
			if(a>maxSum) {
				maxSum=a;
			}
			double b = sc.nextDouble();
			arr[a]+=b;
		}
		sc.close();
		int count =0;
		for(int i=0;i<1110;i++) {
			if(arr[i]!=0) {
				count++;
			}
		}
		System.out.print(count);
		for(int i=1110;i>=0;i--) {
			if(arr[i]!=0) {
				System.out.printf(" %d %.1f",i,arr[i]);
			}
		}

	}

}

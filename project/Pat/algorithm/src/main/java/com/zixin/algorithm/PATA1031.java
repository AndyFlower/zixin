package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		sc.close();
		int n=arr.length;
		int n1 = (n+2)/3;//关键是如何求出n1  也可以从小到大枚举 找到第一个符合条件的值
		int n3=n1;
		int n2 =n+2-n1-n3;
		for(int i=0;i<n1-1;i++) {
			System.out.print(arr[i]);
			for(int j=0;j<n2-2;j++) {
				System.out.print(" ");
			}
			System.out.print(arr[n-i-1]);
			System.out.println();
			
		}
		for(int i=0;i<n2;i++) {
			System.out.print(arr[n1+i-1]);
		}
	}
}

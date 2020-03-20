package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1004 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String [][] arrs = new String [n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				arrs[i][j]=sc.next();
			}
		}
		sc.close();
		String maxName =arrs[0][0];
		String maxNo = arrs[0][1];
		String minName = arrs[0][0];
		String minNo = arrs[0][1];
		int max = Integer.parseInt(arrs[0][2]);
		int min = Integer.parseInt(arrs[0][2]);
		for(int i=1;i<n;i++) {
			if(Integer.parseInt(arrs[i][2])>max) {
				max = Integer.parseInt(arrs[i][2]);
				maxName = arrs[i][0];
				maxNo = arrs[i][1];
			}else if(Integer.parseInt(arrs[i][2])<min){
				min = Integer.parseInt(arrs[i][2]);
				minName=  arrs[i][0];
				minNo = arrs[i][1];
			}
		}
		System.out.println(maxName + " " +maxNo);
		System.out.println(minName + " " +minNo);
	}
}

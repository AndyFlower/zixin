package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class PATB1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gradeNum = sc.nextInt();
		int arr[] = new int[gradeNum];
		for(int i=0;i<gradeNum;i++) {
			arr[i] = sc.nextInt();
		}
		int searchNum = sc.nextInt();
		int grades[] = new int[searchNum];
		for(int i=0;i<searchNum;i++) {
			grades[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		int res[] = new int[searchNum];
		for(int j=0;j<searchNum;j++) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>grades[j]) {
					continue;
				}
				if(arr[i]==grades[j]) {
					res[j]=res[j]+1;
				}
			}
		}
		for(int i=0;i<searchNum;i++) {
			if(i!=searchNum-1) {
				System.out.print(res[i]+" ");
			}else {
				System.out.print(res[i]);
			}
		}

	}

}

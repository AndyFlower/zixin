package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pm=sc.nextInt();
		int pn=sc.nextInt();
		sc.close();
		int index = 0;
		int temp=0;
		for(int i=2;i<Integer.MAX_VALUE;i++) {
			if(isSuShu(i)) {
				index+=1;
				if(index>=pm) {
					temp+=1;
				}
				
				//System.out.print("temp:"+temp +" "+i);
				if(index>pn) {
					break;
				}
				if(index>=pm&&index<=pn) {
					if(index == pn) {
						System.out.print(i);
					}else {
					if(temp%10==0) {
						System.out.print(i);
						System.out.println();
						temp=0;
					}else {
						System.out.print(i+" ");
					}
					}
				}
			}
		}
		
	}
	
	
	private static boolean isSuShu(int i) {
		int q = (int) Math.sqrt(i);
		for(int j=2;j<=q;j++) {
			if(i%j==0) {
				return  false;
			}
		}
		return true;
	}

}

package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1027 {

	public static void main(String[] args) {
		
		char[] c = {'0','1','2','3','4','5','6','7','8','9','A','B','C'};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int num = sc.nextInt();
			if(i==0) {
				System.out.print("#"+c[num/13]+c[num%13]);
			}else {
				System.out.print(""+c[num/13]+c[num%13]);
			}
		}
		
		sc.close();

	}

}

package com.zixin.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class PATA1065 {

	public static void main(String[] args) {
		Scanner   sc= new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 1;
		for(int i=0;i<num;i++) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = sc.nextBigInteger();
			if(a.add(b).compareTo(c)>0) {
				System.out.println("Case #"+flag+": true");
				flag++;
			}else {
				System.out.println("Case #"+flag+": false");
				flag++;
			}
		}

	}

}

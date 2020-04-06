package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1008 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int to=0;
		int total=0;
		int now = 0;
		for(int i=0;i<n;i++) {
			to = sc.nextInt();
			if(to>now) {
				total+=((to-now)*6);
				
			}else {
				total +=((now-to)*4);
			}
			total+=5;
			now=to;
		}
		sc.close();
		System.out.println(total);
	}

}

package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1058 {

	public static void main(String[] args) {
		int [] a=new int[3];
		int [] b=new int[3];
		int [] c=new int[3];
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2= sc.next();
		sc.close();
		a[0]=Integer.parseInt(s1.split("\\.")[0]);
		a[1]=Integer.parseInt(s1.split("\\.")[1]);
		a[2]=Integer.parseInt(s1.split("\\.")[2]);
		b[0]=Integer.parseInt(s2.split("\\.")[0]);
		b[1]=Integer.parseInt(s2.split("\\.")[1]);
		b[2]=Integer.parseInt(s2.split("\\.")[2]);
		int carry = 0;
		c[2]=(a[2]+b[2])%29;
		carry = (a[2]+b[2])/29;
		c[1]=(a[1]+b[1]+carry)%17;
		carry =(a[1]+b[1]+carry)/17;
		c[0]=a[0]+b[0]+carry;
		System.out.println(c[0]+"."+c[1]+"."+c[2]);

	}

}

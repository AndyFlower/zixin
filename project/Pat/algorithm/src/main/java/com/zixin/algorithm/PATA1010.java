package com.zixin.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class PATA1010 {
	static int[] map = new int[256];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N1=sc.next();
		String N2=sc.next();
		int tag = sc.nextInt();
		int radis = sc.nextInt();
		sc.close();
		
		
		for(char c='0';c<='9';c++){
			map[c] =c-'0';
		}
		for(char c='a';c<='z';c++) {
			map[c]=c-'a'+10;
		}
		
		
	}
	static BigInteger vonvertToNum10(char a[],BigInteger radix) {//a转换为10进制数
		BigInteger ans = BigInteger.ZERO;
		int len =a.length;
		for(int i=0;i<len;i++) {
			ans=ans.add(ans.multiply(radix).add(BigInteger.valueOf(map[a[i]])));
			if(ans.compareTo(new BigInteger("-1"))<0) {
				return new BigInteger("-1");
			}
		}
		return ans;
		
	}
}

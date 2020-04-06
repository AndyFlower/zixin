package com.zixin.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class PATA1024 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int step = sc.nextInt();
     sc.close();
      int k=0;
      char [] a = s.toCharArray();
      while(k<step&&!judge(a)) {
    	 s= new BigInteger(s).add(new BigInteger(new StringBuilder(s).reverse().toString())).toString();
    	// System.out.println(s);
    	 a=s.toCharArray();
    	 k++;
      }
      for(int i=0;i<a.length;i++) {
    	  System.out.print(a[i]-'0');
      }
      System.out.println();
      System.out.println(k);
		
	}

	/**
	 * 
	 * @Title: judge
	 * @Description: 判断是否是回文串
	 * @author Administrator
	 * @date 2020-04-06 12:39:54
	 * @param @param arr
	 * @param @return 参数
	 * @return boolean 返回类型
	 * @throws
	 */
	static boolean   judge(char[] arr) {
		for(int i=0;i<=arr.length/2;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				return false;
			}
		}
		return true;
	}
}

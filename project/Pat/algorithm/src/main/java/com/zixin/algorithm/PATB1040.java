package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * @author sangliping
 * @desc 要想知道构成多少个PAT，那么遍历字符串后对于每一A，它前面的P的个数和它后面的T的个数的乘积就是能构成的PAT的个数。然后把对于每一个A的结果相加即可
 *  */
public class PATB1040 {

	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		//char[] c = scanner.next().toCharArray();//获得输入字母转成char数组
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		char[] c = rd.readLine().toCharArray();
		//scanner.close();
		rd.close();
		long t=0,at=0,pat=0;
		for(int i=c.length-1;i>=0;i--) {
			if(c[i]=='T') {
				t++;
			}else if(c[i]=='A') {
				at = (t+at)%1000000007;
			}else {
				pat = (pat+at)%1000000007;
			}
		}
		System.out.println(pat%1000000007);

	}

}

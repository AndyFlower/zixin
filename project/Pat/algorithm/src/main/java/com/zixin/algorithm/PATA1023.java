package com.zixin.algorithm;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 * @ClassName: PATA1023
 * @Description: 以字符串读入  然后开一个数组 记录0-9每一个出现的次数
 *               乘以2的结果  如果长度不同则不用继续   
 *               长度相同  遍历第二个 出现了则-1   最后遍历数组 ，如果都是0说明是成立的  反之则不成立
 *               2  5 输出答案错误  还没找到问题在哪
 *               
 * @author Administrator
 * @date 2020-04-06 12:19:41
 */
public class PATA1023 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int [] arr= new int[10];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'0']++;
		}
		String ne = new BigInteger(s).multiply(new BigInteger("2")).toString();
		if(s.length()!=ne.length()) {
			System.out.println("No");
			System.out.println(ne);
		}else {
			for(int i=0;i<ne.length();i++) {
				arr[ne.charAt(i)-'0']--;
			}
		}
		boolean flag = true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println("No");
				System.out.println(ne);
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Yes");
			System.out.println(ne);
		}
		

	}

}

package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * @author sangliping
 * @Desc 1.最长后缀的长度小于等于几个字符串中的最小长度
 *       2、将字符串反转可以免去各种判断
 *       3、使用Scanner会有一个超时 17分  ，换成BufferedReader可以AC
 */
public class PATA1077 {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		//int num = Integer.parseInt(sc.nextLine());
		int num = Integer.parseInt(rd.readLine());
		String [] arr = new String[num];
		int min = 257;
		for(int i=0;i<num;i++) {
			String str = rd.readLine();//sc.nextLine();
			if(str.length()<min) {
				min=str.length();
			}
			arr[i]=new StringBuilder(str).reverse().toString();
		}
		//sc.close();
		rd.close();
		boolean same = true;
		int sameIndex = 0;
		for(int i=0;i<min;i++) {
			char c = arr[0].charAt(i);
			for(int j=1;j<num;j++) {
				if(arr[j].charAt(i)!=c) {
					same=false;
					break;
				}
			}
			if(same) {
				sameIndex++;
			}
			
		}
		if(sameIndex>0) {
			for(int i=sameIndex-1;i>=0;i--) {
				System.out.printf("%c",arr[0].charAt(i));
			}
		}else {
			System.out.println("nai");//不存在公共前缀
		}
	}

}

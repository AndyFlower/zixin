package com.zixin.algorithm;

import java.util.Scanner;
/**
 * @desc 说反话
 * @author Administrator
 *
 */
public class PATB1009 {

	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		String[] strs = str.split(" ");
		for(int i=strs.length-1;i>=0;i--) {
			if(i!=strs.length-1) {
				System.out.print(" ");
			}
			System.out.print(strs[i]);
		}
	}
}

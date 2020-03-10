package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		int pre = 0;
		int cur = 0;
		//<=   =号不能少
		for (int i = 2; i <= num; i++) {
			if (isSuShu(i)) {
				if (cur == 0 && pre != 0) {
					cur = i;
				}
				if (pre == 0) {
					pre = i;
				}
				if (pre != 0 && cur != 0) {
					cur = i;

					if (cur - pre == 2) {
						// System.out.println(pre+" "+cur);
						count = count + 1;
					}
					pre = cur;
				}
			}
		}
		System.out.print(count);
	}

	private static boolean isSuShu(int i) {
		if (i == 1) {
			return true;
		}
		if (i == 2) {
			return false;
		}
		//注意这里使用sqrt 不然容易超时
		int temp = (int) Math.sqrt(i);
		int t = 2;
		for (int j = t; j <= temp; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main1(String[] args) {
		isSuShu(9);
	}
}

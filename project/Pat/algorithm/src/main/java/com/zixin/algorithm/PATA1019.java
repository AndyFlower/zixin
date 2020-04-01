package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();// 数据
		int gid = sc.nextInt();// 几进制
		int[] res = new int[40];
		int index = 0;
		do {
			res[index++] = num % gid;
			num = num / gid;
		} while (num != 0);

		boolean flag = isJuder(res, index);
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		for (int i = index - 1; i >= 0; i--) {
			if (i == index - 1) {
				System.out.printf("%d", res[i]);
			} else {
				System.out.printf(" %d", res[i]);
			}
		}

	}

	static boolean isJuder(int[] arr, int num) {
		for (int i = 0; i < num / 2; i++) {
			if (arr[i] != arr[num - 1 - i]) {
				return false;
			}
		}
		return true;
	}

}

package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1015
 * @Description: 这个题的重点是进制转换和素数的判断   全部通过
 * @author Administrator
 * @date 2020-04-05 23:38:49
 */
public class PATA1015 {

	public static void main(String[] args) {
		int[] arr = new int[111];
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n < 0) {
				break;
			}
			int r = sc.nextInt();
			if (isPrim(n) == false) {
				System.out.println("No");
			} else {
				int len = 0;
				do {
					arr[len++] = n % r;
					n = n / r;
				} while (n != 0);
				for (int i = 0; i < len; i++) {
					n = n * r + arr[i];
				}
				if (isPrim(n)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
		sc.close();
	}

	static boolean isPrim(int n) {
		if (n <= 1) {
			return false;
		}
		int sqrt = (int) Math.sqrt(n);
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

}

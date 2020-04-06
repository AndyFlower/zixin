package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1078
 * @Description: 最后一个测试点超时 
 *              这里要注意的是正向探测法 
 *              二次方探测法是 +1^2  -1^2  +2^2  -2^2  正向探测法就只是考虑正的 
 * @author Administrator
 * @date 2020-04-06 10:14:43
 */
public class PATA1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tSize = sc.nextInt();
		int numNumber = sc.nextInt();
		while (!isPrime(tSize)) {
			tSize++;
		} // 找到第一个比其大的素数

		boolean[] hashTable = new boolean[tSize];
		for (int i = 0; i < numNumber; i++) {
			int temp = sc.nextInt();
			int M = temp % tSize;
			if (hashTable[M] == false) {
				hashTable[M] = true;
				if (i == 0) {
					System.out.print(M);
				} else {
					System.out.print(" " + M);
				}
			} else {
				int step = 1;
				for (step = 1; step < tSize; step++) {
					M = (temp + step * step) % tSize;
					if (hashTable[M] == false) {
						hashTable[M] = true;
						if (i == 0) {
							System.out.print(M);
						} else {
							System.out.print(" " + M);
						}
						break;
					}
				}
				if (step >= tSize) {
					if (i > 0) {
						System.out.print(" ");
					}
					System.out.print("-");
				}
			}
		}

		sc.close();
	}

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		int seq = (int) Math.sqrt(n * 1.0);
		for (int i = 2; i <= seq; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}

package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int bai = num / 100;
		int shi = (num % 100) / 10;
		int ge = num % 10;
		if (bai != 0) {
			for (int i = 0; i < bai; i++) {
				System.out.print("B");
			}

		}
		if (shi != 0) {
			for (int i = 0; i < shi; i++) {
				System.out.print("S");
			}

		}
		for (int i = 1; i <= ge; i++) {
			System.out.print(i);
		}
	}

}

package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A1 = 0;
		int A2 = 0;
		int A3 = 0;
		int A4 = 0;
		int A5 = 0;
		boolean flag = true;
		int count = 0;
		int sum = 0;
		int num = sc.nextInt();
		int[] arrs = new int[num];
		for (int i = 0; i < num; i++) {
			arrs[i] = sc.nextInt();
			int n = arrs[i];
			// A1 能被 5 整除的数字中所有偶数的和
			if (n % 5 == 0 && n % 2 == 0) {
				A1 = A1 + n;
			}
			// A2  将被 5 除后余 1 的数字按给出顺序进行交错求和
			 if (n % 5 == 1) {
				if (flag) {
					A2 = A2 + n;
					flag = !flag;
				} else {
					A2 = A2 - n;
					flag = !flag;
				}
			}
			// A3 被 5 除后余 2 的数字的个数；
			 if (n % 5 == 2) {
				A3 = A3 + 1;
			}
			// A4 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
			if (n % 5 == 3) {
				count = count + 1;
				sum = sum + n;
			}
			// A5  被 5 除后余 4 的数字中最大数字。
			if (n % 5 == 4) {
				if (n > A5) {
					A5 = n;
				}
			}
		}
	
		sc.close();
		
		if (A1 != 0) {
			System.out.print(A1 + " ");
		} else {
			System.out.print("N" + " ");
		}
		if (A2 != 0) {
			System.out.print(A2 + " ");
		} else {
			System.out.print("N" + " ");
		}

		if (A3 != 0) {
			System.out.print(A3 + " ");
		} else {
			System.out.print("N" + " ");
		}

		if (count!=0) {
			 System.out.printf("%.1f", (1.0 * sum / count));
			 System.out.print(" ");
		} else {
			System.out.print("N" + " ");
		}

		if (A5 != 0) {
			System.out.print(A5);
		} else {
			System.out.print("N");
		}

	}

}

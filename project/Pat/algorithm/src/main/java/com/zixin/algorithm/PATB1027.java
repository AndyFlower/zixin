package com.zixin.algorithm;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PATB1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String pattern = sc.next();
		sc.close();
		// System.out.println(num+" "+pattern);

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		// 将一半的数据放入map中，然后从里面取来确定最多需要打印几行
		int sum = 1;
		for (int i = 1; i < 501 && sum < 501;) {
			hash.put(addIn(i), i);
			sum = addIn(i);
			i = i + 2;
		}

		// for(Entry<Integer,Integer> entry: hash.entrySet()) {
		// System.out.println(entry.getValue()+" "+entry.getKey());
		// }

		int temp = (num + 1) / 2;
		while (!hash.containsKey(temp)) {
			temp = temp - 1;
		}
		int maxNum = hash.get(temp);
		int skip = 0;
		for (int j = maxNum; j >= 1; j = j - 2) {
			for (int k = 0; k < skip; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < j; k++) {
				System.out.print(pattern);
			}
			skip = skip + 1;
			System.out.println();

		}
		skip = skip - 1;
		for (int j = 3; j <= maxNum; j = j + 2) {
			skip = skip - 1;
			for (int k = 0; k < skip; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < j; k++) {
				System.out.print(pattern);
			}

			System.out.println();

		}
		System.out.println(num - (temp * 2 - 1));
	}

	private static int addIn(int i) {
		int sum = 0;
		for (int j = 1; j <= i; j = j + 2) {
			sum = sum + j;

		}
		return sum;
	}
}

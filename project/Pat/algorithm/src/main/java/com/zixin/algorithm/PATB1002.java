package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1002 {
	static String[] pinyin = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu" };

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		str = sum + "";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(pinyin[str.charAt(i) - '0']);
			if (i < str.length() - 1) {
				System.out.print(" ");
			}
		}

	}

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// 将输入的字符串转换为char类型的数组
		char[] chars = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			sum = sum + (chars[i] - '0');
		}
		char[] c = (sum + "").toCharArray();
		boolean flag = false;
		for (int j = 0; j < c.length; j++) {
			if (j != c.length - 1) {
				print(c[j]);
				System.out.print(" ");

			} else {
				print(c[j]);
			}

		}

	}

	private static void print(char c) {
		switch (c) {
		case '1':
			System.out.print("yi");
			break;
		case '2':
			System.out.print("er");
			break;
		case '3':
			System.out.print("san");
			break;
		case '4':
			System.out.print("si");
			break;
		case '5':
			System.out.print("wu");
			break;
		case '6':
			System.out.print("liu");
			break;
		case '7':
			System.out.print("qi");
			break;
		case '8':
			System.out.print("ba");
			break;
		case '9':
			System.out.print("jiu");
			break;
		case '0':
			System.out.print("ling");
			break;

		}
	}
}

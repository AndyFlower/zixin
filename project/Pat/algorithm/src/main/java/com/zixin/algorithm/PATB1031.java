package com.zixin.algorithm;

import java.io.IOException;

import java.util.Scanner;

import java.util.regex.Pattern;

public class PATB1031 {

	static int[] arr = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
	static char[] m = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
	public final static String REGEX_NUMERIC = "^\\d+$";
	static Pattern pattern = Pattern.compile(REGEX_NUMERIC);
	// Matcher isNum = pattern.matcher(orginal);

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int p = Integer.parseInt(sc.next());// 输入数字个数
		String[] num = new String[p];// 保存在String数组中
		boolean flag = true;
		for (int i = 0; i < p; i++) {
			num[i] = sc.next();
		}
		sc.close();
		for (int i = 0; i < p; i++) {
			// num[i]=sc.next();
			int temp = 0;
			if (!pattern.matcher(num[i].substring(0, 17)).matches()) {
				flag = false;
				System.out.println(num[i]);
			} else {
				for (int j = 0; j < num[i].length() - 1; j++) {
					// System.out.println(num[i].charAt(j)+" "+arr[j]);
					temp = temp + (num[i].charAt(j) - '0') * arr[j];
				}
				// System.out.println(temp+" temp");
				if (m[temp % 11] == num[i].charAt(17)) {
					// System.out.println("符合");
				} else {
					flag = false;
					System.out.println(num[i]);
				}
			}
		}
		if (flag) {
			System.out.println("All passed");
		}
	}

}

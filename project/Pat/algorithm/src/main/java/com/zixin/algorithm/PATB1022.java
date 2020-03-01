package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * D进制数的A+B
 * 
 * @author Administrator
 *
 */
public class PATB1022 {
	public static void main(String[] args) throws IOException {

		StreamTokenizer scanner = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		scanner.nextToken();
		int a, b, d;
		a = (int) scanner.nval;
		scanner.nextToken();
		b = (int) scanner.nval;
		scanner.nextToken();
		d = (int) scanner.nval;
		int sum = a + b;//计算a+b
		int ans[] = new int[31];//找一个数组存放计算的每一个值
		int num = 0;
		do {
			ans[num++] = sum % d;
			sum = sum / d;

		} while (sum != 0);

		for (int i = num - 1; i >= 0; i--) {//逆序输出
			System.out.print(ans[i]);
		}
	}
}

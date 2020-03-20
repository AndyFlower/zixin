package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 从控制台读入一行文本
 * @author Administrator
 *
 */
public class P002 {
	public static void main(String[] args) throws IOException {

		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(scanner.readLine());
		
		
		Scanner s = new Scanner(System.in);
		System.out.println(s.nextLine());
		s.close();
	}
}

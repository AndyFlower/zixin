package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3n+1猜想
 * @author Administrator
 *
 */
public class PATB1001 {

	public static void main(String[] args) throws IOException {
		int n , step=0;
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		//如果这两直接用scanner.read() 结果会有问题
		n = Integer.parseInt(scanner.readLine());
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
			}else {
				n=(3*n+1)/2;
			}
			step++;
			System.out.println(step);
		}
		System.out.println(step);
	}
}

package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Codeup1934 {
	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		// java.io.StreamTokenizer.nextToken() 方法分析从标记生成器的输入流中的下一个标记
		in.nextToken();
		int n = (int) in.nval;// n个数
		int index =-1;
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			in.nextToken();
			arr[i] = (int) in.nval;
		}
		in.nextToken();
		int findx = (int) in.nval;
		for (int i = 0; i < n; i++) {
			if (arr[i] == findx) {
				index = i;
				break;
			}

		}
		System.out.print(index);
	}
}

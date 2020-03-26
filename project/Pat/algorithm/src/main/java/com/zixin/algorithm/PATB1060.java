package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1060 {
    //理解题意
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		br.close();
		int i = 0;
		for (i = num; i > 0; i--) {
			int cur = 0;
			for (int j = 0; j < num; j++) {
				if (Integer.parseInt(arr[j]) > i)
					cur++;
			}
			if (cur >= i) {
				break;
			}
		}
		System.out.println(i);

	}

}

package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1056 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		br.close();
		int sum = 0;
		int n = Integer.parseInt(arr[0])-1;
		for(int i=1;i<arr.length;i++) {
			sum=sum+Integer.parseInt(arr[i]);
		}
		System.out.println(n*sum*10+n*sum);

	}

}

package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATA1042 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());
		String[] next = br.readLine().split(" ");

		br.close();
		char mp[]= {'S','H','C','D','J'};//代表各种花色
		
		int [] start = new int[54];
		for(int i=0;i<54;i++) {
			start[i]=i+1;//初始化54张牌
		}
		
		int end[] =new int[54];
		for(int k=0;k<times;k++) {
			
		}
		
		
	}

}

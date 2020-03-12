package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1021 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int[] a = {0,0,0,0,0,0,0,0,0,0};
		 String str = br.readLine();
		 br.close();
		 char[] arr = str.toCharArray();
		 for(int i=0;i<arr.length;i++) {
			 a[arr[i]-'0']=a[arr[i]-'0']+1;
		 }
        for(int i=0;i<a.length;i++) {
        	if(a[i]!=0) {
        		System.out.println(i+":"+a[i]);
        	}
        }
	}

}

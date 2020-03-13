package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PATB1030 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int num = Integer.parseInt(s1[0]);
		int p = Integer.parseInt(s1[1]);
		int[] arr = new int[num];
		for(int i=0;i<s2.length;i++) {
			arr[i]=Integer.parseInt(s2[i]);
		}
		Arrays.sort(arr);
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i]*p;
			for(int j=arr.length-1;j>=i;j--) {
				if(temp>=arr[j]) {
					//System.out.println("j:"+j);
					if((j-i+1)>max) {
						max=j-i+1;
					}
					break;
				}else {
					j--;
				}
				
			}
			
		}
		System.out.println(max);
	}

}

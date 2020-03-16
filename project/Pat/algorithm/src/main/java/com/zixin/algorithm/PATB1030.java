package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class PATB1030 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int num = Integer.parseInt(s1[0]);
        BigInteger p = new BigInteger(s1[1]);
		int[] arr = new int[num];
		for(int i=0;i<s2.length;i++) {
			arr[i]=Integer.parseInt(s2[i]);
		}
		Arrays.sort(arr);
		int max = 0;
		/*
		 * for(int i=0;i<arr.length;i++) { int temp = arr[i]*p; for(int
		 * j=arr.length-1;j>=i;j--) { if(temp>=arr[j]) { //System.out.println("j:"+j);
		 * if((j-i+1)>max) { max=j-i+1; } break; }else { j--; }
		 * 
		 * }
		 * 
		 * }
		 */
		int result = 0, temp = 0;
	    for (int i = 0; i < num; i++) {
	        for (int j = i + result; j < num; j++) {
	            if (BigInteger.valueOf(arr[j]).compareTo(BigInteger.valueOf(arr[i]).multiply(p))<=0) {
	                temp = j - i + 1;
	                if (temp > result)
	                    result = temp;
	            } else {
	                break;
	            }
	        }
	    }
		System.out.println(result);
	}
	
}

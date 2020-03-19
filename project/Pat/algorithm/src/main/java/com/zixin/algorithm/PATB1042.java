package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1042 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] cc = br.readLine().toCharArray();
		br.close();
        int arr[] = new int[129];
        for(int i=0;i<cc.length;i++) {
        	char  c = Character.toLowerCase(cc[i]);
        	if(c>='a'&&c<='z') {
        		arr[c]=arr[c]+1;
        	}
        }
        int max = 0;
        char a=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        		a=(char)i;//注意这里
        	}
        }
        System.out.println(a+" "+max);
	}

}

package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		br.close();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			char a = Character.toLowerCase(arr[i]);
			if(a>='a'&&a<='z') {
				sum= sum+a-'a'+1;
			}
		}
		//System.out.println(sum);
		//将10进制转换为2进制 除以2取余  直到商为0
		int num1=0;
		int num0=0;
		while(sum!=0) {//记住这里的终止条件
			int t = sum%2;
			if(t==1) {
				num1++;
			}else {
				num0++;
			}
			sum=sum/2;
			
		}
		
		System.out.println(num0+" "+num1);

	}
    
}

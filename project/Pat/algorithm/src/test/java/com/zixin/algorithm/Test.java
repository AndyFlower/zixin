package com.zixin.algorithm;

public class Test {

	public static void main(String[] args) {
		int  a =12;
		int b = 2;
		int count =0;
		for(int i=0;i<=a;i++) {
			int s0=0;
			
			char arr[] = (i+"").toCharArray();
			for(int j=0;j<arr.length;j++) {
				//System.out.println("arr[j]:"+arr[j]+","+(arr[j]==1)+","+(arr[j]==0)+","+((int)arr[j]==0));
				if((arr[j]+"").equals("0")||(arr[j]+"").equals("1")) {
					s0=s0+1;
				}
				
				if(s0>b) {
					continue;
				}
			}
			//System.out.println("s0:"+s0+","+b);
			if(s0==b) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("一共有："+count+"个大数");
	}
	
}

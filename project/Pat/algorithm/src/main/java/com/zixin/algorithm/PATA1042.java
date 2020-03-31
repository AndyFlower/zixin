package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATA1042 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());
		String[] nexttemp = br.readLine().split(" ");
        int[] next = new int[55];
        for(int i=1;i<55;i++) {
        	next[i]=Integer.parseInt(nexttemp[i-1]);
        }
		br.close();
		char mp[]= {'S','H','C','D','J'};//代表各种花色
		
		int [] start = new int[55];
		for(int i=1;i<55;i++) {
			start[i]=i;//初始化54张牌
		}
		
		int end[] =new int[55];
		for(int k=0;k<times;k++) {
			for(int i=1;i<55;i++) {
				end[next[i]]=start[i];
			}
			for(int j=1;j<55;j++) {
				start[j]=end[j];//将end数组再赋给start数组
			}
		}
		
		
		for(int i=1;i<55;i++) {
			if(i!=1) {
				System.out.print(" ");
			}
			//System.out.println(start[i]);
			start[i]--;//注意这里减一的情况1-13  减一变成0-12  如果除以13就是0  对13取余是0-12  牌是从1-13 所以取余之后要再加1
			System.out.printf("%c%d",mp[(start[i])/13],start[i]%13+1);
		}
	}

}

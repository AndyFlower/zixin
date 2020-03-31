package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATA1046 {

	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String []  distemp = br.readLine().split(" ");//获得输入距离
		int queryNum = Integer.parseInt(br.readLine());
		String [] str = new String[queryNum];
		int sum=0;
		
		int []  dis = new int[distemp.length];
		for(int i=1;i<distemp.length;i++) {
			sum+=Integer.parseInt(distemp[i]);//累加sum
			dis[i]=sum;//预处理dis数组
		}
		for(int i=0;i<queryNum;i++) {
			str[i]=br.readLine();
		}
		br.close();
		for(int i=0;i<queryNum;i++) {
			int left = Integer.parseInt(str[i].split(" ")[0]);
			int right = Integer.parseInt(str[i].split(" ")[1]);
			if(left>right) {
				int temp= left;
				left = right;
				right=temp;//交换
			}
			int  distence = dis[right-1]-dis[left-1];
			System.out.println(distence<(sum-distence)?distence:sum-distence);
		}

	}

}

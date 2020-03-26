package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1061 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int stuNum = Integer.parseInt(str[0]);//学生人数
		int quesNum = Integer.parseInt(str[1]);//题目数量
		String arr[] = br.readLine().split(" ");//题目分数
		String correct[] = br.readLine().split(" ");//正确答案
		String [][] answer = new String[stuNum][quesNum];//初始化数组
		for(int i=0;i<stuNum;i++) {
			answer[i]=br.readLine().split(" ");
		}//填充数据

		br.close();
		for(int i=0;i<stuNum;i++) {
			String [] tempArr= answer[i];
			int grade = 0;
			for(int j=0;j<tempArr.length;j++) {
				if(tempArr[j].equals(correct[j])) {
					grade+=Integer.parseInt(arr[j]);
				}
			}
			System.out.println(grade);
		}
	}

}

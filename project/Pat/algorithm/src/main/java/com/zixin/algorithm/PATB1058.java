package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1058 {

	public static void main(String[] args) throws IOException {

		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String[] s1 = br.readLine().split(" ");
		int stuNum = Integer.parseInt(s1[0]);//学生数量
		int timuNum =Integer.parseInt(s1[1]);//题目数量
		for(int i=0;i<timuNum;i++) {
			String[] s = br.readLine().split(" ");
			TIMU tim= new TIMU();
			tim.setNo(i+1);
			tim.setGrade(Integer.parseInt(s[0]));
			tim.setXuanxianggeshu(Integer.parseInt(s[1]));
			tim.setCorrectGrade(Integer.parseInt(s[2]));
			String[] temp = new String[Integer.parseInt(s[2])];
			for(int j=3;j<s.length;j++) {
				temp[j-1]=s[j];
				
			}
			tim.setCorrectAnswer(temp);
		}//录入完正确答案
		for(int i=0;i<stuNum;i++) {
			String s = br.readLine();//学生作答的一行
		}
		
		
	}
	
	static class TIMU{
		int no;
		int xuanxianggeshu;
		
		public int getXuanxianggeshu() {
			return xuanxianggeshu;
		}
		public void setXuanxianggeshu(int xuanxianggeshu) {
			this.xuanxianggeshu = xuanxianggeshu;
		}
		int grade;
		int correctGrade;
		String[] correctAnswer;
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public int getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public int getCorrectGrade() {
			return correctGrade;
		}
		public void setCorrectGrade(int correctGrade) {
			this.correctGrade = correctGrade;
		}
		public String[] getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(String[] correctAnswer) {
			this.correctAnswer = correctAnswer;
		}
		
	}

}

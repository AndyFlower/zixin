package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PATA1083 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Student8[]  stu = new Student8[n];
		for(int i=0;i<n;i++) {
			String[] temp = br.readLine().split(" ");
			Student8 s= new Student8();
			s.name=temp[0];
			s.haoma=temp[1];
			s.grade=Integer.parseInt(temp[2]);
			stu[i]=s;
		}
		String[] t1 = br.readLine().split(" ");
		int from = Integer.parseInt(t1[0]);
		int to=Integer.parseInt(t1[1]);
		Arrays.sort(stu,new Comparator<Student8>() {

			@Override
			public int compare(Student8 o1, Student8 o2) {
				return o2.grade-o1.grade;

			}
		});
		
		boolean flag = false;
		for(int i=0;i<n;i++) {
			if(stu[i].grade>=from&&stu[i].grade<=to) {
				System.out.println(stu[i].name+" "+stu[i].haoma);
				flag = true;
			}
		}
		
		if(flag==false) {
			System.out.println("NONE");
		}
	}
}

class Student8{
	String name;
	String haoma;
	int grade;
}


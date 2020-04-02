package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PATA1012 {

	public static void main(String[] args) {
		String course[]= {"A","C","M","E"};
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m1=sc.nextInt();
		StudentR [] stuarr =new StudentR[n];
        for(int i=0;i<n;i++) {
        	int id = sc.nextInt();
        	int c = sc.nextInt();
        	int m=sc.nextInt();
        	int e=sc.nextInt();
        	int a = (int) (Math.round((c+m+e)*1.0/3.0)+0.5);
        	int arr[] = {a,c,m,e};
        	StudentR stu = new StudentR(id,arr );
        	stuarr[i]=stu;
        	int[] now= {0};
        	for(int  now1=now[0];now1<4;now1++) {
        		Arrays.sort(stuarr ,new Comparator<StudentR>() {

    				@Override
    				public int compare(StudentR o1, StudentR o2) {
    					// TODO Auto-generated method stub
    					return o2.getGrade()[now[0]]-o2.getGrade()[now[0]];
    				}
    			});
        	}
        	
        	
        }
	}
 
}

class StudentR{
	private int id;
	private int[] grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int[] getGrade() {
		return grade;
	}
	public void setGrade(int[] grade) {
		this.grade = grade;
	}
	public StudentR(int id, int[] grade) {
		super();
		this.id = id;
		this.grade = grade;
	}
	
}
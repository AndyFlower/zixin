package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PATA1012 {

	/**
	 * 
	 * @Title: main
	 * @Description: 超时  重调
	 * @author Administrator
	 * @date 2020-04-02 22:23:49
	 * @param @param args 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		String course[]= {"A","C","M","E"};
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m1=sc.nextInt();
		StudentR [] stuarr =new StudentR[n];
		int Rank[][]= new int [1000000][4];
        for(int i=0;i<n;i++) {
        	int id = sc.nextInt();
        	int c = sc.nextInt();
        	int m=sc.nextInt();
        	int e=sc.nextInt();
        	int a = (int) (Math.round((c+m+e)*1.0/3.0)+0.5);
        	int arr[] = {a,c,m,e};
        	StudentR stu = new StudentR(id,arr );
        	stuarr[i]=stu;
        }
        int[] now= {0};
    	for(int  now1=now[0];now1<4;now1++,now[0]++) {
    		Arrays.sort(stuarr ,new Comparator<StudentR>() {

				@Override
				public int compare(StudentR o1, StudentR o2) {
					// TODO Auto-generated method stub
					return o2.getGrade()[now[0]]-o1.getGrade()[now[0]];
				}
			});
    		Rank[stuarr[0].getId()][now[0]]=1;
    		for(int i=1;i<n;i++) {
    			if(stuarr[i].getGrade()[now[0]]==stuarr[i-1].getGrade()[now[0]]) {
    				Rank[stuarr[i].getId()][now[0]]=Rank[stuarr[i-1].getId()][now[0]];
    			}else {
    				Rank[stuarr[i].getId()][now[0]]=i+1;
    			}
    		}
    	}
    	
    	for(int i=0;i<m1;i++) {
    		int query = sc.nextInt();
    		if(Rank[query][0]==0) {
    			System.out.println("N/A");
    		}else {
    			int k=0;
    			for(int j=0;j<4;j++) {
    				if(Rank[query][j]<Rank[query][k]) {
    					k=j;
    				}
    			}
    			System.out.println(Rank[query][k]+" "+course[k]);
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
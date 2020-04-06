package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PATA1075 {
	 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int m = Integer.parseInt(s[2]);
		Student7[] stu = new Student7[10010];
		init(n,k,stu);//初始化数据
		int full[] =new int[k+1];
		
		String[] s1 = br.readLine().split(" ");
		for(int i=1;i<=k;i++) {
			full[i]=Integer.parseInt(s1[i-1]);//填充每一道题的满分
		}
		
		int u_id,P_id,score_obtained;//考生ID  题目ID   分数值
		for(int i=0;i<m;i++) {
			String[] temp = br.readLine().split(" ");
			u_id = Integer.parseInt(temp[0]);
			P_id= Integer.parseInt(temp[1]);
			score_obtained=Integer.parseInt(temp[2]);
			if(score_obtained!=-1) {//说明编译通过
				stu[u_id].flag=true;
			}
			if(score_obtained!=-1&&stu[u_id].score[P_id]==-1) {//第一次编译错误 记0分
				stu[u_id].score[P_id]=0;
			}
			if(score_obtained==full[P_id]&&stu[u_id].score[P_id]<full[P_id]) {//第一次得满分
				stu[u_id].solve++;//完美解题数+1
			}
			if(score_obtained>stu[u_id].score[P_id]) {
				stu[u_id].score[P_id]=score_obtained;//更新分数
			}
		}
		br.close();
		//计算总分
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				if(stu[i].score[j]!=-1) {
					stu[i].score_all+=stu[i].score[j];
				}
				
			}
		}
		Arrays.sort(stu,1, n+1,new ComparatorsS());//排序
		int r=1;
		for(int i=1;i<=n&&stu[i].flag==true;i++) {
			if(i>1&&stu[i].score_all!=stu[i-1].score_all) {
				r=i;
			}
			System.out.printf("%d %05d %d",r,stu[i].id,stu[i].score_all);
			
			for(int j=1;j<=k;j++) {
				if(stu[i].score[j]==-1) {
					System.out.print(" -");
				}else {
					System.out.printf(" %d",stu[i].score[j]);
				}
			}
			System.out.println();
		}

	}
	
	static void init(int n,int k,Student7[] stu) {
		for(int i=1;i<=n;i++) {
			Student7 stu1 = new Student7();
			stu1.id=i;
			stu1.score_all=0;
			stu1.solve=0;
			stu1.flag=false;
			stu1.score = new int[k+1];
			//for(int j=1;j<=k;j++) {
				//stu1.score[j]=-1;//所有分数初始化为-1
			//}
			Arrays.fill(stu1.score, -1);
			
			stu[i]=stu1;
		}
	}
}



class Student7{

	int id;//id
	int score[]; //每道题的得分
	boolean flag;//是否有能通过编译的提交
	int score_all;//总分
	int solve;//完美解题数
	public Student7() {
		super();
	}
	
	
}

class  ComparatorsS implements Comparator<Student7>{
	@Override
	public int compare(Student7 p1, Student7 p2) {
		if (p1.score_all > p2.score_all) {//先比总分
			return -1;
		} else if (p1.score_all < p2.score_all) {
			return 1;
		} else {//总分同时，比解决的题目总数
			if (p1.solve > p2.solve) {
				return -1;
			} else if (p1.solve < p2.solve) {
				return 1;
			} else {//前俩者相同，id小的在前
				return p1.id-p2.id;
 
			}
		}
	}


		
	}
	

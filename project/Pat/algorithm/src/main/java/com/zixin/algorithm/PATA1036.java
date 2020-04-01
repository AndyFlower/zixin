package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1036 {

	public static void main(String[] args) {
		SStudent1  girl=new SStudent1("","",-1);//女生最高分 初始化为-1
		SStudent1  boy=new SStudent1("","",101);//男生最低分 初始化为101

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			String name = sc.next();
			String gender = sc.next();
			String id = sc.next();
			int grade = sc.nextInt();
			if("M".equals(gender)&&grade<boy.getGrade()) {
				boy.setName(name);
				boy.setId(id);
				boy.setGrade(grade);
			}else if("F".equals(gender)&&grade>girl.getGrade()) {
				girl.setName(name);
				girl.setId(id);
				girl.setGrade(grade);
			}
		}

		sc.close();
		boolean flag = true;
		if(girl.getGrade()==-1) {
			System.out.println("Absent");
			flag =false;
		}else {
			System.out.println(girl.getName()+" "+girl.getId());
		}
		if(boy.getGrade()==101) {
			System.out.println("Absent");
			flag =false;
		}else {
			System.out.println(boy.getName()+" "+boy.getId());
		}
		if(!flag) {
			System.out.println("NA");
		}else {
			System.out.println(girl.getGrade()-boy.getGrade());
		}
	}

}

class  SStudent1{
	private String name;
	private String id;
	private int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public SStudent1(String name, String id, int grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	public SStudent1() {
		super();
	}
	
}

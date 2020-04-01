package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @author sangliping
 * @Desc 1、最容易想到的是先全部输入，然后排序取最大和最小值
 *       2、初始化一个完全不可能的值  然后进行比较  这样时间复杂度会小一些
 *
 */
public class PATA1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        SStudent late = new SStudent("",0,0,0);
        SStudent early = new SStudent("",24,59,59);
        for(int i=0;i<num;i++) {
        	SStudent s = new SStudent();
        	String name = sc.next();
        	String h = sc.next();
        	s.setName(name);
        	s.setHh(Integer.parseInt(h.split(":")[0]));
        	s.setMm(Integer.parseInt(h.split(":")[1]));
        	s.setSs(Integer.parseInt(h.split(":")[2]));
        	if(great(early,s)) {
        		early=s;
        	}
        	
        	SStudent s1 = new SStudent();
        	
        	String h1 = sc.next();
        	s1.setName(name);
        	s1.setHh(Integer.parseInt(h1.split(":")[0]));
        	s1.setMm(Integer.parseInt(h1.split(":")[1]));
        	s1.setSs(Integer.parseInt(h1.split(":")[2]));
        	if(!great(late,s1)) {
        		late=s1;
        	}
        }
        sc.close();
        System.out.println(early.getName()+" "+late.getName());
	}

	static boolean great(SStudent s1,SStudent s2) {
		if(s1.getHh()!=s2.getHh()) {
			return s1.getHh()>s2.getHh();
		}
		if(s1.getMm()!=s2.getMm()) {
			return s1.getMm()>s2.getMm();
		}
		return s1.getSs()>s2.getSs();
	}
}

class SStudent{
	private String name;
	private int hh;
	private int mm;
	private int ss;
	
	public SStudent() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHh() {
		return hh;
	}
	public void setHh(int hh) {
		this.hh = hh;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getSs() {
		return ss;
	}
	public void setSs(int ss) {
		this.ss = ss;
	}
	public SStudent(String name, int hh, int mm, int ss) {
		super();
		this.name = name;
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	
}

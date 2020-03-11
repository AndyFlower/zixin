package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PATB1015 {
     public static int min;
     public static int pre;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        min = sc.nextInt();
        pre = sc.nextInt();
        ArrayList<KStudent> list = new ArrayList<KStudent>();
        
        for(int i=0;i<total*3;i=i+3) {
        	KStudent s = new KStudent(sc.next(),sc.nextInt(),sc.nextInt());
        	list.add(s);
        }
        ArrayList<KStudent> beforeSort = new ArrayList<KStudent>();
        for(int j=0;j<list.size();j++) {
        	KStudent ks = list.get(j);
        	if(ks.getDescore()>=min&&ks.getCaiscore()>=min) {
        		if(ks.getDescore()>=pre&&ks.getCaiscore()>=pre) {
        			ks.setLv(1);
        		}else if(ks.getDescore()>=pre && ks.getCaiscore()>=min) {
        			ks.setLv(2);
        		}else if(ks.getDescore()>=min && ks.getCaiscore()>=min&&ks.getDescore()>=ks.getCaiscore()) {
        			ks.setLv(3);
        		}else if(ks.getDescore()>=min&&ks.getCaiscore()>=min){
        			ks.setLv(4);
        		}else {
        			ks.setLv(5);
        		}
        		beforeSort.add(ks);
        	}
        }
        sc.close();
        Collections.sort(beforeSort, new KStudent.Com());
        System.out.println(beforeSort.size());
        for(int i=0;i<beforeSort.size();i++) {
        	System.out.println(beforeSort.get(i).getNo()+" "+beforeSort.get(i).getDescore()+" "+beforeSort.get(i).getCaiscore());
        }
	}

}

class KStudent{
	private String no;
	private int descore;
	private int caiscore;
	private int lv;
	public KStudent(String no, int descore, int caiscore) {
		super();
		this.no = no;
		this.descore = descore;
		this.caiscore = caiscore;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getDescore() {
		return descore;
	}
	public void setDescore(int descore) {
		this.descore = descore;
	}
	public int getCaiscore() {
		return caiscore;
	}
	public void setCaiscore(int caiscore) {
		this.caiscore = caiscore;
	}
	
	
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}


	public static class Com implements Comparator<KStudent>{

		@Override
		public int compare(KStudent o1, KStudent o2) {
			//均大于预分数
			if(o1.lv<o2.lv) {
				return -1;
			}else if(o1.lv>o2.lv) {
				return 1;
			}else {
				if(o1.getDescore()+o1.getCaiscore()>o2.getDescore()+o2.getCaiscore()) {
					return -1;
				}else if(o1.getDescore()+o1.getCaiscore()<o2.getDescore()+o2.getCaiscore()) {
					return 1;
				}else {
					if(o1.getDescore()>o2.getDescore()) {
						return -1;
					}else if(o1.getDescore()<o2.getDescore()) {
						return 1;
					}else {
						if(Integer.parseInt(o1.getNo())<Integer.parseInt(o2.getNo())) {
							return -1;
						}else if(Integer.parseInt(o1.getNo())>Integer.parseInt(o2.getNo())) {
							return 1;
						}else {
							return 0;
						}
					}
				}
			}
			
	        
	        
		}
		
	}
	
	
}
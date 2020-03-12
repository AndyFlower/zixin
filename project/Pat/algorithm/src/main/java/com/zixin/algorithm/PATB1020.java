package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PATB1020 {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String[] s = sc.nextLine().split(" ");
		 String[] s = br.readLine().split(" ");
		int category =Integer.parseInt(s[0]);
		int maxNeed =Integer.parseInt(s[1]);
		
		//String[] w =sc.nextLine().split(" ");
		//String[] q =sc.nextLine().split(" ");
		String[] w =br.readLine().split(" ");
		String[] q =br.readLine().split(" ");
		//sc.close();
		List<Packet> li = new ArrayList<Packet>();
		for (int j = 0; j < category; j++) {
			double m = Double.parseDouble(w[j]);
            double p = Double.parseDouble(q[j]);
            double value = p / m;
			Packet c = new Packet(m,p,value);
			li.add(c);
		}
		Collections.sort(li);
		/*
		 * for(int i=0;i<li.size();i++) {
		 * System.out.println(li.get(i).getNum()+" "+li.get(i).getTotal()); }
		 */
		double res = 0D;
		for(int i=0;i<li.size();i++) {
			if(maxNeed-li.get(i).getNum()>=0) {
				maxNeed=maxNeed-(int)li.get(i).getNum();
				res=res+li.get(i).getTotal();
			}else if(maxNeed-li.get(i).getNum()<=0&&maxNeed>0) {
				res=res+li.get(i).getPrice()*maxNeed;
				break;
			}
		}
		System.out.printf("%.2f",res);
		
	}
}

class Packet implements Comparable<Packet> {
	private double num;
	private double total;
	private double price;


	public Packet(double num, double total, double price) {
		super();
		this.num = num;
		this.total = total;
		this.price = price;
	}

	@Override
	public int compareTo(Packet o) {
	    return this.getPrice()>o.getPrice()?-1:1;
		
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

}

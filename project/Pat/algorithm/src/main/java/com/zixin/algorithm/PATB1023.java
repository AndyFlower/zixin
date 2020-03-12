package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1023 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String[] a = br.readLine().split(" ");
		 br.close();
		 
		 if(Integer.parseInt(a[0])==0) {
			 for(int i=1;i<a.length;i++) {
				 if(Integer.parseInt(a[i])!=0) {
					 for(int j=0;j<Integer.parseInt(a[i]);j++) {
						 System.out.print(i);
						 
					 }
				 }
			 }
		 }else {
			 //有0的情况
			 //找第一个不为0的数
			 for(int i=1;i<a.length;i++) {
				 if(Integer.parseInt(a[i])!=0) {
					 System.out.print(i);
					 a[i]=Integer.parseInt(a[i])-1+"";
					 break;
				 }
			 }
			 for(int i=0;i<a.length;i++) {
				 if(Integer.parseInt(a[i])!=0) {
					 for(int j=0;j<Integer.parseInt(a[i]);j++) {
						 System.out.print(i);
						 
					 }
				 }
			 }
		 }

	}

}

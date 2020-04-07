package com.zixin.algorithm;

import java.util.Scanner;
import java.util.Vector;

public class PATA1103 {
	static Vector<Integer> fac =new Vector<Integer>();
	static Vector<Integer> ans =new Vector<Integer>();
	static Vector<Integer> temp =new Vector<Integer>();
	static int n;
	static int k;
	static int maxFacSum=-1;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 n=sc.nextInt();
		 k=sc.nextInt();
		int p=sc.nextInt();
		sc.close();
	    init(n,p);
	    DFS(fac.size()-1,0,0,0);
	    if(maxFacSum==-1) {
	    	System.out.println("Impossible");
	    }else {
	    	System.out.printf("%d = %d^%d",n,ans.elementAt(0),p);
	    	for(int i=1;i<ans.size();i++) {
	    		System.out.printf(" + %d^%d",ans.elementAt(i),p);
	    	}
	    }
		
	}
	
	static void init(int n,int p) {
		int i=0;
		int temp=0;
		while(temp<=n) {
			fac.add(temp);
			temp=(int) Math.pow(++i, p);
		}
	}
	
	static void DFS(int index,int nowK,int sum,int facSum) {
		if(sum==n&&nowK==k) {
			if(facSum>maxFacSum) {
				ans = temp;
				maxFacSum=facSum;
			}
			return;
			
		}
		if(sum>n||nowK>k) {
			return;
		}
		if(index-1>=0) {
			temp.add(index);//把底数加入
			DFS(index,nowK+1,sum+fac.elementAt(index),facSum+index);
			temp.remove(index);
			DFS(index-1,nowK,sum,facSum);
		}
	}

}

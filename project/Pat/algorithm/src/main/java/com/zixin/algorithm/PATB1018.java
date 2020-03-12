package com.zixin.algorithm;

import java.io.IOException;

import java.util.Scanner;

public class PATB1018 {
	static final String C="C";
	static final String J="J";
	static final String B="B";
	static String[] res = {"B","C","J"};
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[][] arrs = new String[num][2];
        for(int i=0;i<num;i++) {
        	arrs[i][0]=sc.next();
        	arrs[i][1]=sc.next();
        }
        sc.close();
        //甲的胜利  平局 失败
        int arra[] = new int[3];
        int arraa[] = new int[3];
        //乙的胜利  平局 失败
        int arrb[] = new int[3];
        int arrbb[] = new int[3];
        for(int i=0;i<arrs.length;i++) {
        	int ba = battle(arrs[i][0],arrs[i][1]);
        	if(ba==1) {
        		arra[0]=arra[0]+1;
        		arrb[2]=arrb[2]+1;
        		if(arrs[i][0].equals(B)) {
        			arraa[0]=arraa[0]+1;
        		}else if(arrs[i][0].equals(C)) {
        			arraa[1]=arraa[1]+1;
        		}else {
        			arraa[2]=arraa[2]+1;
        		}
        	}else if(ba==0) {
        		arra[1]=arra[1]+1;
        		arrb[1]=arrb[1]+1;
        	}else {
        		arrb[0]=arrb[0]+1;
        		arra[2]=arra[2]+1;
        		if(arrs[i][1].equals(B)) {
        			arrbb[0]=arrbb[0]+1;
        		}else if(arrs[i][1].equals(C)) {
        			arrbb[1]=arrbb[1]+1;
        		}else {
        			arrbb[2]=arrbb[2]+1;
        		}
        	}
        }
        print(arra);
        print(arrb);
        //print(arraa);
        //print(arrbb);
        System.out.print(res[getMax(arraa)]+" "+res[getMax(arrbb)]);
        
	}
	
	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+" ");
			}else {
				System.out.print(arr[i]);
			}
		
		}
		System.out.println();
	}
	private static int getMax(int[] arr) {
		int a = arr[0];
		int r=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>a) {
				a=arr[i];
				r=i;
			}
		
		}
		return r;
	}
	private static int battle(String first,String second) {
		if(first.equals(second)) {
			return 0;
		}else if((first.equals(C)&&second.equals(J))||(first.equals(J)&&second.equals(B))||(first.contentEquals(B)&&second.equals(C))) {
			return 1;
		}else if((second.equals(C)&&first.equals(J))||(second.equals(J)&&first.equals(B))||(second.contentEquals(B)&&first.equals(C))) {
			return -1;
		}
		return 0;
	}
	
	public static void main1(String[] args) {
		System.out.println(battle("C","B"));
	}
}

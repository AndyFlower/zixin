package com.zixin.algorithm;

import java.io.IOException;

import java.util.Scanner;

public class PATB1018 {
	static final String C="C";
	static final String J="J";
	static final String B="B";
	public static void main1(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arrs = new String[num];
        for(int i=0;i<num;i++) {
        	arrs[i]=sc.nextLine();
        }
	}
	
	
	private static int battle(String first,String second) {
		if(first.equals(second)||(first.equals(C)&&second.equals(B))||(first.equals(B)&&second.equals(C))) {
			return 0;
		}else if((first.equals(C)&&second.equals(J))||(first.equals(J)&&second.equals(B))||(first.contentEquals(B)&&second.equals(C))) {
			return 1;
		}else if((second.equals(C)&&first.equals(J))||(second.equals(J)&&first.equals(B))||(second.contentEquals(B)&&first.equals(C))) {
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(battle("C","B"));
	}
}

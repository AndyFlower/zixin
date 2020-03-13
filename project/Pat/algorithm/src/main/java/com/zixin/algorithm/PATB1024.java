package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class PATB1024 {

	public static void main1(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		br.close();
		int index = a.indexOf("E");
		//System.out.println(index);
		char[] a1 = a.substring(0, index).toCharArray();
		char[] a2 = a.substring(index + 1, a.length()).toCharArray();
		//System.out.println(Arrays.toString(a1) + " " + Arrays.toString(a2));
		if (a2[0] == '+') {//加号是向后移
			int num = Integer.parseInt(a.substring(index + 2, a.length()));
			int tempNum = -1;
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] == '.') {
					tempNum = 0;
				} else {
					System.out.print(a1[i]);
				}
				if (a1[i] != '.' && tempNum >= 0) {
					tempNum=tempNum+1;
				}

			}
			for(int j=0;j<num-tempNum;j++) {
				System.out.print("0");
			}
		}else if(a2[0] == '-'&& a1[0] == '+' ) {//等于-需要向左移
			int num = Integer.parseInt(a.substring(index + 2, a.length()));
			System.out.print("0.");
			for(int i=0;i<num-1;i++) {
				System.out.print("0");
			}
			for(int i=1;i<a1.length;i++) {
				if(a1[i]!='.') {
					System.out.print(a1[i]);
				}
			}
		}else if(a2[0] == '-'&& a1[0] == '-' ) {
			int num = Integer.parseInt(a.substring(index + 2, a.length()));
			System.out.print("-0.");
			for(int i=0;i<num-1;i++) {
				System.out.print("0");
			}
			for(int i=1;i<a1.length;i++) {
				if(a1[i]!='.') {
					System.out.print(a1[i]);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        BigDecimal bd = new BigDecimal(val);
        System.out.println(bd.toPlainString());
    }
	
}

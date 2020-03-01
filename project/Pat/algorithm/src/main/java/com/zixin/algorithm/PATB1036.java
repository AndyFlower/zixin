package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
/**
 * 
 * @author Administrator
 * @desc 考虑列数为奇数和偶数的情况，将输出分为3部分 第一行   第2到n-1行 第n行 
 */
public class PATB1036 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer scanner = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		scanner.nextToken();
		int row,col;
		String c;
		col = (int)scanner.nval;//获得列数
		scanner.nextToken();
		c = scanner.sval;//获得要填充的字符串
		if(col%2==1) {
			row = col/2+1;//奇数时四舍五入
		}else {
			row = col/2;//偶数时
		}
		for(int i=0;i<col;i++) {
			System.out.print(c);
		}
		System.out.println();
		for(int i=2;i<col;i++) {
			System.out.print(c);
			for(int j=0;j<col-2;j++) {
				System.out.print(" ");
			}
			System.out.print(c);
			System.out.println();
		}
		for(int i=0;i<col;i++) {
			System.out.print(c);
		}

	}

}

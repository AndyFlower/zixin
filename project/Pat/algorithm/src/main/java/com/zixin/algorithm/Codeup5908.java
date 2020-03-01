package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 回文串
 * 
 * @author Administrator
 *
 */
public class Codeup5908 {
	public static void main(String[] args) throws IOException {
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		String str = scanner.readLine();
		String[] strs = new String[str.length()];
		for(int i=0;i<str.length();i++) {
			strs[i]=str.substring(i,i+1);
		}
		boolean flag = judge(strs);
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	/**
	 * 注意这里用equals ，如果用==比较的是地址  不相等
	 * @param str
	 * @return
	 */
	private static boolean judge(String[] str) {
		int len = str.length;//字符串长度
		for(int i=0;i<len/2;i++) {//i枚举字符串的前一半
			if(!str[i].equals(str[len-i-1])) {
				return false;//不是回文串
			}
		}
		
		return true;//是回文串
		
	}

}

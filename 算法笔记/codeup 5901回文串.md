## 题目

题目描述
读入一串字符，判断是否是回文串。“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。

输入
一行字符串，长度不超过255。

输出
如果是回文串，输出“YES”，否则输出“NO”。

样例输入
12321
样例输出
YES

## 思路

假设字符串从下标0开始，由于回文串是正读和反读都一样，因此只需要遍历字符串中的前一半（不需要到i=len/2）,如果出现str[i]不等于其对称位置str[len-i-1],那么久说明这个字符串不是回文串；如果前一半的所有字符str[i]都等于对应的对称位置str[len-i-1],那么说明这个字符串是回文串。

## 答案

```java
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

```


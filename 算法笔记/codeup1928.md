## 题目

Codeup1928
有两个日期，求两个日期之间的天数，如果两个日期是连续的我们规定他们之间的天数为两天。
输入

有多组数据，每组数据有两行，分别表示两个日期，形式为YYYYMMDD
1
输出

每组数据输出一行，即日期差值
1
输入样例

20130101
20130105
1
2
输出样例

**5**

## 思路分析

不妨假设第一个日期早于第二个日期（否则交换即可）；

直接思路：令日期不断加1天，知道第一个日期等于第二个为止，具体处理时，如果当加了一天之后天数d等于当前月份m所拥有的天数加1，那么就另月份m+1，同时天数d为1，如果月份变为了13，那么久另年份y+1，同时置月份m为1.

定义一个二维数组，存放每个月的天数，其中第二维为0表示平年，为1时表示闰年



## 答案

```java
package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.StreamTokenizer;
/**
 * 令日期不断加1天，知道第一个日期等于第二个为止，具体处理时，如果当加了一天之后天数d等于当前月份m所拥有的天数加1，那么就另月份m+1，同时天数d为1，如果月份变为了13，那么久另年份y+1，同时置月份m为1.

定义一个二维数组，存放每个月的天数，其中第二维为0表示平年，为1时表示闰年
 * @author Administrator
 * 未考虑日期输入的合法性
 *
 */
public class Codeup1928 {
	static int month[][] = { { 0, 0 }, { 31, 31 }, { 28, 29 }, { 31, 31 }, { 30, 30 }, { 31, 31 }, { 30, 30 }, { 31, 31 },
			{ 31, 31 }, { 30, 30 }, { 31, 31 }, { 30, 30 }, { 31, 31 } };

	public static void main(String[] args) throws IOException {

		//变量记录结果
		int ans = 1;
		int time1,y1,m1,d1;
		int time2,y2,m2,d2;
		StreamTokenizer scanner = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		scanner.nextToken();
		time1 = (int)scanner.nval;
		scanner.nextToken();
		time2 = (int)scanner.nval;
		//如果日期1大于日期2进行交换
		if(time1>time2) {
			int temp = time1;
			time1=time2;
			time2=temp;
		}
		y1=time1/10000;
		m1=time1%10000/100;
		d1=time1%100;
		y2=time2/10000;
		m2=time2%10000/100;
		d2=time2%100;
		//当第一个日期没有达到第二个日期时进行循环
		//即!((y1==y2)&&(m1==m2)&&(d1==d2))
		while(y1<y2||m1<m2||d1<d2) {
			d1++;//天数加1
			if(d1==month[m1][isLeapYear(y1)]+1) {//满当月天数
				m1++;//日期变为下个月1号
				d1=1;
			}
			if(m1==13) {
				y1++;//日期变为下一年
				m1=1;
			}
			ans++;//累计
		}
		System.out.println(ans);
	}

	/**
	 * @desc 判断是否为闰年
	 * @param year
	 * @return
	 */
	private static int isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			return 1;
		}
		if (year % 400 == 0) {
			return 1;
		}
		return 0;
	}
}

```


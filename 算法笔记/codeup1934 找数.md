## 问题

Codeup 1934 找x

时间限制 1 Sec 内存限制 32 MB

题目描述

输入一个数n，然后输入n个数值各不相同，再输入一个值x，输出这个值在这个数组中的下标（从0开始，若不在数组中则输出-1）。

输入
测试数据有多组，输入n(1<=n<=200)，接着输入n个数，然后输入x。

输出
对于每组输入,请输出结果。

样例输入
4
1 2 3 4
3

样例输出

2

## 思路

题目要求从从n个数之中找到值等于x的数并返回其在数组中的下标，即这n个数是从0开始计数的，并且要求如果这n个数中没有等于x的数要打印输出-1。

题目整体不难，根据描述思路很清晰，即：

step 1，输入n个数存放到数组a；
step 2，循环遍历比较每个数组元素与x是否相等；
step 3，当发现与x相等的数组元素时跳出循环，并且输出该元素的数组下标k；
step 4，如果遍历完整个数组之后也即k == n时仍然没有与x相等的元素，则直接打印输出-1。

## 答案

```java
package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Codeup1934 {
	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		// java.io.StreamTokenizer.nextToken() 方法分析从标记生成器的输入流中的下一个标记
		in.nextToken();
		int n = (int) in.nval;// n个数
		int index =-1;
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			in.nextToken();
			arr[i] = (int) in.nval;
		}
		in.nextToken();
		int findx = (int) in.nval;
		for (int i = 0; i < n; i++) {
			if (arr[i] == findx) {
				index = i;
				break;
			}

		}
		System.out.print(index);
	}
}


```


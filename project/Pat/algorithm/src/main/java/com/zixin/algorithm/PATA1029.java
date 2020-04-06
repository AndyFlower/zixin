package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1029
 * @Description: 双指针法
 * @author Administrator
 * @date 2020-04-05 17:02:36
 */
public class PATA1029 {

	/**
	 * 
	 * @Title: main1
	 * @Description: 测试点3错误  后面有超时
	 * @author Administrator
	 * @date 2020-04-05 17:01:13
	 * @param @param args
	 * @param @throws IOException 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void main1(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		int n = Integer.parseInt(arr1[0]);

		int m = Integer.parseInt(arr2[0]);
		int mid = (n + m - 1) / 2;
		int i = 1;
		int j = 1;
		int count = 0;
		while (i <= n && j <= m && count < mid) {
			if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[j])) {
				i++;
				count++;
			} else {
				j++;
				count++;
			}
		}

		if (i <= n & count < mid) {
			i++;
			count++;

		}
		if (j <= m & count < mid) {
			j++;
			count++;

		}
		if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[j])) {
			System.out.println(arr1[i]);
		} else {
			System.out.println(arr2[j]);
		}
	}
	/**
	 * 
	 * @Title: main
	 * @Description: 有超时  将每个数组的最后一个设置成一个很大的数 就不用考虑一个完了再遍历另一个  只需要一个while就可以
	 * @author Administrator
	 * @date 2020-04-05 17:01:37
	 * @param @param args 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr1=new int[n+1];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		arr1[n]=Integer.MAX_VALUE;
		int m=sc.nextInt();
		int [] arr2=new int[m+1];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		sc.close();
		arr2[m]=Integer.MAX_VALUE;
		int mid = (n+m-1)/2;
		int i=0,j=0,count=0;
		while(count<mid) {
			if(arr1[i]<arr2[j]) {
				i++;
			}else {
				j++;
			}
			count++;
		}
		if(arr1[i]<arr2[j]) {
			System.out.println(arr1[i]);
		}else {
			System.out.println(arr2[j]);
		}
	}

}

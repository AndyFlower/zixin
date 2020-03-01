package com.zixin.algorithm;
/**
 * 数组初始化
 * @author Administrator
 *
 */
public class P001 {

	public static void main(String[] args) {
		//动态初始化 数据类型[] 变量名 = new  数据类型[数组长度];
		int [] arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		//静态初始化 数据类型[]  变量名 = new  数据类型[]{1，2， 3};
		int [] arr1 = {1,2,3};
		int [] arr2 = new int[] {1,2,3};
		
	}
}

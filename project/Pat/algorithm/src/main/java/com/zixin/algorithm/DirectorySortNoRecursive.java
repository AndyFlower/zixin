package com.zixin.algorithm;

import java.util.Arrays;

/**
 * @Desc  从右往左，找出第一个左边小于右边的数 下标为a  
 *        从右往左 找出第一个大于a下标的数  下标为b 
 *        交换下标a 和下标b
 *        将a下标后的数据从小到大排列 
 * @author Administrator
 *
 */
public class DirectorySortNoRecursive {

	public static void main(String[] args) {
		String s = "1234";
		char[] data = s.toCharArray();
		Prim(data);


	}
	
	public static void Prim(char[] data) {
		Arrays.sort(data);
		System.out.println(data);
		while (nextPermutate(data)) {
			System.out.println(data);
		}

	}
	
	private static boolean nextPermutate(char[] data) {
		int end = data.length-1;
		int swapPoint1 = end,swapPoint2=end;
		while(swapPoint1 > 0 && data[swapPoint1] <= data[swapPoint1 - 1]) {
			swapPoint1--;
		}
		if(swapPoint1==0) {
			return false;
		}else {
			while(swapPoint2 > 0 && data[swapPoint2] <= data[swapPoint1-1]) {
				swapPoint2--;
			}
			swap(data, swapPoint1 - 1, swapPoint2);
			reverse(data, swapPoint1, end);
            return true;
		}
		
	}
	/**
	 * @Desc  交换元素
	 * @param data
	 * @param left
	 * @param right
	 */
	private static void swap(char[] data, int left, int right) {
		char temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}
 
	/**
	 * @Desc 数组逆序
	 * @param data
	 * @param left
	 * @param right
	 */
	private static void reverse(char[] data, int left, int right) {
		for (int i = left, j = right; i < j; i++, j--)
			swap(data, i, j);
	}

}

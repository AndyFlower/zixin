package com.zixin.algorithm;

/**
 * @Desc 直接插入排序
 * 每一步将一个待排序的元素，按其排序码的大小，插入到前面已经排好序的一组元素的适当位置上去，
 * 直到元素全部插入为止。
 * @author Administrator
 *
 */
public class DirectInsertSort {

	public static void main(String[] args) {
		int [] A = {2,3,1,4,6,9,5};
		for(int i=1;i<A.length;i++) {//进行n-1趟排序
			int temp  = A[i];//temp临时存放A[i] j从i开始往前枚举
			int j=i;
			while(j>=1 && temp<A[j-1]) {//只要temp小于前一个元素A[j-1]
				A[j]=A[j-1];//把A[j-1]后移一位A[j]
				j--;
			}
			A[j]=temp;
		}
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}

	}

}

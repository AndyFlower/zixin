package com.zixin.algorithm;

/**
 * @Desc 快速排序 对一个序列A中的元素A[1]到A[n] 令i从1到n枚举，进行n趟操作，每趟从待排序部分[i,n]中选择最小的元素，令其与待排序部分的第一个元素A[i]进行交换，这样元素A[i]就会与当前有序区间[1,i-1]形成新的有序区间，于是在n趟之后，所有元素就会有序
 * 可以看出每一趟之后，都有一个元素会到达最终位置
 * @author Administrator
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int A[] = {3,1,5,4,9,2};
		for(int i=0;i<A.length;i++) {//进行n趟操作
          int k=i;
          for(int j=i;j<A.length;j++) {//选出[i,n]中最小的元素，下标为k
        	  if(A[j]<A[k]) {
        		  k=j;
        	  }
          }
          int temp=A[i];
          A[i]=A[k];
          A[k]=temp;
		}
		
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}

	}
	
	

}

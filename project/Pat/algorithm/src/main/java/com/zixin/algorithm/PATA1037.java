package com.zixin.algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1037
 * @Description:  解题思路：贪心策略
 *                将元素按从小到大的顺序排序，对每一个集合按两部分正数和负数来处理， 0不考虑 因为0不影响结果对于正数肯定是大的乘以大的，
 *                对于负数肯定是小的乘以小的。  负负得正  越小的数乘积之后会越大  所以分两步从两头处理
 * @author Administrator
 * @date 2020-04-05 13:51:33
 */
public class PATA1037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m= sc.nextInt();
		int arr2[] = new int[n];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		int res=0;
		while( i<n&&j<m&&arr[i]<0&&arr2[j]<0) {
			res+=arr[i]*arr2[j];
			i++;j++;
		}
		i=n-1;
		j=m-1;
		while(i>=0&&j>=0&&arr[i]>0&&arr2[j]>0) {
			res+=arr[i]*arr2[j];
			i--;
			j--;
		}
		System.out.println(res);
       
	}

}

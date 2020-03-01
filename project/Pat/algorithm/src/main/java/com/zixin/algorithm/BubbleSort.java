package com.zixin.algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {3,1,4,5,2};
		for(int i=1;i<=4;i++) {//进行n-1趟比较
			//第i趟都从a[0]到a[n-i-1]都与他们下一个数比较
			for(int j=0;j<5-i;j++) {
				if(a[j]>a[j+1]) {//左边大，则交换
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println(i+":"+a[i]);
		}

	}

}

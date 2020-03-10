package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1008 {

	//不知道这个为啥不对
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//数组元素个数
        int index = sc.nextInt();//需要逆转的位置
        int [] arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        sc.close();
        reverse(arr,0,arr.length-index-1);
        reverse(arr,arr.length-index,arr.length-1);
        reverse(arr,0,arr.length-1);
        print(arr);
	}

	private static void reverse(int [] arr,int from ,int to) {
		while(from <to) {
			int temp = arr[from];
			arr[from] = arr[to];
			arr[to]=temp;
			from++;
			to--;
		}
		
		//print(arr);
	}
	
	private static void print(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+" ");
			}else {
				System.out.print(arr[i]);
			}
			
		}
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int a[] = new int[N];
        int i, j;
        for (i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        in.close();
        for (i = 0; i < M; i++) {
            int tmp = a[N - 1];
            for (j = N - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = tmp;
        }
        for (i = 0; i < N - 1; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[N - 1]);
    }
}

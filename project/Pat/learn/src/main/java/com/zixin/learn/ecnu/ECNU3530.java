package com.zixin.learn.ecnu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ECNU3530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.next();
        }
        sc.close();
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for(int i=n-1;i>=0;i--) {
        	System.out.print(arr[i]);
        }

	}

}

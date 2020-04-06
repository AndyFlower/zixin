package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @ClassName: PATA1048
 * @Description: 3 4测试点均超时   Scanner和BufferedReader一样
 * @author Administrator
 * @date 2020-04-04 19:32:41
 */
public class PATA1048 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[] = new int[1005];
		for(int i=0;i<n;i++) {
			int c= sc.nextInt();
			arr[c]=arr[c]+1;
		}
		sc.close();
		boolean flag = false;
		for(int i=0;i<(m+5)/2;i++) {//这里只循环一半的数据 也还是3 4 超时
			if(arr[i]!=0&&arr[m-i]!=0) {
				if(i==m-i&&arr[i]>1) {
					
					System.out.println(i+" "+(m-i));
					flag=true;
					break;
				}else if(i!=m-i) {
					System.out.println(i+" "+(m-i));
					flag=true;
					break;
				}
			}
		}
		if(!flag) {
			System.out.println("No Solution");
		}
		

	}
	
}

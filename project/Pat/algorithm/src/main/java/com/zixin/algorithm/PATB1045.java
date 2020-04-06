package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 给a[i]做个递增排序。如果一个元素动了那么肯定不满足要求。所以首先是排序后不动。其次它得大于左边所有数字的最大值。
 * @author sangliping
 *
 */
public class PATB1045 {

	/**
	 * 
	 * @Title: main
	 * @Description: 法1
	 * @author Administrator
	 * @date 2020-04-05 17:10:51
	 * @param @param args
	 * @param @throws IOException 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void main1(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);  使用Scanner  只有一个通过剩下全超时，换成下面这个有一个不超时  待优化
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//buff加快读取速度
		 StreamTokenizer st = new StreamTokenizer(bf);
        //int  num = sc.nextInt();
		st.nextToken();
		int  num=(int)st.nval;
        int [] arr = new int[num];
        int [] bak = new int[num];
        for(int i=0;i<num;i++) {
        	st.nextToken();
        	arr[i]=(int)st.nval;
        	bak[i]=arr[i];
        }
        int max=0;
        bf.close();
        Arrays.sort(arr);
        int length=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num;i++) {
        	
        	if(arr[i]==bak[i]&&bak[i]>max) {
        		length=length+1;
        		if(sb.length()==0) {
        			sb.append(bak[i]);
        		}else {
        			sb.append(" "+bak[i]);
        		}
        		
        	}
        	if(bak[i]>max) {
        		max=bak[i];
        	}
        }
        System.out.println(length);
        System.out.println(sb.toString());
       
	}
	/**
	 * 
	 * @Title: main
	 * @Description: 遍历数组获得数组左边的最大值和右边的最小值  然后判断 如果左小右大 则说明符合要求
	 *               超时 需要优化
	 * @author Administrator
	 * @date 2020-04-05 21:14:47
	 * @param @param args 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		int[] leftMax = new int[n];
		int[] rightMin= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
		leftMax[0]=0;//A[0]左边没比他大的数
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(leftMax[i-1],arr[i-1] );
		}
		rightMin[n-1]=Integer.MAX_VALUE;
		for(int i=n-2;i>=0;i--) {
			rightMin[i]=Math.min(rightMin[i+1], arr[i+1]);
			
		}
		int num=0;
		int res[] =new int[n];
		for(int i=0;i<n;i++) {
			if(leftMax[i]<arr[i]&&rightMin[i]>arr[i]) {
				res[num++]=arr[i];
			}
		}
		System.out.println(num);
		for(int i=0;i<num;i++) {
			if(i==0) {
				System.out.print(res[0]);
			}else {
				System.out.print(" "+res[i]);
			}
		}
		
	}

}

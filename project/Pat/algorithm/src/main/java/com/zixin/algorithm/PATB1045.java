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

	public static void main(String[] args) throws IOException {
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

}

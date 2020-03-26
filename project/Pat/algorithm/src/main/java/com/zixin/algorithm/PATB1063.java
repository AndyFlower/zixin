package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;

public class PATB1063 {

	/**
	 * 暴力循环有一个超时  
	 * 先排序 再选最后一个还是有一个超时
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String [] arr = new String[num];
		for(int i=0;i<num;i++) {
			arr[i]=br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int a1= Math.abs(Integer.parseInt(o1.split(" ")[0]));
				int a2 = Math.abs(Integer.parseInt(o1.split(" ")[1]));
				int b1= Math.abs(Integer.parseInt(o2.split(" ")[0]));
				int b2 = Math.abs(Integer.parseInt(o2.split(" ")[1]));
				return (a1*a1+a2*a2)-(b1*b1+b2*b2);
			}
		});
		//System.out.println(Arrays.toString(arr));
		/*
		 * double t1 = 0; for(int i=0;i<num;i++) { String[] temp = arr[i].split(" ");
		 * int a1 = Integer.parseInt(temp[0]); int a2 = Integer.parseInt(temp[1]);
		 * double a = Math.sqrt(a1*a1+a2*a2); if(a>t1) { t1=a; } }//循环完之后找出了最大值
		 */
		int a1 = Integer.parseInt(arr[num-1].split(" ")[0]);
		int a2 = Integer.parseInt(arr[num-1].split(" ")[1]);
		System.out.println(new   java.text.DecimalFormat("#.00").format(Math.sqrt(a1*a1+a2*a2)));
	}
	//格式化2位输出
	public static String formatDouble4(double d) {
        DecimalFormat df = new DecimalFormat("#.00");

        
        return df.format(d);
    }

}

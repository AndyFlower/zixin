package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @ClassName: PATA1038
 * @Description: 解题思路：如果S1+S2<S2+S1 将S1排在前面  这个是重点  否则只按照字典序的话  32   321这两个数字的顺序将出现问题
 * 
 * 问题：最后一个测试点超时
 * @author Administrator
 * @date 2020-04-05 14:43:45
 */
public class PATA1038 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		br.close();
		Arrays.sort(arr, 1, arr.length, new Comparator<String >() {

			@Override
			public int compare(String o1, String o2) {
				return (o1+o2).compareTo(o2+o1);
			}
		});

		String res="";
		for(int i=1;i<arr.length;i++) {
		res+=arr[i];
		}
		while(res.length()!=0&&res.charAt(0)=='0') {
			res = res.substring(1, res.length());
		}
		if(res.length()==0) {
			System.out.println("0");
		}else {
			System.out.println(res);
		}
		
		
		}
	

}

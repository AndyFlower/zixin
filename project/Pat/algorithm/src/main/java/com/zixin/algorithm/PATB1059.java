package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PATB1059 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		HashMap<String,Integer> ha = new HashMap<String,Integer>();
		
		for(int i=0;i<num;i++) {
			ha.put(br.readLine(), i+1);
		}//保存完排名
		int searchNum = Integer.parseInt(br.readLine());
		String[] arr = new String[searchNum];
		for(int i=0;i<searchNum;i++) {
			arr[i]=br.readLine();//将查询的放入数组
		}
		br.close();
		for(int i=0;i<searchNum;i++) {
			String key = arr[i];
			if(!ha.containsKey(key)) {
				System.out.println(key+": Are you kidding?");
			}else {
				Integer value = ha.get(key);
				if(value==-1) {
					System.out.println(key+": Checked");
				}else if(value==1) {
					System.out.println(key+": Mystery Award");
					ha.put(key, -1);
				}else {
					if(isSuShu(value)) {
						System.out.println(key+": Minion");
						ha.put(key, -1);
					}else {
						System.out.println(key+": Chocolate");
						ha.put(key, -1);
					}
				}
				
			}
		}

	}
	
	private static boolean isSuShu(int n) {
		int k =(int) Math.sqrt(n)+1;
		for(int i=2;i<k;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	
}

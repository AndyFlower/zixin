package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PATB1033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Character> ha = new HashMap<Character, Character>();
		char[] s = sc.next().toCharArray();
		char[] res = sc.next().toCharArray();// 真实输入的字符串
		sc.close();
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < s.length; i++) {
			ha.put(Character.toLowerCase(s[i]), Character.toLowerCase(s[i]));// 将所有坏掉的键放入map中
		}
		if (ha.containsKey('+')) {
			for (int i = 0; i < s.length; i++) {
				ha.put(s[i], s[i]);
			}
		}
		if(ha.containsKey('+')) {
			for (int j = 0; j < res.length; j++) {
				if(ha.containsKey(res[j])||(res[j]>=65&&res[j]<=90)) {
					continue;
				}else {
					sb.append(res[j]);
				}
			}
		}else {
			for (int j = 0; j < res.length; j++) {
				if(ha.containsKey(res[j])) {
					continue;
				}else {
					sb.append(res[j]);
				}
			}
		}
	
		System.out.println(sb.toString());
	}
	public static void mainBest(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//buff加快读取速度
		 //StreamTokenizer st = new StreamTokenizer(bf);这个还没有完全搞懂，不过好像这玩意能更快
		String temp = bf.readLine();
		char[] broken = (temp+temp.toLowerCase()).toCharArray();//记录坏键
		//这里是个加快的原因，因为坏键撑死一百以内个，所以这里直接把所有的键位对应小写都变成坏键，并不会增加多少循环
		//后面直接比对就好了
		char[] type = bf.readLine().toCharArray();//记录需要打的键
		StringBuilder sb = new StringBuilder("");//用这个string变量来添加，比String块太多了，也比每次比对完就输出要快，输出很费事的
		Arrays.sort(broken);//因为要使用二分查找，所以先排序，默认字典顺序
		if(Arrays.binarySearch(broken, '+')==-1) {//判断是否大小写
			//大小写没坏，可以输出大写字母
			for(int i=0;i<type.length;i++) {
				if(Arrays.binarySearch(broken,type[i])<0) {
					sb.append(type[i]);//不是坏键，原样添加
				}
			}
		}
		else {//不可以输出大写字母
			for(int i=0;i<type.length;i++) {
				if((64<type[i] && type[i]<91)) {
					continue;//大写字母直接跳过
				}else {
					if(Arrays.binarySearch(broken,type[i])<0)
						sb.append(type[i]);	//这里的肯定不是大写字母，直接输出
				}
			}
		}
		System.out.println(sb);//输出结果
	}
}

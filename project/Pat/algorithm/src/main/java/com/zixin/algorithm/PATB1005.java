package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PATB1005 {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//输入数据，初始化集合
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int j = 0; j < n; j++) {
			int k = s.nextInt();
			list.add(k);
		}
		s.close();
		isOver(list);
	}
	@SuppressWarnings("unchecked")
	public static void isOver(ArrayList list) {
		int p = 0;

		//k是集合的长度
		int k = list.size();
		//循环
		while (p != list.size()) {
			k = list.size();
			int m = (int) list.get(p);//当前处理的数
			while (m != 1) {//不等于的时候
				if (m % 2 == 0) {//被2整除 
					m = m / 2;
					for (int i1 = 0; i1 < list.size(); i1++) {
						if ((int) list.get(i1) == m) {//如果有原集合中有当前的数，则移除
							list.remove(i1);
						}
					}
				} else {//不能被2整除
					m = (3 * m + 1) / 2;
					for (int i2 = 0; i2 < list.size(); i2++) {
						if ((int) list.get(i2) == m) {//如果有原集合当中的数，则移除
							list.remove(i2);
						}
					}
				}
			}

			if (k == list.size()) {
				p++;
			}

		}
		Collections.sort(list);
		//逆序输出
		for (int i3 = list.size() - 1; i3 >= 0; i3--) {
			System.out.print((int) list.get(i3));
			if(i3!=0) {
				System.out.print(" ");
			}

		}
		
	}

	
}

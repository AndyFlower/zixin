package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PATB1039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		HashMap<String, Integer> ha = new HashMap<String, Integer>();
		boolean flag = true;// 默认是够的
		for (int i = 0; i < s1.length(); i++) {
			String te = s1.charAt(i) + "";
			if (ha.containsKey(te)) {
				ha.put(te, ha.get(te) + 1);
			} else {
				ha.put(te, 1);
			}
		}
		for (int j = 0; j < s2.length(); j++) {
			String t = s2.charAt(j) + "";
			if (ha.containsKey(t)) {
				ha.put(t, ha.get(t) - 1);
				if (ha.get(t) < 0) {// 小于0说明是不够的
					flag = false;// 不够的话将flag设置为false
				}
			} else {
				// 不包含的情况
				ha.put(t, -1);
			}
		}
		int res = 0;
		if (flag) {

			Iterator<Entry<String, Integer>> it = ha.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();

				res += entry.getValue();

			}
			System.out.print("Yes" + " " + res);
		} else {
			Iterator<Entry<String, Integer>> it = ha.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
                if(entry.getValue()<0) {
                	res += entry.getValue();
                }

			}
			System.out.print("No" + " " + -res);
		}

	}
	//来自网络 提交通过
	public static void correct(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c1 = br.readLine().toCharArray();
        char[] c2 = br.readLine().toCharArray();
        int[] flag = new int[256];
        for (int i = 0; i < c1.length; i++) {
            flag[c1[i]]++;
        }
        int count = c2.length;
        for (int i = 0; i < c2.length; i++) {
            if (flag[c2[i]] != 0){
                flag[c2[i]]--;
                count--;
            }
        }
        if (count == 0) {
            System.out.print("Yes " + (c1.length - c2.length));
        }else {
            System.out.print("No " + count);
        }
    }
}

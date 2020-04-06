package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PATA1041 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			arr[i] = k;
			if (!m.containsKey(k)) {
				m.put(k, 1);
			} else {
				m.put(k, m.get(k) + 1);
			}

		}
		sc.close();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (m.containsKey(arr[i]) && m.get(arr[i]) == 1) {
				System.out.println(arr[i]);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("None");
		}
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortAscend(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new ArrayList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			@Override
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				int compare = (o1.getValue()).compareTo(o2.getValue());
				return compare;
			}
		});

		Map<K, V> returnMap = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			returnMap.put(entry.getKey(), entry.getValue());
		}
		return returnMap;
	}

}

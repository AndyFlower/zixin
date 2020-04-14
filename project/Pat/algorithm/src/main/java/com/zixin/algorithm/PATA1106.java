package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Title: PATA1106.java
 * @Package com.zixin.algorithm
 * @Description: 描述
 * @author: Sanglp
 * @date: 2020年4月14日 下午11:33:01
 * @version V1.0 qq交流群：1027372701
 */
public class PATA1106 {

	static ArrayList<Integer>[] tree;
	static int minDepth = Integer.MAX_VALUE;
	static double minPrice = Double.MAX_VALUE;
	static int num;
	static boolean isNotRoot[];
	static double p;
	static double r;

	/**
	 * 
	 * @Title: main   
	 * @Description: 答案正确 但是有超时 需改进 
	 * @param: @param args      
	 * @return: void      
	 * @throws
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		p = sc.nextDouble();
		r = sc.nextDouble() / 100.00;
		sc.nextLine();
		isNotRoot = new boolean[n];
		tree = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<>();
			String[] str = sc.nextLine().split(" ");
			// System.out.println(Arrays.toString(str));
			if (str.length > 1) {
				for (int j = 1; j < str.length; j++) {
					isNotRoot[Integer.parseInt(str[j])] = true;
					tree[i].add(Integer.parseInt(str[j]));
				}
			}

		}
		sc.close();
		// System.out.println(findRoot());
		DFS(findRoot(), 0);
		System.out.printf("%.4f %d", minPrice, num);

	}

	static int findRoot() {
		for (int i = 0; i < tree.length; i++) {
			if (!isNotRoot[i]) {
				return i;
			}
		}
		return -1;
	}

	static void DFS(int index, int depth) {
		if (tree[index].size() == 0) {
			double price = p * Math.pow(1 + r, depth);
			if (price < minPrice) {
				minPrice = price;
				num = 1;
			} else if (price == minPrice) {
				num++;
			}
		}
		for (int i = 0; i < tree[index].size(); i++) {
			DFS(tree[index].get(i), depth + 1);
		}
	}
}

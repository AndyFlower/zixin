package com.zixin.learn.other;

import java.util.Scanner;

/**
 * @Title: Dfs02.java
 * @Package com.zixin.learn.other
 * @Description: 类似0-1背包问题
 * @author: Sanglp
 * @date: 2020年4月11日 下午5:17:45
 * @version V1.0 qq交流群：1027372701
 */
public class Dfs02 {

	static int x;// 最大载重量
	static int n;// n件物品
	static float W[];// 重量
	static float V[];// 价值
	static float best;
	static boolean flag[];
	static int b[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		n = sc.nextInt();
		W = new float[n + 1];
		V = new float[n + 1];
		flag = new boolean[n + 1];
		b = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			W[i] = sc.nextFloat();
			V[i] = sc.nextFloat();
		}
		sc.close();
		dfs(1, 0, 0);
		System.out.println(best);
		for (int i = 1; i <= n; i++) {
			if (b[i] != 0) {
				System.out.print(b[i] + " ");
			}
		}

	}

	static void dfs(int k, float weight, float price) {
		if (price > best) {// 搜索的边界问题 如果搜索到最大值 则更新最大值并且更小最大路径
			best = price;
			for (int i = 1; i <= n; i++) {
				if (flag[i]) {
					b[i] = i;
				}
			}

		}
		if (k > n) {
			return;
		}
		flag[k] = true;// 默认先选第k件物品
		dfs(k + 1, weight + W[k], price + V[k]);
		flag[k] = false;// 不选第k件物品
		dfs(k + 1, weight, price);

	}

}

package com.zixin.learn;

/**
 * 
 * @ClassName: ZeroOneBagProblem
 * @Description:0-1背包问题
 * @author: Sanglp
 * @date: 2020年4月8日 下午6:14:55
 * @Copyright:
 */
public class ZeroOneBagProblem {
	private int[] v;
	private int[] w;
	private int[][] c;
	private int weight;

	public ZeroOneBagProblem(int length, int weight, int[] vin, int[] win) {
		v = new int[length + 1];
		w = new int[length + 1];
		c = new int[length + 1][weight + 1];
		this.weight = weight;
		for (int i = 0; i < length + 1; i++) {
			v[i] = vin[i];
			w[i] = win[i];
		}
	}

	public void solve() {
		for (int i = 1; i < v.length; i++) {
			for (int k = 1; k <= weight; k++) {
				if (w[i] <= k) {
					if (v[i] + c[i - 1][k - w[i]] > c[i - 1][k]) {
						c[i][k] = v[i] + c[i - 1][k - w[i]];
					}else {
						c[i][k] = c[i - 1][k];
					}
				} else {
					c[i][k] = c[i - 1][k];
				}
			}
		}
	}

	public void printResult() {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j <= weight; j++)
				System.out.printf("%3d ",c[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] v = { 0, 60, 100, 120 };
		int[] w = { 0, 10, 20, 30 };
		int weight = 50;
		ZeroOneBagProblem knapsack = new ZeroOneBagProblem(3, weight, v, w);
		knapsack.solve();
		knapsack.printResult();
	}
}

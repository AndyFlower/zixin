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
	private int[] value;
	private int[] weight;
	private int[][] c;
	private int maxWeight;

	public ZeroOneBagProblem(int length, int maxWeight, int[] vin, int[] win) {
		value = new int[length + 1];
		weight = new int[length + 1];
		c = new int[length + 1][maxWeight + 1];
		this.maxWeight = maxWeight;
		for (int i = 0; i < length + 1; i++) {
			value[i] = vin[i];
			weight[i] = win[i];
		}
	}

	public void solve() {
		for (int i = 1; i < value.length; i++) {
			for (int k = 1; k <= maxWeight; k++) {
				if (weight[i] <= k) {
					if (value[i] + c[i - 1][k - weight[i]] > c[i - 1][k]) {
						c[i][k] = value[i] + c[i - 1][k - weight[i]];
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
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j <= maxWeight; j++)
				System.out.printf("%3d ",c[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] value = { 0, 60, 100, 120 };//背包的价值
		int[] w = { 0, 10, 20, 30 };//背包的重量
		int maxWeight = 50;
		ZeroOneBagProblem knapsack = new ZeroOneBagProblem(3, maxWeight, value, w);
		knapsack.solve();
		knapsack.printResult();
	}
}

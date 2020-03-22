package com.zixin.algorithm;

public class LC134 {
	/**
	 * 
	 * @Title: canCompleteCircuit @Description: 暴力算法 @author Administrator @date
	 * 2020-03-21 11:16:29 @param @param gas @param @param cost @param @return
	 * 参数 @return int 返回类型 @throws
	 */
	public int canCompleteCircuitForce(int[] gas, int[] cost) {

		int n = gas.length;
		for (int i = 0, j; i < n; i++) {
			int gas_left = 0;
			for (j = 0; j < n; j++) {
				int k = (i + j) % n;
				gas_left += gas[k] - cost[k];
				if (gas_left < 0) {
					break;
				}
			}
			if (j >= n) {
				return i;
			}

		}
		return -1;
	}
	
	public int canCompleteCircuit(int[] gas, int[] cost) {

		int n = gas.length;
		for (int i = 0, j; i < n; i+=j+1) {//优化的部分  如果i走到j失败了 那么i和j之间的所有的点都会失败  因为i点可以加油 最差的情况是加的油刚好够走  所以如果加上i的油都不够 那么其他的肯定也不够 
			int gas_left = 0;
			for (j = 0; j < n; j++) {
				int k = (i + j) % n;
				gas_left += gas[k] - cost[k];
				if (gas_left < 0) {
					break;
				}
			}
			if (j >= n) {
				return i;
			}

		}
		return -1;
	}
}

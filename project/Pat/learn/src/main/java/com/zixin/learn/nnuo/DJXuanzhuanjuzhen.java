package com.zixin.learn.nnuo;

public class DJXuanzhuanjuzhen {

	public static void main(String[] args) {
		// printrec90(3, 3);
		// printrec180(3,3);
		printrec180fa2(3, 3);
	}

	// 顺时针旋转90度 原来n*m
	private static void printrec90(int n, int m) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[j][m - i - 1] = arr[i][j];// 重点是这里
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

	// 顺时针旋转180度 原来n*m 法一 旋转2次90度
	private static void printrec180(int n, int m) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[j][m - i - 1] = arr[i][j];// 重点是这里
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[j][m - i - 1] = b[i][j];// 重点是这里
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	// 顺时针旋转180度 原来n*m 法二 旋转2次90度
	private static void printrec180fa2(int n, int m) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[n - i - 1][m - j - 1] = arr[i][j];// 重点是这里
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

	// 旋转矩阵
	/**
	 * 
	 * @Title: print1134
	 * @Description: 
	 * @author Administrator
	 * @date 2020-03-25 23:01:29
	 * @param @param n
	 * @param @param m 参数
	 * @return void 返回类型
	 * @throws
	 * 1 8 7 
	 * 2 9 6
	 * 3 4 5
	 */
	private static void print1134(int n, int m) {
		
	}
}

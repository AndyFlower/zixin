package com.zixin.learn.nnuo;

public class DJFanzhuanjuzhen {

	public static void main(String[] args) {
		fanzhuan1134();

	}

	//DJ 1134 上下翻转
	private static void fanzhuan1134() {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b=new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=arr[3-i-1][j];//重点是这个公式
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}

package com.zixin.learn.nnuo;

public class PrintShape {

	public static void main(String[] args) {
		printTrapezoidReverse(3,5);

	}

	/**
	 * 左低右高三角形
	 * 
	 * @param n
	 */
	private static void printTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 左高右低三角形
	 * 
	 * @param n
	 */
	private static void prinTriangleReverse(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}
	}

	/**
	 * 正三角形
	 * 
	 * @param n
	 */
	private static void printRegularTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < ((2 * n - 1) - (2 * i - 1)) / 2; j++) {// 减去* 再除以
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {// 每一行是2*i-1个*
				System.out.print("*");
			}

			System.out.println();
		}
	}

	private static void printRegularTriangleReverse(int n) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < ((2 * n - 1) - (2 * i - 1)) / 2; j++) {// 减去* 再除以
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {// 每一行是2*i-1个*
				System.out.print("*");
			}

			System.out.println();
		}
	}

	/**
	 * 输出梯形
	 * 
	 * @param m 第一行几个
	 * @param n 最后一行几个
	 */
	private static void printTrapezoid(int m, int n) {
      for(int i=m;i<=n;i++) {
    	  for(int j=0;j<i&&j<=n;j++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
	}
	
	/**
	 * 输出逆梯形
	 * 
	 * @param m 第一行几个
	 * @param n 最后一行几个
	 */
	private static void printTrapezoidReverse(int m, int n) {
      for(int i=m;i<=n;i++) {
    	  for(int j=0;j<n-i;j++) {
    		  System.out.print(" ");
    	  }
    	  for(int j=0;j<i&&j<=n;j++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
	}

	/**
	 * 输入一个整数n表示菱形的对角半长度 用*画出菱形
	 * 
	 * @param m
	 * @param n
	 */
	private static void printRhombus(int n) {
         for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=n-i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=n-i+1;j<n+i;j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }//上三角
         for(int i=n-1;i>=1;i--) {
        	 for(int j=1;j<=n-i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=n-i+1;j<n+i;j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         
	}
	
	/**
	 * 杨辉三角输出
	 * @param n
	 */
	private static void printPascalTriangle(int n) {
		int [][] arr = new int [n+1][n+1];//列+1 最前面一列放0  公式变成a[i][j]=a[i-1][j-i]+a[i-1][j]
		arr[1][1]=1;
		for(int i=2;i<n+1;i++) {
			for(int j=1;j<i+1;j++) {
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}

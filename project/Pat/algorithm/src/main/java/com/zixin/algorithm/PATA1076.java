package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName:  PATA1076   
 * @Description:TODO(描述这个类的作用)   
 * @author: Sanglp
 * @date:   2020年4月24日 上午9:17:39      
 * qq交流群：1027372701
 */
public class PATA1076 {

	private static int Graph[][];
	private static int MAX_DEPTH;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		Graph = new int[n+1][n+1];//初始化图的大小
		MAX_DEPTH = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int num = sc.nextInt();
			for(int j=0;j<num;j++) {
				Graph[sc.nextInt()][i]=1;//A关注B  线应该是B指向A
			}
		}
		
		int searchNum = sc.nextInt();
		int [] search = new int[searchNum];
		for(int i=0;i<searchNum;i++) {
			search[i]=sc.nextInt();//需要查找的人数ID
		}
		sc.close();//输入流关闭
      
	}

}

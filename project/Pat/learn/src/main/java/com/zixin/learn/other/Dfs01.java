package com.zixin.learn.other;

import java.util.Scanner;
/**  
 * @Title:  Dfs01   
 * @Description:    描述   
 * @author: Sanglp     
 * @date:   20200411 17:11:00  
 * @version V1.0 
 * qq交流群：1027372701
 */ 
public class Dfs01 {
	static int n = 0;
	static int a[];
	static boolean flag[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		flag = new boolean[n + 1];
		a = new int[n + 1];
		sc.close();
		dfs(1);
	}

	/**
	 * 
	 * @Title: dfs   
	 * @Description: 回溯算法  
	 * @param: @param k      当前填空的位置
	 * @return: void      
	 * @throws
	 */
	static void dfs(int k) {// n表示需要填空的数
		if (k > n) {//边界条件 也就是递归的退出条件 是k已经到达n的大小
			for (int i = 1; i <= n; i++) {//到了以后我们就将其输出
				System.out.print(a[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!flag[i]) {//如果数据没有使用过
				a[k] = i;//我们就使用
				flag[i] = true;//并将标记记为true
				dfs(k + 1);//接着填下一个 
				flag[i] = false;// 搜索完之后需要将标记恢复默认 也就是走完一趟的时候要标记位要清除
			}
		}

	}

}

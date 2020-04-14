package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1090
 * @Description:树的深度遍历
 * @author: Sanglp
 * @date: 2020年4月14日 上午10:13:53 
 * qq交流群：1027372701
 */
public class PATA1090 {

	static ArrayList<Integer>[] tree ;
	static double p;
	static double r;
	static int n;
	static int maxDepth = 0;// 最大深度
	static int num = 0;// 最大深度节点个数

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		p=sc.nextDouble();
		r=sc.nextDouble()/100.0;
		int father;
		int root=0;
		tree = new ArrayList[n];
		for(int i=0;i<n;i++) {
			tree[i]=new ArrayList<>();
		}
		for(int i=0;i<n;i++) {
			father=sc.nextInt();
		
			if(father!=-1) {
				tree[father].add(i);//i是father的子节点
			}else {
				root=i;//根节点为root
			}
		}
		sc.close();
		DFS(root,0);
		//System.out.println(maxDepth);
		System.out.printf("%.2f %d",p*Math.pow(1.0+r, maxDepth),num);
	}

	/**
	 * 
	 * @Title: DFS   
	 * @Description: 深度优先遍历
	 * @param: @param index
	 * @param: @param depth      
	 * @return: void      
	 * @throws
	 */
	static void DFS(int index, int depth) {
		if (tree[index].size() == 0) {// 到达叶节点
			if(depth>maxDepth) {
				maxDepth=depth;
				num=1;
			}else if(depth==maxDepth) {
				num++;
			}
			return;
		}
		for(int i=0;i<tree[index].size();i++) {
			DFS(tree[index].get(i),depth+1);
		}
	}
}

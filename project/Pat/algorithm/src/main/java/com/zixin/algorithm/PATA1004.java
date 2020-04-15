package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @ClassName: PATA1004
 * @Description:TODO(描述这个类的作用)
 * @author: Sanglp
 * @date: 2020年4月15日 上午8:54:36 qq交流群：1027372701
 */
public class PATA1004 {

	static ArrayList<Integer> tree[];
	static boolean isNotRoot[];//保存是否为根节点
	static int leafNum[];
	static int h[];//广度优先遍历使用
	static int maxDepth=0;//深度优先遍历使用
	static int max_h=0;//广度优先遍历使用
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		tree = new ArrayList[n+1];
		for (int i = 0; i <= n; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		leafNum = new int[n+1];
		h = new int[n+1];
		isNotRoot = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			int parent = sc.nextInt();
			int num = sc.nextInt();
			for (int j = 0; j < num; j++) {
				int child = sc.nextInt();
				isNotRoot[child] = true;
				tree[parent].add(child);
			}
		}
		sc.close();
		int root = findRoot();
		//广度优先
		BFS(root);
		for(int i=0;i<=max_h;i++) {
			if(i==0) {
				System.out.print(leafNum[i]);
			}else {
				System.out.print(" "+leafNum[i]);
			}
		}
		//深度优先
		DFS(root,1);
		
		 for(int i=1;i<=maxDepth;i++) {
			 if(i==1) {
				 System.out.print(leafNum[i]);
			}else{ 
				System.out.print(" "+leafNum[i]); 
			} 
		}
		 
	}

	/**
	 * 
	 * @Title: findRoot   
	 * @Description: 寻找根节点
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	static int findRoot() {
		for (int i = 1; i < isNotRoot.length; i++) {
			if (!isNotRoot[i]) {
				return i;

			}
		}
		return -1;
	}
	
	static void DFS(int index,int depth) {
		if(depth>maxDepth) {
			maxDepth=depth;
		}
		if(tree[index].size()==0) {
			leafNum[depth]++;
		}
		for(int i=0;i<tree[index].size();i++) {
			DFS(tree[index].get(i),depth+1);
		}
	}
	
	/**
	 * 
	 * @Title: BFS   
	 * @Description: 广度优先是利用一个栈进行操作  根节点入栈   然后根据出栈元素 将其所有子节点进行入栈  因为栈先进先出 可以做到每一层  从左往右依次遍历 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void BFS(int root) {
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(tree.length);
		queue.add(root);//根节点入栈
		while(!queue.isEmpty()) {
			int front = queue.peek();//
			queue.remove();
			max_h = Math.max(h[front], max_h);
			if(tree[front].size()==0) {
				leafNum[h[front]]++;
			}
			for(int i=0;i<tree[front].size();i++) {
				h[tree[front].get(i)]=h[front]+1;
				queue.add(tree[front].get(i));
			}
		}
		
	}
}

package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**  
 * @Title:  PATA1102.java   
 * @Package com.zixin.algorithm   
 * @Description:    反转二叉树   
 * @author: Sanglp     
 * @date:   2020年4月11日 下午11:10:26   
 * @version V1.0 
 * qq交流群：1027372701
 */
public class PATA1102 {

	static int maxN =110;
	static TreeNode102 [] arr = new TreeNode102[maxN];
	static boolean[] notRoot = new boolean[maxN];
	static int num = 0;
	static int n=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 n=sc.nextInt();
		 Arrays.fill(arr, 0, maxN-1, new TreeNode102(-1,-1));
		 for(int i=0;i<n;i++) {
			String s1=sc.next();
			String s2 = sc.next();
			if(s1.equals("-")) {
				arr[i].lchild=-1;
			}else {
				arr[i].lchild=Integer.parseInt(s1);
				notRoot[Integer.parseInt(s1)]=true;
			}
			if(s2.equals("-")) {
				arr[i].rchild=-1;
			}else {
				arr[i].rchild=Integer.parseInt(s2);
				notRoot[Integer.parseInt(s2)]=true;
			}
		 }
		 sc.close();
		 int root = findRoot();
		 postOrder(root);
		 BFS(root);
		 inOrder(root);

	}
	
	static int findRoot() {
		for(int i=0;i<n;i++) {
			if(!notRoot[i]) {
				return i;//返回根节点
			}
		}
		return -1;
	}
	static void inOrder(int root) {
		if(root==-1) {
			return;
		}
		inOrder(arr[root].lchild);
		print(root);
		inOrder(arr[root].rchild);
	}
	
	/**
	 * 
	 * @Title: postOrder   
	 * @Description: 后序遍历用于交换节点 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void postOrder(int root) {
		if(root==-1) {
			return;
		}
		postOrder(arr[root].lchild);
		postOrder(arr[root].rchild);
		int temp = arr[root].lchild;
		arr[root].lchild = arr[root].rchild;
		arr[root].rchild=temp;//交换左右孩子节点
	}
	static void BFS(int root) {
		Queue<Integer> que = new ArrayBlockingQueue<Integer>(maxN);
		que.add(root);
		while(!que.isEmpty()) {
			int now = que.peek();
			que.remove();
			System.out.println(now);
			if(arr[now].lchild!=-1) {
				que.add(arr[now].lchild);
			}
			if(arr[now].rchild!=-1) {
				que.add(arr[now].rchild);
			}
		}
		
	}
	static void print(int id) {
		System.out.print(id);
		num++;
		if(num<n) {
			System.out.print(" ");
		}else {
			System.out.println();
		}
	}
}

class TreeNode102{
	int lchild;
	int rchild;
	
	public TreeNode102() {
		super();
	}

	public TreeNode102(int lchild, int rchild) {
		super();
		this.lchild = lchild;
		this.rchild = rchild;
	}
	
}

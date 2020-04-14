package com.zixin.algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Title: PATA1020.java
 * @Package com.zixin.algorithm
 * @Description: 描述
 * @author: Sanglp
 * @date: 2020年4月11日 下午7:26:57
 * @version V1.0 qq交流群：1027372701
 */
public class PATA1020 {
	static int pre[];
	static int in[];
	static int post[];

	static boolean flag=true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		post = new int[n];
		in = new int[n];
		for (int i = 0; i < n; i++) {
			post[i] = sc.nextInt();
		} // 后序便利
		for (int i = 0; i < n; i++) {
			in[i] = sc.nextInt();
		} // 中序遍历

		sc.close();
		TreeNode20 root = createTree(0,n-1,0,n-1);
		BFS(root);
	}

	
	static  void BFS(TreeNode20 root) {
		Queue<TreeNode20> que = new ArrayDeque<TreeNode20>();
		que.add(root);//将根节点入队列
		while(!que.isEmpty()) {//只要队列非空
			TreeNode20 now = que.peek();//取出队首
			que.remove();//移除
			if(flag) {
				System.out.print(now.data);//访问元素
				flag = false;
			}else {
				System.out.print(" "+now.data);
			}
			
			if(now.lchild!=null) {//左不空
				que.add(now.lchild);//左入队
			}
			if(now.rchild!=null) {//右不空
				que.add(now.rchild);//右入队
			}
		}
	}
	static TreeNode20 createTree(int postL, int postR, int inL, int inR) {
		if (postL > postR) {// 后序长度小于等于0 直接返回
			return null;
		}

		TreeNode20 root = new TreeNode20();// 创建一个新节点，用来存放当前二叉树的根节点
		root.data = post[postR];// 后序遍历的最后一个值是当前树的根节点
		int k;
		for (k = inL; k <= inR; k++) {// 循环遍历中序 直到找到根节点的值
			if (in[k] == post[postR]) {
				break;
			}
		}
		int numLeft = k - inL;// 左子树的长度
		root.lchild = createTree(postL, postL + numLeft - 1, inL, k - 1);// 递归创建左子树
		root.rchild = createTree(postL + numLeft, postR - 1, k + 1, inR);// 递归创建右子树
		return root;// 返回根节点
	}
}

class TreeNode20 {

	int data;
	TreeNode20 lchild;
	TreeNode20 rchild;
}

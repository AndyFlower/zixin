package com.zixin.algorithm;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Title: PATA1086.java
 * @Package com.zixin.algorithm
 * @Description: 已知先序和中序求后序
 * @author: Sanglp
 * @date: 2020年4月11日 下午10:43:36
 * @version V1.0 qq交流群：1027372701
 */
public class PATA1086 {

	static int pre[];
	static int in[];
	static int post[];
	static boolean flag = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		pre = new int[n];
		in = new int[n];
		int preIndex = 0;
		int inIndex = 0;
		for (int i = 0; i < n * 2; i++) {
			String str = sc.next();
			if (str.equals("Push")) {
				int s = sc.nextInt();
				stack.push(s);
				pre[preIndex++] = s;
			} else if (str.equals("Pop")) {
				in[inIndex++] = stack.pop();
			}
		}
		sc.close();
		TreeNode86 root = createTree(0, n - 1, 0, n - 1);
		postOrder(root);
	}

	/**
	 * 
	 * @Title: postOrder @Description:后序遍历 递归版本 @param: @param root 根节点 @return:
	 * void @throws
	 */
	static void postOrder(TreeNode86 root) {
		if (root == null) {
			return;
		}
		postOrder(root.lchild);
		postOrder(root.rchild);
		if (flag) {
			System.out.print(root.data);
			flag = false;
		} else {
			System.out.print(" " + root.data);
		}

	}

	/**
	 * 
	 * @Title: createTree @Description: 根据先序和中序建立树 @param: @param
	 * preL @param: @param preR @param: @param inL @param: @param
	 * inR @param: @return @return: TreeNode86 @throws
	 */
	static TreeNode86 createTree(int preL, int preR, int inL, int inR) {
		if (preL > preR) {
			return null;
		}
		TreeNode86 root = new TreeNode86();
		root.data = pre[preL];
		int k;
		for (k = inL; k < inR; k++) {
			if (in[k] == pre[preL]) {// 从中序中找到根节点
				break;
			}
		}
		int numLeft = k - inL;// 左子树的长度
		root.lchild = createTree(preL + 1, preL + numLeft, inL, k - 1);// 递归创建左子树
		root.rchild = createTree(preL + numLeft + 1, preR, k + 1, inR);// 递归创建右子树
		return root;// 返回整棵树的根节点
	}
}

class TreeNode86 {
	int data;
	TreeNode86 lchild;
	TreeNode86 rchild;
}
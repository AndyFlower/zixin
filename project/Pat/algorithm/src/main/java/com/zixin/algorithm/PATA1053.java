package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1053
 * @Description:根据权重计算和
 * @author: Sanglp
 * @date: 2020年4月15日 上午11:29:09 
 * qq交流群：1027372701
 */
public class PATA1053 {

	static TreeNode53[] tree;
	static int nodeNum;// 节点个数
	static int noneLeafNum;// 节点个数
	static int sum;// 和值
	static boolean isNotRoot[];
	static int[] path;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nodeNum = sc.nextInt();
		noneLeafNum = sc.nextInt();
		sum = sc.nextInt();
		tree = new TreeNode53[nodeNum + 1];
		isNotRoot = new boolean[nodeNum];
		path = new int[nodeNum];
		for (int i = 0; i < nodeNum; i++) {// 初始化数据节点
			TreeNode53 node = new TreeNode53();
			node.child = new ArrayList<Integer>();
			node.data = sc.nextInt();
			tree[i] = node;
		}
		for (int i = 0; i < noneLeafNum; i++) {
			int parent = sc.nextInt();
			int childNum = sc.nextInt();
			for (int j = 0; j < childNum; j++) {
				int child = sc.nextInt();
				isNotRoot[child] = true;
				tree[parent].child.add(child);
			}
			Collections.sort(tree[parent].child, new Comparator<Integer>() {//这里是为了方便排序输出

				@Override
				public int compare(Integer arg0, Integer arg1) {
					return tree[arg1].data-tree[arg0].data;
					
				}
			});

		}
		sc.close();
		int i = findRoot();// 找到根节点
		path[0]=i;
		DFS(i, 1, tree[i].data);
	}

	static int findRoot() {
		for (int i = 0; i < nodeNum; i++) {
			if (!isNotRoot[i]) {
				return i;
			}
		}
		return -1;
	}

	static void DFS(int index, int numNode, int dfssum) {
		if (dfssum > sum) {// 如果已经大于了 就要退出
			return;
		}
		if (dfssum == sum) {// 等于的情况下
			if (tree[index].child.size() > 0) {//如果还不是叶节点 说明再往下加肯定都大于  也直接退出
				return;
			}
			for (int i = 0; i < numNode; i++) {//输出
				if (i == 0) {
					System.out.print(tree[path[i]].data);
				} else {
					System.out.print(" " + tree[path[i]].data);
				}

			}
			System.out.println();
			return;
		}

		for (int i = 0; i < tree[index].child.size(); i++) {
			path[numNode] = tree[index].child.get(i);
			DFS(tree[index].child.get(i), numNode + 1, tree[tree[index].child.get(i)].data + dfssum);
		}
	}
}

class TreeNode53 {
	int data;
	ArrayList<Integer> child;
}
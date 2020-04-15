Given a non-empty tree with root *R*, and with weight *W**i* assigned to each tree node *T**i*. The **weight of a path from \*R\* to \*L\*** is defined to be the sum of the weights of all the nodes along the path from *R* to any leaf node *L*.

Now given any weighted tree, you are supposed to find all the paths with their weights equal to a given number. For example, let's consider the tree showed in the following figure: for each node, the upper number is the node ID which is a two-digit number, and the lower number is the weight of that node. Suppose that the given number is 24, then there exists 4 different paths which have the same given weight: {10 5 2 7}, {10 4 10}, {10 3 3 6 2} and {10 3 3 6 2}, which correspond to the red edges in the figure.

![img](https://images.ptausercontent.com/212)

### Input Specification:

Each input file contains one test case. Each case starts with a line containing 0<*N*≤100, the number of nodes in a tree, *M* (<*N*), the number of non-leaf nodes, and 0<*S*<230, the given weight number. The next line contains *N* positive numbers where *W**i* (<1000) corresponds to the tree node *T**i*. Then *M* lines follow, each in the format:

```
ID K ID[1] ID[2] ... ID[K]

```

where `ID` is a two-digit number representing a given non-leaf node, `K` is the number of its children, followed by a sequence of two-digit `ID`'s of its children. For the sake of simplicity, let us fix the root ID to be `00`.

### Output Specification:

For each test case, print all the paths with weight S in **non-increasing** order. Each path occupies a line with printed weights from the root to the leaf in order. All the numbers must be separated by a space with no extra space at the end of the line.

Note: sequence {*A*1,*A*2,⋯,*A**n*} is said to be **greater than** sequence {*B*1,*B*2,⋯,*B**m*} if there exists 1≤*k*<*m**i**n*{*n*,*m*} such that *A**i*=*B**i* for *i*=1,⋯,*k*, and *A**k*+1>*B**k*+1.

### Sample Input:

```in
20 9 24
10 2 4 3 5 10 2 18 9 7 2 2 1 3 12 1 8 6 2 2
00 4 01 02 03 04
02 1 05
04 2 06 07
03 3 11 12 13
06 1 09
07 2 08 10
16 1 15
13 3 14 16 17
17 2 18 19 
```

### Sample Output:

```out
10 5 2 7
10 4 10
10 3 3 6 2
10 3 3 6 2  
```

### Special thanks to Zhang Yuan and Yang Han for their contribution to the judge's data.

### 题意

给定一棵树和每个节点的权值，求所有从根节点到叶节点的节点的路径，使得每条路径上节点的权值之和等于给定的常数S，如果有多条路径，按路径非递增的顺序输出

### 代码

```java
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
```

### 提交

![PATA 1053提交](image\PATA 1053提交.png)
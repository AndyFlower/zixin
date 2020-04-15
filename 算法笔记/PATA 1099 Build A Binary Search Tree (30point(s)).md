A Binary Search Tree (BST) is recursively defined as a binary tree which has the following properties:

- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
- Both the left and right subtrees must also be binary search trees.

Given the structure of a binary tree and a sequence of distinct integer keys, there is only one way to fill these keys into the tree so that the resulting tree satisfies the definition of a BST. You are supposed to output the level order traversal sequence of that tree. The sample is illustrated by Figure 1 and 2.

![figBST.jpg](https://images.ptausercontent.com/24c2521f-aaed-4ef4-bac8-3ff562d80a1b.jpg)

### Input Specification:

Each input file contains one test case. For each case, the first line gives a positive integer *N* (≤100) which is the total number of nodes in the tree. The next *N* lines each contains the left and the right children of a node in the format `left_index right_index`, provided that the nodes are numbered from 0 to *N*−1, and 0 is always the root. If one child is missing, then −1 will represent the NULL child pointer. Finally *N* distinct integer keys are given in the last line.

### Output Specification:

For each test case, print in one line the level order traversal sequence of that tree. All the numbers must be separated by a space, with no extra space at the end of the line.

### Sample Input:

```in
9
1 6
2 3
-1 -1
-1 4
5 -1
-1 -1
7 -1
-1 8
-1 -1
73 45 11 58 82 25 67 38 42
```

### Sample Output:

```out
58 25 82 11 38 67 45 73 42
```

### 题意

二叉树有N个节点，给出给个节点的左右孩子节点的编号，不存在的话用-1表示，接着给出一个N个整数的序列，将这N个整数填入二叉树的节点中，使其成为一颗二叉查找树，并给出这颗二叉查找树的层序遍历序列。

### 代码

```java
package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**  
 * @Title:  PATA1099.java   
 * @Package com.zixin.algorithm   
 * @Description:    描述   
 * @author: Sanglp     
 * @date:   2020年4月15日 下午7:20:20   
 * @version V1.0 
 * qq交流群：1027372701
 */
public class PATA1099 {

	static TreeNode99 [] arr;
	static int n;
	static int number[];
	static int num=0;
	static int printNum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		arr = new TreeNode99[n];
		number = new int [n];
		for(int i=0;i<n;i++) {
			TreeNode99  node = new TreeNode99();
			node.lchild=sc.nextInt();
			node.rchild=sc.nextInt();
			arr[i]=node;
		}
		for(int i=0;i<n;i++) {
			number[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(number);//二叉查找树的中序遍历是有序的 
		inOrder(0);
		BFS(0);
	}
	/**
	 * 
	 * @Title: inOrder   
	 * @Description: 因为二叉排序树的中序遍历是有序的，而numbers我们已经排了序
	 * 				所以只需要在中序遍历的时候将数据填进去就知道了每个节点对应的数据了   
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void inOrder(int root) {
		if(root==-1) {
			return;
		}
		inOrder(arr[root].lchild);
		System.out.println(root+" "+ num);
		arr[root].data=number[num++];
		inOrder(arr[root].rchild);
	}
	
	/**
	 * 
	 * @Title: BFS   
	 * @Description: 广度优先遍历
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void BFS(int root) {
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(n);
		queue.add(root);
		while(!queue.isEmpty()) {
			int temp = queue.peek();
			queue.remove();
			if(printNum==0) {
				System.out.print(arr[temp].data);
			}else {
				System.out.print(" "+arr[temp].data);
			}
			printNum++;
			
			if(arr[temp].lchild!=-1) {
				queue.add(arr[temp].lchild);
			}
			if(arr[temp].rchild!=-1) {
				queue.add(arr[temp].rchild);
			}
		}
	}
}

class TreeNode99{
	int data;//数据
	int lchild;//左节点
	int rchild;//右节点
}

```

### 提交

![PATA 1099提交](image\PATA 1099提交.png)
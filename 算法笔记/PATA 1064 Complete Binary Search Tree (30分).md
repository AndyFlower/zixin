**Complete Binary Search Tree** (30分)

A Binary Search Tree (BST) is recursively defined as a binary tree which has the following properties:

- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
- Both the left and right subtrees must also be binary search trees.

A Complete Binary Tree (CBT) is a tree that is completely filled, with the possible exception of the bottom level, which is filled from left to right.

Now given a sequence of distinct non-negative integer keys, a unique BST can be constructed if it is required that the tree must also be a CBT. You are supposed to output the level order traversal sequence of this BST.

### Input Specification:

Each input file contains one test case. For each case, the first line contains a positive integer *N* (≤1000). Then *N* distinct non-negative integer keys are given in the next line. All the numbers in a line are separated by a space and are no greater than 2000.

### Output Specification:

For each test case, print in one line the level order traversal sequence of the corresponding complete binary search tree. All the numbers in a line must be separated by a space, and there must be no extra space at the end of the line.

### Sample Input:

```in
10
1 2 3 4 5 6 7 8 9 0

      
    
```

### Sample Output:

```out
6 3 8 1 5 7 9 0 2 4

      
    
```

作者: CHEN, Yue

单位: 浙江大学

时间限制: 400 ms

内存限制: 64 MB



### 题意

给出N个非负整数，要用他们构建一颗完全二叉排序树，输出这颗完全二叉排序树的层序遍历序列。

### 代码

```java
package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @ClassName:  PATA1064   
 * @Description:用数组来存放完全二叉排序树，那么左孩子一定是2x 右孩子一定是2x+1
 * 				二叉排序树的中序遍历是递增的，所以先对输入的数据按照递增进行排序  
 * 				第一个节点就是根节点
 * @author: Sanglp
 * @date:   2020年4月15日 下午5:34:26      
 * qq交流群：1027372701
 */
public class PATA1064 {

	static  int number[] ;//节点权值
	static  int CBT [] ;//完全二叉树
	static int n;//节点个数
	static int index = 0;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        number = new int[n];
        CBT=new int[n+1];//因为节点是从1开始存放的，所以这里的空间要开到n+1
        for(int i=0;i<n;i++) {
        	int data = sc.nextInt();
        	number[i]=data;
        }
        Arrays.sort(number);
        sc.close();
        inOrder(1);
        for(int i=1;i<=n;i++) {
        	if(i==1) {
        		System.out.print(CBT[i]);
        	}else {
        		System.out.print(" "+CBT[i]);
        	}
        }
	}

	/**
	 * 
	 * @Title: inOrder   
	 * @Description: 中序遍历 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void inOrder(int root) {
		if(root>n) {//空节点 直接返回
			return;
		}
		inOrder(root*2);//左子树递归
		CBT[root]=number[index++];//根节点处赋值
		inOrder(root*2+1);//右子树递归
	}
}

```

### 提交

![PATA 1064提交](image\PATA 1064提交.png)
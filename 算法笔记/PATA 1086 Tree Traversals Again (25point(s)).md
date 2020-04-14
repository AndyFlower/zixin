An inorder binary tree traversal can be implemented in a non-recursive way with a stack. For example, suppose that when a 6-node binary tree (with the keys numbered from 1 to 6) is traversed, the stack operations are: push(1); push(2); push(3); pop(); pop(); push(4); pop(); pop(); push(5); push(6); pop(); pop(). Then a unique binary tree (shown in Figure 1) can be generated from this sequence of operations. Your task is to give the postorder traversal sequence of this tree.

![img](https://images.ptausercontent.com/30)
Figure 1

### Input Specification:

Each input file contains one test case. For each case, the first line contains a positive integer *N* (≤30) which is the total number of nodes in a tree (and hence the nodes are numbered from 1 to *N*). Then 2*N* lines follow, each describes a stack operation in the format: "Push X" where X is the index of the node being pushed onto the stack; or "Pop" meaning to pop one node from the stack.

### Output Specification:

For each test case, print the postorder traversal sequence of the corresponding tree in one line. A solution is guaranteed to exist. All the numbers must be separated by exactly one space, and there must be no extra space at the end of the line.

### Sample Input:

```in
6
Push 1
Push 2
Push 3
Pop
Pop
Push 4
Pop
Pop
Push 5
Push 6
Pop
Pop
```

### Sample Output:

```out
3 4 2 6 5 1
```

### 题意

用栈来模拟一颗二叉树的先序和中序遍历过程，求这颗二叉树的后序遍历序列。

样例解释:

push  1 2 3 4 5 6因此先序是 1 2 3 4 5 6

Pop是 3 2 4 1 6 5 因此中序是324165

所以后序是3 4 2 6 5 1

![PATA1086递归图解](image\PATA1086递归图解.png)

### 代码

```java
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
```

### 提交

![PATA 1086提交](image\PATA 1086提交.png)
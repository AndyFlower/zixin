## 构造数组的MaxTree

###  题目

定义二叉树节点如下：

```java
public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}
```

一个数组的MaxTree定义如下：

- 数组必须没有重复元素
- MaxTree是一颗二叉树，数组的每一个值对应一个二叉树的节点
- 包括MaxTree树在内且在其中的每一颗子树上，值最大的都是树的头

给定一个没有重复元素的数组，写出生成这个数组的MaxTree的函数，要求如果数据长度为N，则时间复杂度为O(N)，额外时间复杂度为O(N)

### 思路

下面举例说明如何在满足时间和空间复杂度的要求下生成MaxTree

arr={3,4,5,1,2}

3的左边第一个比3大的数：无     3的右边第一个比3大的数4

4的左边第一个比4大的数：无     4的右边第一个比4大的数5

5的左边第一个比5大的数：无     5的右边第一个比5大的数无

1的左边第一个比1大的数：5     1的右边第一个比1大的数2

2的左边第一个比2大的数：5     2的右边第一个比2大的数无

建立树的原则：

- 每一个数的父节点是它左边第一个比它大的数和它右边第一个比他大的数中，较小的那个
- 如果左边也没有，右边也没有，那么这个数就是最大值，也就是头结点

### 代码

```java
package com.zixin.learn;

import java.util.HashMap;
import java.util.Stack;

public class MaxTree {

	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}

	public static Node getMaxTree(int[] arr) {
		//创建数组长度个数的数组并赋值
		Node[] nArr = new Node[arr.length];
		for (int i = 0; i != arr.length; i++) {
			nArr[i] = new Node(arr[i]);
		}
		//初始化一个栈
		Stack<Node> stack = new Stack<Node>();
		HashMap<Node, Node> lBigMap = new HashMap<Node, Node>();
		HashMap<Node, Node> rBigMap = new HashMap<Node, Node>();
		for (int i = 0; i != nArr.length; i++) {
			//当前节点
			Node curNode = nArr[i];
			//栈不为空，并且栈顶的元素的值小于当前节点的值
			while ((!stack.isEmpty()) && stack.peek().value < curNode.value) {
				popStackSetMap(stack, lBigMap);
			}
			//栈为空，或者栈顶的元素大于当前节点则入栈
			stack.push(curNode);
		}
		while (!stack.isEmpty()) {
			popStackSetMap(stack, lBigMap);
		}
		for (int i = nArr.length - 1; i != -1; i--) {
			Node curNode = nArr[i];
			while ((!stack.isEmpty()) && stack.peek().value < curNode.value) {
				popStackSetMap(stack, rBigMap);
			}
			stack.push(curNode);
		}
		while (!stack.isEmpty()) {
			popStackSetMap(stack, rBigMap);
		}
		Node head = null;
		for (int i = 0; i != nArr.length; i++) {
			Node curNode = nArr[i];
			Node left = lBigMap.get(curNode);
			Node right = rBigMap.get(curNode);
			//如果左右都没有比它大的数，那么他就是头结点
			if (left == null && right == null) {
				head = curNode;
			} else if (left == null) {
				if (right.left == null) {
					right.left = curNode;
				} else {
					right.right = curNode;
				}
			} else if (right == null) {
				if (left.left == null) {
					left.left = curNode;
				} else {
					left.right = curNode;
				}
			} else {
				//如果都不为空，取两侧较小的作为父节点
				Node parent = left.value < right.value ? left : right;
				if (parent.left == null) {
					parent.left = curNode;
				} else {
					parent.right = curNode;
				}
			}
		}
		return head;
	}

	public static void popStackSetMap(Stack<Node> stack, HashMap<Node, Node> map) {
		//取出栈顶元素
		Node popNode = stack.pop();
		//如果栈为空，则将取出节点放入map中  value为null 
		if (stack.isEmpty()) {
			map.put(popNode, null);
		} else {
			//如果不为空，将取出节点放入map中，并将下一个栈顶元素作为value
			map.put(popNode, stack.peek());
		}
	}

	/**
	 * @Desc 先序遍历
	 * @param head
	 */
	public static void printPreOrder(Node head) {
		if (head == null) {
			return;
		}
		System.out.print(head.value + " ");
		printPreOrder(head.left);
		printPreOrder(head.right);
	}

	/**
	 * @Desc 中序遍历
	 * @param head
	 */
	public static void printInOrder(Node head) {
		if (head == null) {
			return;
		}
		printPreOrder(head.left);
		System.out.print(head.value + " ");
		printPreOrder(head.right);
	}

	public static void main(String[] args) {
		int[] uniqueArr = { 3, 4, 5, 1, 2 };
		Node head = getMaxTree(uniqueArr);
		printPreOrder(head);
		System.out.println();
		printInOrder(head);

	}

}

```


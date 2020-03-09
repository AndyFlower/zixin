package com.zixin.learn.zuo.chapter_1_stackandqueue;

import java.util.HashMap;
import java.util.Stack;

public class Problem_08_MaxTree {

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

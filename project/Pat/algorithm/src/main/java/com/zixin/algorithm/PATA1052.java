package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PATA1052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 数量
		int head = sc.nextInt();// 头结点
		Node52[] arr = new Node52[100005];
		for (int i = 0; i < 100005; i++) {// 这个地方需要优化
			Node52 node = new Node52();
			node.flag = false;
			arr[i] = node;
		}
		for (int i = 0; i < n; i++) {
			Node52 node = new Node52();
			int address = sc.nextInt();
			node.address = address;
			node.data = sc.nextInt();
			node.next = sc.nextInt();
			arr[address] = node;
		}
		sc.close();
		int count = 0;
		int p = head;
		while (p != -1) {
			arr[p].flag = true;
			count++;
			p = arr[p].next;
		}
		if (count == 0) {// 特判 链表中没有节点 输出 0 -1
			System.out.println("0 -1");
		} else {
			Arrays.parallelSort(arr, new Compa52());// 有效节点进行排序
			System.out.printf("%d %05d\n", count, arr[0].address);// 防止-1被格式化 上面特殊处理 输出节点信息 下一个节点不是节点类的next
																	// 而是下一个节点的address
			for (int i = 0; i < count; i++) {
				if (i != count - 1) {
					System.out.printf("%05d %d %05d\n", arr[i].address, arr[i].data, arr[i + 1].address);
				} else {
					System.out.printf("%05d %d -1\n", arr[i].address, arr[i].data);
				}
			}
		}
	}

}

class Node52 {
	int address;
	int data;
	int next;
	boolean flag;

}

class Compa52 implements Comparator<Node52> {

	@Override
	public int compare(Node52 o1, Node52 o2) {
		if (!o1.flag || !o2.flag) {
			if (!o1.flag && o2.flag) {
				return 1;
			} else if (o1.flag && !o2.flag) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return o1.data - o2.data;
		}
	}

}

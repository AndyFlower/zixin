A linked list consists of a series of structures, which are not necessarily adjacent in memory. We assume that each structure contains an integer `key` and a `Next` pointer to the next structure. Now given a linked list, you are supposed to sort the structures according to their key values in increasing order.

### Input Specification:

Each input file contains one test case. For each case, the first line contains a positive *N* (<105) and an address of the head node, where *N* is the total number of nodes in memory and the address of a node is a 5-digit positive integer. NULL is represented by −1.

Then *N* lines follow, each describes a node in the format:

```
Address Key Next
```

where `Address` is the address of the node in memory, `Key` is an integer in [−105,105], and `Next` is the address of the next node. It is guaranteed that all the keys are distinct and there is no cycle in the linked list starting from the head node.

### Output Specification:

For each test case, the output format is the same as that of the input, where *N* is the total number of nodes in the list and all the nodes must be sorted order.

### Sample Input:

```in
5 00001
11111 100 -1
00001 0 22222
33333 100000 11111
12345 -1 33333
22222 1000 12345

      
    
```

### Sample Output:

```out
5 12345
12345 -1 00001
00001 0 11111
11111 100 22222
22222 1000 33333
33333 100000 -1

      
    
```

作者: CHEN, Yue

单位: 浙江大学

时间限制: 400 ms

内存限制: 64 MB

代码长度限制: 16 KB

### 题意

给出N个结点的地址address，数据域data以及指针域next,然后给出链表的首地址，把这个链表上的节点按data值从小到大除数

初始设置所有节点均为无效节点，然后根据首地址进行遍历，遍历到的标识记为true

对节点进行排序

### 代码

```java
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

```

### 提交

![PATA1052提交-22分](image\PATA1052提交-22分.png)
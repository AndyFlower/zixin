To store English words, one method is to use linked lists and store a word letter by letter. To save some space, we may let the words share the same sublist if they share the same suffix. For example, `loading` and `being` are stored as showed in Figure 1.

![fig.jpg](https://images.ptausercontent.com/ef0a1fdf-3d9f-46dc-9a27-21f989270fd4.jpg)

Figure 1

You are supposed to find the starting position of the common suffix (e.g. the position of `i` in Figure 1).

### Input Specification:

Each input file contains one test case. For each case, the first line contains two addresses of nodes and a positive *N* (≤105), where the two addresses are the addresses of the first nodes of the two words, and *N* is the total number of nodes. The address of a node is a 5-digit positive integer, and NULL is represented by −1.

Then *N* lines follow, each describes a node in the format:

```
Address Data Next

      
    
```

where`Address` is the position of the node, `Data` is the letter contained by this node which is an English letter chosen from { a-z, A-Z }, and `Next` is the position of the next node.

### Output Specification:

For each case, simply output the 5-digit starting position of the common suffix. If the two words have no common suffix, output `-1` instead.

### Sample Input 1:

```in
11111 22222 9
67890 i 00002
00010 a 12345
00003 g -1
12345 D 67890
00002 n 00003
22222 B 23456
11111 L 00001
23456 e 67890
00001 o 00010

      
    
```

### Sample Output 1:

```out
67890

      
    
```

### Sample Input 2:

```in
00001 00002 4
00001 a 10001
10001 s -1
00002 a 10002
10002 t -1

      
    
```

### Sample Output 2:

```out
-1
```

### 题意

给出两条链表的首地址以及若干个节点的地址、数据、下一个节点的地址，求两条链表的首个共用节点的地址，如果没有则输出-1。

### 思路

使用静态链表，在节点的结构体中再定义一个flag,表示节点是否在第一条链表中出现，若出现，则flag为1，若未出现，，则flag为-1

遍历第一个将经过的所有节点的flag赋为1

遍历第二个 若出现flag为1的节点，说明在第一条链表中出现过即为第一个共同点

遍历完仍然没有则输出-1

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName:  PATA1032   
 * @Description:最后一个点超时   
 * @author: Sanglp
 * @date:   2020年4月7日 上午9:52:24      
 * @Copyright:
 */
public class PATA1032 {
static int maxN = 100010;
	public static void main(String[] args) {
		Node32[] node = new Node32[maxN];
		Scanner sc = new Scanner(System.in);

		int s1 = sc.nextInt();//链表首地址
		int s2=sc.nextInt();//链表首地址
		int n=sc.nextInt();
		int address,next;//地址和下一个节点的位置
		String data;//数据
		for(int i=0;i<n;i++) {
			address = sc.nextInt();
			data=sc.next();
			next = sc.nextInt();
			Node32 no = new Node32();
			no.data=data;
			no.next=next;
			node[address]=no;
		}
		sc.close();
		int p=0;
		for( p =s1;p!=-1;p=node[p].next) {
			node[p].flag=true;
		}
		for( p=s2;p!=-1;p=node[p].next) {
			if(node[p].flag) {
				break;//找到第一个已经在第一条链表中出现的节点
			}
			
		}
		if(p!=-1) {
			System.out.printf("%05d",p);
		}else {
			System.out.println("-1");
		}
	}

}

class Node32{
	String data;
	int next;
	boolean flag;
}
```

###  提交

![PATA1032提交-22分](image\PATA1032提交-22分.png)
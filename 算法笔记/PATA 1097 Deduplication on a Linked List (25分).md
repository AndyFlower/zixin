Given a singly linked list *L* with integer keys, you are supposed to remove the nodes with duplicated absolute values of the keys. That is, for each value *K*, only the first node of which the value or absolute value of its key equals *K* will be kept. At the mean time, all the removed nodes must be kept in a separate list. For example, given *L* being 21→-15→-15→-7→15, you must output 21→-15→-7, and the removed list -15→15.

### Input Specification:

Each input file contains one test case. For each case, the first line contains the address of the first node, and a positive *N*(≤105) which is the total number of nodes. The address of a node is a 5-digit nonnegative integer, and NULL is represented by −1.

Then *N* lines follow, each describes a node in the format:

```
Address Key Next
```

where `Address` is the position of the node, `Key` is an integer of which absolute value is no more than 104, and `Next` is the position of the next node.

### Output Specification:

For each case, output the resulting linked list first, then the removed list. Each node occupies a line, and is printed in the same format as in the input.

### Sample Input:

```in
00100 5
99999 -7 87654
23854 -15 00000
87654 15 -1
00000 -15 99999
00100 21 23854

      
    
```

### Sample Output:

```out
00100 21 23854
23854 -15 99999
99999 -7 -1
00000 -15 87654
87654 15 -1
```

### 题意

给出N个节点的地址address,数据域data以及指针域next,然后给出链表首地址，要求取出链表上权值的绝对值相同的节点，之后把位删除的节点链表顺序输出

21  -15  -15  -7  15  处理后  21  -15   -7 删除部分  -15  15



### 代码(15分)  第二个测试点错误  后两个超时

```java
package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class PATA1097 {

	static int MAXN=100005;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int head = sc.nextInt();
		int num  =sc.nextInt();
		Node97[]  arr = new Node97[MAXN];
		//for(int i=0;i<100005;i++) {
			//Node97 node = new Node97();
			//node.flag=MAXN*2;
			//arr[i]=node;
		//}
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		for(int i=0;i<num;i++) {
			Node97 node = new Node97();
			int address = sc.nextInt();
			node.address=address;
			int data = sc.nextInt();
			node.data=data;
			int next = sc.nextInt();
			node.next=next;
			arr[address]=node;
		}
		sc.close();
		int p=head;
		int countValid =0;
		int countRemoved=0;
		while(p!=-1) {
			int data = arr[p].data;
			if(!map.containsKey(Math.abs(data))) {
				arr[p].flag=countValid++;
				map.put(Math.abs(data), Math.abs(data));
			}else {
				arr[p].flag=MAXN+countRemoved++;
				
			}
			p=arr[p].next;
		}
		Arrays.sort(arr, new Compa97());
		int count = countValid+countRemoved;
		for(int i=0;i<count;i++) {
			if(i!=countValid-1&&i!=count-1) {
				System.out.printf("%05d %d %05d\n",arr[i].address,arr[i].data,arr[i+1].address);
			}else {
				System.out.printf("%05d %d -1\n",arr[i].address,arr[i].data);
			}
		}
		
	}

}

class Node97{
	int address;
	int data;
	int next;
	int flag;//有效1  无效2   无效节点3
}


class Compa97 implements Comparator<Node97> {

	@Override
	public int compare(Node97 o1, Node97 o2) {
		if(null==o1) {
			o1 = new Node97();
			o1.flag=200010;
		}
		if(null==o2) {
			o2 = new Node97();
			o2.flag=200010;
		}
		return o1.flag-o2.flag;
	}

}
```




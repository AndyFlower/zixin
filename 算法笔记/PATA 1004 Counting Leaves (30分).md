A family hierarchy is usually presented by a pedigree tree. Your job is to count those family members who have no child.

### Input Specification:

Each input file contains one test case. Each case starts with a line containing 0<*N*<100, the number of nodes in a tree, and *M* (<*N*), the number of non-leaf nodes. Then *M* lines follow, each in the format:

```
ID K ID[1] ID[2] ... ID[K]

      
    
```

where `ID` is a two-digit number representing a given non-leaf node, `K` is the number of its children, followed by a sequence of two-digit `ID`'s of its children. For the sake of simplicity, let us fix the root ID to be `01`.

The input ends with *N* being 0. That case must NOT be processed.

### Output Specification:

For each test case, you are supposed to count those family members who have no child **for every seniority level** starting from the root. The numbers must be printed in a line, separated by a space, and there must be no extra space at the end of each line.

The sample case represents a tree with only 2 nodes, where `01` is the root and `02` is its only child. Hence on the root `01` level, there is `0` leaf node; and on the next level, there is `1` leaf node. Then we should output `0 1` in a line.

### Sample Input:

```in
2 1
01 1 02

      
    
```

### Sample Output:

```out
0 1
```



### 题意

给定一棵树，问每一层各有多少叶子结点。

### 代码

```java
package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @ClassName: PATA1004
 * @Description:TODO(描述这个类的作用)
 * @author: Sanglp
 * @date: 2020年4月15日 上午8:54:36 qq交流群：1027372701
 */
public class PATA1004 {

	static ArrayList<Integer> tree[];
	static boolean isNotRoot[];//保存是否为根节点
	static int leafNum[];
	static int h[];//广度优先遍历使用
	static int maxDepth=0;//深度优先遍历使用
	static int max_h=0;//广度优先遍历使用
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		tree = new ArrayList[n+1];
		for (int i = 0; i <= n; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		leafNum = new int[n+1];
		h = new int[n+1];
		isNotRoot = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			int parent = sc.nextInt();
			int num = sc.nextInt();
			for (int j = 0; j < num; j++) {
				int child = sc.nextInt();
				isNotRoot[child] = true;
				tree[parent].add(child);
			}
		}
		sc.close();
		int root = findRoot();
		//广度优先
		BFS(root);
		for(int i=0;i<=max_h;i++) {
			if(i==0) {
				System.out.print(leafNum[i]);
			}else {
				System.out.print(" "+leafNum[i]);
			}
		}
		//深度优先
		DFS(root,1);
		
		 for(int i=1;i<=maxDepth;i++) {
			 if(i==1) {
				 System.out.print(leafNum[i]);
			}else{ 
				System.out.print(" "+leafNum[i]); 
			} 
		}
		 
	}

	/**
	 * 
	 * @Title: findRoot   
	 * @Description: 寻找根节点
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	static int findRoot() {
		for (int i = 1; i < isNotRoot.length; i++) {
			if (!isNotRoot[i]) {
				return i;

			}
		}
		return -1;
	}
	
	static void DFS(int index,int depth) {
		if(depth>maxDepth) {
			maxDepth=depth;
		}
		if(tree[index].size()==0) {
			leafNum[depth]++;
		}
		for(int i=0;i<tree[index].size();i++) {
			DFS(tree[index].get(i),depth+1);
		}
	}
	
	/**
	 * 
	 * @Title: BFS   
	 * @Description: 广度优先是利用一个栈进行操作  根节点入栈   然后根据出栈元素 将其所有子节点进行入栈  因为栈先进先出 可以做到每一层  从左往右依次遍历 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void BFS(int root) {
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(tree.length);
		queue.add(root);//根节点入栈
		while(!queue.isEmpty()) {
			int front = queue.peek();//
			queue.remove();
			max_h = Math.max(h[front], max_h);
			if(tree[front].size()==0) {
				leafNum[h[front]]++;
			}
			for(int i=0;i<tree[front].size();i++) {
				h[tree[front].get(i)]=h[front]+1;
				queue.add(tree[front].get(i));
			}
		}
		
	}
}

```



### 提交

![PATA 1004提交](image\PATA 1004提交.png)
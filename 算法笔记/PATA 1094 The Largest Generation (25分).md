A family hierarchy is usually presented by a pedigree tree where all the nodes on the same level belong to the same generation. Your task is to find the generation with the largest population.

### Input Specification:

Each input file contains one test case. Each case starts with two positive integers *N* (<100) which is the total number of family members in the tree (and hence assume that all the members are numbered from 01 to *N*), and *M* (<*N*) which is the number of family members who have children. Then *M* lines follow, each contains the information of a family member in the following format:

```
ID K ID[1] ID[2] ... ID[K]

      
    
```

where `ID` is a two-digit number representing a family member, `K` (>0) is the number of his/her children, followed by a sequence of two-digit `ID`'s of his/her children. For the sake of simplicity, let us fix the root `ID` to be `01`. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print in one line the largest population number and the level of the corresponding generation. It is assumed that such a generation is unique, and the root level is defined to be 1.

### Sample Input:

```in
23 13
21 1 23
01 4 03 02 04 05
03 3 06 07 08
06 2 12 13
13 1 21
08 2 15 16
02 2 09 10
11 2 19 20
17 1 22
05 1 11
07 1 14
09 1 17
10 1 18
```

### Sample Output:

```out
9 4
```

### 题意

输入树的节点个数N从1开始，非叶子节点M，然后输入M个非叶节点各自的孩子节点的编号，求节点个数最多的一层（根节点层号为1） 输出该层的节点个数和层号



![PATA 1094建树](image\PATA 1094建树.png)

### 代码

```java
package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PATA1094 {

	static ArrayList<Integer> tree[] ;
	static int n;
	static int m;
	static boolean rootFlag[] ;
	static int  depths[];
	static int maxnumDepth;
	static int maxNum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		tree = new ArrayList[n+1];
		rootFlag = new boolean[n+1];
		depths = new int[n+1];
		for(int i=0;i<=n;i++) {
			tree[i] = new ArrayList<Integer>();//初始化数组
		}
		m=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=m;i++) {
			String[] str = sc.nextLine().split(" ");
			for(int j=2;j<str.length;j++) {
				rootFlag[Integer.parseInt(str[j])]=true;//这个作为别人的子节点 所以肯定不是父节点 
				tree[Integer.parseInt(str[0])].add(Integer.parseInt(str[j]));
			}
		}
		sc.close();
		
		int root = findRoot();
		//System.out.println(root);
		DFS(root,1);
		//System.out.println(Arrays.toString(depths));
		for(int i=1;i<n+1;i++) {
			if(depths[i]>maxNum) {
				maxnumDepth=i;
				maxNum=depths[i];
			}
		}
		
		System.out.println(maxNum+" "+maxnumDepth);
	}
	
	static  int findRoot() {
		for(int i=1;i<rootFlag.length;i++) {
			if(!rootFlag[i]) {
				return i;
			}
		}
		return 0;
	}
	
	static  void  DFS(int index,int depth) {
		depths[depth]++;
		if(tree[index].size()==0) {
			return;
		}
		for(int i=0;i<tree[index].size();i++) {
			DFS(tree[index].get(i),depth+1);
		}
	}
}

```

### 提交

![PATA 1094提交](image\PATA 1094提交.png)
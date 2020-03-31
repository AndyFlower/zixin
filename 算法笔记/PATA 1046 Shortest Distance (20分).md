### **1046** **Shortest Distance** (20分)

The task is really simple: given *N* exits on a highway which forms a simple cycle, you are supposed to tell the shortest distance between any pair of exits.

### Input Specification:

Each input file contains one test case. For each case, the first line contains an integer *N* (in [3,105]), followed by *N* integer distances *D*1 *D*2 ⋯ *D**N*, where *D**i* is the distance between the *i*-th and the (*i*+1)-st exits, and *D**N* is between the *N*-th and the 1st exits. All the numbers in a line are separated by a space. The second line gives a positive integer *M* (≤104), with *M* lines follow, each contains a pair of exit numbers, provided that the exits are numbered from 1 to *N*. It is guaranteed that the total round trip distance is no more than 107.

### Output Specification:

For each test case, print your results in *M* lines, each contains the shortest distance between the corresponding given pair of exits.

### Sample Input:

```in
5 1 2 4 14 9
3
1 3
2 5
4 1
```

### Sample Output:

```out
3
10
7
```

题意

有N个节点围成一个圈，相邻相关点之间的距离已知，且每次只能移动到相邻点，然后给出N个询问，每个询问给出两个数字A和B即节点编号，求从A号节点到B号节点的最短距离

### 思路

1、以dis[i]表示节点按顺时针方向到达i号节点顺指针方向的下一个节点的距离，sum表示一圈的总距离，于是每个查询都是left->right，结果就是dis(left,right)与sum-dis(left,right)中较小值

2、dis数组和sum在读入的时候就可以进行累加得到，这样对每个查询left->right,dis(left,right)其实就是dis[right-1]-dis[left-1]，这样可以做到查询复杂度为O（1）；



### 代码

```java
package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATA1046 {

	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String []  distemp = br.readLine().split(" ");//获得输入距离
		int queryNum = Integer.parseInt(br.readLine());
		String [] str = new String[queryNum];
		int sum=0;
		
		int []  dis = new int[distemp.length];
		for(int i=1;i<distemp.length;i++) {
			sum+=Integer.parseInt(distemp[i]);//累加sum
			dis[i]=sum;//预处理dis数组
		}
		for(int i=0;i<queryNum;i++) {
			str[i]=br.readLine();
		}
		br.close();
		for(int i=0;i<queryNum;i++) {
			int left = Integer.parseInt(str[i].split(" ")[0]);
			int right = Integer.parseInt(str[i].split(" ")[1]);
			if(left>right) {
				int temp= left;
				left = right;
				right=temp;//交换
			}
			int  distence = dis[right-1]-dis[left-1];
			System.out.println(distence<(sum-distence)?distence:sum-distence);
		}

	}

}

```


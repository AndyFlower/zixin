![PATA 1090输入构建树](D:\slpworkspace\github\2020\算法笔记\image\PATA 1090输入构建树.png)A supply chain is a network of retailers（零售商）, distributors（经销商）, and suppliers（供应商）-- everyone involved in moving a product from supplier to customer.

Starting from one root supplier, everyone on the chain buys products from one's supplier in a price *P* and sell or distribute them in a price that is *r*% higher than *P*. It is assumed that each member in the supply chain has exactly one supplier except the root supplier, and there is no supply cycle.

Now given a supply chain, you are supposed to tell the highest price we can expect from some retailers.

### Input Specification:

Each input file contains one test case. For each case, The first line contains three positive numbers: *N* (≤105), the total number of the members in the supply chain (and hence they are numbered from 0 to *N*−1); *P*, the price given by the root supplier; and *r*, the percentage rate of price increment for each distributor or retailer. Then the next line contains *N* numbers, each number *S**i* is the index of the supplier for the *i*-th member. *S**r**o**o**t* for the root supplier is defined to be −1. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print in one line the highest price we can expect from some retailers, accurate up to 2 decimal places, and the number of retailers that sell at the highest price. There must be one space between the two numbers. It is guaranteed that the price will not exceed 1010.

### Sample Input:

```in
9 1.80 1.00
1 5 4 4 -1 4 5 3 6
```

### Sample Output:

```out
1.85 2
```



![PATA 1090输入构建树](image\PATA 1090输入构建树.png)

### 代码

```java
package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1090
 * @Description:树的深度遍历
 * @author: Sanglp
 * @date: 2020年4月14日 上午10:13:53 
 * qq交流群：1027372701
 */
public class PATA1090 {

	static ArrayList<Integer>[] tree ;
	static double p;
	static double r;
	static int n;
	static int maxDepth = 0;// 最大深度
	static int num = 0;// 最大深度节点个数

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		p=sc.nextDouble();
		r=sc.nextDouble()/100.0;
		int father;
		int root=0;
		tree = new ArrayList[n];
		for(int i=0;i<n;i++) {
			tree[i]=new ArrayList<>();
		}
		for(int i=0;i<n;i++) {
			father=sc.nextInt();
		
			if(father!=-1) {
				tree[father].add(i);//i是father的子节点
			}else {
				root=i;//根节点为root
			}
		}
		sc.close();
		DFS(root,0);
		//System.out.println(maxDepth);
		System.out.printf("%.2f %d",p*Math.pow(1.0+r, maxDepth),num);
	}

	/**
	 * 
	 * @Title: DFS   
	 * @Description: 深度优先便利 
	 * @param: @param index
	 * @param: @param depth      
	 * @return: void      
	 * @throws
	 */
	static void DFS(int index, int depth) {
		if (tree[index].size() == 0) {// 到达叶节点
			if(depth>maxDepth) {
				maxDepth=depth;
				num=1;
			}else if(depth==maxDepth) {
				num++;
			}
			return;
		}
		for(int i=0;i<tree[index].size();i++) {
			DFS(tree[index].get(i),depth+1);
		}
	}
}

```


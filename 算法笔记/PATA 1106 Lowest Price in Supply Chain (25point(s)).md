A supply chain is a network of retailers（零售商）, distributors（经销商）, and suppliers（供应商）-- everyone involved in moving a product from supplier to customer.

Starting from one root supplier, everyone on the chain buys products from one's supplier in a price *P* and sell or distribute them in a price that is *r*% higher than *P*. Only the retailers will face the customers. It is assumed that each member in the supply chain has exactly one supplier except the root supplier, and there is no supply cycle.

Now given a supply chain, you are supposed to tell the lowest price a customer can expect from some retailers.

### Input Specification:

Each input file contains one test case. For each case, The first line contains three positive numbers: *N* (≤105), the total number of the members in the supply chain (and hence their ID's are numbered from 0 to *N*−1, and the root supplier's ID is 0); *P*, the price given by the root supplier; and *r*, the percentage rate of price increment for each distributor or retailer. Then *N* lines follow, each describes a distributor or retailer in the following format:

*K**i* ID[1] ID[2] ... ID[*K**i*]

where in the *i*-th line, *K**i* is the total number of distributors or retailers who receive products from supplier *i*, and is then followed by the ID's of these distributors or retailers. *K**j* being 0 means that the *j*-th member is a retailer. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print in one line the lowest price we can expect from some retailers, accurate up to 4 decimal places, and the number of retailers that sell at the lowest price. There must be one space between the two numbers. It is guaranteed that the all the prices will not exceed 1010.

### Sample Input:

```in
10 1.80 1.00
3 2 3 5
1 9
1 4
1 7
0
2 6 1
1 8
0
0
0
```

### 题意

给出一颗销售的树，树根唯一，树根处价格为p,每走一层，价格增加r%,求叶子节点处的最低价格。

### 代码

```java
package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Title: PATA1106.java
 * @Package com.zixin.algorithm
 * @Description: 描述
 * @author: Sanglp
 * @date: 2020年4月14日 下午11:33:01
 * @version V1.0 qq交流群：1027372701
 */
public class PATA1106 {

	static ArrayList<Integer>[] tree;
	static int minDepth = Integer.MAX_VALUE;
	static double minPrice = Double.MAX_VALUE;
	static int num;
	static boolean isNotRoot[];
	static double p;
	static double r;

	/**
	 * 
	 * @Title: main   
	 * @Description: 答案正确 但是有超时 需改进 
	 * @param: @param args      
	 * @return: void      
	 * @throws
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		p = sc.nextDouble();
		r = sc.nextDouble() / 100.00;
		sc.nextLine();
		isNotRoot = new boolean[n];
		tree = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<>();
			String[] str = sc.nextLine().split(" ");
			// System.out.println(Arrays.toString(str));
			if (str.length > 1) {
				for (int j = 1; j < str.length; j++) {
					isNotRoot[Integer.parseInt(str[j])] = true;
					tree[i].add(Integer.parseInt(str[j]));
				}
			}

		}
		sc.close();
		// System.out.println(findRoot());
		DFS(findRoot(), 0);
		System.out.printf("%.4f %d", minPrice, num);

	}

	static int findRoot() {
		for (int i = 0; i < tree.length; i++) {
			if (!isNotRoot[i]) {
				return i;
			}
		}
		return -1;
	}

	static void DFS(int index, int depth) {
		if (tree[index].size() == 0) {
			double price = p * Math.pow(1 + r, depth);
			if (price < minPrice) {
				minPrice = price;
				num = 1;
			} else if (price == minPrice) {
				num++;
			}
		}
		for (int i = 0; i < tree[index].size(); i++) {
			DFS(tree[index].get(i), depth + 1);
		}
	}
}

```


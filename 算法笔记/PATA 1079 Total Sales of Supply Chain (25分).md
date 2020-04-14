A supply chain is a network of retailers（零售商）, distributors（经销商）, and suppliers（供应商）-- everyone involved in moving a product from supplier to customer.

Starting from one root supplier, everyone on the chain buys products from one's supplier in a price *P* and sell or distribute them in a price that is *r*% higher than *P*. Only the retailers will face the customers. It is assumed that each member in the supply chain has exactly one supplier except the root supplier, and there is no supply cycle.

Now given a supply chain, you are supposed to tell the total sales from all the retailers.

### Input Specification:

Each input file contains one test case. For each case, the first line contains three positive numbers: *N* (≤105), the total number of the members in the supply chain (and hence their ID's are numbered from 0 to *N*−1, and the root supplier's ID is 0); *P*, the unit price given by the root supplier; and *r*, the percentage rate of price increment for each distributor or retailer. Then *N* lines follow, each describes a distributor or retailer in the following format:

*K**i* ID[1] ID[2] ... ID[*K**i*]

where in the *i*-th line, *K**i* is the total number of distributors or retailers who receive products from supplier *i*, and is then followed by the ID's of these distributors or retailers. *K**j* being 0 means that the *j*-th member is a retailer, then instead the total amount of the product will be given after *K**j*. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print in one line the total sales we can expect from all the retailers, accurate up to 1 decimal place. It is guaranteed that the number will not exceed 1010.

### Sample Input:

```in
10 1.80 1.00
3 2 3 5
1 9
1 4
1 7
0 7
2 6 1
1 8
0 9
0 4
0 3   
```

### Sample Output:

```out
42.4
```

### 题意

给出一颗销售供应的树，树根唯一，在树根处给货物的价格为P。然后从根节点开始每往子节点走一层，该层的货物价格就会在父亲节点的价格上增加r%，给出每个叶节点的货物量，求他们的价格之和。



![PATA 1079深度优先](image\PATA 1079深度优先.png)

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;
import java.util.Vector;

/**
 * 
 * @ClassName: PATA1079
 * @Description:PATA1079
 * @author: Sanglp
 * @date: 2020年4月14日 上午9:25:46 
 * qq交流群：1027372701
 */
public class PATA1079 {
    static Node79 tree[] =new Node79[100010];// 存放树
    static double ans=0;
    static double p;
    static double r;
    static  int n;
    /**
     * 
     * @Title: main   
     * @Description: 只有叶子结点才会有数据，也就是第一个数为0的时候才会有data，否则只有孩子节点的信息
     * @param: @param args      
     * @return: void      
     * @throws
     */
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();//节点个数
		p=sc.nextDouble();//单价
		r=sc.nextDouble()/100.0;//比率
		for(int i=0;i<n;i++) {
			Node79 node = new Node79();
			node.child=new Vector<Integer>();
			tree[i]=node;
			int k=sc.nextInt();
			if(k==0) {//第一个数为0  说明这个节点是叶节点  只有数据
				tree[i].data=sc.nextDouble();
			}else {
				for(int j=0;j<k;j++) {//根据孩子节点的个数添加到子节点中
					int child = sc.nextInt();
					tree[i].child.add(child);
				}
			}
		}
		sc.close();
		DFS(0,0);//DFS入口
		System.out.printf("%.1f",p*ans);
	}
    
    static void DFS(int index,int depth) {
    	if(tree[index].child.size()==0) {//到达叶节点
    		ans+=tree[index].data*Math.pow(1.0+r, depth);
    		return;
    	}
    	for(int i=0;i<tree[index].child.size();i++) {
    		DFS(tree[index].child.get(i),depth+1);//递归访问
    	}
    }
}

class Node79 {
	double data;// 货物量
	Vector<Integer> child;// 指针域
}
```


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
package com.zixin.algorithm;

import java.util.Scanner;

/**  
 * @Title:  UnionSet.java   
 * @Package com.zixin.algorithm   
 * @Description:    并查集
 * @author: Sanglp     
 * @date:   2020年4月21日 下午10:51:17   
 * @version V1.0 
 * qq交流群：1027372701
 */
public class UnionSet {

	private static int n;
	private static int m;
	private static int father[];//存放父节点
	private static boolean isRoot[];//记录每个节点是否作为某个节点的根节点
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		father = new int[n+1];
		isRoot = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			father[i]=i;
			isRoot[i]=false;
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b=sc.nextInt();
			union(a,b);
		}
		sc.close();
		for(int i=1;i<=n;i++) {
			isRoot[findFather(i)]=true;
		}
		int ans = 0;
		for(int i=1;i<=n;i++) {
			ans+=isRoot[i]?1:0;
		}
		System.out.println(ans);
	}
	
	
	static int findFather(int x) {//查找X所在的集合
		int a=x;
		while(x!=father[x]) {
			x=father[x];
		}
		//路径压缩
		while(a!=father[a]) {
			int z=a;
			a=father[a];
			father[z]=x;
		}
		return x;
	}
	//合并ab所在的集合
	static void union(int a,int b) {
		int faA = findFather(a);
		int faB =findFather(b);
		if(faA!=faB) {
			father[faA]=faB;
		}
	}
}

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

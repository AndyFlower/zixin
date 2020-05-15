package com.zixin.algorithm;

import java.util.ArrayList;

public class GraphOperation {

	private static int MAXV = 1000;
	private static int INF = Integer.MAX_VALUE;
	private static int n;
	private static boolean visited[];
	private static int Graph[][];
	//--------------------
	private static ArrayList<Integer> Adj[];//数组 每一个元素是一个链表
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @Title: DFSTrave   
	 * @Description: 深度遍历图 
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	static void DFSTrave() {
		for(int u=0;u<n;u++) {
			if(visited[u]==false) {
				DFS(u,1);
			}
		}
	}
	static void DFS(int u,int depth) {
		visited[u]=true;
		for(int v=0;v<n;v++) {
			if(visited[v]==false&&Graph[u][v]!=INF) {
				DFS(v,depth+1);
			}
		}
	}
	
	//-------------邻接表版
	static void DFS2(int u,int depth) {
		visited[u]=true;
		for(int i=0;i<Adj[u].size();i++) {
			int v = Adj[u].get(i);
			if(!visited[v]) {
				DFS(v,depth+1);
			}
		}
	}

}

package com.zixin.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PATA1034 {

	private static int maxn=2010;
	private static int INF=Integer.MAX_VALUE;
	private static  Map<Integer, String> intToString;
	private static  Map<String, Integer> StringToInt;
	private static  Map<String, Integer> Gang;
	private static int G[][];
	private static int weight[];
	private static boolean visited[];
	private static int numPerson;
	private static int n;
	private static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		G = new int[maxn][maxn];
		weight = new int[maxn];
		visited = new boolean[maxn];
		intToString = new HashMap<Integer, String>();
		StringToInt = new HashMap<String, Integer>();
		Gang =new HashMap<String,Integer>();
		n = sc.nextInt();
		k=sc.nextInt();
		for(int i=0;i<n;i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			int w = sc.nextInt();
			int d1 = change(str1);
			int d2 = change(str2);
			weight[d1]+=w;
			weight[d2]+=w;
			G[d1][d2]+=w;
			G[d2][d1]+=w;
		}
		sc.close();
		DFSTrave();
        System.out.println(Gang.size());
        for(Map.Entry<String, Integer> entry : Gang.entrySet()){
           
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
	}
	
	
	static void DFS(int nowVisit,int head ,int numMember,int totalValue) {
		numMember++;
		visited[nowVisit]=true;
		if(weight[nowVisit]>weight[head]) {
			head = nowVisit;
		}
		for(int i=0;i<numPerson;i++) {
			if(G[nowVisit][i]>0) {
				totalValue+=G[nowVisit][i];
				G[nowVisit][i]=G[i][nowVisit]=0;
				if(!visited[i]) {
					DFS(i,head,numMember,totalValue);
				}
			}
		}
	}

	static void DFSTrave() {
		for(int i=0;i<numPerson;i++) {
			if(!visited[i]) {
				int head = i;
				int numMember=0;
				int totalValue=0;
				DFS(i,head,numMember ,totalValue);
				if(numMember>2&&totalValue>k) {
					Gang.put(intToString.get(head),numMember);
				}
			}
		}
	}
	
	static int change(String str) {
		if(StringToInt.containsKey(str)) {
			return StringToInt.get(str);
		}else {
			StringToInt.put(str, numPerson);
			intToString.put(numPerson, str);
			return numPerson++;
		}
	}
}

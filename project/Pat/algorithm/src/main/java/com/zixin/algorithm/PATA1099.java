package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**  
 * @Title:  PATA1099.java   
 * @Package com.zixin.algorithm   
 * @Description:    描述   
 * @author: Sanglp     
 * @date:   2020年4月15日 下午7:20:20   
 * @version V1.0 
 * qq交流群：1027372701
 */
public class PATA1099 {

	static TreeNode99 [] arr;
	static int n;
	static int number[];
	static int num=0;
	static int printNum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		arr = new TreeNode99[n];
		number = new int [n];
		for(int i=0;i<n;i++) {
			TreeNode99  node = new TreeNode99();
			node.lchild=sc.nextInt();
			node.rchild=sc.nextInt();
			arr[i]=node;
		}
		for(int i=0;i<n;i++) {
			number[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(number);//二叉查找树的中序遍历是有序的 
		inOrder(0);
		BFS(0);
	}
	/**
	 * 
	 * @Title: inOrder   
	 * @Description: 因为二叉排序树的中序遍历是有序的，而numbers我们已经排了序
	 * 				所以只需要在中序遍历的时候将数据填进去就知道了每个节点对应的数据了   
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void inOrder(int root) {
		if(root==-1) {
			return;
		}
		inOrder(arr[root].lchild);
		System.out.println(root+" "+ num);
		arr[root].data=number[num++];
		inOrder(arr[root].rchild);
	}
	
	/**
	 * 
	 * @Title: BFS   
	 * @Description: 广度优先遍历
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void BFS(int root) {
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(n);
		queue.add(root);
		while(!queue.isEmpty()) {
			int temp = queue.peek();
			queue.remove();
			if(printNum==0) {
				System.out.print(arr[temp].data);
			}else {
				System.out.print(" "+arr[temp].data);
			}
			printNum++;
			
			if(arr[temp].lchild!=-1) {
				queue.add(arr[temp].lchild);
			}
			if(arr[temp].rchild!=-1) {
				queue.add(arr[temp].rchild);
			}
		}
	}
}

class TreeNode99{
	int data;//数据
	int lchild;//左节点
	int rchild;//右节点
}

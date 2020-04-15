package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @ClassName:  PATA1064   
 * @Description:用数组来存放完全二叉排序树，那么左孩子一定是2x 右孩子一定是2x+1
 * 				二叉排序树的中序遍历是递增的，所以先对输入的数据按照递增进行排序  
 * 				第一个节点就是根节点
 * @author: Sanglp
 * @date:   2020年4月15日 下午5:34:26      
 * qq交流群：1027372701
 */
public class PATA1064 {

	static  int number[] ;//节点权值
	static  int CBT [] ;//完全二叉树
	static int n;//节点个数
	static int index = 0;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        number = new int[n];
        CBT=new int[n+1];//因为节点是从1开始存放的，所以这里的空间要开到n+1
        for(int i=0;i<n;i++) {
        	int data = sc.nextInt();
        	number[i]=data;
        }
        Arrays.sort(number);
        sc.close();
        inOrder(1);
        for(int i=1;i<=n;i++) {
        	if(i==1) {
        		System.out.print(CBT[i]);
        	}else {
        		System.out.print(" "+CBT[i]);
        	}
        }
	}

	/**
	 * 
	 * @Title: inOrder   
	 * @Description: 中序遍历 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void inOrder(int root) {
		if(root>n) {//空节点 直接返回
			return;
		}
		inOrder(root*2);//左子树递归
		CBT[root]=number[index++];//根节点处赋值
		inOrder(root*2+1);//右子树递归
	}
}

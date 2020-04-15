package com.zixin.algorithm;

import java.util.Scanner;

/**  
 * @Title:  PATA1066.java   
 * @Package com.zixin.algorithm   
 * @Description:    描述   
 * @author: Sanglp     
 * @date:   2020年4月15日 下午10:42:25   
 * @version V1.0 
 * qq交流群：1027372701
 */
public class PATA1066 {

	static int n;
	static int data[] = {88,70,61,96,120};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		//data =  {88,70,61,96,120};//new int[n];
		Tree66 tree=new Tree66();
		for(int i=0;i<n;i++) {
			//data[i]=sc.nextInt();
			tree.insert(data[i]);
		}
		sc.close();
		System.out.println(tree.treeRoot.value);
	}
	
	
}

class TreeNode66{
	int value;//节点权值
	int height;//当前子树的高度
	TreeNode66 lchild;
	TreeNode66 rchild;
}

class Tree66{
	TreeNode66 treeRoot;
	void createTree(int [] data) {
		for(int i=0;i<data.length;i++) {
			insert(data[i]);
		}
	}
	TreeNode66 createNode(int value) {
		TreeNode66 node= new TreeNode66();
		node.value=value;
		node.lchild=node.rchild=null;
		node.height=1;
		return node;
	}
	
	int getHeight(TreeNode66 root) {
		if(root ==null) {
			return 0;
		}
		return root.height;
	}
	
	/**
	 * 
	 * @Title: updateHeight   
	 * @Description: 更新节点的高度 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	void updateHeight(TreeNode66 root) {
		
		root.height=Math.max(getHeight(root.lchild), getHeight(root.rchild))+1;
		System.out.println("更新树的高度"+root.height);
	}
	/**
	 * 
	 * @Title: getBalanceFactor   
	 * @Description: 获得平衡因子   
	 * @param: @param root
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int getBalanceFactor(TreeNode66 root) {
		return Math.abs(getHeight(root.lchild)-getHeight(root.rchild));
	}
	 
	void L(TreeNode66 root) {
		System.out.println("左旋转");
		TreeNode66 temp = root.rchild;
		root.rchild=temp.lchild;
		temp.lchild=root;
		updateHeight(root);
		updateHeight(temp);
		root =temp;
	}
	/**
	 * 
	 * @Title: R   
	 * @Description:右旋 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	void R(TreeNode66 root) {
		System.out.println("右旋转");
		TreeNode66 temp = root.rchild;
		root.lchild=temp.rchild;
		temp.rchild=root;
		updateHeight(root);
		updateHeight(temp);
		root =temp;
	}
	
	/**
	 * 
	 * @Title: insert   
	 * @Description:插入值为value的节点  
	 * @param: @param value      
	 * @return: void      
	 * @throws
	 */
	void insert(int value) {
		if(treeRoot==null) {
			System.out.println("treeRoot is null");
			treeRoot = createNode(value);
			return;
		}
		TreeNode66 temp =treeRoot;
		while(true) {
			if(value < temp.value) {
				if(temp.lchild == null) {
					temp.lchild=createNode(value);
					updateHeight(treeRoot);
					if(getBalanceFactor(treeRoot)==2) {
						if(getBalanceFactor(treeRoot.lchild)==1) {
							R(treeRoot);
						}else if(getBalanceFactor(treeRoot.lchild)==-1) {
							L(treeRoot.lchild);
							R(treeRoot);
						}
					}
					break;
				}else {
					temp = temp.lchild;
				}
			}else {
				if(temp.rchild == null) {
					temp.rchild=createNode(value);
					updateHeight(treeRoot);
					if(getBalanceFactor(treeRoot)==2) {
						if(getBalanceFactor(treeRoot.rchild)==-1) {
							L(treeRoot);
						}else if(getBalanceFactor(treeRoot.rchild)==1) {
							R(treeRoot.lchild);
							L(treeRoot);
						}
					}
					break;
				}else {
					temp = temp.rchild;
				}
			}
		}
		
	}
}
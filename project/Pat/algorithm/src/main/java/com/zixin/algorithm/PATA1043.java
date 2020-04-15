package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @ClassName:  PATA1043   
 * @Description:二叉排序树 
 * @author: Sanglp
 * @date:   2020年4月15日 下午5:10:31      
 * qq交流群：1027372701
 */
public class PATA1043 {

	static ArrayList<Integer> origin=new ArrayList<Integer>();// 原始数列
	static ArrayList<Integer> pre=new ArrayList<Integer>();// 先序
	static ArrayList<Integer> post=new ArrayList<Integer>();// 后序
	static ArrayList<Integer> preM=new ArrayList<Integer>();// 镜像先序
	static ArrayList<Integer> postM=new ArrayList<Integer>();// 镜像后序 
	static int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();// 节点个数
		Tree43 tree = new Tree43();
		for (int i = 0; i < num; i++) {
			int data = sc.nextInt();// 数据
			origin.add(data);// 数据加入原始队列
			tree.insert(data);//创建二叉排序树
			
		}
		sc.close();

		//预处理先序 逆先序   后序    逆后序的结果  便于后序进行比较
		preOrder(tree.root);
		preOrderM(tree.root);
		postOrder(tree.root);
		postOrderM(tree.root);
		if(isEqual(pre,origin)) {
			System.out.println("YES");
			for(int i=0;i<post.size();i++) {
				if(i==0) {
					System.out.print(post.get(i));
				}else {
					System.out.print(" "+post.get(i));
				}
			}
		}else if(isEqual(origin,preM)) {
			System.out.println("YES");
			for(int i=0;i<postM.size();i++) {
				if(i==0) {
					System.out.print(postM.get(i));
				}else {
					System.out.print(" "+postM.get(i));
				}
			}
		}else {
			System.out.println("NO");
		}
	}

	/**
	 * 
	 * @Title: isEqual   
	 * @Description: 比较是否相等   
	 * @param: @param origin
	 * @param: @param dest
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	static boolean isEqual(ArrayList<Integer>  origin,ArrayList<Integer> dest) {
		if(origin.size()!=dest.size()) {
			return false;
		}
		for(int i=0;i<origin.size();i++) {
			if(!origin.get(i).equals(dest.get(i))) {
				return false;
			}
		}
		return true;
	}
	/**
	 * 
	 * @Title: preOrder   
	 * @Description: 先序遍历 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void preOrder(TreeNode43 root) {
		pre.add(root.data);
		if (root.lchild != null) {
			preOrder(root.lchild);
		}
		if (root.rchild != null) {
			preOrder(root.rchild);
		}
	}

	/**
	 * 
	 * @Title: preOrderM   
	 * @Description: 镜像先序 
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void preOrderM(TreeNode43 root) {
		preM.add(root.data);
		if (root.rchild != null) {
			preOrderM(root.rchild);
		}
		if (root.lchild != null) {
			preOrderM(root.lchild);
		}

	}

	/**
	 * 
	 * @Title: postOrder   
	 * @Description: 后序  
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void postOrder(TreeNode43 root) {

		if (root.lchild != null) {
			postOrder(root.lchild);
		}
		if (root.rchild != null) {
			postOrder(root.rchild);
		}
		post.add(root.data);
	}

	/**
	 * 
	 * @Title: postOrderM   
	 * @Description: 镜像后序  
	 * @param: @param root      
	 * @return: void      
	 * @throws
	 */
	static void postOrderM(TreeNode43 root) {

		if (root.rchild != null) {
			postOrderM(root.rchild);
		}
		if (root.lchild != null) {
			postOrderM(root.lchild);
		}
		postM.add(root.data);
	}

	
}

class TreeNode43 {
	int data;// 数据域
	TreeNode43 lchild;// 左子树
	TreeNode43 rchild;// 右子树
	public TreeNode43(int data) {
		super();
		this.data = data;
		this.lchild=null;
		this.rchild=null;
	}
	public TreeNode43() {
		super();
	}
	
}

class Tree43{
	TreeNode43 root;
	 void insert(int data) {
		if (null == root) {
			root = new TreeNode43();
			root.data = data;// 赋数据
			root.lchild = root.rchild = null;// 左右结点置空
			
		}else {
			TreeNode43 temp =root;
			while(true) {
				if(data < temp.data) {
					if(temp.lchild == null) {
						temp.lchild=new TreeNode43(data);
						break;
					}else {
						temp = temp.lchild;
					}
				}
				else {
					if(temp.rchild == null) {
						temp.rchild=new TreeNode43(data);
						break;
					}else {
						temp = temp.rchild;
					}
				}
			}

		}
	}
}
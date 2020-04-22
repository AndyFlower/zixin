package com.zixin.algorithm;

import java.util.Arrays;

/**
 * 
 * @ClassName:  CreateHeap   
 * @Description:建堆  以及堆排序
 * @author: Sanglp
 * @date:   2020年4月22日 下午1:06:07      
 * qq交流群：1027372701
 */
public class CreateHeap {

	private static int heap[]= {0,85,55,99,98,68,92,82,57,66,56};// 用数组来存放二叉树

	private  static int n=10;//总的个数
	public static void main(String[] args) {
		//createHeap(10);
	    System.out.println(Arrays.toString(heap));
	    heapSort();
	    
	    System.out.println(Arrays.toString(heap));
	}

	/**
	 * 
	 * @Title: heapSort   
	 * @Description: 堆排序 
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	static void heapSort() {
		createHeap(n);
		for(int i=n;i>1;i--) {
			swap(i,1);
			downAdjust(1,i-1);
		}
	}
	/**
	 * 
	 * @Title: downAdjust   
	 * @Description: 节点向下调整
	 * @param: @param low
	 * @param: @param high      
	 * @return: void      
	 * @throws
	 */
	static void downAdjust(int low, int high) {
		int i = low;// 预调整节点
		int j = 2 * i;// 左孩子节点
		while (j < high) {// 存在左孩子节点
			if (j + 1 < high && heap[j + 1] > heap[j]) {// 并且存在右孩子节点 并且右孩子节点更大
				j = j + 1;// 让j存储右孩子下标

			}
			if (heap[j] > heap[i]) {// 如果孩子节点比当前欲调整节点更大 则需要交换
				swap(i, j);
				i = j;// 将i变为需要调整的节点j
				j = 2 * i;// j还是保存其左孩子 继续调整
			}else {
				break;
			}
		}
	}

	static void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	/**
	 * 
	 * @Title: createHeap   
	 * @Description: 建堆  从下向上  从右向左 第一个非叶子结点向下调整
	 * @param: @param n      
	 * @return: void      
	 * @throws
	 */
	static  void createHeap(int n) {
		for(int i=n/2+1;i>=1;i--) {
			downAdjust(i,n);
		}
	}
	
	/**
	 * 
	 * @Title: deleteTop   
	 * @Description: 删除堆顶元素 
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	static   void deleteTop() {
		heap[1]=heap[n];//将最后一个元素覆盖堆顶
		n--;
		downAdjust(1,n);
	}
	/**
	 * 
	 * @Title: upAdjust   
	 * @Description: 向上调整   
	 * @param: @param low
	 * @param: @param high      
	 * @return: void      
	 * @throws
	 */
	static  void upAdjust(int low,int high) {
		int i=high;
		int j=i/2;//父节点
		while(j>=low) {
			if(heap[j]<heap[i]) {
				swap(j,i);
				i=j;
				j=i/2;
			}else {
				break;
			}
			
		}
		
	}
	/**
	 * 
	 * @Title: insert   
	 * @Description: 添加元素x 
	 * @param: @param x      
	 * @return: void      
	 * @throws
	 */
	static void insert(int x) {
		heap[++n]=x;
		upAdjust(1,n);
	}
}

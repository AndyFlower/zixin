package com.zixin.learn.zuo.chapter_1_stackandqueue;

import java.util.LinkedList;

public class Problem_07_SlidingWindowMaxArray {

	public static int[] getMaxWindow(int[] arr, int w) {
		if (arr == null || w < 1 || arr.length < w) {
			return null;
		}
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		//初始化返回数组
		int[] res = new int[arr.length - w + 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			//如果队列不为空，且队列队尾的下标所对应的值小于当前的值
			while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
				//将队列尾的数据删掉
				qmax.pollLast();
			}
			//如果队列为空，或者队列队尾的下标所对应的值大于当前的值，则将当前的值放入队尾
			qmax.addLast(i);
			//如果队列的第一个值等于i-w说明队列中存放的队头元素已过期，将队头元素移除
			if (qmax.peekFirst() == i - w) {
				qmax.pollFirst();
			}
			//如果i大于或等于窗口值减1，说明已经开始有了符合条件的最大值 ，将队头元素放入返回数组中
			if (i >= w - 1) {
				res[index++] = arr[qmax.peekFirst()];
			}
		}
		return res;
	}

	// for test
	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 5, 4, 3, 3, 9, 7 };
		int w = 3;
		printArray(getMaxWindow(arr, w));

	}

}

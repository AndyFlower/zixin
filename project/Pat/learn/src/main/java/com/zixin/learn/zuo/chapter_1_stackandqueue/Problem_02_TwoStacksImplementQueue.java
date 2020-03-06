package com.zixin.learn.zuo.chapter_1_stackandqueue;

import java.util.Stack;

/**
 * 
 * @author zixin
 * @Desc 两个栈实现队列的功能
 */
public class Problem_02_TwoStacksImplementQueue {

	public static class TwoStacksQueue {
		//push栈
		public Stack<Integer> stackPush;
		//pop栈
		public Stack<Integer> stackPop;

		//构造函数，初始化一个push栈和一个pop栈
		public TwoStacksQueue() {
			stackPush = new Stack<Integer>();
			stackPop = new Stack<Integer>();
		}
        //添加元素，是往push栈中添加
		public void add(int pushInt) {
			stackPush.push(pushInt);
		}

		/**
		 * poll操作。如果两个都为空，说明没有元素了
		 *         当pop为空，且push不为空的时候，将push中的数据全部放入pop栈中，然后再pop栈中弹出
		 * @return
		 */
		public int poll() {
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			} else if (stackPop.empty()) {
				while (!stackPush.empty()) {
					stackPop.push(stackPush.pop());
				}
			}
			return stackPop.pop();
		}

		/**
		 * 均为空，则报错
		 * pop为空的情况下，将push中的数据全部放入pop，从pop中取出第一个
		 * @return
		 */
		public int peek() {
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			} else if (stackPop.empty()) {
				while (!stackPush.empty()) {
					stackPop.push(stackPush.pop());
				}
			}
			return stackPop.peek();
		}
	}

	public static void main(String[] args) {
		TwoStacksQueue test = new TwoStacksQueue();
		test.add(1);
		test.add(2);
		test.add(3);
		System.out.println(test.peek());
		System.out.println(test.poll());
		System.out.println(test.peek());
		System.out.println(test.poll());
		System.out.println(test.peek());
		System.out.println(test.poll());
	}

}

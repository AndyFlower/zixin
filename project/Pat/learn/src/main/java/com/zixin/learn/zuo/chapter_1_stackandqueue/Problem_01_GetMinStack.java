package com.zixin.learn.zuo.chapter_1_stackandqueue;

import java.util.Stack;

public class Problem_01_GetMinStack {
	public static class MyStack1 {
		//数据栈
		private Stack<Integer> stackData;
		//最小值栈
		private Stack<Integer> stackMin;

		//构造函数，初始化两个栈
		public MyStack1() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		/**
		 * push:数据栈直接放入  最小值栈如果为空则放入，否则比较新值和最小值栈顶，只有新值更小的时候才放入
		 * @param newNum
		 */
		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			} else if (newNum <= this.getmin()) {
				this.stackMin.push(newNum);
			}
			this.stackData.push(newNum);
		}

		/**
		 * pop:数据栈取一个元素，还要和最小值栈比较，如果当前取出的数和最小值栈相等，则最小值栈pop，并且把数据返回
		 * @return
		 */
		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			int value = this.stackData.pop();
			if (value == this.getmin()) {
				this.stackMin.pop();
			}
			return value;
		}

		/**
		 * 获取最小元素 ：取最小值栈的栈顶
		 * @return
		 */
		public int getmin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			return this.stackMin.peek();
		}
	}

	public static class MyStack2 {
		//数据栈
		private Stack<Integer> stackData;
		//最小值栈
		private Stack<Integer> stackMin;

		//构造函数，初始化数据栈和最小值栈
		public MyStack2() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		/**
		 * 栈内添加元素：
		 *     数据栈直接添加，最小值栈如果为空直接添加，如果新数据小于等于最小值栈的栈顶将新数据入栈，否则将最小值栈的栈顶重复压入栈中
		 * @param newNum
		 */
		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			} else if (newNum < this.getmin()) {
				this.stackMin.push(newNum);
			} else {
				int newMin = this.stackMin.peek();
				this.stackMin.push(newMin);
			}
			this.stackData.push(newNum);
		}

		/**
		 * pop:不空的话数据栈和最小值栈同时pop
		 * @return
		 */
		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			this.stackMin.pop();
			return this.stackData.pop();
		}

		/**
		 * 获取最小值：最小值栈的栈顶就是当前的最小值
		 * @return
		 */
		public int getmin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			return this.stackMin.peek();
		}
	}

	public static void main(String[] args) {
		MyStack1 stack1 = new MyStack1();
		stack1.push(3);
		System.out.println(stack1.getmin());
		stack1.push(4);
		System.out.println(stack1.getmin());
		stack1.push(1);
		System.out.println(stack1.getmin());
		System.out.println(stack1.pop());
		System.out.println(stack1.getmin());

		System.out.println("=============");

		MyStack1 stack2 = new MyStack1();
		stack2.push(3);
		System.out.println(stack2.getmin());
		stack2.push(4);
		System.out.println(stack2.getmin());
		stack2.push(1);
		System.out.println(stack2.getmin());
		System.out.println(stack2.pop());
		System.out.println(stack2.getmin());
	}

}

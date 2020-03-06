package com.zixin.learn.zuo.chapter_1_stackandqueue;

import java.util.Stack;
/**
 * @Desc 用一个栈实现另一个栈的排序  只允许申请一个栈 不允许申请另外的数据结构
 * @author sangliping
 *
 */
public class Problem_05_StackSortStack {

	public static void sortStackByStack(Stack<Integer> stack) {
		//申请一个help栈
		Stack<Integer> help = new Stack<Integer>();
		//数据栈不空的时候
		while (!stack.isEmpty()) {
			//获得栈顶
			int cur = stack.pop();
			//如果help的数据不为空，并且help的栈顶元素小于当前元素
			while (!help.isEmpty() && help.peek() < cur) {
				//将help的元素放入stack
				System.out.println(help.peek()+"小于"+cur +"将help的元素放入stack");
				stack.push(help.pop());
			}
			//help为空  或者help的栈顶大于等于当前元素 当前元素放入help栈中
			System.out.println((help.isEmpty())?"为空将"+cur+"放入help":help.peek()+"大于等于"+cur +"将"+cur+"放入help");
			help.push(cur);
		}
		//help不为空的时候，将help的元素放入stack中
		while (!help.isEmpty()) {
			stack.push(help.pop());
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(1);
		stack.push(6);
		stack.push(2);
		stack.push(5);
		stack.push(4);
		sortStackByStack(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}

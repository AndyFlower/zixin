package com.zixin.learn.zuo.chapter_1_stackandqueue;

import java.util.Stack;

public class Problem_06_HanoiStack {

	public static int hanoiProblem1(int num, String left, String mid,
			String right) {
		if (num < 1) {
			return 0;
		}
		return process(num, left, mid, right, left, right);
	}

	public static int process(int num, String left, String mid, String right,
			String from, String to) {
		//只有一层需要移动的时候
		if (num == 1) {
			//如果from或to有一个是mid，说明是从右往中，或从左往中，直接移动即可。
			if (from.equals(mid) || to.equals(mid)) {
				System.out.println("Move 1 from " + from + " to " + to);
				return 1;
			} else {
				//否则说明是从左到右，或从右到左，都需要两步，先到中间，再到目的地
				System.out.println("Move 1 from " + from + " to " + mid);
				System.out.println("Move 1 from " + mid + " to " + to);
				return 2;
			}
		}
		//当层数大于1的时候，且有一个是到中间
		if (from.equals(mid) || to.equals(mid)) {
			//如果是从左到中，或者中到左 another就为右，否则就为左，就是说现在参与的是左中，那么剩下的一个是右，同理右中
			String another = (from.equals(left) || to.equals(left)) ? right : left;
			//递归处理n-1层，从当前的from到另一端，即从做到右，或从右到左
			int part1 = process(num - 1, left, mid, right, from, another);
			//将第N层塔从左移到中或从右移到中
			int part2 = 1;
			System.out.println("Move " + num + " from " + from + " to " + to);
			//将1~N-1层塔全部从右移到中,或者从左移动中
			int part3 = process(num - 1, left, mid, right, another, to);
			return part1 + part2 + part3;
		} else {
			//从左到右或者从右到左  递归处理n-1层
			//将1~N-1层塔先全部从左移动到右或从右移到左
			int part1 = process(num - 1, left, mid, right, from, to);
			//将第N层塔从左移动到中 或从右移到中
			int part2 = 1;
			System.out.println("Move " + num + " from " + from + " to " + mid);
			//将1~N-1层塔从右移到左 或相反
			int part3 = process(num - 1, left, mid, right, to, from);
			//N层从中移到右
			int part4 = 1;
			System.out.println("Move " + num + " from " + mid + " to " + to);
			//最后将1~N-1层塔全部从左移到右，交给递归过程
			int part5 = process(num - 1, left, mid, right, from, to);
			return part1 + part2 + part3 + part4 + part5;
		}
	}

	public static enum Action {
		No, LToM, MToL, MToR, RToM
	}

	public static int hanoiProblem2(int num, String left, String mid, String right) {
		//左栈
		Stack<Integer> lS = new Stack<Integer>();
		//中栈
		Stack<Integer> mS = new Stack<Integer>();
		//右栈
		Stack<Integer> rS = new Stack<Integer>();
		lS.push(Integer.MAX_VALUE);
		mS.push(Integer.MAX_VALUE);
		rS.push(Integer.MAX_VALUE);
		//从num开始由大到小依次入左栈
		for (int i = num; i > 0; i--) {
			lS.push(i);
		}
		Action[] record = { Action.No };
		int step = 0;
		//如果右栈的个数不等于num+1说明还没有移动完
		while (rS.size() != num + 1) {
			step += fStackTotStack(record, Action.MToL, Action.LToM, lS, mS, left, mid);
			step += fStackTotStack(record, Action.LToM, Action.MToL, mS, lS, mid, left);
			step += fStackTotStack(record, Action.RToM, Action.MToR, mS, rS, mid, right);
			step += fStackTotStack(record, Action.MToR, Action.RToM, rS, mS, right, mid);
		}
		return step;
	}

	public static int fStackTotStack(Action[] record, Action preNoAct,
			Action nowAct, Stack<Integer> fStack, Stack<Integer> tStack,
			String from, String to) {
		if (record[0] != preNoAct && fStack.peek() < tStack.peek()) {
			tStack.push(fStack.pop());
			System.out.println("Move " + tStack.peek() + " from " + from + " to " + to);
			record[0] = nowAct;
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int num = 4;

		// solution 1
		//int steps1 = hanoiProblem1(num, "left", "mid", "right");
		//System.out.println("It will move " + steps1 + " steps.");
		//System.out.println("===================================");

		// solution 2
		int steps2 = hanoiProblem2(num, "left", "mid", "right");
		System.out.println("It will move " + steps2 + " steps.");
		System.out.println("===================================");

	}

}
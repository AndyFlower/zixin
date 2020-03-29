package com.zixin.learn.nnuo;

import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Stack<Object> stack=new Stack<Object>();
        //1.empty()栈是否为空
        System.out.println(stack.empty());
        //2.peek()栈顶值    
        stack.push(1);
        //3.进栈push()
        stack.push("b");
        System.out.println(stack.peek());
        //4.pop()出栈
        stack.pop();
        System.out.println(stack.peek());


	}

}

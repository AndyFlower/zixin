package com.zixin.learn.easy.day04;

import java.util.Stack;

/**
 * 
 * @ClassName: PreInPosTraversal
 * @Description: 递归版和非递归版本的先序、中序、后序遍历
 * @author Administrator
 * @date 2020-03-21 17:35:38
 */
public class PreInPosTraversal {

	/**
	 * 
	 * @ClassName: Node
	 * @Description: 定义一个树的结点
	 * @author Administrator
	 * @date 2020-03-21 17:36:18
	 */
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    /**
     * 递归版本实现先序、中序、后序遍历，唯一变化就是 print() 函数位置不同。
     * 
     */
    // 先序遍历：中、左、右
    public static void preOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    // 中序遍历：左、中、右
    public static void inOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        inOrderRecur(head.left);
        System.out.print(head.value + " ");
        inOrderRecur(head.right);
    }

    // 后序遍历：左、右、中
    public static void posOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.print(head.value + " ");
    }


    /**
     * 非递归版本实现先序、中序、后序遍历
     *
     * @param head
     */
    public static void preOrderUnRecur(Node head) {
        System.out.print("pre-order: ");
        if (head != null) {
            // 准备一个栈
            Stack<Node> stack = new Stack<Node>();
            // 放入头结点
            stack.add(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.print(head.value + " ");
                if (head.right != null) {//有右先压右
                    stack.push(head.right);
                }
                if (head.left != null) {//再压左
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }

    /**
     * 
     * @Title: inOrderUnRecur
     * @Description: head不空或者栈不空  头结点压进去 然后一直往左走  
     * 如果当前结点为空 从栈哪一个  打印，当前结点向右 ，如果当前结点不空 则压入栈  向左
     * @author Administrator
     * @date 2020-03-21 17:49:04
     * @param @param head 参数
     * @return void 返回类型
     * @throws
     */
    public static void inOrderUnRecur(Node head) {
        System.out.print("in-order: ");
        if (head != null) {
            Stack<Node> stack = new Stack<Node>();
            while (!stack.isEmpty() || head != null) {//注意这里  是栈不为空或者头结点不为空
                // 首先压入头结点然后一直压入所有的左孩子
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                    // 弹出栈顶然后一直弹出右孩子
                } else {
                    head = stack.pop();//拿出元素
                    System.out.print(head.value + " ");
                    head = head.right;//然后向右
                }
            }
        }
        System.out.println();
    }

     /**
      * 
      * @Title: posOrderUnRecur1
      * @Description: 后序遍历：先使用中左右的顺序将元素压入栈中，然后遍历栈弹出即可
      * 使用一个辅助栈    左右中   根据前面的先序可以实现 中右左   然后不打印  放入辅助栈   最后再打印辅助栈  就是逆序   左右中
      * @author Administrator
      * @date 2020-03-21 17:59:53
      * @param @param head 参数
      * @return void 返回类型
      * @throws
      */
    public static void posOrderUnRecur1(Node head) {
        System.out.print("pos-order: ");
        if (head != null) {
            Stack<Node> stack1 = new Stack<Node>();
            Stack<Node> stack2 = new Stack<Node>();
            stack1.push(head);
            // 这里和前序遍历类似，只不过左右节点压入顺序相反
            while (!stack1.isEmpty()) {
                head = stack1.pop();
                // 将打印语句替换为压栈语句
                stack2.push(head);
                if (head.left != null) {
                    stack1.push(head.left);
                }
                if (head.right != null) {
                    stack1.push(head.right);
                }
            }
            // 逐个弹出栈 stack2 中元素即为左、右、中顺序
            while (!stack2.isEmpty()) {
                System.out.print(stack2.pop().value + " ");
            }
        }
        System.out.println();
    }

    /**
     * 
     * @Title: posOrderUnRecur2
     * @Description: 另一种实现后续：使用一个栈 
     * 上一个方法使用了2个栈  这个只使用一个栈
     * @author Administrator
     * @date 2020-03-21 18:03:17
     * @param @param h 参数
     * @return void 返回类型
     * @throws
     */
    public static void posOrderUnRecur2(Node h) {
        System.out.print("pos-order: ");
        if (h != null) {
            Stack<Node> stack = new Stack<Node>();
            stack.push(h);
            Node c = null;
            while (!stack.isEmpty()) {
                c = stack.peek();
                if (c.left != null && h != c.left && h != c.right) {
                    stack.push(c.left);
                } else if (c.right != null && h != c.right) {
                    stack.push(c.right);
                } else {
                    System.out.print(stack.pop().value + " ");
                    h = c;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.left = new Node(3);
        head.right = new Node(8);
        head.left.left = new Node(2);
        head.left.right = new Node(4);
        head.left.left.left = new Node(1);
        head.right.left = new Node(7);
        head.right.left.left = new Node(6);
        head.right.right = new Node(10);
        head.right.right.left = new Node(9);
        head.right.right.right = new Node(11);

        // recursive
        System.out.println("==============递归版本==============");
        System.out.print("pre-order: ");
        preOrderRecur(head);
        System.out.println();
        System.out.print("in-order: ");
        inOrderRecur(head);
        System.out.println();
        System.out.print("pos-order: ");
        posOrderRecur(head);
        System.out.println();

        // unRecursive
        System.out.println("============非递归版本=============");
        preOrderUnRecur(head);
        inOrderUnRecur(head);
        posOrderUnRecur1(head);
        posOrderUnRecur2(head);
    }
}

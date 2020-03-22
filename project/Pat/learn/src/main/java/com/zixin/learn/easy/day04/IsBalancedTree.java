package com.zixin.learn.easy.day04;

/**
 * 
 * @ClassName: IsBalancedTree
 * @Description: 判断是否为平衡树
 * @author Administrator
 * @date 2020-03-22 11:17:59
 */
public class IsBalancedTree {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isBalance(Node head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(head, 1, res);
        return res[0];
    }

    public static int getHeight(Node head, int level, boolean[] res) {
        if (head == null) {
            return level;
        }
        int leftHight = getHeight(head.left, level + 1, res);
        if (!res[0]) {
            return level;
        }
        int rightHight = getHeight(head.right, level + 1, res);
        if (!res[0]) {
            return level;
        }
        // 如果左右高度差大于 1 则返回 false
        if (Math.abs(leftHight - rightHight) > 1) {
            res[0] = false;
        }
        return Math.max(leftHight, rightHight);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

        System.out.println(isBalance(head));
    }
}

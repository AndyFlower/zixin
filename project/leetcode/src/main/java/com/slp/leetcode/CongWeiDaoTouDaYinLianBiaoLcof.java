package com.slp.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName CongWeiDaoTouDaYinLianBiaoLcof
 * @Description 从尾到头打印链表
 * @Author sanglp
 * @Date 2020/9/15 17:00
 * @Version 1.0
 **/
public class CongWeiDaoTouDaYinLianBiaoLcof {

    public static void main(String[] args) {
    ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(2);
        first.next=second;
        second.next=third;
        third.next = null;
        int [] res =reversePrint(first);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }

    }
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> s = new Stack();
        ListNode ite = head;
        while (ite!=null){
            s.push(ite.val);
           ite = ite.next;
        }
        int k=0;
        int size = s.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.pop();
        }
        return arr;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}


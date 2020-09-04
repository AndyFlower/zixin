package com.slp.leetcode;

/**
 * @ClassName AddTwoNumbers
 * @Description 两数相加
 * @Author sanglp
 * @Date 2020/9/4 16:16
 * @Version 1.0
 **/
public class AddTwoNumbers {
    public static void main(String[] args) {
        //1.测试用例1  243+564
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        ListNode result = addTwoNumbers(listNode1,listNode4);
        while (result!=null){
            System.out.print(result.val);
            result = result.next;
        }
        System.out.println("");
        //2、测试用例2 当有一个列表为空
        result = addTwoNumbers(listNode1,null);
        while (result!=null){
            System.out.print(result.val);
            result = result.next;
        }
        System.out.println("");
        //3.测试用例3 两个链表的长度不一致
        ListNode listNode7 = new ListNode(5);
        listNode6.next = listNode7;
        result = addTwoNumbers(listNode1,listNode4);
        while (result!=null){
            System.out.print(result.val);
            result = result.next;
        }
        System.out.println("");

        //3.测试用例4 两个链表相加最后进位
        ListNode listNode8 = new ListNode(5);
        listNode3.next = listNode8;
        result = addTwoNumbers(listNode1,listNode4);
        while (result!=null){
            System.out.print(result.val);
            result = result.next;
        }
        System.out.println("");
    }

    /**
     * @desc 算法实现
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);//新建一个哑结点  这个节点的意义主要是为了方便返回的 返回之后就可以直接通过next获取数据域
        ListNode cur = pre;//当前节点指向哑结点
        int carry = 0;//carry表示是否有进位 进位最大是1 因为9+9+1=19
        while (l1 != null || l2 != null) {//判断两个链表是否为null 只要有一个列表还未到尾节点就继续运算
            //如果已经有一个链表的节点为空了 那么就以0来补齐
            int x = l1 == null ? 0 : l1.val;//如果为null为补0，否则就是取该节点的值
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;//默认进位的地方是1
            //对两个数字相加的结果进行处理 得出进位和当前位的值 根据当前位的值创建新的节点 当前节点的下一个节点指向新节点 并将当前节点后移
            carry = sum / 10;//这里是处理是否有进位
            sum = sum % 10;//这里是处理当前的结果
            cur.next = new ListNode(sum);//根据结果构建下一个节点

            cur = cur.next;//当前节点指向下一个节点
            if (l1 != null) {//不为空 向后走
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        //循环完之后 要看最后还有没有进位 如果有的话就需要再新加一个节点
        if (carry == 1) {//循环完之后，如果最后一个有进位，则需要单独处理
            cur.next = new ListNode(carry);
        }
        return pre.next;//返回pre.next的原因是，最开始创建的时候有一个pre节点，从pre的下一个节点开始，才是真正的数据节点的开头
    }
}

/**
 * 列表节点定义
 */
class ListNode{
    int val;//节点的值
    ListNode next;//下一个节点
    ListNode(int x){//使用构造函数新建一个节点
        val = x;
    }

}
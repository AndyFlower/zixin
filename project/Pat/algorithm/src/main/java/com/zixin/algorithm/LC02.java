package com.zixin.algorithm;

public class LC02 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode temp1 = new ListNode(4);
		ListNode temp2 = new ListNode(3);
		l1.next = temp1;
		temp1.next = temp2;

		ListNode l2 = new ListNode(5);
		ListNode temp3 = new ListNode(6);
		ListNode temp4 = new ListNode(4);
		l2.next = temp3;
		temp3.next = temp4;
		ListNode node = addTwoNumbers(l1, l2);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}

	}

	/**
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 * @Desc 注意点：1、如何返回结果对应的链表   pre.next
	 *            2、加的结果可能会出现进位
	 *            3、最后也可能会产生进位
	 *            4、两个链表长度不一致的时候，后面要补0
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode pre = new ListNode(0);
		ListNode cur = pre;
		int carry = 0;
		while (l1 != null || l2 != null) {// 判断两个链表是否为null
			int x = l1 == null ? 0 : l1.val;// 如果为null为补0，否则就是取该节点的值
			int y = l2 == null ? 0 : l2.val;
			int sum = x + y + carry;// 默认进位的地方是1

			carry = sum / 10;// 这里是处理是否有进位
			sum = sum % 10;// 这里是处理当前的结果
			cur.next = new ListNode(sum);// 根据结果构建下一个节点

			cur = cur.next;// 当前节点指向下一个节点
			if (l1 != null) {// 不为空 向后走
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (carry == 1) {// 循环完之后，如果最后一个有进位，则需要单独处理
			cur.next = new ListNode(carry);
		}
		return pre.next;// 返回pre.next的原因是，最开始创建的时候有一个pre节点，从pre的下一个节点开始，才是真正的数据节点的开头
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
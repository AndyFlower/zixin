
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学

package com.cute.leetcode.editor.cn;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {//判断两个链表是否为null
            int x = l1 == null ? 0 : l1.val;//如果为null为补0，否则就是取该节点的值
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;//默认进位的地方是1

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
        if (carry == 1) {//循环完之后，如果最后一个有进位，则需要单独处理
            cur.next = new ListNode(carry);
        }
        return pre.next;//返回pre.next的原因是，最开始创建的时候有一个pre节点，从pre的下一个节点开始，才是真正的数据节点的开头
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}    
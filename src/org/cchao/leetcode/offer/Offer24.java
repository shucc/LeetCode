package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/3
 * @Description 反转链表
 */
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (null != cur) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode tempNode = null;
        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = tempNode;
            tempNode = node;
        }
        return tempNode;
    }
}

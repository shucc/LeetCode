package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/3
 * @Description 反转链表
 */
public class Offer8_24 {
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
}

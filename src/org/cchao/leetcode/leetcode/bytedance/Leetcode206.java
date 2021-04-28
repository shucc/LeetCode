package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/04/28
 * @Description 反转链表
 */
public class Leetcode206 {

    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode nowNode = null;
        while (head != null) {
            nowNode = new ListNode(head.val);
            nowNode.next = preNode;
            preNode = nowNode;
            head = head.next;
        }
        return nowNode;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

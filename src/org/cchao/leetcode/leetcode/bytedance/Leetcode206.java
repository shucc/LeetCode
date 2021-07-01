package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/04/28
 * @Description 反转链表
 */
public class Leetcode206 {

    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        while (null != head) {
            ListNode nowNode = new ListNode(head.val);
            nowNode.next = prevNode;
            head = head.next;
            prevNode = nowNode;
        }
        return prevNode;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

package org.cchao.leetcode.first.linkedlist;

/**
 * Created by shucc on 18/6/1.
 * cc@cchao.org
 * 反转链表
 */
public class LeetCode206 {

    public static void main(String args[]) {
        int[] origin = new int[]{34, 1, 54, 7, 14};
        ListNode head = NodeCreate.create(origin);
        NodePrint.printNode(head);
        NodePrint.printNode(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode parentNode = null;
        ListNode nowNode = head;
        ListNode childNode = nowNode.next;
        while (null != nowNode) {
            nowNode.next = parentNode;
            parentNode = nowNode;
            nowNode = childNode;
            if (null != childNode) {
                childNode = childNode.next;
            }
        }
        return parentNode;
    }
}

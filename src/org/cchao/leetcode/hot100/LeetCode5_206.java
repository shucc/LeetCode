package org.cchao.leetcode.hot100;

public class LeetCode5_206 {
    public ListNode reverseList(ListNode head) {
        ListNode nextNode = null;
        ListNode tempNode;
        while (head != null) {
            tempNode = nextNode;
            nextNode = new ListNode(head.val);
            nextNode.next = tempNode;
            head = head.next;
        }
        return nextNode;
    }
}

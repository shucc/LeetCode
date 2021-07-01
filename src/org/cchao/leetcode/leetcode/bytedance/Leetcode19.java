package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/06/30
 * @Description 删除链表的倒数第k个节点
 */
public class Leetcode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head || null == head.next) {
            return null;
        }
        ListNode tempHead = head;
        int tempN = n;
        while (tempN > 0) {
            tempHead = tempHead.next;
            tempN--;
        }
        ListNode resNode = new ListNode(0);
        resNode.next = head;
        ListNode prevNode = null;
        while (tempHead != null) {
            tempHead = tempHead.next;
            prevNode = head;
            head = head.next;
        }
        if (null != prevNode) {
            prevNode.next = head == null ? null : head.next;
        } else {
            return head.next;
        }
        return resNode.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode first = head;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode second = dummy;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

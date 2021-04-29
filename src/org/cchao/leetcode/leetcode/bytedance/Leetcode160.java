package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/04/29
 * @Description 相交链表
 */
public class Leetcode160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode originA = headA;
        ListNode originB = headB;
        while (headA != headB) {
            headA = (headA == null ? originB : headA.next);
            headB = (headB == null ? originA : headB.next);
        }
        return headA;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

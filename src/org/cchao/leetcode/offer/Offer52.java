package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/9
 * @Description 两个链表的第一个公共节点
 */
public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return curA;
    }
}

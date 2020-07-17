package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/17
 * @Description 相交链表
 */
public class ListNode06 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }
        ListNode firstA = headA;
        ListNode firstB = headB;
        while (headA != headB) {
            headA = (headA== null ? firstB : headA.next);
            headB = (headB == null ? firstA : headB.next);
        }
        return headA;
    }
}

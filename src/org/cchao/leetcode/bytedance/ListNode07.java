package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/17
 * @Description 合并K个有序链表
 */
public class ListNode07 {

    public ListNode mergeKLists2(ListNode[] lists) {
        if (null == lists || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode node = lists[0];
        for (int i = 1; i < lists.length; i++) {
            node = mergeListNode(node, lists[i]);
        }
        return node;
    }

    private ListNode mergeListNode(ListNode headA, ListNode headB) {
        if (null == headA) {
            return headB;
        }
        if (null == headB) {
            return headA;
        }
        if (headA.val < headB.val) {
            headA.next = mergeListNode(headA.next, headB);
            return headA;
        } else {
            headB.next = mergeListNode(headA, headB.next);
            return headB;
        }
    }
}

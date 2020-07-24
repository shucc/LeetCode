package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/3
 * @Description 合并两个排序的链表
 */
public class Offer25 {
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode node = res;
        while (null != l1 && null != l2) {
            if (l1.val < l2.val) {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            } else {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            }
        }
        node.next = (null == l1) ? l2 : l1;
        return res.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }
}

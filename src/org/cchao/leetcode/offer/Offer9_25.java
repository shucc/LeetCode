package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/3
 * @Description 合并两个排序的链表
 */
public class Offer9_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
}

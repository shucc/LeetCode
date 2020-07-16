package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/16
 * @Description 合并两个有序链表
 */
public class ListNode01 {

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
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

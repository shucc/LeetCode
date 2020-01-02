package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2020/1/2
 * @Description
 */
public class LeetCode21_141 {
    public boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (slow == null || fast == null) {
                return false;
            }
            slow = slow.next;
            fast = null == fast.next ? null : fast.next.next;
        }
        return true;
    }
}

package org.cchao.leetcode.leetcode.bytedance;

import java.util.HashSet;

/**
 * @author cchen6
 * @Date on 2021/08/02
 * @Description  环形链表
 */
public class Leetcode142 {

    public ListNode detectCycle(ListNode head) {
        if (null == head || head.next == null) {
            return null;
        }
        HashSet<ListNode> hashSet = new HashSet<>();
        while (null != head) {
            if (hashSet.contains(head)) {
                return head;
            } else {
                hashSet.add(head);
            }
            head = head.next;
        }
        return null;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

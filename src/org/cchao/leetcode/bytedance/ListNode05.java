package org.cchao.leetcode.bytedance;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cchen6
 * @Date on 2020/7/16
 * @Description 环形列表2
 */
public class ListNode05 {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (null != head) {
            if (nodeSet.size() > 0 && nodeSet.contains(head)) {
                return head;
            }
            nodeSet.add(head);
            head = head.next;
        }
        return null;
    }

    public ListNode detectCycle2(ListNode head) {
        if (null == head || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (null == fast || null == fast.next) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

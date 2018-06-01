package org.cchao.leetcode.linkedlist;

import java.util.List;

/**
 * Created by shucc on 18/5/31.
 * cc@cchao.org
 * 删除所有和val相等的链表结点
 */
public class LeetCode203 {

    public ListNode removeElements2(ListNode head, int val) {
        ListNode tempNode = new ListNode(0);
        tempNode.next = head;
        ListNode nowNode = tempNode;
        while (null != nowNode.next) {
            if (val == nowNode.next.val) {
                nowNode.next = nowNode.next.next;
            } else {
                nowNode = nowNode.next;
            }
        }
        return tempNode.next;
    }

    public ListNode removeElements(ListNode head, int val) {
        if (null == head) {
            return null;
        }
        ListNode nowNode = head;
        ListNode parentNode = null;
        while (null != nowNode) {
            if (val != nowNode.val) {
                parentNode = nowNode;
                nowNode = nowNode.next;
            } else {
                ListNode nextNode = nowNode.next;
                if (null == nextNode) {
                    if (null == parentNode) {
                        return null;
                    } else {
                        parentNode.next = null;
                    }
                    break;
                }
                nowNode.next = nextNode.next;
                nowNode.val = nextNode.val;
            }
        }
        return head;
    }
}

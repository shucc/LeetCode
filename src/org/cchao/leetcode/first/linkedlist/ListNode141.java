package org.cchao.leetcode.first.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shucc on 18/6/1.
 * cc@cchao.org
 * 判断环形链表
 */
public class ListNode141 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (null != head) {
            if (nodeSet.contains(head)) {
                return true;
            } else {
                nodeSet.add(head);
            }
            head = head.next;
        }
        return false;
    }
}

package org.cchao.leetcode.first.linkedlist;

/**
 * Created by shucc on 18/5/31.
 * cc@cchao.org
 * 删除链表节点
 */
public class LeetCode237 {

    public void deleteNode(ListNode node) {
        ListNode childNode = node.next;
        node.next = childNode.next;
        node.val = childNode.val;
    }
}

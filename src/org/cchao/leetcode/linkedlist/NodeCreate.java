package org.cchao.leetcode.linkedlist;

/**
 * Created by shucc on 18/6/1.
 * cc@cchao.org
 */
public class NodeCreate {

    public static ListNode create(int[] nodeNumbers) {
        ListNode resultNode = new ListNode(nodeNumbers[0]);
        ListNode nowNode = resultNode;
        for (int i = 1; i < nodeNumbers.length; i++) {
            nowNode.next = new ListNode(nodeNumbers[i]);
            nowNode = nowNode.next;
        }
        return resultNode;
    }
}

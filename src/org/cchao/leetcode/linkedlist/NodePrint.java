package org.cchao.leetcode.linkedlist;

/**
 * Created by shucc on 18/6/1.
 * cc@cchao.org
 */
public class NodePrint {

    public static void printNode(ListNode head) {
        ListNode nowNode = head;
        while (null != nowNode) {
            System.out.print(String.valueOf(nowNode.val) + "-->");
            nowNode = nowNode.next;
        }
        System.out.println("");
    }
}

package org.cchao.leetcode.linkedlist;

/**
 * Created by shucc on 18/6/1.
 * cc@cchao.org
 * 合并两个有序列表
 */
public class LeetCode21 {

    public static void main(String args[]) {
        int[] array1 = new int[]{1, 4, 656, 767};
        int[] array2 = new int[]{2, 45, 234, 342, 578, 999};
        ListNode node1 = NodeCreate.create(array1);
        ListNode node2 = NodeCreate.create(array2);
        ListNode resultNode = mergeTwoLists(node1, node2);
        NodePrint.printNode(resultNode);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode nowNode = tempNode;
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (null != node1 || null != node2) {
            if (null == node1) {
                nowNode.next = node2;
                break;
            } else if (null == node2) {
                nowNode.next = node1;
                break;
            } else {
                if (node1.val < node2.val) {
                    nowNode.next = new ListNode(node1.val);
                    node1 = node1.next;
                } else {
                    nowNode.next = new ListNode(node2.val);
                    node2 = node2.next;
                }
                nowNode = nowNode.next;
            }
        }
        return tempNode.next;
    }
}

package org.cchao.leetcode.linkedlist;

/**
 * Created by shucc on 18/5/31.
 * cc@cchao.org
 */
public class LeetCode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempNode = new ListNode(0);
        tempNode.next = head;
        ListNode nowNode = head;
        int count = 0;
        while (null != nowNode) {
            count++;
            nowNode = nowNode.next;
        }
        int deleteIndex = count - n;
        nowNode = tempNode;
        while (deleteIndex > 0) {
            deleteIndex--;
            nowNode = nowNode.next;
        }
        nowNode.next = nowNode.next.next;
        return tempNode.next;
    }
}

package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/16
 * @Description 反转链表
 */
public class ListNode02 {

    public ListNode reverseList(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode tempNode = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = tempNode;
            tempNode = head;
            head = nextNode;
        }
        return tempNode;
    }
}

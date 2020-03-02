package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/2/27
 * @Description 链表中倒数第k个节点
 */
public class Offer2_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int num = 1;
        ListNode tempNode = head;
        while (null != tempNode) {
            tempNode = tempNode.next;
            num++;
        }
        k = num - k - 1;
        while (k > 0) {
            head = head.next;
            k--;
        }
        return head;
    }
}

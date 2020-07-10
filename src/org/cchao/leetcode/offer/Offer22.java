package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/2/27
 * @Description 链表中倒数第k个节点
 */
public class Offer22 {
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

    /**
     * 双指针法
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode before = head;
        //before先走k步
        while (k > 0) {
            before = before.next;
            k--;
        }
        ListNode after = head;
        while (before != null) {
            before = before.next;
            after = after.next;
        }
        return after;
    }
}

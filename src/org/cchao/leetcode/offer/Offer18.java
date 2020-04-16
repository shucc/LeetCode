package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/9
 * @Description 删除链表的节点
 */
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode curNode = new ListNode(0);
        curNode.next = head;
        ListNode resNode = curNode;
        while (null != curNode && null != curNode.next) {
            if (curNode.next.val == val) {
                curNode.next = curNode.next.next;
                break;
            }
            curNode = curNode.next;
        }
        return resNode.next;
    }
}

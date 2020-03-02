package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/2
 * @Description 从尾到头打印链表
 */
public class Offer7_6 {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int num = 0;
        while (null != node) {
            node = node.next;
            num++;
        }
        int[] res = new int[num];
        int index = num - 1;
        while (null != head) {
            res[index] = head.val;
            head = head.next;
            index--;
        }
        return res;
    }
}

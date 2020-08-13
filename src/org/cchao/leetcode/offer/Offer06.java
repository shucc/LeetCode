package org.cchao.leetcode.offer;

import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2020/3/2
 * @Description 从尾到头打印链表
 */
public class Offer06 {
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

    public int[] reversePrint2(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (null != head) {
            stack.push(head);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (i < res.length) {
            res[i] = stack.pop().val;
            i++;
        }
        return res;
    }
}

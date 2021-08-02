package org.cchao.leetcode.leetcode.bytedance;

import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2021/08/02
 * @Description 删除排序链表中的重复元素 II
 */
public class Leetcode82 {

    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        boolean needPop = false;
        while (null != head) {
            if (!stack.isEmpty() && stack.peek().val == head.val) {
                head = head.next;
                needPop = true;
                continue;
            }
            if (needPop) {
                stack.pop();
            }
            needPop = false;
            stack.push(head);
            head = head.next;
        }
        if (needPop) {
            stack.pop();
        }
        ListNode nowNode = null;
        while (!stack.isEmpty()) {
            ListNode popNode = stack.pop();
            popNode.next = nowNode;
            nowNode = popNode;
        }
        return nowNode;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

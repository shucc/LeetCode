package org.cchao.leetcode.first.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shucc on 18/6/1.
 * cc@cchao.org
 * 判断回文链表
 */
public class ListNode234 {

    public static void main(String args[]) {
        int[] array = new int[]{1, 1, 2, 1};
        ListNode head = NodeCreate.create(array);
        NodePrint.printNode(head);
        System.out.println(String.valueOf(isPalindrome2(head)));
    }

    public static boolean isPalindrome(ListNode head) {
        if (null == head) {
            return true;
        }
        List<Integer> headArray = new ArrayList<>();
        ListNode nowNode = head;
        while (null != nowNode) {
            headArray.add(nowNode.val);
            nowNode = nowNode.next;
        }
        int size = headArray.size();
        for (int i = 0; i < size / 2; i++) {
            if (!headArray.get(i).equals(headArray.get(size - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(ListNode head) {
        if (null == head) {
            return true;
        }
        StringBuilder originStr = new StringBuilder();
        StringBuilder reverseStr = new StringBuilder();
        ListNode nowNode = head;
        while (null != nowNode) {
            originStr.append(head.val);
            reverseStr.insert(0, head.val);
            nowNode = nowNode.next;
        }
        return originStr.toString().equals(reverseStr.toString());
    }
}

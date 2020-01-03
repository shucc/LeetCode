package org.cchao.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2020/1/3
 * @Description
 */
public class LeetCode24_231 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> valList = new ArrayList<>();
        while (null != head) {
            valList.add(head.val);
            head = head.next;
        }
        int length = valList.size();
        int start = 0;
        int end = length - 1;
        while (start < end) {
            if (!valList.get(start).equals(valList.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        StringBuilder leftStr = new StringBuilder();
        StringBuilder rightStr = new StringBuilder();
        while (null != head) {
            leftStr.append(head.val);
            rightStr.insert(0, head.val);
            head = head.next;
        }
        return leftStr.toString().equals(rightStr.toString());
    }

    public boolean isPalindrome3(ListNode head) {
        ListNode pre = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = pre;
            pre = slow;
            slow = temp;
        }
        if(fast != null) slow = slow.next;
        //遍历链表判断是否相同
        while(pre != null){
            if(pre.val != slow.val){
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}

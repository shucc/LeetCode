package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/16
 * @Description 两数相加
 */
public class ListNode03 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tempNode = new ListNode(0);
        res.next = tempNode;
        int num = 0;
        while (null != l1 || null != l2) {
            ListNode node;
            if (null == l1) {
                node = new ListNode((l2.val + num) % 10);
                num = (l2.val + num) / 10;
                l2 = l2.next;
            } else if (null == l2) {
                node = new ListNode((l1.val + num) % 10);
                num = (l1.val + num) / 10;
                l1 = l1.next;
            } else {
                node = new ListNode((l2.val + l1.val + num) % 10);
                num = (l2.val + l1.val + num) / 10;
                l2 = l2.next;
                l1 = l1.next;
            }
            tempNode.next = node;
            tempNode = node;
        }
        if (num > 0) {
            tempNode.next = new ListNode(num);
        }
        return res.next;
    }
}

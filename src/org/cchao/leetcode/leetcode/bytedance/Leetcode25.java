package org.cchao.leetcode.leetcode.bytedance;

/**
 * K 个一组翻转链表
 */
public class Leetcode25 {

    public static void main(String[] args) {
        ListNode rootNode = new ListNode(0);
        ListNode tempNode = new ListNode(1);
        rootNode.next = tempNode;
        for (int i = 2; i <= 5; i++) {
            tempNode.next = new ListNode(i);
            tempNode = tempNode.next;
        }
        Leetcode25 leetcode25 = new Leetcode25();
        ListNode resNode = leetcode25.reverseKGroup(rootNode.next, 4);
        leetcode25.printNode(rootNode.next);
        leetcode25.printNode(resNode);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (null == head || head.next == null) {
            return head;
        }
        ListNode originNode = head;
        //k个node翻转后的最后的node
        ListNode lastNode = null;
        ListNode preNode = null;
        //k个node翻转后的最前面的node
        ListNode nowNode = null;
        int i = 0;
        while (head != null && i < k) {
            i++;
            nowNode = new ListNode(head.val);
            nowNode.next = preNode;
            if (null == lastNode) {
                lastNode = nowNode;
            }
            preNode = nowNode;
            head = head.next;
        }
        //翻转后发现这次翻转剩余node数不大于k，要保持原有顺序
        if (i < k) {
            return originNode;
        }
        if (null != head) {
            //使用递归翻转当前最后一个node后面的ListNode
            ListNode nextNode = reverseKGroup(head, k);
            if (null != lastNode) {
                lastNode.next = nextNode;
            }
        }
        return nowNode;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private void printNode(ListNode node) {
        StringBuilder nodeStr = new StringBuilder();
        while (null != node) {
            nodeStr.append(node.val).append("-->");
            node = node.next;
        }
        System.out.println(nodeStr.toString());
    }
}

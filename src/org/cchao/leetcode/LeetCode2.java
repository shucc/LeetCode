package org.cchao.leetcode;

/**
 * Created by shucc on 18/1/10.
 * cc@cchao.org
 */
public class LeetCode2 {

    public static void main(String[] args) {
        ListNode listNodeA = createNode(new int[] {2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,9});
        ListNode listNodeB = createNode(new int[] {5,6,4,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,9,9,9,9});

        ListNode listNode1 = createNode(new int[]{2, 4, 3});
        ListNode listNode2 = createNode(new int[] {5, 6, 4});

        ListNode resultNodeC = addTwoNumbers(listNodeA, listNodeB);
        ListNode resultNode3 = addTwoNumbers(listNode1, listNode2);
        System.out.println(getNodeNumber(resultNodeC));
        System.out.println(getNodeNumber(resultNode3));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(getNodeNumber(l1));
        java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(getNodeNumber(l2));
        java.math.BigDecimal bigDecimalResult = bigDecimal1.add(bigDecimal2);
        String result = bigDecimalResult.toString();
        //将相加的结果反转存入数组
        int[] resultArray = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            resultArray[i] = Integer.valueOf(String.valueOf(result.charAt(result.length() - i - 1)));
        }
        System.out.println();
        return createNode(resultArray);
    }

    public static String getNodeNumber(ListNode listNode) {
        StringBuilder result = new StringBuilder("");
        while (null != listNode) {
            String temp = result.toString();
            result.replace(0, temp.length(), String.valueOf(listNode.val));
            result.append(temp);
            listNode = listNode.next;
        }
        return result.toString();
    }

    private static ListNode createNode(int[] numberArray) {
        ListNode resultNode = null;
        int length = numberArray.length;
        for (int i = length - 1; i >= 0; i--) {
            ListNode tempNode = new ListNode(numberArray[i]);
            tempNode.next = resultNode;
            resultNode = tempNode;
        }
        return resultNode;
    }

    private static class ListNode {

        int val;

        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}

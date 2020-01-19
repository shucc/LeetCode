package org.cchao.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/1/17
 * @Description
 */
public class LeetCode39_148 {
    public ListNode sortList(ListNode head) {
        ListNode resNode = null;

        return resNode;
    }

    private ListNode sort(List<Integer> nums) {
        ListNode root = null;
        ListNode node = null;
        int min;
        int minIndex;
        for (int i = 0; i < nums.size(); i++) {
            min = nums.get(i);
            minIndex = i;
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) < min) {
                    min = nums.get(j);
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
            if (null == node) {
                node = new ListNode(min);
                root = node;
            } else {
                node.next = new ListNode(min);
                node = node.next;
            }
        }
        return root;
    }

    private void swap(List<Integer> nums, int i, int j) {
        if (i == j) {
            return;
        }
        nums.set(i, nums.get(i) + nums.get(j));
        nums.set(j, nums.get(i) - nums.get(j));
        nums.set(i, nums.get(i) - nums.get(j));
    }
}

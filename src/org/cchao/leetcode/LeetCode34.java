package org.cchao.leetcode;

/**
 * Created by shucc on 18/1/15.
 * cc@cchao.org
 */
public class LeetCode34 {

    public static void main(String args[]) {
        int[] temp = new int[] {5, 7, 7, 8, 8, 10};
        int[] result = searchRange(temp, 9);
        System.out.println(String.valueOf(result[0]) + "-->" + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                start = i;
                break;
            }
        }
        if (start != -1) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (target == nums[i]) {
                    end = i;
                    break;
                }
            }
        }
        return new int[] {start, end};
    }
}

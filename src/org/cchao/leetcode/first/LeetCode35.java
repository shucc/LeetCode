package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/1/15.
 * cc@cchao.org
 */
public class LeetCode35 {
    
    public static void main(String args[]) {
        int[] temp1 = new int[] {1,3,5,6};
        System.out.println(String.valueOf(searchInsert(temp1, 5)));
        System.out.println(String.valueOf(searchInsert(temp1, 2)));
        System.out.println(String.valueOf(searchInsert(temp1, 7)));
        System.out.println(String.valueOf(searchInsert(temp1, 0)));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (nums[i] > target) {
                if (i == 0 || nums[i - 1] < target) {
                    return i;
                }
            }
        }
        return nums.length;
    }
}

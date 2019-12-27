package org.cchao.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode11_448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[Math.abs(nums[i]) - 1];
            if (temp > 0) {
                nums[Math.abs(nums[i]) - 1] = -temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = new int[] {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(temp).toString());
    }
}

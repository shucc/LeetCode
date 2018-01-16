package org.cchao.leetcode;

import java.util.*;

/**
 * Created by shucc on 18/1/16.
 * cc@cchao.org
 */
public class LeetCode18 {

    public static void main(String args[]) {
        int[] temp1 = new int[] {1, 0, -1, 0, -2, 2};
        List<List<Integer>> result = fourSum(temp1, 0);
        System.out.println(result.toString());
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            result.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}

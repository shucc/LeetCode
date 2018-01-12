package org.cchao.leetcode;

import java.util.*;

/**
 * Created by shucc on 18/1/12.
 * cc@cchao.org
 */
public class LeetCode15 {

    public static void main(String[] args) {
        int[] temp1 = new int[] {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(temp1);
        System.out.println(result.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}

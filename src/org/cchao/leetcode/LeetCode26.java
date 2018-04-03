package org.cchao.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shucc on 18/1/22.
 * cc@cchao.org
 */
public class LeetCode26 {
    
    public static void main(String args[]) {
        int[] temp1 = new int[] {1, 1, 2};
        System.out.println(String.valueOf(removeDuplicates(temp1)));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(nums[i]);
        }
        return result.size();
    }
}

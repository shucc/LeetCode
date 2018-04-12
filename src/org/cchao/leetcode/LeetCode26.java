package org.cchao.leetcode;

import java.lang.reflect.Array;
import java.util.Collections;
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
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j > 0) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
        }
        return i + 1;
    }
}

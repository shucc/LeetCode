package org.cchao.leetcode.leetcode.bytedance;

import java.util.HashMap;

/**
 * @author cchen6
 * @Date on 2021/05/06
 * @Description 两数之和
 */
public class Leetcode1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.get(key) != null) {
                return new int[] {i, map.get(key)};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}

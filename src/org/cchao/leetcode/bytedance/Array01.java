package org.cchao.leetcode.bytedance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/7/13
 * @Description 三数之和
 */
public class Array01 {

    public static void main(String[] args) {
        int[] temp = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println(new Array01().threeSum(temp));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int third = nums.length - 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while (third > j) {
                    if (nums[i] + nums[j] + nums[third] < 0) {
                        break;
                    } else if (nums[i] + nums[j] + nums[third] > 0) {
                        third--;
                    } else {
                        List<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[third]);
                        res.add(integers);
                        break;
                    }
                }
            }
        }
        return res;
    }
}

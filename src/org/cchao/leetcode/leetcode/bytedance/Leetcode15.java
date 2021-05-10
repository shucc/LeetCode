package org.cchao.leetcode.leetcode.bytedance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2021/05/06
 * @Description 三数之和
 */
public class Leetcode15 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        Leetcode15 leetcode15 = new Leetcode15();
        List<List<Integer>> res = leetcode15.threeSum(nums);
        System.out.println(res.toString());
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 2) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int first = i + 1;
            int end = nums.length - 1;
            while (first < end) {
                //去重
                if (nums[first] + nums[end] == target) {
                    if (nums[first] == nums[first - 1] && end < nums.length - 1 &&  nums[end] == nums[end + 1]) {
                        first++;
                        end--;
                        continue;
                    }
                    List<Integer> tempRes = new ArrayList<>();
                    tempRes.add(nums[i]);
                    tempRes.add(nums[first]);
                    tempRes.add(nums[end]);
                    res.add(tempRes);
                    first++;
                    end--;
                } else if (nums[first] + nums[end] < target) {
                    first++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
}

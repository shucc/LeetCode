package org.cchao.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/1/7
 * @Description
 */
public class LeetCode28_46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        process(res, new ArrayList<>(), nums, new int[nums.length]);
        return res;
    }

    private void process(List<List<Integer>> listList, List<Integer> tempList, int[] nums, int[] visited) {
        if (tempList.size() == nums.length) {
            listList.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            tempList.add(nums[i]);
            process(listList, tempList, nums, visited);
            visited[i] = 0;
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        LeetCode28_46 leetCode28_46 = new LeetCode28_46();
        System.out.println(leetCode28_46.permute(new int[]{1, 2, 3}));
    }
}

package org.cchao.leetcode.hot100.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/1/6
 * @Description
 */
public class LeetCode39 {
    private List<List<Integer>> listList = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (null == candidates || candidates.length == 0 || target < 0) {
            return listList;
        }
        List<Integer> list = new ArrayList<>();
        process(0, candidates, target, list);
        return listList;
    }

    private void process(int start, int[] candidates, int target, List<Integer> integerList) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            listList.add(new ArrayList<>(integerList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                integerList.add(candidates[i]);
                process(i, candidates, target - candidates[i], integerList);
                integerList.remove(integerList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        LeetCode39 leetCode39 = new LeetCode39();
        int[] temp = new int[]{2, 3, 6, 7};
        System.out.println(leetCode39.combinationSum(temp, 8).toString());
    }
}

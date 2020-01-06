package org.cchao.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/1/6
 * @Description
 */
public class LeetCode26_78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        listList.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tempList = new ArrayList<>();
            for (int j = 0; j < listList.size(); j++) {
                List<Integer> temp = new ArrayList<>();
                temp.addAll(listList.get(j));
                temp.add(nums[i]);
                tempList.add(temp);
            }
            listList.addAll(tempList);
        }
        return listList;
    }

    public static void main(String[] args) {
        int[] temp = new int[] {1,2,3};
        System.out.println(subsets(temp).toString());
    }
}

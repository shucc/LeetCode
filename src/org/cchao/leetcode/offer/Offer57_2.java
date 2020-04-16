package org.cchao.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/3/4
 * @Description 和为s的连续正数序列
 */
public class Offer57_2 {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur;
        //双向指针
        for (int l = 1, r = 2;l < r;) {
            int sum = (l + r) * (r - l + 1) / 2;
            if (sum == target) {
                cur = new ArrayList<>();
                for (int i = l; i <= r; i++) {
                    cur.add(i);
                }
                res.add(cur);
                l++;
            } else if (sum < target) {
                r++;
            } else {
                l++;
            }
        }
        int[][] temp = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) {
            int[] array = new int[res.get(i).size()];
            for (int j = 0; j < res.get(i).size(); j++) {
                array[j] = res.get(i).get(j);
            }
            temp[i] = array;
        }
        return temp;
    }
}

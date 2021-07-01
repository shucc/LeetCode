package org.cchao.leetcode.leetcode.bytedance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2021/05/21
 * @Description 计算右侧小于当前元素的个数
 */
public class Leetcode315 {

    public static void main(String[] args) {
        Leetcode315 leetcode315 = new Leetcode315();
        int[] temp = new int[] {5,2,6,1};
        System.out.println("Result:" + leetcode315.countSmaller(temp));
    }

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            count.add(0);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count.set(i, count.get(i) + 1);
                }
            }
        }
        return count;
    }
}

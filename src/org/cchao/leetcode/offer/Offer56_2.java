package org.cchao.leetcode.offer;

import java.util.HashMap;

/**
 * @author cchen6
 * @Date on 2021/03/18
 * @Description 数组中数字出现的次数 II
 */
public class Offer56_2 {

    public static void main(String[] args) {
        Offer56_2 offer56_2 = new Offer56_2();
        System.out.println("Result:" + offer56_2.singleNumber(new int[] {3, 4, 3, 3}));
    }

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.get(num) == null ? 1 : (map.get(num) + 1));
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }
}

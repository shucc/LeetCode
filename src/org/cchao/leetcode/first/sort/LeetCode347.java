package org.cchao.leetcode.first.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shucc on 18/6/8.
 * cc@cchao.org
 * Top K Frequent Elements
 */
public class LeetCode347 {

    public static void main(String args[]) {
        int[] test = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(String.valueOf(topKFrequent(test, 2)));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequentMap = new HashMap<>();
        for (int value : nums) {
            if (null == frequentMap.get(value)) {
                frequentMap.put(value, 0);
            } else {
                frequentMap.put(value, frequentMap.get(value) + 1);
            }
        }
        List<Integer>[] listArray = new List[nums.length + 1];
        for (int key : frequentMap.keySet()) {
            int count = frequentMap.get(key);
            if (null == listArray[count]) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(key);
                listArray[count] = temp;
            } else {
                listArray[count].add(key);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = listArray.length - 1; i >= 0; i--) {
            if (null != listArray[i]) {
                result.addAll(listArray[i]);
            }
            if (result.size() >= k) {
                break;
            }
        }
        return result;
    }
}

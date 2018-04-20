package org.cchao.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shucc on 18/1/11.
 * cc@cchao.org
 */
public class LeetCode3 {

    public static void main(String[] args) {
        String temp1 = "abcabcbtyu";
        String temp2 = "bbbbb";
        String temp3 = "pwwkew";
        System.out.println(String.valueOf(lengthOfLongestSubstring(temp1)) + "-->" + lengthOfLongestSubstring(temp2) + "-->" + lengthOfLongestSubstring(temp3));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        for (int j = 0; j < n; j++) {
            char nowChar = s.charAt(j);
            if (map.containsKey(nowChar)) {
                 i = Math.max(map.get(nowChar), i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            map.put(nowChar, j + 1);
        }
        return maxLength;
    }
}

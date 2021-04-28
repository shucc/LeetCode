package org.cchao.leetcode.leetcode.bytedance;

import java.util.HashSet;

/**
 * @author cchen6
 * @Date on 2021/04/28
 * @Description 无重复字符的最长子串
 */
public class Leetcode3 {

    public static void main(String[] args) {
        String temp1 = "abcabcbb";
        String temp2 = "g";
        String temp3 = "pwwkew";
        Leetcode3 leetcode3 = new Leetcode3();
        System.out.println(leetcode3.lengthOfLongestSubstring(temp2) + "-->" + leetcode3.lengthOfLongestSubstring(temp2));
    }

    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.isEmpty()) {
            return 0;
        }
        int maxSize = 0;
        HashSet<Character> tempSet = new HashSet<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!tempSet.contains(s.charAt(i))) {
                tempSet.add(s.charAt(i));
                maxSize = Math.max(maxSize, tempSet.size());
            } else {
                //寻找到之前子串与当前char的位置，这个位置前移以为就是当前重新计算子串的开始位置
                while (s.charAt(i) != s.charAt(start)) {
                    tempSet.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
        }
        return maxSize;
    }
}

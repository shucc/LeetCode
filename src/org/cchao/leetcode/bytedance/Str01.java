package org.cchao.leetcode.bytedance;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cchen6
 * @Date on 2020/7/7
 * @Description 无重复字符的最长子串
 */
public class Str01 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("a") + "-->" + lengthOfLongestSubstring("") + "-->" + lengthOfLongestSubstring("bbbbb"));
    }

    /**
     * 滑动窗口，如果最新添加进去的重复了移除最左边的
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int length = s.length();
        int res = 0;
        int left = 0;
        for (int i = 0; i < length; i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            res = Math.max(res, set.size());
        }
        return res;
    }
}

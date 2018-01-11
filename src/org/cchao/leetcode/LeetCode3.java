package org.cchao.leetcode;

/**
 * Created by shucc on 18/1/11.
 * cc@cchao.org
 */
public class LeetCode3 {

    public static void main(String[] args) {
        String temp1 = "abcabcbb";
        String temp2 = "bbbbb";
        String temp3 = "pwwkew";
        System.out.println(String.valueOf(lengthOfLongestSubstring(temp1)) + "-->" + lengthOfLongestSubstring(temp2) + "-->" + lengthOfLongestSubstring(temp3));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (0 == s.length()) {
            return 0;
        }
        int maxLength = 1;
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.replace(0, stringBuilder.length(), "");
            for (int j = i; j < s.length(); j++) {
                if (stringBuilder.length() > 0 && stringBuilder.toString().contains(String.valueOf(s.charAt(j)))) {
                    break;
                } else {
                    stringBuilder.append(String.valueOf(s.charAt(j)));
                }
            }
            if (stringBuilder.length() > maxLength) {
                maxLength = stringBuilder.length();
            }
        }
        return maxLength;
    }
}

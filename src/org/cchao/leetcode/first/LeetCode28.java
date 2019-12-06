package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/12.
 * cc@cchao.org
 */
public class LeetCode28 {

    public static void main(String args[]) {
        System.out.println(String.valueOf(strStr("hello", "ll")));
        System.out.println(String.valueOf(strStr("mississippi", "pi")));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return -1;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == haystack.length() && haystack.equals(needle)) {
            return 0;
        }
        int needleLength = needle.length();
        int maxSize = haystack.length() - needleLength;
        char needleOne = needle.charAt(0);
        for (int i = 0; i <= maxSize; i++) {
            if (haystack.charAt(i) == needleOne && needle.equals(haystack.substring(i, i + needleLength))) {
                return i;
            }
        }
        return -1;
    }
}

package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/8
 * @Description 最长公共前缀
 */
public class Str02 {

    public static void main(String[] args) {
        String[] temp = new String[] {"c"};
        System.out.println(longestCommonPrefix(temp));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        int endIndex = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, endIndex);
                }
            }
            endIndex++;
        }
        return strs[0].substring(0, endIndex);
    }
}

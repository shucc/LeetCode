package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/8
 * @Description 字符串的排列
 */
public class Str03 {

    public static void main(String[] args) {
        System.out.println(new Str03().checkInclusion("adc", "dcda"));
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        char[] char1Array = s1.toCharArray();
        int[] int1Array = new int[26];
        for (int i = 0; i < char1Array.length; i++) {
            int1Array[char1Array[i] - 'a']++;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] int2Array = new int[26];
            for (int j = i; j < i + s1.length(); j++) {
                int2Array[s2.charAt(j) - 'a']++;
            }
            if (isMatch(int1Array, int2Array)) {
                return true;
            }
        }
        return false;
    }

    public boolean isMatch(int[] int1Array, int[] int2Array) {
        for (int i = 0; i < int1Array.length; i++) {
            if (int1Array[i] != int2Array[i]) {
                return false;
            }
        }
        return true;
    }
}

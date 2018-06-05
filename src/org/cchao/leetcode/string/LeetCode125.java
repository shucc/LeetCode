package org.cchao.leetcode.string;

/**
 * Created by shucc on 18/6/5.
 * cc@cchao.org
 */
public class LeetCode125 {

    public static void main(String args[]) {
        System.out.println(String.valueOf(isPalindrome("A man, a plan, a canal: Panama")));
        System.out.println(String.valueOf(isPalindrome("race a car")));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!isAlpha(s.charAt(left))) {
                left++;
            } else if (!isAlpha(s.charAt(right))) {
                right--;
            } else if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isAlpha(char strChar) {
        return  (strChar >= 'a' && strChar <= 'z') || (strChar >= '0' && strChar <= '9');
    }
}

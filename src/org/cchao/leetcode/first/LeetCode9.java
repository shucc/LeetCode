package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/1/11.
 * cc@cchao.org
 */
public class LeetCode9 {

    public static void main(String[] args) {
        System.out.println(String.valueOf(isPalindrome(-2147447412)) + "-->" + isPalindrome(-2147483648));
    }

    public static boolean isPalindrome(int x) {
        if (0 == x) {
            return true;
        }
        if (x < 0) {
            x += Integer.MAX_VALUE;
        }
        if (x >= Integer.MAX_VALUE) {
            return false;
        }
        int origin = x;
        int result = 0;
        int length = String.valueOf(x).length();
        while (x > 0) {
            result += (x % 10) * Math.pow(10, length - 1);
            x = x / 10;
            length--;
        }
        return origin == result;
    }
}

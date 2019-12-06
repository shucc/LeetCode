package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/12.
 * cc@cchao.org
 */
public class LeetCode693 {

    public static void main(String args[]) {
        System.out.println(String.valueOf(hasAlternatingBits(10)) + "-->" + hasAlternatingBits(7) + "-->" + hasAlternatingBits(5));
    }

    public static boolean hasAlternatingBits(int n) {
        int result = -1;
        int temp;
        while (n > 0) {
            temp = n & 1;
            if (-1 == result) {
                result = temp;
            } else if (temp == result) {
                return false;
            } else {
                result = temp;
            }
            n >>= 1;
        }
        return true;
    }
}

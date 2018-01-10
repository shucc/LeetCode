package org.cchao.leetcode;

/**
 * Created by shucc on 18/1/10.
 * cc@cchao.org
 */
public class LeetCode7 {

    public static void main(String[] args) {
        System.out.println(String.valueOf(reverse(123)));
        System.out.println(String.valueOf(reverse(-2875)));
        System.out.println(String.valueOf(reverse(120)));
        System.out.println(String.valueOf(reverse(1646324359)));
    }

    public static int reverse(int x) {
        if ( 0 == x) {
            return 0;
        }
        boolean isNegative = (x < 0);
        x = Math.abs(x);
        String number = String.valueOf(x);
        int length = number.length();
        char[] numberArray = new char[length];
        for (int i = 0; i < length; i++) {
            numberArray[i] = number.charAt(i);
        }
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = length - 1; i >= 0; i--) {
            stringBuilder.append(numberArray[i]);
        }
        int result = Integer.valueOf(stringBuilder.toString());
        if (isNegative) {
            return -result;
        }
        return result;
    }
}

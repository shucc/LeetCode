package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/1/10.
 * cc@cchao.org
 */
public class LeetCode7 {

    public static void main(String[] args) {
        System.out.println(String.valueOf(reverse(0)));
        System.out.println(String.valueOf(reverse(123)));
        System.out.println(String.valueOf(reverse(-2875)));
        System.out.println(String.valueOf(reverse(120)));
        System.out.println(String.valueOf(reverse(1534236469)));
    }

    public static int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int result = 0;
        int length = String.valueOf(x).length();
        while (x > 0) {
            result += ((x % 10) * Math.pow(10, length - 1));
            x = x / 10;
            length = length - 1;
        }
        //整数溢出
        if (result == Integer.MAX_VALUE) {
            return 0;
        }
        if (isNegative) {
            return -result;
        }
        return result;
    }
}

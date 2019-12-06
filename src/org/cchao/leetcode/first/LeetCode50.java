package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/1/11.
 * cc@cchao.org
 */
public class LeetCode50 {

    public static void main(String[] args) {
        System.out.println(String.valueOf(myPow(2.0000, 2)) + "-->" + myPow(2.10000, 3));
        System.out.println(String.valueOf(myPow(0.00001, 2147483647)));
        System.out.println(String.valueOf(myPow(2.0000, -2147483648)));
        System.out.println(String.valueOf(myPow(-1.0000, -2147483648)));
    }

    public static double myPow(double x, int n) {
        if (0 == x) {
            return 0;
        }
        if (1 == x) {
            return 1;
        }
        if (-1 == x) {
            if (n == Integer.MIN_VALUE) {
                return 1;
            }
            return -1;
        }
        if (0 == n) {
            return 1;
        }
        if (1 == n) {
            return x;
        }
        if (-1 == n) {
            return 1 / x;
        }
        boolean isNegative = false;
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 0;
            }
            n = -n;
            isNegative = true;
        }
        double result = myPow(x * x, n / 2);
        if (n % 2 != 0) {
            result *= x;
        }
        return isNegative ? (1 / result) : result;
    }
}

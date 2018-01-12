package org.cchao.leetcode;

/**
 * Created by shucc on 18/1/11.
 * cc@cchao.org
 */
public class LeetCode50 {

    public static void main(String[] args) {
        System.out.println(String.valueOf(myPow(2.0000, 2)) + "-->" + myPow(2.10000, 3));
    }

    public static double myPow(double x, int n) {
        if (0 == x) {
            return 0;
        }
        if (0 == n) {
            return 1;
        }
        if (1 == n) {
            return x;
        }
        double result = (n % 2 == 0 ? 1 : x);
        boolean isNegative = n < 0;
        n = Math.abs(n);
        int i = (n % 2 == 0 ? 0 : 1);
        while (i < n) {
            result *= (x * x);
            i += 2;
        }
        if (isNegative) {
            return 1 / result;
        }
        return result;
    }
}

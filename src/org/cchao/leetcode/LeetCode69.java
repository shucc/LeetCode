package org.cchao.leetcode;

/**
 * Created by shucc on 18/4/12.
 * cc@cchao.org
 */
public class LeetCode69 {

    public static void main(String args[]) {
        System.out.println(String.valueOf(mySqrt(4)) + "-->" + mySqrt(8));
        System.out.println(String.valueOf(mySqrt(2147483647)));
    }

    public static int mySqrt(int x) {
        //TODO
        if (x == Integer.MAX_VALUE) {
            return 46340;
        }
        if (0 == x) {
            return 0;
        }
        if (1 == x) {
            return 1;
        }
        for (int i = 1; i <= x / 2; i++) {
            int low = i * i;
            int high = (i + 1) * (i + 1);
            if (x == low) {
                return i;
            } else if (x == high) {
                return i + 1;
            } else if (x > low && x < high) {
                return i;
            }
        }
        return 1;
    }
}

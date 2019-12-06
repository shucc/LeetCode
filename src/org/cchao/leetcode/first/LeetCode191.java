package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/9.
 * cc@cchao.org
 */
public class LeetCode191 {

    public static void main(String args[]) {
        System.out.println(String.valueOf(hammingWeight(11)));
    }

    public static int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (1 == (n & 1)) {
                result++;
            }
            n = n >> 1;
        }
        return result;
    }

    public static int hammingWeight2(int n) {
        int result = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                result++;
            }
            mask <<= 1;
        }
        return result;
    }
}

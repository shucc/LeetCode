package org.cchao.leetcode.hot100;

public class LeetCode2_461 {

    public static int hammingDistance(int x, int y) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((x & 1) != (y & 1)) {
                result++;
            }
            x = x >> 1;
            y = y >> 1;
        }
        return result;
    }

    public static int hammingDistance2(int x, int y) {
        int temp = x ^ y;
        int result = 0;
        while (temp > 0) {
            result += temp & 1;
            temp = temp >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance2(1, 4));
    }
}

package org.cchao.leetcode.hot100;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/1/7
 * @Description
 */
public class LeetCode27_338 {
    public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            bits[i] = countBit(i);
        }
        return bits;
    }

    private int countBit(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public int[] countBits2(int num) {
        int[] bits = new int[num + 1];
        bits[0] = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 1) {
                //偶数
                bits[i] = bits[i / 2];
            } else {
                bits[i] = bits[i - 1] + 1;
            }
        }
        return bits;
    }

    public static void main(String[] args) {
        LeetCode27_338 leetCode27_338 = new LeetCode27_338();
        System.out.println(Arrays.toString(leetCode27_338.countBits2(8)));
    }
}

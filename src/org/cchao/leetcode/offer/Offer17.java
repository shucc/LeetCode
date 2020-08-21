package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/3/2
 * @Description 打印从1到最大的n位数
 */
public class Offer17 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Offer17().printNumbers2(0)));
    }

    public int[] printNumbers(int n) {
        int number = 1;
        while (n > 0) {
            number = number * 10;
            n--;
        }
        int[] result = new int[number - 1];
        for (int i = 1; i < number; i++) {
            result[i - 1] = i;
        }
        return result;
    }

    public int[] printNumbers2(int n) {
        int num = (int) Math.pow(10, n);
        int[] res = new int[num - 1];
        int left = 0;
        int end = res.length;
        while (left < end) {
            res[left] = left + 1;
            res[end - 1] = end;
            left++;
            end--;
        }
        return res;
    }
}

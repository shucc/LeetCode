package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/2
 * @Description 打印从1到最大的n位数
 */
public class Offer3_17 {
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
}

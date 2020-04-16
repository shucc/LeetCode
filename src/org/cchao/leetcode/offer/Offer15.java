package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/3
 * @Description 二进制中1的个数
 */
public class Offer15 {
    public int hammingWeight(int n) {
        int num = 0;
        while (n != 0) {
            num += (n & 1);
            //使用无符号右移
            n = n >>> 1;
        }
        return num;
    }
}

package org.cchao.leetcode.bytedance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/7/15
 * @Description 第k个排列
 */
public class Array07 {

    public static void main(String[] args) {
        System.out.println(new Array07().getPermutation(3, 3));
    }

    public String getPermutation(int n, int k) {
        if (n == 1) {
            return "1";
        }
        //阶乘结果
        int[] temp = new int[n + 1];
        temp[0] = 1;
        temp[1] = 1;
        for (int i = 2; i <= n; i++) {
            temp[i] = temp[i - 1] * i;
        }
        List<Integer> strings = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            strings.add(i);
        }
        StringBuilder res = new StringBuilder();
        while (strings.size() > 0) {
            //第一个数开头的序列的总数
            int length = temp[n - 1];
            int num = (k % length) == 0 ? (k / length) : (k / length) + 1;
            res.append(num);
        }
        return res.toString();
    }
}

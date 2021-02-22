package org.cchao.leetcode.offer;

import java.util.ArrayList;

/**
 * @author cchen6
 * @Date on 2020/9/4
 * @Description 圆圈中最后剩下的数字
 */
public class Offer62 {

    public static void main(String[] args) {
        Offer62 offer62 = new Offer62();
        System.out.println(offer62.lastRemaining(5, 3) + "-->" + offer62.lastRemaining(10, 17));
    }

    public int lastRemaining(int n, int m) {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intList.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n;
            intList.remove(idx);
            n--;
        }
        return intList.get(0);
    }
}

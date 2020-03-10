package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/9
 * @Description 第一个只出现一次的字符
 */
public class Offer25_50 {
    public char firstUniqChar(String s) {
        if (s.length() == 0) {
            return ' ';
        }
        int[] array = new int[128];
        int[] index = new int[128];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)]++;
            //记录char第一次出现的下标
            if (index[s.charAt(i)] == 0) {
                index[s.charAt(i)] = i;
            }
        }
        int minIndex = s.length();
        for (int i = 0; i < array.length; i++) {
            //出现一次且下标更小
            if (array[i] == 1 && index[i] < minIndex) {
                minIndex = index[i];
            }
        }
        return minIndex == s.length() ? ' ' : s.charAt(minIndex);
    }

    public static void main(String[] args) {
        Offer25_50 offer23_50 = new Offer25_50();
        System.out.println(offer23_50.firstUniqChar(""));
    }
}

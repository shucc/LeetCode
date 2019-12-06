package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/2.
 * cc@cchao.org
 */
public class LeetCode771 {
    
    public static void main(String args[]) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
        System.out.println(numJewelsInStones("ebd", "bbb"));
    }

    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] matched = J.toCharArray();
        char[] matching = S.toCharArray();
        for (int i = 0; i < matching.length; i++) {
            for (int j = 0; j < matched.length; j++) {
                if (matching[i] == matched[j]) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}

package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/1/12.
 * cc@cchao.org
 */
public class LeetCode13 {

    public static void main(String[] args) {
        System.out.println(String.valueOf(romanToInt("DCXXI")) + "-->" + romanToInt("MCMXCVI"));
    }

    public static int romanToInt(String origin) {
        int result = 0;
        char[] stringArray = origin.toCharArray();
        int now = 0;
        for (int i = 0; i < stringArray.length; i++) {
            int pre = now;
            switch (stringArray[i]) {
                case 'M':
                    now = 1000;
                    break;
                case 'D':
                    now = 500;
                    break;
                case 'C':
                    now = 100;
                    break;
                case 'L':
                    now = 50;
                    break;
                case 'X':
                    now = 10;
                    break;
                case 'V':
                    now = 5;
                    break;
                case 'I':
                    now = 1;
                    break;
                default:
                    break;
            }
            if (now > pre) {
                result -= pre * 2;
            }
            result += now;
        }
        return result;
    }
}

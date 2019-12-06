package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/1/11.
 * cc@cchao.org
 */
public class LeetCode6 {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("ABC", 2));
        System.out.println(convert("ABCDE", 3));
        System.out.println(convert("ABCDE", 4));
    }

    public static String convert(String s, int numRows) {
        if (1 == numRows || numRows >= s.length()) {
            return s;
        }
        char[] stringArray = s.toCharArray();
        int length = stringArray.length / (numRows - 1) + 1;
        String[][] resultArray = new String[numRows][length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (index < stringArray.length) {
                        resultArray[j][i] = String.valueOf(stringArray[index]);
                    }
                    index++;
                }
            } else {
                for (int j = numRows - 1; j >= 0; j--) {
                    if (j == 0 || j == numRows - 1) {
                        continue;
                    }
                    if (index < stringArray.length) {
                        resultArray[j][i] = String.valueOf(stringArray[index]);
                    }
                    index++;
                }
            }
        }
        StringBuilder resultBuilder = new StringBuilder("");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                if (null != resultArray[i][j]) {
                    resultBuilder.append(resultArray[i][j]);
                }
            }
        }
        return resultBuilder.toString();
    }
}

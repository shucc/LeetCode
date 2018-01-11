package org.cchao.leetcode;

/**
 * Created by shucc on 18/1/11.
 * cc@cchao.org
 */
public class LeetCode6 {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("ABC", 2));
    }

    public static String convert(String s, int numRows) {
        char[] stringArray = s.toCharArray();
        String[][] resultArray = new String[numRows][stringArray.length * 2 / (numRows + 1)];
        for (int i = 0; i < numRows; i++) {
            boolean isMiddle = (i == numRows - 2);
            for (int j = 0; j < resultArray[i].length; j++) {
                if (isMiddle) {
                    int size = i + numRows * j;
                    if (size < stringArray.length) {
                        resultArray[i][j] = String.valueOf(stringArray[size]);
                    }
                } else if (j % 2 == 0) {
                    int size = i + (numRows + 1) * (j / 2);
                    if (size < stringArray.length) {
                        resultArray[i][j] = String.valueOf(stringArray[size]);
                    }
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

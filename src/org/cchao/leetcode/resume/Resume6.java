package org.cchao.leetcode.resume;

public class Resume6 {

    public boolean isPalindrome(String s) {
        if (null == s || s.length() <= 1){
            return true;
        }
        char[] originCharArray = s.toCharArray();
        int size = originCharArray.length - 1;
        char left;
        char right;
        for (int i = 0; i < originCharArray.length - 1; i++) {
            if (!isValid(originCharArray[i])) {
                continue;
            }
            left = originCharArray[i];
            while (!isValid(originCharArray[size])) {
                size--;
            }
            right = originCharArray[size];
            if (!isSame(left, right)) {
                return false;
            }
            size--;
        }
        return true;
    }

    private boolean isSame(char left, char right) {
        if (left < 65 || right < 65) {
            return left == right;
        } else {
            return left == right || Math.abs(left - right) == 32;
        }
    }

    private boolean isValid(char temp) {
        return (temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z') || (temp >= '0' && temp <= '9');
    }
}

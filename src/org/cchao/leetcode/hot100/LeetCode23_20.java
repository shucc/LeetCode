package org.cchao.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2020/1/2
 * @Description
 */
public class LeetCode23_20 {
    public static boolean isValid(String s) {
        if (null == s || s.length() % 2 != 0) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put(']', '[');
                put('}', '{');
                put(')', '(');
            }
        };
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == map.get(temp)) {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}

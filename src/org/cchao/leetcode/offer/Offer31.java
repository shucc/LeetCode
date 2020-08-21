package org.cchao.leetcode.offer;

import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2020/8/21
 * @Description 栈的压入、弹出序列
 */
public class Offer31 {

    public static void main(String[] args) {
        Offer31 offer31 = new Offer31();
        int[] pushed = new int[]{1, 2, 3, 4, 5};
        System.out.println(offer31.validateStackSequences(pushed, new int[]{4, 5, 3, 2, 1}) + "-->" + offer31.validateStackSequences(pushed, new int[]{4, 3, 5, 1, 2}));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int poppedIndex = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[poppedIndex]) {
                stack.pop();
                poppedIndex++;
            }
        }
        return stack.isEmpty();
    }
}

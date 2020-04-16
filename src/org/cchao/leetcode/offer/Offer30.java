package org.cchao.leetcode.offer;

import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2020/3/10
 * @Description 包含min函数的栈
 */
public class Offer30 {
    class MinStack {

        private Stack<Integer> stack;
        private Stack<Integer> sortStack;

        public MinStack() {
            stack = new Stack<>();
            sortStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (sortStack.isEmpty()) {
                sortStack.push(x);
            } else if (x <= sortStack.peek()) {
                sortStack.push(x);
            }
        }

        public void pop() {
            int temp = stack.pop();
            if (!sortStack.isEmpty() && temp == sortStack.peek()) {
                sortStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return sortStack.peek();
        }
    }
}

package org.cchao.leetcode.offer;

import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2020/3/3
 * @Description 用两个栈实现队列
 */
public class Offer09 {
    class CQueue {

        Stack<Integer> stack;
        Stack<Integer> queue;

        public CQueue() {
            stack = new Stack<>();
            queue = new Stack<>();
        }

        public void appendTail(int value) {
            stack.push(value);
        }

        public int deleteHead() {
            if (queue.isEmpty()) {
                if (stack.isEmpty()) {
                    return -1;
                }
                while (!stack.isEmpty()) {
                    queue.push(stack.pop());
                }
            }
            return queue.pop();
        }
    }
}

package org.cchao.leetcode.offer;

import java.util.LinkedList;

/**
 * @author cchen6
 * @Date on 2020/7/23
 * @Description
 */
public class Offer59 {

    class MaxQueue {

        private LinkedList<Integer> queue;
        private LinkedList<Integer> maxQueue;

        public MaxQueue() {
            queue = new LinkedList<>();
            maxQueue = new LinkedList<>();
        }

        public int max_value() {
            return maxQueue.isEmpty() ? -1 : maxQueue.peekFirst();
        }

        public void push_back(int value) {
            queue.add(value);
            while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {
                maxQueue.pollLast();
            }
            maxQueue.add(value);
        }

        public int pop_front() {
            if (!maxQueue.isEmpty() && maxQueue.peekFirst().equals(queue.peekFirst())) {
                maxQueue.pollFirst();
            }
            return queue.isEmpty() ? -1 : queue.poll();
        }
    }
}

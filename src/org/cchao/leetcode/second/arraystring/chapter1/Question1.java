package org.cchao.leetcode.second.arraystring.chapter1;

public class Question1 {

    static class MyCircularQueue {

        private int[] queueArray;

        private int arraySize;

        //队列头下标
        private int head;

        //队列尾下标
        private int tail;

        /**
         * 构造器，设置队列长度为 k
         * @param k
         */
        public MyCircularQueue(int k) {
            arraySize = k;
            queueArray = new int[arraySize];
            head = -1;
            tail = -1;
        }

        /**
         * 向循环队列插入一个元素。如果成功插入则返回真
         * @param value
         * @return
         */
        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                head = 0;
                tail = 0;
            } else if (tail == arraySize - 1) {
                tail = 0;
            } else {
                tail++;
            }
            queueArray[tail] = value;
            return true;
        }

        /**
         * 从循环队列中删除一个元素。如果成功删除则返回真
         * @return
         */
        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            queueArray[0] = 0;
            if (head == 0 && tail == 0) {
                head = -1;
                tail = -1;
            } else {
                head++;
                if (head == arraySize) {
                    head = 0;
                }
            }
            return true;
        }

        /**
         * 从队首获取元素。如果队列为空，返回 -1
         * @return
         */
        public int Front() {
            if (head == -1) {
                return -1;
            }
            return queueArray[head];
        }

        /**
         * 获取队尾元素。如果队列为空，返回 -1
         * @return
         */
        public int Rear() {
            if (tail == -1) {
                return -1;
            }
            return queueArray[tail];
        }

        /**
         *  检查循环队列是否为空
         * @return
         */
        public boolean isEmpty() {
            return head == -1 && tail == -1;
        }

        /**
         * 检查循环队列是否已满
         * @return
         */
        public boolean isFull() {
            return (head == 0 && tail == arraySize - 1) || (head - tail == 1);
        }
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(2);

    }
}

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
         *
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
         *
         * @param value
         * @return
         */
        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                head = 0;
            }
            tail = (tail + 1) % arraySize;
            queueArray[tail] = value;
            return true;
        }

        /**
         * 从循环队列中删除一个元素。如果成功删除则返回真
         *
         * @return
         */
        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            if (head == tail) {
                head = -1;
                tail = -1;
                return true;
            }
            head = (head + 1) % arraySize;
            return true;
        }

        /**
         * 从队首获取元素。如果队列为空，返回 -1
         *
         * @return
         */
        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return queueArray[head];
        }

        /**
         * 获取队尾元素。如果队列为空，返回 -1
         *
         * @return
         */
        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            return queueArray[tail];
        }

        /**
         * 检查循环队列是否为空
         *
         * @return
         */
        public boolean isEmpty() {
            return head == -1;
        }

        /**
         * 检查循环队列是否已满
         *
         * @return
         */
        public boolean isFull() {
            return ((tail + 1) % arraySize) == head;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(2);
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.enQueue(9));
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.isEmpty());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.enQueue(6));
        System.out.println(myCircularQueue.enQueue(4));
    }
}

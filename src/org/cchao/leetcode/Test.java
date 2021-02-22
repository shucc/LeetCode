package org.cchao.leetcode;

/**
 * @author cchen6
 * @Date on 2020/7/21
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadA threadA = new ThreadA(counter);
        ThreadB threadB = new ThreadB(counter);
        new Thread(threadB).start();
        new Thread(threadA).start();
    }

    private static class Counter {
        boolean isA = true;
        int count = 0;
    }

    private static class ThreadA implements Runnable {

        private final Counter counter;

        public ThreadA(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            while (counter.count < 100) {
                synchronized (counter) {
                    if (counter.isA) {
                        System.out.println(Thread.currentThread().getName() + "-->" + counter.count);
                        counter.count++;
                        counter.isA = !counter.isA;
                        counter.notify();
                    } else {
                        try {
                            counter.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    private static class ThreadB implements Runnable {

        private final Counter counter;

        public ThreadB(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            while (counter.count < 100) {
                synchronized (counter) {
                    if (!counter.isA) {
                        System.out.println(Thread.currentThread().getName() + "-->" + counter.count);
                        counter.count++;
                        counter.isA = !counter.isA;
                        counter.notify();
                    } else {
                        try {
                            counter.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

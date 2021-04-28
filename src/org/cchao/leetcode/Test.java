package org.cchao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearch(nums, target);
        int endIndex = binarySearch(nums, target + 1) - 1;
        if (leftIndex <= endIndex && endIndex < nums.length && nums[leftIndex] == target && nums[endIndex] == target) {
            return new int[]{leftIndex, endIndex};
        }
        return new int[]{-1, -1};
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static class Counter {
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

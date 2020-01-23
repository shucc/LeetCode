package org.cchao.leetcode.hot100;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/1/20
 * @Description
 */
public class LeetCode43_215 {

    public int findKthLargest2(int[] nums, int k) {
        //是否从大到小
        boolean maxStart = k < nums.length / 2;
        int max = 0;
        int maxIndex;
        int min = 0;
        int minIndex;
        if (maxStart) {
            for (int i = 0; i < k; i++) {
                maxIndex = i;
                max = nums[maxIndex];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > max) {
                        max = nums[j];
                        maxIndex = j;
                    }
                }
                swap(nums, maxIndex, i);
            }
        } else {
            for (int i = 0; i < (nums.length - k + 1); i++) {
                minIndex = i;
                min = nums[minIndex];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < min) {
                        min = nums[j];
                        minIndex = j;
                    }
                }
                swap(nums, minIndex, i);
            }
        }
        return maxStart ? max : min;
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        //quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int middle = getMiddle(nums, start, end);
            quickSort(nums, start, middle - 1);
            quickSort(nums, middle + 1, end);
        }
    }

    private int getMiddle(int[] nums, int start, int end) {
        int key = nums[start];
        while (start < end) {
            while (start < end && nums[end] >= key) {
                end--;
            }
            nums[start] = nums[end];
            while (start < end && nums[start] < key) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = key;
        return start;
    }

    public static void main(String[] args) {
        int[] temp = new int[] {3,2,3,1,2,4,5,5,6};
        System.out.println(new LeetCode43_215().findKthLargest2(temp, 4));
    }
}

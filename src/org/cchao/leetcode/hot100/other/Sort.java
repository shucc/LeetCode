package org.cchao.leetcode.hot100.other;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/1/8
 * @Description
 */
public class Sort {
    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int middle = process(nums, low, high);
            quickSort(nums, low, middle - 1);
            quickSort(nums, middle + 1, high);
        }
    }

    private int process(int[] nums, int low, int high) {
        int key = nums[low];
        while (low < high) {
            while (low < high && key <= nums[high]) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] < key) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = key;
        return low;
    }

    public void chooseSort(int[] nums) {
        for (int i = 0; i <= nums.length / 2; i++) {
            int minIndex = i;
            int maxIndex = nums.length - i - 1;
            for (int j = i + 1; j < nums.length - i; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(nums, i, minIndex);
            swap(nums, nums.length - i - 1, maxIndex);
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    private void bubble(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    swap(nums, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{23, 1, 4, 21, 12, 4, 15, 5, 2, 3, 5, 1, 11, 435, 1, 2, 3, 5, 2};
        System.out.println(Arrays.toString(nums));
        Sort sort = new Sort();
        sort.bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
}

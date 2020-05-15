package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/5/11
 * @Description 最小的k个数
 */
public class Offer40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        sort(arr, 0, arr.length - 1);
        return Arrays.copyOfRange(arr, 0, k);
    }

    private void sort(int[] nums, int low, int high) {
        if (low < high) {
            int middle = getMiddle(nums, low, high);
            sort(nums, low, middle - 1);
            sort(nums, middle + 1, high);
        }
    }

    private int getMiddle(int[] nums, int low, int high) {
        int key = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= key) {
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
}

package org.cchao.leetcode.sort;

/**
 * Created by shucc on 18/6/8.
 * cc@cchao.org
 * 数组中的第K个最大元素
 */
public class LeetCode215 {

    private static int result;

    public static void main(String args[]) {
        int[] test = new int[]{3, 2, 1, 5, 6, 4};
        System.out.println(String.valueOf(findKthLargest(test, 1)));
    }

    public static int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, nums.length - k);
        return result;
    }

    private static void quickSort(int[] nums, int low, int high, int resultIndex) {
        if (low <= high) {
            int middle = getMiddle(nums, low, high);
            if (middle == resultIndex) {
                result = nums[middle];
                return;
            }
            if (middle > resultIndex) {
                quickSort(nums, low, middle - 1, resultIndex);
            } else {
                quickSort(nums, middle + 1, high, resultIndex);
            }
        }
    }

    private static int getMiddle(int[] nums, int low, int high) {
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

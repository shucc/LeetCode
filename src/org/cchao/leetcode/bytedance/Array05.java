package org.cchao.leetcode.bytedance;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/7/14
 * @Description 数组中第K大的元素
 */
public class Array05 {

    public static void main(String[] args) {
        int[] temp = new int[] {3,2,1,5,6,4};
        System.out.println(Arrays.toString(temp));
        System.out.println(new Array05().findKthLargest2(temp, 2));
        System.out.println(Arrays.toString(temp));
    }

    public int findKthLargest(int[] nums, int k) {
        int maxIndex = 0;
        for (int i = 0; i < k; i++) {
            maxIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[maxIndex]) {
                    nums[maxIndex] = nums[maxIndex] + nums[j];
                    nums[j] = nums[maxIndex] - nums[j];
                    nums[maxIndex] = nums[maxIndex] - nums[j];
                }
            }
        }
        return nums[k - 1];
    }

    public int findKthLargest2(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSort(int[] nums, int left, int right, int k) {
        if (left < right) {
            int mid = getMiddle(nums, left, right);
            quickSort(nums, left, mid - 1, k);
            quickSort(nums, mid + 1, right, k);
        }
        return -1;
    }

    private int getMiddle(int[] nums, int left, int right) {
        int temp = nums[left];
        while (left < right) {
            while (left < right && nums[right] >= temp) {
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] < temp) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = temp;
        return left;
    }
}

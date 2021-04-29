package org.cchao.leetcode.leetcode.bytedance;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2021/04/29
 * @Description 数组中第K大的数字
 */
public class Leetcode215 {

    public static void main(String[] args) {
        int[] temp = new int[] {3,2,1,5,6,4};
        System.out.println(Arrays.toString(temp));
        Leetcode215 leetcode215 = new Leetcode215();
        System.out.println(String.valueOf(leetcode215.findKthLargest(temp, 1)));
    }

    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, k - 1);
        return nums[k - 1];
    }

    private void quickSort(int[] nums, int low, int high, int k) {
        if (low < high) {
            int middle = getMiddle(nums, low, high);
            if (middle < k) {
                quickSort(nums, middle + 1, high, k);
            } else if (middle > k){
                quickSort(nums, low, middle - 1, k);
            }
        }
    }

    private int getMiddle(int[] nums, int low, int high) {
        int key = nums[low];
        while (low < high) {
            while (low < high && nums[high] < key) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] >= key) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = key;
        return low;
    }
}

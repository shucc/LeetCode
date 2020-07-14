package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/14
 * @Description 搜索旋转排序数组
 */
public class Array03 {

    public static void main(String[] args) {
        int[] temp = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(new Array03().search(temp, 0));
        System.out.println(new Array03().search(temp, 3));
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                //0下标值小于mid值，说明左边是有序的，此时需要借助左边判断target位置
                if (target < nums[mid] && target >= nums[0]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[nums.length - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

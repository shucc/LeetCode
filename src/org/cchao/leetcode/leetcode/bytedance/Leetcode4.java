package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/07/30
 * @Description 寻找两个正序数组的中位数
 */
public class Leetcode4 {

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 3};
        int[] num2 = new int[]{2, 4};
        Leetcode4 leetcode4 = new Leetcode4();
        System.out.println(leetcode4.findMedianSortedArrays(num1, num2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        //为奇数返回排序后的nums[length/2],为偶数返回(nums[length/2-1]+nums[length/2])/2
        int[] res = processArray(nums1, nums2, length / 2 + 1);
        if (length % 2 == 0) {
            return ((double) res[length / 2] + res[length / 2 - 1]) / 2;
        }
        return res[length / 2];
    }

    private int[] processArray(int[] nums1, int[] nums2, int k) {
        int[] nums = new int[nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while (index < k) {
            if (index1 == nums1.length) {
                nums[index] = nums2[index2];
                index2++;
                index++;
            } else if (index2 == nums2.length) {
                nums[index] = nums1[index1];
                index1++;
                index++;
            } else if (nums2[index2] <= nums1[index1]) {
                nums[index] = nums2[index2];
                index2++;
                index++;
            } else if (index2 == nums2.length || nums2[index2] > nums1[index1]) {
                nums[index] = nums1[index1];
                index1++;
                index++;
            }
        }
        return nums;
    }
}




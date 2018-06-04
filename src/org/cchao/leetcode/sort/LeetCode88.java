package org.cchao.leetcode.sort;

import java.util.Arrays;

/**
 * Created by shucc on 18/6/4.
 * cc@cchao.org
 * 合并两个有序数组
 */
public class LeetCode88 {

    public static void main(String args[]) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge3(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print("-->" + String.valueOf(nums1[i]));
        }
    }

    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[--length] = nums1[--m];
            } else {
                nums1[--length] = nums2[--n];
            }
        }
        while (n > 0) {
            nums1[--length] = nums2[--n];
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        int[] result = new int[length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < length; i++) {
            if (index1 < m && index2 < n) {
                if (nums1[index1] < nums2[index2]) {
                    result[i] = nums1[index1];
                    index1++;
                } else {
                    result[i] = nums2[index2];
                    index2++;
                }
            } else if (index1 < m) {
                result[i] = nums1[index1];
                index1++;
            } else {
                result[i] = nums2[index2];
                index2++;
            }
        }
        for (int i = 0; i < length; i++) {
            nums1[i] = result[i];
        }
    }
}

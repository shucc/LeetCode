package org.cchao.leetcode.resume;

import java.util.Arrays;

public class Resume4 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int index = m + n - 1;
        while (index >= 0) {
            if (index1 < 0) {
                nums1[index] = nums2[index2];
                index2--;
            } else if (index2 < 0) {
                nums1[index] = nums1[index1];
                index1--;
            } else {
                if (nums1[index1] > nums2[index2]) {
                    nums1[index] = nums1[index1];
                    index1--;
                } else {
                    nums1[index] = nums2[index2];
                    index2--;
                }
            }
            index--;
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        System.out.println(Arrays.toString(num1));
        merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }
}

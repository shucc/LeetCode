package org.cchao.leetcode.hot100;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/1/3
 * @Description
 */
public class LeetCode25_581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] temp = new int[nums.length];
        int size = nums.length;
        int max;
        int maxIndex;
        boolean hasInit = false;
        for (int i = size - 1; i >= 0; i--) {
            maxIndex = size - i - 1;
            max = nums[maxIndex];
            for (int j = 0; j <= i; j++) {
                if (!hasInit) {
                    temp[j] = nums[j];
                }
                if (nums[j] < max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }
            hasInit = true;
            if (maxIndex != i) {
                nums[maxIndex] = nums[i];
                nums[i] = max;
            }
        }
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(nums));
        int start = 0;
        int end = size - 1;
        while (start < end) {
            if (nums[start] == temp[start]) {
                start++;
            }
            if (nums[end] == temp[end]) {
                end--;
            }
            if (nums[start] != temp[start] && nums[end] != temp[end]) {
                break;
            }
        }
        return start == end ? 0 : end - start + 1;
    }

    public static int findUnsortedSubarray2(int[] nums) {
        int size = nums.length;
        int maxIndex = size - 1;
        int minIndex = size - maxIndex - 1;
        boolean needToRight = true;
        boolean needToLeft = true;
        while (minIndex < maxIndex) {
            for (int i = minIndex; i <= maxIndex; i++) {
                if (needToRight && nums[i] < nums[minIndex] && i != minIndex) {
                    needToRight = false;
                }
                if (needToLeft && nums[i] > nums[maxIndex] && i != maxIndex) {
                    needToLeft = false;
                }
            }
            if (!needToLeft && !needToRight) {
                break;
            }
            if (needToRight) {
                minIndex++;
            }
            if (needToLeft) {
                maxIndex--;
            }
        }
        return maxIndex == minIndex ? 0 : maxIndex - minIndex + 1;
    }

    public static int findUnsortedSubarray3(int[] nums) {
        int size = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < size; i++) {
            if (nums[i] < nums[i - 1]) {
                flag = true;
            }
            if (flag) {
                min = Math.min(min, nums[i]);
            }
        }
        flag = false;
        for (int i = size - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                flag = true;
            }
            if (flag) {
                max = Math.max(max, nums[i]);
            }
        }
        int l, r;
        for (l = 0; l < size; l++) {
            if (min < nums[l])
                break;
        }
        for (r = size - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }

    public static int findUnsortedSubarray4(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int min = nums[len - 1];
        int l = 0, r = -1;
        for (int i = 0; i < len; i++) {
            if (max > nums[i]) {
                r = i;
            } else {
                max = nums[i];
            }
            if (min < nums[len - i - 1]) {
                l = len - i - 1;
            } else {
                min = nums[len - i - 1];
            }
        }
        return r - l + 1;
    }

    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray4(new int[]{1, 3, 2, 2, 2}));
        System.out.println(findUnsortedSubarray4(new int[]{2, 6, 11, 13, 10, 13, 12, 14, 15}));
    }
}

package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/5/11
 * @Description 把数组排成最小的数
 */
public class Offer45 {

    public static void main(String[] args) {
        int[] temp = new int[]{3, 30, 34, 5, 9};
        sort(temp, 0, temp.length - 1);
        System.out.print(minNumber(temp));
    }

    public static String minNumber(int[] nums) {
        sort(nums, 0, nums.length - 1);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            res.append(nums[i]);
        }
        return res.toString();
    }

    private static void sort(int[] nums, int start, int end) {
        if (start < end) {
            int middle = middle(nums, start, end);
            sort(nums, start, middle - 1);
            sort(nums, middle + 1, end);
        }
    }

    private static int middle(int[] nums, int start, int end) {
        int key = nums[start];
        while (start < end) {
            while (start < end && (key + "" + nums[end]).compareTo(nums[end] + "" + key) <= 0) {
                end--;
            }
            nums[start] = nums[end];
            while (start < end && (key + "" + nums[start]).compareTo(nums[start] + "" + key) > 0) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = key;
        return start;
    }
}

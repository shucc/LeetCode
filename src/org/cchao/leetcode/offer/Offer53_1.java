package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/25
 * @Description 在排序数组中查找数字 I
 */
public class Offer53_1 {

    public static void main(String[] args) {
        int[] temp = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(new Offer53_1().search(temp, 8));
    }

    public int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }

    /**
     * 获取target最后的坐标
     *
     * @param nums
     * @param target
     * @return
     */
    private int helper(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}

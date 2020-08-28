package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/26
 * @Description 0～n-1中缺失的数字
 */
public class Offer53_2 {

    public static void main(String[] args) {
        Offer53_2 offer53_2 = new Offer53_2();
        System.out.println(offer53_2.missingNumber(new int[] {0,1,2,3,4,5,6,7,9}));
    }

    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle != nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}

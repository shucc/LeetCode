package org.cchao.leetcode.resume;

public class Resume1 {

    public static int singleNumber(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp = temp ^ nums[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] temp1 = new int[]{2,2,1};
        int[] temp2 = new int[]{4,1,2,1,2};
        System.out.println(4 ^ 6);
    }
}

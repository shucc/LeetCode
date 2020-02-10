package org.cchao.leetcode.resume;

public class Resume2 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                value = nums[i];
                count++;
            } else if (value == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int[] temp1 = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(temp1));
    }
}

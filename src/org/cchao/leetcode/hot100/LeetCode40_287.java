package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2020/1/20
 * @Description
 */
public class LeetCode40_287 {
    public int findDuplicate(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (temp[nums[i]] > 0) {
                return nums[i];
            }
            temp[nums[i]] = 1;
        }
        return 0;
    }

    public int findDuplicate2(int[] nums) {
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }

    public static void main(String[] args) {
        int[] temp = new int[] {3,1,3,4,2};
        System.out.println((new LeetCode40_287()).findDuplicate2(temp));
    }
}

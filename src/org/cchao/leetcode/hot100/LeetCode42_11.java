package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2020/1/20
 * @Description
 */
public class LeetCode42_11 {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++) {
            for (int j = 1;j < height.length; j++) {
                int res = (j - i) * Math.min(height[i], height[j]);
                if (res > max) {
                    max = res;
                }
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (start < end) {
            max = Math.max(max, (end - start)*Math.min(height[start], height[end]));
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] temp = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println((new LeetCode42_11()).maxArea(temp));
        System.out.println((new LeetCode42_11()).maxArea2(temp));
    }
}

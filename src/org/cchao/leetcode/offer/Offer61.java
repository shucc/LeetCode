package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/8/28
 * @Description 扑克牌中的顺子
 */
public class Offer61 {

    public static void main(String[] args) {
        Offer61 offer61 = new Offer61();
        System.out.println(offer61.isStraight(new int[]{0, 0, 2, 2, 5}) + "-->" + offer61.isStraight(new int[]{1, 2, 3, 4, 5}) + "-->" + offer61.isStraight(new int[]{1, 2, 3, 7, 5}));
    }

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        while (nums[count] == 0) count++;   //count为0出现的次数
        int i = count + 1;            //i是左边第二个不为0的元素
        for (int j = i; j < 5; j++) {
            int dif = nums[j] - nums[j - 1];    //dif为相邻两元素的差值，
            count = count - dif + 1;     //count= count-(dif-1)，用count来修补数组中不符合要求的元素
            if (count < 0 || dif == 0) return false;   //count为0表示已经用完大小王修补错误，dif=0表示存在相同元素
        }
        return true;
    }
}

package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/13
 * @Description 旋转数组的最小数字
 */
public class Offer11 {

    public static void main(String[] args) {
        int[] temp1 = new int[] {3,4,5,1,2};
        int[] temp2 = new int[] {2,2,2,0,1};
        System.out.println(new Offer11().minArray(temp1) + "-->" + new Offer11().minArray(temp2));
    }

    public int minArray(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }
}

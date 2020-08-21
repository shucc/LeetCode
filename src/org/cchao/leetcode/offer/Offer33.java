package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/21
 * @Description 二叉搜索树的后序遍历序列
 */
public class Offer33 {

    public static void main(String[] args) {
        Offer33 offer33 = new Offer33();
        System.out.println(offer33.verifyPostorder(new int[]{1, 6, 3, 2, 5}) + "-->" + offer33.verifyPostorder(new int[]{1, 3, 2, 6, 5}));
    }

    public boolean verifyPostorder(int[] postorder) {
        return process(postorder, 0, postorder.length - 1);
    }

    private boolean process(int[] postorder, int start, int end) {
        if (start >= end) {
            return true;
        }
        //最后一个，即根节点
        int rootVal = postorder[end];
        int mid = start;
        while (postorder[mid] < rootVal) {
            mid++;
        }
        int temp = mid;
        while (temp < end) {
            if (postorder[temp] < rootVal) {
                return false;
            }
            temp++;
        }
        return process(postorder, start, mid - 1) && process(postorder, mid, end - 1);
    }
}

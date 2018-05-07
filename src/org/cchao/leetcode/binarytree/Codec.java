package org.cchao.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shucc on 18/5/7.
 * cc@cchao.org
 * 序列化二叉树
 */
public class Codec {

    public String serialize(TreeNode root) {
        if (null == root) {
            return "";
        }
        List<Integer> preNodeList = preorderTraversal(root);
        List<Integer> inNodeList = inorderTraversal(root);
        return listToStr(preNodeList) + "#" + listToStr(inNodeList);
    }

    private String listToStr(List<Integer> originList) {
        if (null == originList || originList.size() == 0) {
            return "";
        }
        StringBuilder resultBuilder = new StringBuilder();
        int size = originList.size();
        for (int i = 0; i < size; i++) {
            resultBuilder.append(originList.get(i));
            if (i < size - 1) {
                resultBuilder.append(",");
            }
        }
        return resultBuilder.toString();
    }

    private List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.add(root.val);
            result.addAll(preorderTraversal(root.left));
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }

    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }

    public TreeNode deserialize(String data) {
        if (null == data || data.isEmpty()) {
            return null;
        }
        String[] dataStr = data.split("#");
        List<Integer> preNodeList = strToList(dataStr[0]);
        List<Integer> inNodeList = strToList(dataStr[1]);
        return buildTreeFromPI(preNodeList, inNodeList);
    }

    private List<Integer> strToList(String origin) {
        if (null == origin || origin.isEmpty()) {
            return new ArrayList<>();
        }
        String[] strArray = origin.split(",");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            result.add(Integer.valueOf(strArray[i]));
        }
        return result;
    }

    private TreeNode buildTreeFromPI(List<Integer> preorder, List<Integer> inorder) {
        return buildTreeFromPI(preorder, inorder, 0, preorder.size() - 1, 0, inorder.size() - 1);
    }

    private TreeNode buildTreeFromPI(List<Integer> preorder, List<Integer> inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder.get(preStart));
        int flag = 0;
        for (int i = inStart; i<= inEnd; i++) {
            if (preorder.get(preStart).equals(inorder.get(i))) {
                flag = i;
                break;
            }
        }
        treeNode.left = buildTreeFromPI(preorder, inorder, preStart + 1, preStart + flag - inStart, inStart, inEnd - 1);
        treeNode.right = buildTreeFromPI(preorder, inorder, preStart + flag - inStart + 1, preEnd, flag + 1, inEnd);
        return treeNode;
    }
}

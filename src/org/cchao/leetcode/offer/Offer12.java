package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/13
 * @Description 矩阵中的路径
 */
public class Offer12 {

    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] words, int x, int y, int nowIndex) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != words[nowIndex]) {
            return false;
        }
        //查询到最后一个
        if (nowIndex == words.length - 1) {
            return true;
        }
        char nowChar = board[x][y];
        board[x][y] = '/';
        boolean res = dfs(board, words, x + 1, y, nowIndex + 1)
                || dfs(board, words, x, y + 1, nowIndex + 1)
                || dfs(board, words, x - 1, y, nowIndex + 1)
                || dfs(board, words, x, y - 1, nowIndex + 1);
        board[x][y] = nowChar;
        return res;
    }
}

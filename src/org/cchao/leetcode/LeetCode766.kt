package org.cchao.leetcode

/**
 * Created by shucc on 18/4/9.
 * cc@cchao.org
 */
object LeetCode766 {

    @JvmStatic
    fun main(args: Array<String>) {
        println(isToeplitzMatrix(arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 1, 2, 3), intArrayOf(9, 5, 1, 2))))
        println(isToeplitzMatrix(arrayOf(intArrayOf(1, 2), intArrayOf(2, 2))))
    }

    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        for (r in matrix.indices) {
            for (c in 0..matrix[0].size - 1) {
                if (r > 0 && c > 0 && matrix[r - 1][c - 1] != matrix[r][c])
                    return false
            }
        }
        return true
    }
}

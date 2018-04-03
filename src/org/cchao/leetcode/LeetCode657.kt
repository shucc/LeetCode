package org.cchao.leetcode

/**
 * Created by shucc on 18/4/3.
 * cc@cchao.org
 */
object LeetCode657 {

    @JvmStatic fun main(args: Array<String>) {
        println(judgeCircle("UD"))
        println(judgeCircle("LL"))
    }

    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0
        for (move in moves) {
            when (move) {
                'R' -> x++
                'L' -> x--
                'U' -> y++
                'D' -> y--
                else -> {}
            }
        }
        return x == 0 && y == 0
    }
}
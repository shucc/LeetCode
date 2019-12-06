package org.cchao.leetcode.first

/**
 * Created by shucc on 18/4/4.
 * cc@cchao.org
 */
object LeetCode292 {

    @JvmStatic fun main(args: Array<String>) {

    }

    fun canWinNim(n: Int): Boolean {
        val remainder = n % 4
        if (remainder == 0) {
            return false
        }
        return true
    }
}
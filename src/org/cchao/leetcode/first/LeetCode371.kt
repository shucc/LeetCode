package org.cchao.leetcode.first

/**
 * Created by shucc on 18/4/4.
 * cc@cchao.org
 */
object LeetCode371 {

    @JvmStatic
    fun main(args: Array<String>) {
        println(getSum(2, 3))
        println(getSum(200, 14338324))
    }

    fun getSum(a: Int, b: Int): Int {
        if (b == 0) {
            return a
        }
        val sum = a xor b
        val carry = (a and b) shl 1
        return getSum(sum, carry)
    }
}
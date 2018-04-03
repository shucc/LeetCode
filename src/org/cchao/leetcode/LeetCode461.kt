package org.cchao.leetcode

/**
 * Created by shucc on 18/4/3.
 * cc@cchao.org
 */
object LeetCode461 {

    @JvmStatic fun main(args: Array<String>) {
        println(hammingDistance(1, 4))
    }

    fun hammingDistance(x: Int, y: Int): Int {
        var z = x xor y
        var result = 0
        while (z > 0) {
            if (z % 2 == 1) {
                result++
            }
            z /= 2
        }
        return result
    }
}
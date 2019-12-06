package org.cchao.leetcode.first

/**
 * Created by shucc on 18/4/8.
 * cc@cchao.org
 */
object LeetCode476 {

    @JvmStatic
    fun main(args: Array<String>) {
        println(findComplement(5).toString() + "-->" + findComplement(1))
    }

    fun findComplement(num: Int): Int {
        var x = num
        var result = 0
        var i = 0
        while (x > 0) {
            if (x and 1 == 0) {
                result += Math.pow(2.0, i.toDouble()).toInt()
            }
            x = x shr 1
            i++
        }
        return result
    }
}
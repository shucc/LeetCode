package org.cchao.leetcode

/**
 * Created by shucc on 18/4/8.
 * cc@cchao.org
 */
object LeetCode171 {

    @JvmStatic
    fun main(args: Array<String>) {
        println(titleToNumber("A"))
        println(titleToNumber("B"))
        println(titleToNumber("AB"))
        println(titleToNumber("ABC"))
    }

    fun titleToNumber(s: String): Int {
        var sum: Double = 0.0
        var i = s.length - 1
        while (i >= 0) {
            val temp = s[i]
            sum += (temp - 64).toInt() * Math.pow(26.0, (s.length - 1 - i).toDouble())
            i--
        }
        return sum.toInt()
    }
}
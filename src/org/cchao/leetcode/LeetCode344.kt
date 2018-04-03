package org.cchao.leetcode

/**
 * Created by shucc on 18/4/3.
 * cc@cchao.org
 */
object LeetCode344 {

    @JvmStatic fun main(args: Array<String>) {
        println(reverseString("hello"))
        println(reverseString("hjifehifhei"))
    }

    fun reverseString(s: String): String {
        val origin = s.toCharArray()
        val result = StringBuilder()
        var i = origin.size - 1
        while (i >= 0) {
            result.append(origin[i])
            i--
        }
        return result.toString()
    }
}
package org.cchao.leetcode

/**
 * Created by shucc on 18/4/4.
 * cc@cchao.org
 */
object LeetCode557 {

    @JvmStatic
    fun main(args: Array<String>) {
        println(reverseWords("Let's take LeetCode contest"))
    }

    fun reverseWords(s: String): String {
        val splitList = s.split(" ")
        var result = StringBuilder()
        val originLength = splitList.size
        var j = 0
        while (j < originLength) {
            val tempString = splitList[j]
            val length = tempString.length
            var i = length - 1
            while (i >= 0) {
                result.append(tempString[i])
                i--
            }
            if (j < originLength - 1) {
                result.append(" ")
            }
            j++
        }
        return result.toString()
    }
}
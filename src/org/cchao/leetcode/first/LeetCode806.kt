package org.cchao.leetcode.first

/**
 * Created by shucc on 18/4/8.
 * cc@cchao.org
 */
object LeetCode806 {

    @JvmStatic
    fun main(args: Array<String>) {
        val result1 = numberOfLines(intArrayOf(7, 5, 4, 7, 10, 7, 9, 4, 8, 9, 6, 5, 4, 2, 3, 10, 9, 9, 3, 7, 5, 2, 9, 4, 8, 9), "zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie")
        println(result1[0].toString() + "-->" + result1[1])
        val result2 = numberOfLines(intArrayOf(4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10), "bbbcccdddaaa")
        println(result2[0].toString() + "-->" + result2[1])
    }

    fun numberOfLines(widths: IntArray, S: String): IntArray {
        val widthMap = HashMap<Char, Int>()
        var i = 0
        while (i < widths.size) {
            widthMap.put((i + 97).toChar(), widths[i])
            i++
        }
        var lineCount = 1
        var sum = 0
        for (temp in S) {
            val nowLength = widthMap[temp] ?: 0
            sum += nowLength
            if (sum >= 100) {
                lineCount++
                if (sum == 100) {
                    sum = 0
                } else {
                    sum = nowLength
                }
            }
        }
        if (0 == sum) {
            return intArrayOf(lineCount, 100)
        }
        return intArrayOf(lineCount, sum)
    }
}
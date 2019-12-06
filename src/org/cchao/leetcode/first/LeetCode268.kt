package org.cchao.leetcode.first

/**
 * Created by shucc on 18/4/3.
 * cc@cchao.org
 */
object LeetCode268 {

    @JvmStatic fun main(args: Array<String>) {
        println(missingNumber(arrayOf(3, 0, 1).toIntArray()))
        println(missingNumber(arrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1).toIntArray()))
    }

    fun missingNumber(nums: IntArray): Int {
        var nowSum = 0
        for (num in nums) {
            nowSum += num
        }
        val expect = nums.size * (nums.size + 1) / 2
        return expect - nowSum
    }
}
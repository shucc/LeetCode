package org.cchao.leetcode.first

/**
 * Created by shucc on 18/4/4.
 * cc@cchao.org
 */
object LeetCode561 {

    @JvmStatic
    fun main(args: Array<String>) {
        println(arrayPairSum(arrayOf(1, 4, 3, 2).toIntArray()))
        println(arrayPairSum(arrayOf(1, 2, 3, 2).toIntArray()))
    }

    fun arrayPairSum(nums: IntArray): Int {
        var sum = 0
        var i = 0
        while (i < nums.size - 1) {
            var j = i + 1
            var min = nums[i]
            while (j < nums.size) {
                if (nums[j] < min) {
                    min = nums[j]
                    nums[j] = nums[i]
                    nums[i] = min
                }
                j++
            }
            if (i % 2 == 0) {
                sum += nums[i]
            }
            i++
        }
        return sum
    }

    fun arrayPairSum2(nums: IntArray, low: Int, high: Int): Int {
        if (low >= high) {
            if (low % 2 == 0) {
                return nums[low]
            }
            return 0
        }
        return 0
    }
}
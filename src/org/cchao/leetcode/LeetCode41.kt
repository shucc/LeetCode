package org.cchao.leetcode

/**
 * Created by shucc on 18/4/3.
 * cc@cchao.org
 */
object LeetCode41 {

    @JvmStatic fun main(args: Array<String>) {
        println(firstMissingPositive(arrayOf(1,2,0).toIntArray()))
        println(firstMissingPositive(arrayOf(3, 4, -1, 1).toIntArray()))
    }

    fun firstMissingPositive(nums: IntArray): Int {
        val positiveList = ArrayList<Int>()
        var max = 0
        for (num in nums) {
            if (num > 0) {
                positiveList.add(num)
                if (num > max) {
                    max = num
                }
            }
        }
        val positiveArray = IntArray(max + 1)
        positiveArray[0] = 1
        for (num in positiveList) {
            positiveArray[num] = 1
        }
        var i = 0
        while (i < positiveArray.size) {
            if (positiveArray[i] != 1) {
                return i
            }
            i++
        }
        return positiveArray.size
    }
}
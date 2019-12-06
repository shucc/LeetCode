package org.cchao.leetcode.first

/**
 * Created by shucc on 18/4/3.
 * cc@cchao.org
 */
object LeetCode448 {

    @JvmStatic fun main(args: Array<String>) {
        println(findDisappearedNumbers(arrayOf(4, 3, 2, 7, 8, 2, 3, 1).toIntArray()))
    }

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val result = ArrayList<Int>()
        val tempArray = IntArray(nums.size + 1)
        tempArray[0] = 1
        for (num in nums) {
            tempArray[num] = 1
        }
        var i = 0
        while (i < tempArray.size) {
            if (tempArray[i] != 1) {
                result.add(i)
            }
            i++
        }
        return result
    }
}
package org.cchao.leetcode

/**
 * Created by shucc on 18/4/3.
 * cc@cchao.org
 */
object LeetCode287 {

    @JvmStatic fun main(args: Array<String>) {
        println(findDuplicate2(arrayOf(3, 10, 1 ,2, 7, 9, 8, 5, 4, 6, 6).toIntArray()))
    }

    fun findDuplicate(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (num in nums) {
            val now = map[num]
            if (null == now) {
                map.put(num, 0)
            } else {
                return num
            }
        }
        return 0
    }

    fun findDuplicate2(nums: IntArray): Int {
        val temp = IntArray(nums.size)
        for (num in nums) {
            temp[num] = temp[num] + 1
            if (temp[num] > 1) {
                return num
            }
        }
        return 0
    }
}
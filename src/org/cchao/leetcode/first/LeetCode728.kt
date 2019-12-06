package org.cchao.leetcode.first

import java.util.ArrayList

/**
 * Created by shucc on 18/4/2.
 * cc@cchao.org
 */
object LeetCode728 {

    @JvmStatic fun main(args: Array<String>) {
        println(selfDividingNumbers(1, 22))
    }

    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val result = ArrayList<Int>()
        for (i in left..right) {
            var isSelfDividingNumber = true
            var temp1 = i
            while (temp1 > 0) {
                val temp2 = temp1 % 10
                if (0 == temp2) {
                    isSelfDividingNumber = false
                    break
                }
                temp1 = temp1 / 10
                if (i % temp2 != 0) {
                    isSelfDividingNumber = false
                    break
                }
            }
            if (isSelfDividingNumber) {
                result.add(i)
            }
        }
        return result
    }
}

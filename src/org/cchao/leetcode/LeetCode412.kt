package org.cchao.leetcode

/**
 * Created by shucc on 18/4/10.
 * cc@cchao.org
 */
object LeetCode412 {

    @JvmStatic
    fun main(args: Array<String>) {
        val result = fizzBuzz(15)
        for (temp in result) {
            println(temp)
        }
    }

    fun fizzBuzz(n: Int): List<String> {
        val result: ArrayList<String> = ArrayList()
        for (i in 1..n) {
            if (i % 15 == 0) {
                result.add("FizzBuzz")
                continue
            }
            if (i % 3 == 0) {
                result.add("Fizz")
                continue
            }
            if (i % 5 == 0) {
                result.add("Buzz")
                continue
            }
            result.add(i.toString())
        }
        return result
    }
}
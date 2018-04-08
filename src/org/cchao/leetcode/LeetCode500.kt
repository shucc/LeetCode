package org.cchao.leetcode

/**
 * Created by shucc on 18/4/8.
 * cc@cchao.org
 */
object LeetCode500 {

    @JvmStatic
    fun main(args: Array<String>) {
        val result = findWords(arrayOf("Hello", "Alaska", "Dad", "Peace"))
        for (temp in result) {
            println(temp)
        }
    }

    fun findWords(words: Array<String>): Array<String> {
        val comparison: Array<Array<Char>> = arrayOf(arrayOf('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P')
                , arrayOf('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L')
                , arrayOf('Z', 'X', 'C', 'V', 'B', 'N', 'M')
        )
        var resultList = ArrayList<String>()
        for (wordOrigin in words) {
            //先转换为大写字母
            val word = wordOrigin.toUpperCase()
            var comparisonIndex = -1
            var comparisonSuccess = true
            var i = 0
            while (i < word.length) {
                if (i == 0) {
                    var j = 0
                    while (j < comparison.size) {
                        for (temp in comparison[j]) {
                            if (word[i] == temp) {
                                comparisonIndex = j
                                break
                            }
                        }
                        j++
                    }
                } else {
                    var isComparison = false
                    for (temp in comparison[comparisonIndex]) {
                        if (temp == word[i]) {
                            isComparison = true
                        }
                    }
                    if (!isComparison) {
                        comparisonSuccess = false
                        break
                    }
                }
                i++
            }
            if (comparisonSuccess) {
                resultList.add(wordOrigin)
            }
        }
        return resultList.toTypedArray()
    }
}
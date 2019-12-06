package org.cchao.leetcode.first

/**
 * Created by shucc on 18/4/3.
 * cc@cchao.org
 */
object LeetCode804 {

    @JvmStatic fun main(args: Array<String>) {
        println(uniqueMorseRepresentations(arrayOf("gin", "zen", "gig", "msg")))
    }

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val morseArray = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        val letterArray = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
        val morseMap = HashMap<Char, String>()
        var i = 0
        while (i < morseArray.size) {
            morseMap.put(letterArray[i], morseArray[i])
            i++
        }
        val result = HashSet<String>()
        var wordStringBuilder = StringBuilder()
        for (word in words) {
            wordStringBuilder.replace(0, wordStringBuilder.length, "")
            for (letter in word) {
                wordStringBuilder.append(morseMap[letter])
            }
            result.add(wordStringBuilder.toString())
        }
        return result.size
    }
}
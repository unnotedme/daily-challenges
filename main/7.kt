import kotlin.ExperimentalStdlibApi

/*
#7 - counting words
difficulty: average

create a program that counts how many times each word is repeated and that shows the final count of all of them.
- the scoring signs do not form part of the word.
- a word is the same as it appears in uppercase and lowercase.
- it is not possible to use the language's own functions that will automatically reset it.
*/

fun main() {
    countWords("hi, my name is ted. my first name is ted and my last name is sá.")
}

fun countWords(text: String) {

    val words = mutableMapOf<String, Int>()

    text.lowercase().replace("[^a-z0-9]".toRegex(), " ").split(" ").forEach { key ->
        if (key.isEmpty()) {
            return@forEach
        }
        if (words[key] != null) {
            words[key] = words.getValue(key) + 1
        } else {
            words[key] = 1
        }
    }

    words.forEach { word ->
        println("${word.key} has repeated ${word.value} ${if(word.value == 1) "time" else "times"}")
    }
}
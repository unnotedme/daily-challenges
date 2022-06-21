/*
challenge #1 - is it an anagram?
dfficulty: avarage

write a function that receives two words (strings) and returns true or false (boolean) according to the anagrams.
- an anagram consists of forming a word by rearranging all the letters of another initial word.
- it is not necessary to verify if both words exists.
- two words that are exactly the same are not an anagram.
*/

@ExperimentalStdlibApi
fun main (){
    println(isAnagram("peach", "cheap"))
}

@ExperimentalStdlibApi
private fun isAnagram(wordOne: String, wordTwo:String): Boolean {
    if (wordOne.lowercase() == wordTwo.lowercase()) {
        return false
    }
    return wordOne.lowercase().toCharArray().sortedArray().contentEquals(wordTwo.lowercase().toCharArray().sortedArray())
}

/*
in this case, i use the @ExperimentalStdlibApi because .lowecase() is considered experimental and is not subject to the general compatibility guarantees.
*/
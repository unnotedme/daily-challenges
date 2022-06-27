/*
#6 - inverting chains
difficulty: easy

create a program that reverses the order of a text string without using language functions that do it automatically.
if we passed "hello world" it would return "dlrow olleh"
*/

fun main() {
    println(reverse("hello world"))
    println(recursiveReverse("hello world"))
}

private fun reverse(text: String): String {
    val textCount = text.count() - 1
    var reversedText = ""
    for (index in 0..textCount) {
        reversedText += text[textCount - index]
    }
    return reversedText
}


private fun recursiveReverse(text: String, index: Int = 0, reversedText: String = ""): String {
    val textCount = text.count() - 1
    var newReversedText = reversedText
    newReversedText += text[textCount - index]
    if (index < textCount) {
        val newIndex = index + 1
        newReversedText = recursiveReverse(text, newIndex, newReversedText)
    }
    return newReversedText
}